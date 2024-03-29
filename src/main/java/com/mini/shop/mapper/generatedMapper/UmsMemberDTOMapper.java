package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsMemberDTO;
import com.mini.shop.dao.generate.UmsMemberDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberDTOMapper {
    long countByExample(UmsMemberDTOExample example);

    int deleteByExample(UmsMemberDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberDTO record);

    int insertSelective(UmsMemberDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsMemberDTO selectOneByExample(UmsMemberDTOExample example);

    List<UmsMemberDTO> selectByExample(UmsMemberDTOExample example);

    UmsMemberDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberDTO record, @Param("example") UmsMemberDTOExample example);

    int updateByExample(@Param("record") UmsMemberDTO record, @Param("example") UmsMemberDTOExample example);

    int updateByPrimaryKeySelective(UmsMemberDTO record);

    int updateByPrimaryKey(UmsMemberDTO record);
}