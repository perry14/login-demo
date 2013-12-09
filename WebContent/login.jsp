<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>登陆</title>
		<script type="text/javascript">
			var result = "${result}";
			if(result != null && result != ""){
				alert(result);
			}
		</script>
	</head>
	<body>
		<s:form action="login" >
			<s:textfield label="用户名" name="username" />
			<s:password label="密码" name="password" />
			<s:submit value="提交" />
		</s:form>
	</body>
</html>