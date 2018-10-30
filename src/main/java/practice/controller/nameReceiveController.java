package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * リクエストを受け取るコントローラ.
 * 
 * @author yu.terauchi
 *
 */
@Controller
@RequestMapping("/nameReceive")
public class nameReceiveController {

	/**
	 * 入力フォームへ入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		System.out.println("inputへ飛びます");
		return "1km/inputname";
	}

	/**
	 * フォームで入力された名前を直接出力画面へ表示する.
	 * 
	 * @param name リクエストパラメータで送られてくる名前
	 * @param model モデル
	 * @return　出力画面
	 */
	@RequestMapping("/toOutput")
	public String toOutput(String name,Model model) {
		System.out.println(name);
		model.addAttribute("name",name);//スコープへのは箱詰め
		return "1km/outputname";
	}
}
