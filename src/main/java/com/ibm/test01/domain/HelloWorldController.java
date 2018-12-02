package com.ibm.test01.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloWorldController extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloWorldController.class);
	}

    @RequestMapping("/index")
    //@ResponseBody
    public String index(Model model) {
    	//System.out.println("xxxxxxxxxxxxxxxxxxx");
		model.addAttribute("name", "洪永才");
		model.addAttribute("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index";
    }
}