package org.gupaoedu.abs.factory.pattern.samples.payment.natived;

import org.gupaoedu.abs.factory.pattern.samples.payment.AbstractPaymentFactory;
import org.gupaoedu.abs.factory.pattern.samples.payment.Channel;
import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;
import org.gupaoedu.abs.factory.pattern.samples.payment.Refund;
import org.gupaoedu.abs.factory.pattern.samples.payment.natived.alipay.AlipayFactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.natived.alipay.AlipayRefund;
import org.gupaoedu.abs.factory.pattern.samples.payment.natived.weixin.WeixinFactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.natived.weixin.WeixinRefund;

/**
 * 本地支付工厂类 {@link AbstractPaymentFactory}
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class NativePaymentFactory extends AbstractPaymentFactory {

    @Override
    public Payment createPayment(Integer channel) {
        beforeProcess();
        Payment payment;
        if (Channel.ALIPAY.getCode().equals(channel)) {
            payment = new AlipayFactoryMethod().createPayment();
        } else if (Channel.WEIXIN.getCode().equals(channel)) {
            payment = new WeixinFactoryMethod().createPayment();
        } else {
            throw new RuntimeException("无效的支付渠道");
        }
        afterProcess();
        return payment;
    }

    @Override
    public Refund createRefund(Integer channel) {
        beforeProcess();
        Refund refund;
        if (Channel.ALIPAY.getCode().equals(channel)) {
            refund = new AlipayRefund();
        } else if (Channel.WEIXIN.getCode().equals(channel)) {
            refund = new WeixinRefund();
        } else {
            throw new RuntimeException("无效的支付渠道");
        }
        afterProcess();
        return refund;
    }
}
