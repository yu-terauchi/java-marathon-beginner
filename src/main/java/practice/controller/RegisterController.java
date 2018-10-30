package practice.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 受け取った値を計算するコントローラ.
 * 
 * @author yu.terauchi
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private ServletContext application;

	/**
	 * 入力フォーム画面へ.
	 * 
	 * @return　入力画面
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		return "15km/buyGoods";
	}

	/**
	 * 出力画面へ.
	 * 
	 * @param goods1　 商品1の価格の値
	 * @param goods2　 商品2の価格の値
	 * @param goods3 　商品3の価格の値
	 * @param total　税抜き価格
	 * @param includeTax 税込み価格
	 * @return 税抜き価格と税込み価格
	 */
	@RequestMapping("/toOutput")
	public String toOutput(String goods1,String goods2,String goods3) {
		
		int total = Integer.parseInt(goods1) + Integer.parseInt(goods2) + Integer.parseInt(goods3);
		int includeTax = total + (int)(total * 0.08);
		
		application.setAttribute("total", total);
		application.setAttribute("includeTax", includeTax);
		
		return "15km/totalPrice";
	}

}
