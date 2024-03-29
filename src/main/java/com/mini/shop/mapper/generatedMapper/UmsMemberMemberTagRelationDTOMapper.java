package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsMemberMemberTagRelationDTO;
import com.mini.shop.dao.generate.UmsMemberMemberTagRelationDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMemberTagRelationDTOMapper {
    long countByExample(UmsMemberMemberTagRelationDTOExample example);

    int deleteByExample(UmsMemberMemberTagRelationDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelationDTO record);

    int insertSelective(UmsMemberMemberTagRelationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsMemberMemberTagRelationDTO selectOneByExample(UmsMemberMemberTagRelationDTOExample example);

    List<UmsMemberMemberTagRelationDTO> selectByExample(UmsMemberMemberTagRelationDTOExample example);

    UmsMemberMemberTagRelationDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelationDTO record, @Param("example") UmsMemberMemberTagRelationDTOExample example);

    int updateByExample(@Param("record") UmsMemberMemberTagRelationDTO record, @Param("example") UmsMemberMemberTagRelationDTOExample example);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelationDTO record);

    int updateByPrimaryKey(UmsMemberMemberTagRelationDTO record);
}