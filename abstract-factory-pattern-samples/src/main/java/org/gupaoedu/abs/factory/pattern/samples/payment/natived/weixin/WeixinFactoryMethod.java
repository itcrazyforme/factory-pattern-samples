package org.gupaoedu.abs.factory.pattern.samples.payment.natived.weixin;

import org.gupaoedu.abs.factory.pattern.samples.payment.FactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;

/**
 * {@link FactoryMethod} 微信支付工厂方法
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class WeixinFactoryMethod implements FactoryMethod {
    public Payment createPayment() {
        return new WeixinPayment();
    }
}
