package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsMemberTagDTO;
import com.mini.shop.dao.generate.UmsMemberTagDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTagDTOMapper {
    long countByExample(UmsMemberTagDTOExample example);

    int deleteByExample(UmsMemberTagDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTagDTO record);

    int insertSelective(UmsMemberTagDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsMemberTagDTO selectOneByExample(UmsMemberTagDTOExample example);

    List<UmsMemberTagDTO> selectByExample(UmsMemberTagDTOExample example);

    UmsMemberTagDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberTagDTO record, @Param("example") UmsMemberTagDTOExample example);

    int updateByExample(@Param("record") UmsMemberTagDTO record, @Param("example") UmsMemberTagDTOExample example);

    int updateByPrimaryKeySelective(UmsMemberTagDTO record);

    int updateByPrimaryKey(UmsMemberTagDTO record);
}