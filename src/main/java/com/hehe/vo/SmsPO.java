package com.hehe.vo;

/**
 * ClassName: SmsPO <br/>
 * Description: <br/>
 * date: 2019/10/12 9:34<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
public class SmsPO {
    private String smsText ;
    private String smsMob ;
    private String status ;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getSmsMob() {
        return smsMob;
    }

    public void setSmsMob(String smsMob) {
        this.smsMob = smsMob;
    }
}
