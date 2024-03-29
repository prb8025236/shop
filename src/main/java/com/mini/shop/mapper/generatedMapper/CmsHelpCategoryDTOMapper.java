package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.CmsHelpCategoryDTO;
import com.mini.shop.dao.generate.CmsHelpCategoryDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpCategoryDTOMapper {
    long countByExample(CmsHelpCategoryDTOExample example);

    int deleteByExample(CmsHelpCategoryDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategoryDTO record);

    int insertSelective(CmsHelpCategoryDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CmsHelpCategoryDTO selectOneByExample(CmsHelpCategoryDTOExample example);

    List<CmsHelpCategoryDTO> selectByExample(CmsHelpCategoryDTOExample example);

    CmsHelpCategoryDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsHelpCategoryDTO record, @Param("example") CmsHelpCategoryDTOExample example);

    int updateByExample(@Param("record") CmsHelpCategoryDTO record, @Param("example") CmsHelpCategoryDTOExample example);

    int updateByPrimaryKeySelective(CmsHelpCategoryDTO record);

    int updateByPrimaryKey(CmsHelpCategoryDTO record);
}