package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.SmsFlashPromotionSessionDTO;
import com.mini.shop.dao.generate.SmsFlashPromotionSessionDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionSessionDTOMapper {
    long countByExample(SmsFlashPromotionSessionDTOExample example);

    int deleteByExample(SmsFlashPromotionSessionDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSessionDTO record);

    int insertSelective(SmsFlashPromotionSessionDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SmsFlashPromotionSessionDTO selectOneByExample(SmsFlashPromotionSessionDTOExample example);

    List<SmsFlashPromotionSessionDTO> selectByExample(SmsFlashPromotionSessionDTOExample example);

    SmsFlashPromotionSessionDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionSessionDTO record, @Param("example") SmsFlashPromotionSessionDTOExample example);

    int updateByExample(@Param("record") SmsFlashPromotionSessionDTO record, @Param("example") SmsFlashPromotionSessionDTOExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionSessionDTO record);

    int updateByPrimaryKey(SmsFlashPromotionSessionDTO record);
}