package org.gupaoedu.abs.factory.pattern.samples.payment;

/**
 * 支付场景抽象工厂类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public abstract class AbstractPaymentFactory {

    protected void beforeProcess() {
        System.out.println("交易对象创建前置处理");
    }

    public abstract Payment createPayment(Integer channel);

    public abstract Refund createRefund(Integer channel);

    protected void afterProcess() {
        System.out.println("交易对象创建后置处理");
    }

}
