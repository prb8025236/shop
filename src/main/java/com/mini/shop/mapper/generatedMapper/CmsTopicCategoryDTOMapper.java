package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.CmsTopicCategoryDTO;
import com.mini.shop.dao.generate.CmsTopicCategoryDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCategoryDTOMapper {
    long countByExample(CmsTopicCategoryDTOExample example);

    int deleteByExample(CmsTopicCategoryDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategoryDTO record);

    int insertSelective(CmsTopicCategoryDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CmsTopicCategoryDTO selectOneByExample(CmsTopicCategoryDTOExample example);

    List<CmsTopicCategoryDTO> selectByExample(CmsTopicCategoryDTOExample example);

    CmsTopicCategoryDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsTopicCategoryDTO record, @Param("example") CmsTopicCategoryDTOExample example);

    int updateByExample(@Param("record") CmsTopicCategoryDTO record, @Param("example") CmsTopicCategoryDTOExample example);

    int updateByPrimaryKeySelective(CmsTopicCategoryDTO record);

    int updateByPrimaryKey(CmsTopicCategoryDTO record);
}