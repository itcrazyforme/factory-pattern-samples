package org.gupaoedu.abs.factory.pattern.samples.payment.natived.weixin;

import org.gupaoedu.abs.factory.pattern.samples.payment.Refund;

/**
 * {@link Refund} 微信支付退款类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class WeixinRefund implements Refund {

    public String refund(String request) {
        return "微信支付-退款：" + request;
    }
}
