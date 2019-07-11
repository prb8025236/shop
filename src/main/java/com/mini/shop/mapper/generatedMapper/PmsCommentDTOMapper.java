package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsCommentDTO;
import com.mini.shop.dao.generate.PmsCommentDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentDTOMapper {
    long countByExample(PmsCommentDTOExample example);

    int deleteByExample(PmsCommentDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentDTO record);

    int insertSelective(PmsCommentDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsCommentDTO selectOneByExample(PmsCommentDTOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsCommentDTO selectOneByExampleWithBLOBs(PmsCommentDTOExample example);

    List<PmsCommentDTO> selectByExampleWithBLOBs(PmsCommentDTOExample example);

    List<PmsCommentDTO> selectByExample(PmsCommentDTOExample example);

    PmsCommentDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsCommentDTO record, @Param("example") PmsCommentDTOExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsCommentDTO record, @Param("example") PmsCommentDTOExample example);

    int updateByExample(@Param("record") PmsCommentDTO record, @Param("example") PmsCommentDTOExample example);

    int updateByPrimaryKeySelective(PmsCommentDTO record);

    int updateByPrimaryKeyWithBLOBs(PmsCommentDTO record);

    int updateByPrimaryKey(PmsCommentDTO record);
}