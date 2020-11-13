package com.mdm.controller;

import com.mdm.pojo.MdmDataMain;
import com.mdm.service.MdmDataMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/11/13
 */
@Controller
public class MdmDataMainController {
    @Autowired
    private MdmDataMainService mdmDataMainService;

    @RequestMapping(path ="/queryAll", method = RequestMethod.GET)
    @ResponseBody
    public List<MdmDataMain> queryAllMainData(){
        return mdmDataMainService.queryAllMdmDataMain();
    }
}
