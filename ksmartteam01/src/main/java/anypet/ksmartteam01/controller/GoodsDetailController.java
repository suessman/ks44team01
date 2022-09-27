package anypet.ksmartteam01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GoodsDetailController {
	@GetMapping("/")
	public String goodsDetail(Model model) {
		return "goodsDetail";
	}
}