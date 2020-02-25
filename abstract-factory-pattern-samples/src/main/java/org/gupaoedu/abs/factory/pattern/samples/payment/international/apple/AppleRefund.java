package org.gupaoedu.abs.factory.pattern.samples.payment.international.apple;

import org.gupaoedu.abs.factory.pattern.samples.payment.Refund;

/**
 * {@link Refund} 苹果支付退款类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class AppleRefund implements Refund {

    public String refund(String request) {
        return "苹果支付-退款：" + request;
    }
}
