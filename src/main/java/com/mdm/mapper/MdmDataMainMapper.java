package com.mdm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mdm.pojo.MdmDataMain;
import com.mdm.pojo.MdmDataMainExample;

/**
 * @author BinQi.Dai
 */
public interface MdmDataMainMapper {
    int countByExample(MdmDataMainExample example);

    int deleteByExample(MdmDataMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MdmDataMain record);

    int insertSelective(MdmDataMain record);

    List<MdmDataMain> selectByExample(MdmDataMainExample example);

    MdmDataMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MdmDataMain record, @Param("example") MdmDataMainExample example);

    int updateByExample(@Param("record") MdmDataMain record, @Param("example") MdmDataMainExample example);

    int updateByPrimaryKeySelective(MdmDataMain record);

    int updateByPrimaryKey(MdmDataMain record);

    List<MdmDataMain> selectAllData();
}