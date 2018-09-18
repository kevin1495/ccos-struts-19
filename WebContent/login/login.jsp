<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
 <!--prefix untuk awalan tag-->
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
.field{
	display:inline-block;
}
</style>
</head>
<body>
	<html:form method="post" action="/login">
		<div>
			<div class="field">Username</div>
			<div class="field"><html:text property="username"/></div>
		</div>
		<div>
			<div class="field">Passwords</div>
			<div class="field"><html:password property="password"/></div>
		</div>
		<div>
			<div><input type="button" onclick="login()" value="login" ></div>
		</div>
		<html:hidden property="task"/>
	</html:form>
	
	<script type="text/javascript">
		function login(){
			document.forms[0].task.value='doLogin';
			document.forms[0].submit();
		}
	</script>
</body>
</html>