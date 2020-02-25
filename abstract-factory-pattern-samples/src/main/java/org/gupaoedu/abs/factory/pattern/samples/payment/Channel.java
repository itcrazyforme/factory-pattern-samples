package org.gupaoedu.abs.factory.pattern.samples.payment;

/**
 * 支付渠道定义枚举类
 *
 * @author <a href="mailto:563750241@qq.com">sam.liu</a>
 * @date created at 2/20/2020
 */
public enum Channel {
    ALIPAY(1, "支付宝"),
    WEIXIN(2, "微信"),
    APPLE(3, "Apple"),
    MASTER_CARD(4, "Master Card");

    private Integer code;
    private String comment;

    Channel(Integer code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public Integer getCode() {
        return code;
    }

    public String getComment() {
        return comment;
    }
}
