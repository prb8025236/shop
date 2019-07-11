package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsMemberLoginLogDTO;
import com.mini.shop.dao.generate.UmsMemberLoginLogDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLoginLogDTOMapper {
    long countByExample(UmsMemberLoginLogDTOExample example);

    int deleteByExample(UmsMemberLoginLogDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLogDTO record);

    int insertSelective(UmsMemberLoginLogDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsMemberLoginLogDTO selectOneByExample(UmsMemberLoginLogDTOExample example);

    List<UmsMemberLoginLogDTO> selectByExample(UmsMemberLoginLogDTOExample example);

    UmsMemberLoginLogDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberLoginLogDTO record, @Param("example") UmsMemberLoginLogDTOExample example);

    int updateByExample(@Param("record") UmsMemberLoginLogDTO record, @Param("example") UmsMemberLoginLogDTOExample example);

    int updateByPrimaryKeySelective(UmsMemberLoginLogDTO record);

    int updateByPrimaryKey(UmsMemberLoginLogDTO record);
}