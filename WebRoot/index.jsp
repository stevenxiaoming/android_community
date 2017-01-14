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
    <s:form action="user_login" method="post" namespace="/">
    	<h3><s:actionmessage /></h3>
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
  </body>
</html>
