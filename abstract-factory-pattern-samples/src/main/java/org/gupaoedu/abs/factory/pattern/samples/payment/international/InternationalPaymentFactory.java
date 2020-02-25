package org.gupaoedu.abs.factory.pattern.samples.payment.international;

import org.gupaoedu.abs.factory.pattern.samples.payment.AbstractPaymentFactory;
import org.gupaoedu.abs.factory.pattern.samples.payment.Channel;
import org.gupaoedu.abs.factory.pattern.samples.payment.Payment;
import org.gupaoedu.abs.factory.pattern.samples.payment.Refund;
import org.gupaoedu.abs.factory.pattern.samples.payment.international.apple.AppleFactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.international.apple.AppleRefund;
import org.gupaoedu.abs.factory.pattern.samples.payment.international.mastercard.MasterCardFactoryMethod;
import org.gupaoedu.abs.factory.pattern.samples.payment.international.mastercard.MasterCardRefund;

/**
 * 国际支付工厂类 {@link InternationalPaymentFactory}
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public class InternationalPaymentFactory extends AbstractPaymentFactory {

    @Override
    public Payment createPayment(Integer channel) {
        beforeProcess();
        Payment payment;
        if (Channel.APPLE.getCode().equals(channel)) {
            payment = new AppleFactoryMethod().createPayment();
        } else if (Channel.MASTER_CARD.getCode().equals(channel)) {
            payment = new MasterCardFactoryMethod().createPayment();
        } else {
            throw  new RuntimeException("无效的支付渠道");
        }
        afterProcess();
        return payment;
    }

    @Override
    public Refund createRefund(Integer channel) {
        beforeProcess();
        Refund refund;
        if (Channel.APPLE.getCode().equals(channel)) {
            refund = new AppleRefund();
        } else if (Channel.MASTER_CARD.getCode().equals(channel)) {
            refund = new MasterCardRefund();
        } else {
            throw new RuntimeException("无效的支付渠道");
        }
        afterProcess();
        return refund;
    }
}
