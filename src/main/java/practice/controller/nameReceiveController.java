package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameReceive")
public class nameReceiveController {

	/**
	 * 
	 * 入力画面を表示する
	 * 
	 * @return
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		System.out.println("inputへ飛びます");
		return "1km/inputname";
	}

	/**
	 * フォームで入力された名前を直接出力画面へ
	 * @param name
	 * @return
	 */
	@RequestMapping("/toOutput")
	public String toOutput(String name,Model model) {
		System.out.println(name);
		model.addAttribute("name",name);//スコープへのは箱詰め
		return "1km/outputname";
	}
}
