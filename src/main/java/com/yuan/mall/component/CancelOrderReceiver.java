package com.yuan.mall.component;

import com.yuan.mall.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ykj
 * @date 2023/2/13/14:40
 * @apiNote 取消订单消息的处理者
 */
@Component
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {
   private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderSender.class);
   @Autowired
   private OmsPortalOrderService portalOrderService;
   @RabbitHandler
   public void handle(Long id){
      LOGGER.info("receive delay message orderId:{}",id);
      portalOrderService.cancelOrder(id);
      
   }
   
}
