package jp.co.cutedogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {

	@RequestMapping("/list")
	public String list() {
		return "list";
	}

}
