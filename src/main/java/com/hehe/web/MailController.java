package com.hehe.web;

import com.hehe.service.MailService;
import com.hehe.vo.MailVo;
import com.hehe.vo.SmsPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;


    /**
     * 发送邮件的主界面
     */
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("mail/sendMail");//打开发送邮件的页面
        mv.addObject("from", mailService.getMailSendFrom());//邮件发信人
        return mv;
    }
    @GetMapping("/sms")
    public ModelAndView Sms() {
        ModelAndView mv = new ModelAndView("mail/sendSMS");//打开发送邮件的页面
        mv.addObject("from", "ok");//邮件发信人
        return mv;
    }


    /**
     * 发送邮件
     */
    @PostMapping("/mail/send")
    public MailVo sendMail(MailVo mailVo, MultipartFile[] files) {
        mailVo.setMultipartFiles(files);
        return mailService.sendMail(mailVo);
    }

  @GetMapping("/test")
    public int test(){
        return 1;
    }
    /**
     * 发送短信工具接口
     * @param smsPO
     * @return
     */
    @PostMapping("/sms/send")
    public SmsPO sendSms(SmsPO smsPO){

        return mailService.sendSMS(smsPO);
    }
}
