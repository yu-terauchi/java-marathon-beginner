package practice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 受け取った値を計算して出力するためのコントローラ
 * @author yu.terauchi
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {
	
	@Autowired
	private HttpSession session;//これ書いたら外部でオブジェクト化して参照してくれるから各メソッドでオブジェクト化する必要なし
	
		/**
		 * 入力フォーム画面へ
		 * @return
		 */
		@RequestMapping("/toInput")
		public String toInput() {
			System.out.println("inputvalueへ飛びます");
			return "10km/inputvalue";
		}

		/**
		 * フォームで入力された名前を直接出力画面へ
		 * @param name
		 * @return
		 */
		@RequestMapping("/toOutput")
		public String toOutput(String num1,String num2) {
			session.setAttribute("num1",num1);//スコープへの箱詰め
			session.setAttribute("num2",num2);//スコープへの箱詰め
			return "10km/outputvalue";
		}
		
		/**
		 * 
		 * @param num1
		 * @param num2
		 * @return
		 */
		@RequestMapping("/toOutput2")
		public String toOutput2() {
			return "10km/outputvalue2";
		}
	}
