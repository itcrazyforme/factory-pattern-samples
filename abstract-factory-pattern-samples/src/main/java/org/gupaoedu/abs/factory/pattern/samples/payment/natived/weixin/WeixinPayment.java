package org.gupaoedu.abs.factory.pattern.samples.payment.natived.weixin;

import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * 微信支付实现类 {@link Payment}
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class WeixinPayment implements Payment {

    public String createOrder(String request) {
        return "微信支付-创建订单：" + request;
    }
}

