package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsProductAttributeDTO;
import com.mini.shop.dao.generate.PmsProductAttributeDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeDTOMapper {
    long countByExample(PmsProductAttributeDTOExample example);

    int deleteByExample(PmsProductAttributeDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeDTO record);

    int insertSelective(PmsProductAttributeDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsProductAttributeDTO selectOneByExample(PmsProductAttributeDTOExample example);

    List<PmsProductAttributeDTO> selectByExample(PmsProductAttributeDTOExample example);

    PmsProductAttributeDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductAttributeDTO record, @Param("example") PmsProductAttributeDTOExample example);

    int updateByExample(@Param("record") PmsProductAttributeDTO record, @Param("example") PmsProductAttributeDTOExample example);

    int updateByPrimaryKeySelective(PmsProductAttributeDTO record);

    int updateByPrimaryKey(PmsProductAttributeDTO record);
}