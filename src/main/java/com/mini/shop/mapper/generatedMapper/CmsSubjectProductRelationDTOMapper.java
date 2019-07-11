package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.CmsSubjectProductRelationDTO;
import com.mini.shop.dao.generate.CmsSubjectProductRelationDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationDTOMapper {
    long countByExample(CmsSubjectProductRelationDTOExample example);

    int deleteByExample(CmsSubjectProductRelationDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelationDTO record);

    int insertSelective(CmsSubjectProductRelationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CmsSubjectProductRelationDTO selectOneByExample(CmsSubjectProductRelationDTOExample example);

    List<CmsSubjectProductRelationDTO> selectByExample(CmsSubjectProductRelationDTOExample example);

    CmsSubjectProductRelationDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsSubjectProductRelationDTO record, @Param("example") CmsSubjectProductRelationDTOExample example);

    int updateByExample(@Param("record") CmsSubjectProductRelationDTO record, @Param("example") CmsSubjectProductRelationDTOExample example);

    int updateByPrimaryKeySelective(CmsSubjectProductRelationDTO record);

    int updateByPrimaryKey(CmsSubjectProductRelationDTO record);
}