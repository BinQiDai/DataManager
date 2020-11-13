package com.mdm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mdm.pojo.MdmDataDetails;
import com.mdm.pojo.MdmDataDetailsExample;

/**
 * @author BinQi.Dai
 */
public interface MdmDataDetailsMapper {
    int countByExample(MdmDataDetailsExample example);

    int deleteByExample(MdmDataDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MdmDataDetails record);

    int insertSelective(MdmDataDetails record);

    List<MdmDataDetails> selectByExample(MdmDataDetailsExample example);

    MdmDataDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MdmDataDetails record, @Param("example") MdmDataDetailsExample example);

    int updateByExample(@Param("record") MdmDataDetails record, @Param("example") MdmDataDetailsExample example);

    int updateByPrimaryKeySelective(MdmDataDetails record);

    int updateByPrimaryKey(MdmDataDetails record);
}