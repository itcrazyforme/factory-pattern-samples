package org.gupaoedu.abs.factory.pattern.samples.payment.international.mastercard;

import org.gupaoedu.abs.factory.pattern.samples.payment.Refund;

/**
 * {@link Refund} MasterCard 退款类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class MasterCardRefund implements Refund {

    public String refund(String request) {
        return "Master Card 支付-退款：" + request;
    }
}
