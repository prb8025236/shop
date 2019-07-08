package com.mini.shop.incepter;

import com.google.gson.Gson;
import com.mini.shop.type.OperationType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Wesley on 2019/6/14
 *
 * @author Wesley
 * @date 2019/6/14
 **/

@Aspect
@Configuration
public class ShopAspect {


    private Gson gson = new Gson();

    private static final Logger log = LoggerFactory.getLogger(ShopAspect.class);

    //     不能拦截@RequestMapping，这样会导致swagger无法使用
//     @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    @Pointcut("execution(public * com.mini.shop.controller.*.*(..))")
    public void pointCutMethod() {


    }

    // 声明环绕通知
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //通过uuid关联请求参数和返回参数
        Object proceed = null;
        //获取request对象
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        StringBuilder sb = new StringBuilder();

        Signature signature = pjp.getSignature();//此处joinPoint的实现类是MethodInvocationProceedingJoinPoint
        MethodSignature methodSignature = (MethodSignature) signature;//获取参数名
        OperationType operationType = methodSignature.getMethod().getAnnotation(OperationType.class);
        //拼接请求内容
        String api = sb.append(request.getRequestURL().toString()).toString();
        String method = request.getMethod();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        Map<String, Object> stringObjectMap = methodBefore(pjp, uuid);
        Date date = new Date();
        proceed = pjp.proceed();


        return proceed;
    }

    public Map<String, Object> methodBefore(JoinPoint joinPoint, String uuid) {
        // 打印请求内容
        try {
            // 下面两个数组中，参数值和参数名的个数和位置是一一对应的。
            Object[] objs = joinPoint.getArgs();
            String[] argNames = ((MethodSignature) joinPoint.getSignature()).getParameterNames(); // 参数名
            Map<String, Object> paramMap = new HashMap<>();
            for (int i = 0; i < objs.length; i++) {
                if (!(objs[i] instanceof ExtendedServletRequestDataBinder) && !(objs[i] instanceof HttpServletResponseWrapper)) {
                    paramMap.put(argNames[i], objs[i]);
                }
            }
            if (paramMap.size() > 0) {
                log.info("\n[{}]方法:{}\n参数:{}", uuid, joinPoint.getSignature(), gson.toJson(paramMap));
            }
            return paramMap;
        } catch (Exception e) {
            log.error("[{}]AOP methodBefore:", uuid, e);
            return null;
        }

    }


}


