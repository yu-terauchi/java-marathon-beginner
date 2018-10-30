package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import practice.domain.User;

/**
 * リクエストを受け取るコントローラクラス
 * 
 * @author yu.terauchi
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserinfoController {

	/**
	 * フォーム画面へ
	 * @return　　
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		System.out.println("inputuserinfoへ飛びます");//経過確認用出力
		return "5km/inputuserinfo";
	}
	
	/**
	 * 
	 * フォームで入力された値を受け取り、スコープに格納してフォワード.
	 * 
	 * @param model　モデル
	 * @param name　リクエストパラメータとしてフォームから送られてくる「名前」情報
	 * @param age　リクエストパラメータとしてフォームから送られてくる「年齢」情報
	 * @param address　リクエストパラメータとしてフォームから送られてくる「住所」情報
	 * @return　userオブジェクトのスコープ参照情報
	 */
	@RequestMapping("/toOutput")
	public String toOutput(Model model,String name,String age,String address) {
		
		User user = new User();
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setAddress(address);
		
		model.addAttribute("user",user);
		
		System.out.println("outputuserinfoへ飛びます");//経過確認用出力
		return "5km/outputuserinfo";
	}
	
	
	
	
	
}
