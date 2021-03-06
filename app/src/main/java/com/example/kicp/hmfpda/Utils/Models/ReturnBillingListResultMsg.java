package com.example.kicp.hmfpda.Utils.Models;

import com.alibaba.fastjson.JSON;
import com.example.kicp.hmfpda.Models.ReturnBillingEntity;
import com.example.kicp.hmfpda.Utils.Enum.StatusCodeEnum;

import java.util.List;

/**
 * 退货明细单 获取类
 */
public class ReturnBillingListResultMsg extends HttpResponseMsg{
    public List<ReturnBillingEntity> Result(){
        if(StatusCode == StatusCodeEnum.Success.getValue() && !(Data == null || Data=="")){
            return JSON.parseArray(Data.toString(), ReturnBillingEntity.class);
        }
        else{
            return null;
        }
    }
}
