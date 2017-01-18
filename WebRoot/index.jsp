<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>community</title>
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
    <h3>登录测试</h3>
    <h4>登录验证提示：<s:actionmessage /></h4>
    <h4>SessionId:<%=session.getId() %></h4>
    <s:form action="user_login" method="post" namespace="/">
    	<h4>网页登录</h4>
    	<table>
    		<tr>
    			<td>学号：</td>
    			<td><input type="text" name="userid"></input></td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td><input type="password" name="password"></input></td>
    		</tr>
    		<tr>
    			<td colspan="2" ><input type="submit" value="登录"></td>
    		</tr>
    	</table>
    </s:form>
    <s:form action="user_mLogin" method="post" namespace="/">
    	<h4>APP手机登录</h4>
    	<table>
    		<tr>
    			<td>学号：</td>
    			<td><input type="text" name="userid"></input></td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td><input type="password" name="password"></input></td>
    		</tr>
    		<tr>
    			<td colspan="2" ><input type="submit" value="登录"></td>
    		</tr>
    	</table>
    </s:form>
    <p>url:http://community.stevenming.com.cn/user-mLogin</p>
    <p>提交格式：学号-userid，密码-password；</p>
    <p>返回数据:message;成功为-"登录成功！"，失败为-""用户名或密码错误！"</p>
    <p>测试用例：成功-userid=101,password=123</p>
  </body>
</html>
