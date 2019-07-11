package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsProductVertifyRecordDTO;
import com.mini.shop.dao.generate.PmsProductVertifyRecordDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductVertifyRecordDTOMapper {
    long countByExample(PmsProductVertifyRecordDTOExample example);

    int deleteByExample(PmsProductVertifyRecordDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecordDTO record);

    int insertSelective(PmsProductVertifyRecordDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsProductVertifyRecordDTO selectOneByExample(PmsProductVertifyRecordDTOExample example);

    List<PmsProductVertifyRecordDTO> selectByExample(PmsProductVertifyRecordDTOExample example);

    PmsProductVertifyRecordDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductVertifyRecordDTO record, @Param("example") PmsProductVertifyRecordDTOExample example);

    int updateByExample(@Param("record") PmsProductVertifyRecordDTO record, @Param("example") PmsProductVertifyRecordDTOExample example);

    int updateByPrimaryKeySelective(PmsProductVertifyRecordDTO record);

    int updateByPrimaryKey(PmsProductVertifyRecordDTO record);
}