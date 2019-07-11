package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsProductLadderDTO;
import com.mini.shop.dao.generate.PmsProductLadderDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLadderDTOMapper {
    long countByExample(PmsProductLadderDTOExample example);

    int deleteByExample(PmsProductLadderDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadderDTO record);

    int insertSelective(PmsProductLadderDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsProductLadderDTO selectOneByExample(PmsProductLadderDTOExample example);

    List<PmsProductLadderDTO> selectByExample(PmsProductLadderDTOExample example);

    PmsProductLadderDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductLadderDTO record, @Param("example") PmsProductLadderDTOExample example);

    int updateByExample(@Param("record") PmsProductLadderDTO record, @Param("example") PmsProductLadderDTOExample example);

    int updateByPrimaryKeySelective(PmsProductLadderDTO record);

    int updateByPrimaryKey(PmsProductLadderDTO record);
}