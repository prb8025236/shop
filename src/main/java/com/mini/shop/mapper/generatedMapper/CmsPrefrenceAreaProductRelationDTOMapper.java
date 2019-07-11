package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.CmsPrefrenceAreaProductRelationDTO;
import com.mini.shop.dao.generate.CmsPrefrenceAreaProductRelationDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaProductRelationDTOMapper {
    long countByExample(CmsPrefrenceAreaProductRelationDTOExample example);

    int deleteByExample(CmsPrefrenceAreaProductRelationDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelationDTO record);

    int insertSelective(CmsPrefrenceAreaProductRelationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CmsPrefrenceAreaProductRelationDTO selectOneByExample(CmsPrefrenceAreaProductRelationDTOExample example);

    List<CmsPrefrenceAreaProductRelationDTO> selectByExample(CmsPrefrenceAreaProductRelationDTOExample example);

    CmsPrefrenceAreaProductRelationDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsPrefrenceAreaProductRelationDTO record, @Param("example") CmsPrefrenceAreaProductRelationDTOExample example);

    int updateByExample(@Param("record") CmsPrefrenceAreaProductRelationDTO record, @Param("example") CmsPrefrenceAreaProductRelationDTOExample example);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelationDTO record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelationDTO record);
}