<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
    
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="ht" %>
 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
	</head>
	<body>
		<ht:form action="/login">
			Selamat datang, <bean:write name="loginForm" property="username"/>
			<br/>
			<input type="button" value="Hello" onclick="hello()"/>
			<input type="button" value="Customer" onclick="customer()"/>
			<input type="button" value="Add Card" onclick="addCard()"/>
			<ht:hidden property="task"/>
		</ht:form>
		
		
		<script language="javascript" type="text/javascript">
			function hello(){
				document.forms[0].task.value = "openHello";
				document.forms[0].action = "helloWorld.do";
				document.forms[0].submit();
			}
			function customer(){
				document.forms[0].task.value = "registerCustomer";
				document.forms[0].action = "customer.do";
				document.forms[0].submit();
			}
			function addCard(){
				document.forms[0].task.value = "openAdd";
				document.forms[0].action = "card.do";
				document.forms[0].submit();
			}
		</script>
	</body>
</html>