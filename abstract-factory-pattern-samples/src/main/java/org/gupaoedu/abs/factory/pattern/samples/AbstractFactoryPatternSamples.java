package org.gupaoedu.abs.factory.pattern.samples;

import org.gupaoedu.abs.factory.pattern.samples.payment.AbstractPaymentFactory;
import org.gupaoedu.abs.factory.pattern.samples.payment.Channel;
import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;
import org.gupaoedu.abs.factory.pattern.samples.payment.Refund;
import org.gupaoedu.abs.factory.pattern.samples.payment.natived.NativePaymentFactory;

/**
 * 抽象工厂代码示例
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class AbstractFactoryPatternSamples {

    public static void main(String[] args) {
        AbstractPaymentFactory nativePaymentFactory = new NativePaymentFactory();
        Payment payment = nativePaymentFactory.createPayment(Channel.ALIPAY.getCode());
        System.out.println(payment.createOrder("0.1"));

        Refund refund = nativePaymentFactory.createRefund(Channel.ALIPAY.getCode());
        System.out.println(refund.refund("0.1"));
    }

}
