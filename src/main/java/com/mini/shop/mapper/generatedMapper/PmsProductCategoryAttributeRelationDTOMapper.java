package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsProductCategoryAttributeRelationDTO;
import com.mini.shop.dao.generate.PmsProductCategoryAttributeRelationDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryAttributeRelationDTOMapper {
    long countByExample(PmsProductCategoryAttributeRelationDTOExample example);

    int deleteByExample(PmsProductCategoryAttributeRelationDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelationDTO record);

    int insertSelective(PmsProductCategoryAttributeRelationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsProductCategoryAttributeRelationDTO selectOneByExample(PmsProductCategoryAttributeRelationDTOExample example);

    List<PmsProductCategoryAttributeRelationDTO> selectByExample(PmsProductCategoryAttributeRelationDTOExample example);

    PmsProductCategoryAttributeRelationDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductCategoryAttributeRelationDTO record, @Param("example") PmsProductCategoryAttributeRelationDTOExample example);

    int updateByExample(@Param("record") PmsProductCategoryAttributeRelationDTO record, @Param("example") PmsProductCategoryAttributeRelationDTOExample example);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelationDTO record);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelationDTO record);
}