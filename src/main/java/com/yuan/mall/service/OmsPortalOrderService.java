package com.yuan.mall.service;

import com.yuan.mall.common.api.CommonResult;
import com.yuan.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ykj
 * @date 2023/2/13/15:06
 * @apiNote 前台订单管理Service
 */
public interface OmsPortalOrderService {
   /**
    * 根据提交信息生成订单
    */
   @Transactional
   CommonResult generateOrder(OrderParam orderParam);
   
   /**
    * 取消单个超时订单
    */
   @Transactional
   void cancelOrder(Long orderId);
}
