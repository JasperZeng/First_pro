package com.zty.services;

import java.util.List;
import com.zty.dodao.Account;

public interface LoginServices {
	
	public List<Account> isLogin(Account ac);
	public Account findById (int accountid);
	public void update(Account account);
    
}
