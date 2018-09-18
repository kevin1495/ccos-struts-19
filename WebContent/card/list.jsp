
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
 <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Card List</title>
<style>
.field{
	display:inline-block;
}
</style>
</head>
<body>
	<html:form action="/card">
		<table border="1">
			<logic:empty name="cardForm" property="listData">
				<tr>
					<td colspan="2">
						Data is not found
					</td>
				</tr>
			</logic:empty>
			<logic:notEmpty name="cardForm" property="listData">
				<logic:iterate id="idList" name="cardForm" property="listData">
					<tr>
						<td>
							<a href="javascript:openDetail('<bean:write name="idList" property="code"/>');">
								<bean:write name="idList" property="code"/>
							</a>
						</td>
						<td><bean:write name="idList" property="name"/> </td>
						<td><bean:write name="idList" property="is_deactivated"/></td>
						<td><bean:write name="idList" property="reason"/></td>
					</tr>
				</logic:iterate>
			</logic:notEmpty>
		</table>
		<div>
			<div><input type="button" onclick="cancel()" value="Cancel" ></div>
		</div>
		<html:hidden property="task"/>
	</html:form>
	
	<script language="javascript" type="text/javascript">
			function openDetail(id){
				document.forms[0].task.value = "openDetail" + id;
				document.forms[0].action = "card.do";
				document.forms[0].submit();
			}
			function cancel(){
				document.forms[0].task.value = "openAdd";
				document.forms[0].action = "card.do";
				document.forms[0].submit();
			}
		</script>
</body>
</html>