package com.jp.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;  // or:  jakarta.servlet.http.HttpServletRequest
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {

	@GetMapping("/") 
	public String index() {
		return "Greetings from Spring Boot!";
	}
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/client-ip-address",
        produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public String getClientIPAddress(HttpServletRequest request) {
		String ip = HttpUtils.getRequestIP(request);
		System.out.println(ip);
        return "Client IP Address: " + ip;
    }
}