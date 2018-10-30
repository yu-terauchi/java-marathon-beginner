package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	
	
	
}
