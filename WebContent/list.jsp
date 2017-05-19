<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib  prefix="s"  uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<STYLE type="text/css">
		.s1{
			background-color: gray;
		}
	
	</STYLE>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px"  width="60%">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>位置</th>
		</tr>
	<s:iterator  value="list"  var="d"  status="s">
		<s:if test="#s.odd">
		<tr  class="s1">
		</s:if>
		<s:else>
			<tr>
		</s:else>
			<td> <s:property  value="#d.deptno"/>  </td>
			<td> <s:property  value="#d.dname"/> </td>
			<td> <s:property  value="#d.loc"/> </td>
		</tr>
	</s:iterator>
	</table>
	
	<a  href="addDept.jsp">添加部门</a>

</body>
</html>