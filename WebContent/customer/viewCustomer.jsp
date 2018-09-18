<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
				<html:radio property="gender" value="Male"/>
				<html:radio property="gender" value="Female"/>
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
				<html:radio property="priority" value="yes"/>
				<html:radio property="priority" value="no"/>
			</div>
		</div>
	</html:form>
</body>
</html>