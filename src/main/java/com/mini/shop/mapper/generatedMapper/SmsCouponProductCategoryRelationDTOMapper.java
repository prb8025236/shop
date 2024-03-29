package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.SmsCouponProductCategoryRelationDTO;
import com.mini.shop.dao.generate.SmsCouponProductCategoryRelationDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductCategoryRelationDTOMapper {
    long countByExample(SmsCouponProductCategoryRelationDTOExample example);

    int deleteByExample(SmsCouponProductCategoryRelationDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelationDTO record);

    int insertSelective(SmsCouponProductCategoryRelationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SmsCouponProductCategoryRelationDTO selectOneByExample(SmsCouponProductCategoryRelationDTOExample example);

    List<SmsCouponProductCategoryRelationDTO> selectByExample(SmsCouponProductCategoryRelationDTOExample example);

    SmsCouponProductCategoryRelationDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCouponProductCategoryRelationDTO record, @Param("example") SmsCouponProductCategoryRelationDTOExample example);

    int updateByExample(@Param("record") SmsCouponProductCategoryRelationDTO record, @Param("example") SmsCouponProductCategoryRelationDTOExample example);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelationDTO record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelationDTO record);
}