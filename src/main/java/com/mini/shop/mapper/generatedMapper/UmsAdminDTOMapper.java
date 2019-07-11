package com.mini.shop.mapper.generatedMapper;

import com.mini.shop.dao.generate.UmsAdminDTO;
import com.mini.shop.dao.generate.UmsAdminDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminDTOMapper {
    long countByExample(UmsAdminDTOExample example);

    int deleteByExample(UmsAdminDTOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminDTO record);

    int insertSelective(UmsAdminDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    UmsAdminDTO selectOneByExample(UmsAdminDTOExample example);

    List<UmsAdminDTO> selectByExample(UmsAdminDTOExample example);

    UmsAdminDTO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminDTO record, @Param("example") UmsAdminDTOExample example);

    int updateByExample(@Param("record") UmsAdminDTO record, @Param("example") UmsAdminDTOExample example);

    int updateByPrimaryKeySelective(UmsAdminDTO record);

    int updateByPrimaryKey(UmsAdminDTO record);
}