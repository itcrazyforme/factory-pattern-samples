package org.gupaoedu.abs.factory.pattern.samples.payment.natived.alipay;

import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * 支付宝支付实现类 {@link Payment}
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class AlipayPayment implements Payment {

    public String createOrder(String request) {
        return "支付宝支付-创建订单：" + request;
    }
}
