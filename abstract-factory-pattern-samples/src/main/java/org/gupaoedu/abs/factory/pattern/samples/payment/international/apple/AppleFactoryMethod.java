package org.gupaoedu.abs.factory.pattern.samples.payment.international.apple;

import org.gupaoedu.abs.factory.pattern.samples.payment.FactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * 支付工厂方法 {@link FactoryMethod}
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class AppleFactoryMethod implements FactoryMethod {
    public Payment createPayment() {
        return new ApplePayment();
    }
}
