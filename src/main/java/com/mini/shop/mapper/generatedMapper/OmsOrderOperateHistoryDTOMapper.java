package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.OmsOrderOperateHistoryDTO;
import com.mini.shop.dao.generate.OmsOrderOperateHistoryDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderOperateHistoryDTOMapper {
    long countByExample(OmsOrderOperateHistoryDTOExample example);

    int deleteByExample(OmsOrderOperateHistoryDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistoryDTO record);

    int insertSelective(OmsOrderOperateHistoryDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    OmsOrderOperateHistoryDTO selectOneByExample(OmsOrderOperateHistoryDTOExample example);

    List<OmsOrderOperateHistoryDTO> selectByExample(OmsOrderOperateHistoryDTOExample example);

    OmsOrderOperateHistoryDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderOperateHistoryDTO record, @Param("example") OmsOrderOperateHistoryDTOExample example);

    int updateByExample(@Param("record") OmsOrderOperateHistoryDTO record, @Param("example") OmsOrderOperateHistoryDTOExample example);

    int updateByPrimaryKeySelective(OmsOrderOperateHistoryDTO record);

    int updateByPrimaryKey(OmsOrderOperateHistoryDTO record);
}