package org.gupaoedu.abs.factory.pattern.samples.payment.natived.alipay;

import org.gupaoedu.abs.factory.pattern.samples.payment.FactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * {@link FactoryMethod} Alipay 支付工厂方法类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class AlipayFactoryMethod implements FactoryMethod {
    public Payment createPayment() {
        return new AlipayPayment();
    }
}
