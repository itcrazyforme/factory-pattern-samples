package org.gupaoedu.abs.factory.pattern.samples.payment.international.mastercard;

import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * {@link Payment} Master Card 支付
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class MasterCardPayment implements Payment {

    public String createOrder(String request) {
        return "MasterCard 支付：" + request;
    }
}
