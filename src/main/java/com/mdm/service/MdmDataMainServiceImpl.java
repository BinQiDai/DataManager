package com.mdm.service;

import com.mdm.mapper.MdmDataMainMapper;
import com.mdm.pojo.MdmDataMain;
import com.mdm.service.MdmDataMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/11/13
 */
@Service
public class MdmDataMainServiceImpl implements MdmDataMainService {
    @Autowired
    private MdmDataMainMapper mdmDataMainMapper;
    /**
     * 获取所有主数据项
     *
     * @return
     * @author BinQi.Dai 2020-11-13 15:08
     */
    @Override
    public List<MdmDataMain> queryAllMdmDataMain() {
        List<MdmDataMain> mdmDataMainList = mdmDataMainMapper.selectAllData();
        return mdmDataMainList;
    }
}
