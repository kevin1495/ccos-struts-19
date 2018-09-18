
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Customer</title>
<style>
.field{
	display:inline-block;
}
</style>
</head>
<body>
	<html:form action="/customer">
		<div>
			<div class="field">Name</div>
			<div class="field"><html:text property="name"/></div>
		</div>
		<div>
			<div class="field">Gender</div>
			<div class="field">
				<html:radio property="gender" value="Male" title="Male"/>Male&nbsp;
				<html:radio property="gender" value="Female"/>Female&nbsp;
			</div>
		</div>
		<div>
			<div class="field">Address</div>
			<div class="field"><html:text property="address"/></div>
		</div>
		<div>
			<div class="field">ID Type</div>
			<div class="field">
				<html:select property="idType">
					<html:option value="KTP"/>
					<html:option value="SIM"/>
				</html:select>
			</div>
		</div>
		<div>
			<div class="field">ID No</div>
			<div class="field"><html:text property="idNo"/></div>
		</div>
		<div>
			<div class="field">Priority</div>
			<div class="field">
				<html:checkbox property="priority"/>
			</div>
		</div>
		<div>
			<div><input type="button" onclick="view()" value="Register" ></div>
		</div>
		<html:hidden property="task"/>
	</html:form>
	
	<script type="text/javascript">
			
			function view(){
				document.forms[0].task.value = "registerCustomer";
				document.forms[0].action = "register.do";
				document.forms[0].submit();
			}
		</script>
</body>
</html>