<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>��½</title>
		<script type="text/javascript">
			var result = "${result}";
			if(result != null && result != ""){
				alert(result);
			}
		</script>
	</head>
	<body>
		<s:form action="login" >
			<s:textfield label="�û���" name="username" />
			<s:password label="����" name="password" />
			<s:submit value="�ύ" />
		</s:form>
	</body>
</html>