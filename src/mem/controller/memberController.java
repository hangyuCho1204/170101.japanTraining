package mem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class memberController {
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String signIn(){
		System.out.println("���� ��� ��Ʈ�ѷ�");
		return "signIn";
	}
}