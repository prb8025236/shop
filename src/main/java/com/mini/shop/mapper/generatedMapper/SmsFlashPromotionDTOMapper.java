package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.SmsFlashPromotionDTO;
import com.mini.shop.dao.generate.SmsFlashPromotionDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionDTOMapper {
    long countByExample(SmsFlashPromotionDTOExample example);

    int deleteByExample(SmsFlashPromotionDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionDTO record);

    int insertSelective(SmsFlashPromotionDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SmsFlashPromotionDTO selectOneByExample(SmsFlashPromotionDTOExample example);

    List<SmsFlashPromotionDTO> selectByExample(SmsFlashPromotionDTOExample example);

    SmsFlashPromotionDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionDTO record, @Param("example") SmsFlashPromotionDTOExample example);

    int updateByExample(@Param("record") SmsFlashPromotionDTO record, @Param("example") SmsFlashPromotionDTOExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionDTO record);

    int updateByPrimaryKey(SmsFlashPromotionDTO record);
}