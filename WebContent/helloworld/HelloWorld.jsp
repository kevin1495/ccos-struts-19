<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<bean:write name="helloWorldForm" property="message" />
	</h1>
</body>
</html>