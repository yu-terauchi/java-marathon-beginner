package practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import practice.domain.UserInfo;
import practice.repository.UserRepository;

/**
 * リクエストパラメータを受け取り、各処理後のデータを出力するコントローラ.
 * 
 * @author yu.terauchi
 *
 */
@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/toInput")
	public String toInput() {
		System.out.println("userInfoSearchへ飛びます");
		return "/20km/userInfoSearch";
	}

	/**
	 * @param id
	 *            フォームで受け取ったリクエストパラメータ
	 * @param model
	 *            モデル
	 * @return リクエストスコープに格納したオブジェクト
	 */
	@RequestMapping("/toDaoToOutput")
	public String toDaoToOutput(Integer id, Model model) {

		UserInfo userInfo = userRepository.load(id);
		System.out.println("DBから取り出した一行データをリポジトリからオブジェクトuserInfoとして受け取ってきたよ");

		model.addAttribute("userInfo", userInfo);
		System.out.println("リクエストスコープにオブジェクトデータを格納");

		return "20km/userInfoView";
	}
}
