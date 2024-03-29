package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsProductOperateLogDTO;
import com.mini.shop.dao.generate.PmsProductOperateLogDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductOperateLogDTOMapper {
    long countByExample(PmsProductOperateLogDTOExample example);

    int deleteByExample(PmsProductOperateLogDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLogDTO record);

    int insertSelective(PmsProductOperateLogDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsProductOperateLogDTO selectOneByExample(PmsProductOperateLogDTOExample example);

    List<PmsProductOperateLogDTO> selectByExample(PmsProductOperateLogDTOExample example);

    PmsProductOperateLogDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductOperateLogDTO record, @Param("example") PmsProductOperateLogDTOExample example);

    int updateByExample(@Param("record") PmsProductOperateLogDTO record, @Param("example") PmsProductOperateLogDTOExample example);

    int updateByPrimaryKeySelective(PmsProductOperateLogDTO record);

    int updateByPrimaryKey(PmsProductOperateLogDTO record);
}