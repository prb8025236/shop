package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.SmsHomeAdvertiseDTO;
import com.mini.shop.dao.generate.SmsHomeAdvertiseDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeAdvertiseDTOMapper {
    long countByExample(SmsHomeAdvertiseDTOExample example);

    int deleteByExample(SmsHomeAdvertiseDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertiseDTO record);

    int insertSelective(SmsHomeAdvertiseDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SmsHomeAdvertiseDTO selectOneByExample(SmsHomeAdvertiseDTOExample example);

    List<SmsHomeAdvertiseDTO> selectByExample(SmsHomeAdvertiseDTOExample example);

    SmsHomeAdvertiseDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeAdvertiseDTO record, @Param("example") SmsHomeAdvertiseDTOExample example);

    int updateByExample(@Param("record") SmsHomeAdvertiseDTO record, @Param("example") SmsHomeAdvertiseDTOExample example);

    int updateByPrimaryKeySelective(SmsHomeAdvertiseDTO record);

    int updateByPrimaryKey(SmsHomeAdvertiseDTO record);
}