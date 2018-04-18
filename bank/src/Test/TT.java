package Test;

import java.util.List;

import com.zty.dodao.Account;
import com.zty.impl.LoginImpl;

public class TT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginImpl aa=new LoginImpl();
		
		Account ac=new Account();
		ac.setAccountid(123456);
		ac.setPassword(123456);
		List<Account> lt= aa.isLogin(ac);
		System.out.println(lt.size());
		
		
	}

}
