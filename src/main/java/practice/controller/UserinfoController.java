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
	 * フォームで入力された値を受け取り、スコープに格納してフォワード
	 * @param model
	 * @param name
	 * @param age
	 * @param address
	 * @return
	 */
	@RequestMapping("/toOutput")
	public String toOutput(Model model,String name,String age,String address) {
		
		User user = new User();
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setAddress(address);
		
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("address",address);
		
		System.out.println("outputuserinfoへ飛びます");//経過確認用出力
		return "5km/outputuserinfo";
	}
	
	
	
	
	
}
