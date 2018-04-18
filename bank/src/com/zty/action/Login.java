package com.zty.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zty.dodao.Account;
import com.zty.services.LoginServices;

public class Login extends ActionSupport{

private LoginServices accountServices;
private Account ac;
private String caozuo;
private int jine;



	public String isLogin() throws Exception {	
	System.out.println("进入登录");
	System.out.println(ac.getAccountid());
	System.out.println(ac.getPassword());
	List<Account> lt=accountServices.isLogin(ac);
	System.out.println(lt);  
	if(lt.size()>0){
		
	Account acc=accountServices.findById(ac.getAccountid());
	Map session=ActionContext.getContext().getSession();
	session.put("acc", acc);	
       return SUCCESS;}
       
       
    else
    	return ERROR;
    		    		
	}
	

	
	public String update() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("update");
		Map session=ActionContext.getContext().getSession();
		Account ac2=(Account)session.get("acc");
		
		if("cunkuan".equals(caozuo)){
			System.out.println("+++++"+jine);
			
			double money=ac2.getMoney();
			System.out.println("存前"+money);
			double money2=money+jine;
			ac2.setMoney(money2);
			ac2.setPassword(ac.getPassword());
			accountServices.update(ac);
			
			System.out.println("存后"+money2);
			System.out.println("+ok");
		}	
		
		if("qukuan".equals(caozuo)){
			double money=ac2.getMoney();
			System.out.println("取前"+money);
			double money2=money-jine;
			ac2.setMoney(money2);
			System.out.println();
			accountServices.update(ac);
			System.out.println("取后"+money2);
		}
		return SUCCESS;
	}	
	
	public String findById() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("findbyid");
		ac=accountServices.findById(ac.getAccountid());
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	

	public LoginServices getAccountServices() {
		return accountServices;
	}

	public void setAccountServices(LoginServices accountServices) {
		this.accountServices = accountServices;
	}

	public Account getAc() {
		return ac;
	}

	public void setAc(Account ac) {
		this.ac = ac;
	}










	public String getCaozuo() {
		return caozuo;
	}










	public void setCaozuo(String caozuo) {
		this.caozuo = caozuo;
	}










	public int getJine() {
		return jine;
	}










	public void setJine(int jine) {
		this.jine = jine;
	}


	
	


}
