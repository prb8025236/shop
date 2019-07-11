package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.PmsSkuStockDTO;
import com.mini.shop.dao.generate.PmsSkuStockDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuStockDTOMapper {
    long countByExample(PmsSkuStockDTOExample example);

    int deleteByExample(PmsSkuStockDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStockDTO record);

    int insertSelective(PmsSkuStockDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PmsSkuStockDTO selectOneByExample(PmsSkuStockDTOExample example);

    List<PmsSkuStockDTO> selectByExample(PmsSkuStockDTOExample example);

    PmsSkuStockDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSkuStockDTO record, @Param("example") PmsSkuStockDTOExample example);

    int updateByExample(@Param("record") PmsSkuStockDTO record, @Param("example") PmsSkuStockDTOExample example);

    int updateByPrimaryKeySelective(PmsSkuStockDTO record);

    int updateByPrimaryKey(PmsSkuStockDTO record);
}