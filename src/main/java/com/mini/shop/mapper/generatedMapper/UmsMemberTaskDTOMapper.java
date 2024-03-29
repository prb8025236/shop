package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsMemberTaskDTO;
import com.mini.shop.dao.generate.UmsMemberTaskDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTaskDTOMapper {
    long countByExample(UmsMemberTaskDTOExample example);

    int deleteByExample(UmsMemberTaskDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTaskDTO record);

    int insertSelective(UmsMemberTaskDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_task
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsMemberTaskDTO selectOneByExample(UmsMemberTaskDTOExample example);

    List<UmsMemberTaskDTO> selectByExample(UmsMemberTaskDTOExample example);

    UmsMemberTaskDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberTaskDTO record, @Param("example") UmsMemberTaskDTOExample example);

    int updateByExample(@Param("record") UmsMemberTaskDTO record, @Param("example") UmsMemberTaskDTOExample example);

    int updateByPrimaryKeySelective(UmsMemberTaskDTO record);

    int updateByPrimaryKey(UmsMemberTaskDTO record);
}