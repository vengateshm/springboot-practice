package dev.vengateshm.springboot_practice.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("/sendEmail")
    public String sendEmail() {
        sendEmailService.sendEmail("vengateshm.13@gmail.com", "Test", "From SpringBoot app");
        return "Sent";
    }
}
