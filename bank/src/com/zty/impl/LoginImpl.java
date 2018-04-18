package com.zty.impl;

import java.util.List;

import com.zty.dodao.Account;
import com.zty.dodao.AccountDAO;
import com.zty.services.LoginServices;

public class LoginImpl implements LoginServices{
private AccountDAO accountdao;
//µÇÂ¼	
@Override
public List<Account> isLogin(Account ac) {
	// TODO Auto-generated method stub	
	List<Account> lt= accountdao.findByExample(ac);
	return lt;
}
@Override
public Account findById(int accountid) {
	// TODO Auto-generated method stub
	return accountdao.findById(accountid);
}
@Override
public void update(Account account) {
	// TODO Auto-generated method stub
	accountdao.update(account);
}
public AccountDAO getAccountdao() {
	return accountdao;
}
public void setAccountdao(AccountDAO accountdao) {
	this.accountdao = accountdao;
}
	

	
}
