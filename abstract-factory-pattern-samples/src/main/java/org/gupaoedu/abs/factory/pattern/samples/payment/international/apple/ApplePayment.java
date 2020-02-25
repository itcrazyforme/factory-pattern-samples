package org.gupaoedu.abs.factory.pattern.samples.payment.international.apple;

import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * {@link Payment} 苹果支付对象类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class ApplePayment implements Payment {

    public String createOrder(String request) {
        return "苹果支付-创建订单";
    }
}
