package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.CmsSubjectDTO;
import com.mini.shop.dao.generate.CmsSubjectDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectDTOMapper {
    long countByExample(CmsSubjectDTOExample example);

    int deleteByExample(CmsSubjectDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectDTO record);

    int insertSelective(CmsSubjectDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CmsSubjectDTO selectOneByExample(CmsSubjectDTOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CmsSubjectDTO selectOneByExampleWithBLOBs(CmsSubjectDTOExample example);

    List<CmsSubjectDTO> selectByExampleWithBLOBs(CmsSubjectDTOExample example);

    List<CmsSubjectDTO> selectByExample(CmsSubjectDTOExample example);

    CmsSubjectDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsSubjectDTO record, @Param("example") CmsSubjectDTOExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsSubjectDTO record, @Param("example") CmsSubjectDTOExample example);

    int updateByExample(@Param("record") CmsSubjectDTO record, @Param("example") CmsSubjectDTOExample example);

    int updateByPrimaryKeySelective(CmsSubjectDTO record);

    int updateByPrimaryKeyWithBLOBs(CmsSubjectDTO record);

    int updateByPrimaryKey(CmsSubjectDTO record);
}