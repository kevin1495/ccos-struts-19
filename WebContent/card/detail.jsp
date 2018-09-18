
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
 <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Card</title>
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
			<div class="field"><html:text property="code" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Name</div>
			<div class="field"><html:text property="name" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Is Deactivated</div>
			<div class="field"><html:text property="isDeactivated" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Reason</div>
			<div class="field"><html:text property="reason" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Date Created</div>
			<div class="field"><html:text property="dateCreated" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Created By</div>
			<div class="field"><html:text property="createdBy" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Date Updated</div>
			<div class="field"><html:text property="dateUpdated" disabled="true"/></div>
		</div>
		<div>
			<div class="field">Updated By</div>
			<div class="field"><html:text property="updatedBy" disabled="true"/></div>
		</div>
		<div>
			<div><input type="button" onclick="back()" value="Back" ></div>
		</div>
		<html:hidden property="task"/>
	</html:form>
	
	<script language="javascript" type="text/javascript">
			function back(){
				document.forms[0].task.value = "openList";
				document.forms[0].action = "card.do";
				document.forms[0].submit();
			}
		</script>
</body>
</html>