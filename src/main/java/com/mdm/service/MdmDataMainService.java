package com.mdm.service;

import com.mdm.pojo.MdmDataMain;

import java.util.List;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/11/13
 */
public interface MdmDataMainService {
    /**
     * 获取所有主数据项
     *
     * @param List<MdmDataMain>
     * @author BinQi.Dai 2020-11-13 15:08
     * @return
     */
    List<MdmDataMain> queryAllMdmDataMain();
}
