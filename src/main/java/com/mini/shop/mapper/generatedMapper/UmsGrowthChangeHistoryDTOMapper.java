package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsGrowthChangeHistoryDTO;
import com.mini.shop.dao.generate.UmsGrowthChangeHistoryDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsGrowthChangeHistoryDTOMapper {
    long countByExample(UmsGrowthChangeHistoryDTOExample example);

    int deleteByExample(UmsGrowthChangeHistoryDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistoryDTO record);

    int insertSelective(UmsGrowthChangeHistoryDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsGrowthChangeHistoryDTO selectOneByExample(UmsGrowthChangeHistoryDTOExample example);

    List<UmsGrowthChangeHistoryDTO> selectByExample(UmsGrowthChangeHistoryDTOExample example);

    UmsGrowthChangeHistoryDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsGrowthChangeHistoryDTO record, @Param("example") UmsGrowthChangeHistoryDTOExample example);

    int updateByExample(@Param("record") UmsGrowthChangeHistoryDTO record, @Param("example") UmsGrowthChangeHistoryDTOExample example);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistoryDTO record);

    int updateByPrimaryKey(UmsGrowthChangeHistoryDTO record);
}