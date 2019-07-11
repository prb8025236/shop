package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.OmsOrderSettingDTO;
import com.mini.shop.dao.generate.OmsOrderSettingDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderSettingDTOMapper {
    long countByExample(OmsOrderSettingDTOExample example);

    int deleteByExample(OmsOrderSettingDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSettingDTO record);

    int insertSelective(OmsOrderSettingDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    OmsOrderSettingDTO selectOneByExample(OmsOrderSettingDTOExample example);

    List<OmsOrderSettingDTO> selectByExample(OmsOrderSettingDTOExample example);

    OmsOrderSettingDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderSettingDTO record, @Param("example") OmsOrderSettingDTOExample example);

    int updateByExample(@Param("record") OmsOrderSettingDTO record, @Param("example") OmsOrderSettingDTOExample example);

    int updateByPrimaryKeySelective(OmsOrderSettingDTO record);

    int updateByPrimaryKey(OmsOrderSettingDTO record);
}