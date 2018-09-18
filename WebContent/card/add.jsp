
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Card</title>
<style>
.field{
	display:inline-block;
}
</style>
</head>
<body>
	<html:form action="/card">
		<div>
			<div class="field">Code</div>
			<div class="field"><html:text property="code"/></div>
		</div>
		<div>
			<div class="field">Name</div>
			<div class="field"><html:text property="name"/></div>
		</div>
		<div>
			<div class="field">Is deactivated</div>
			<div class="field">
				<html:checkbox property="isDeactivated"/>
			</div>
		</div>
		<div>
			<div class="field">Reason</div>
			<div class="field"><html:text property="reason"/></div>
		</div>
		<div>
			<div><input type="button" onclick="addCard()" value="Add Card" ></div>
		</div>
		<div>
			<div><input type="button" onclick="viewCard()" value="View Card(s)" ></div>
		</div>
		<html:hidden property="task"/>
	</html:form>
	
	<script language="javascript" type="text/javascript">
			
			function addCard(){
				document.forms[0].task.value = "addCard";
				document.forms[0].action = "card.do";
				document.forms[0].submit();
			}
			function viewCard(){
				document.forms[0].task.value = "openList";
				document.forms[0].action = "card.do";
				document.forms[0].submit();
			}
	</script>
</body>
</html>