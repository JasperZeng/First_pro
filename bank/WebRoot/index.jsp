<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
   <form action="/bank/update.action" method="post">
  <table border="" align="center">
  <tr><h1>自助存取款系统</h1></tr><br/>
  <tr><td>当前账号：<input type="text" name="accountid" id="accountid" value="${acc.accountid}" readonly></td>
      <td>余额：<input type="text" name="yue" id="yue" value="${acc.money}" readonly></td></tr><br/>
 <tr><td colspan="2">交易类型 </td></tr> <br/>
 <tr>
 <td><input type="radio" name="caozuo" id="cun" value="cunkuan">存款</td>
 <td><input type="radio" name="caozuo" id="qu" checked="checked" value="qukuan">取款</td>
 </tr><br/>
 <tr><td colspan="0">金额</td></tr><br/>
 <tr>
 <td><input type="text" name="jine" id="jine"></td>
 <td>元</td>
 </tr><br/>
 <tr><td align="center" colspan="2">
 <input type="submit" value="提交"></td></tr><br/>
  </table>
  </form> 
  </body>
</html>
