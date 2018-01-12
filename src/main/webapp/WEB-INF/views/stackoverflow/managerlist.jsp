<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
	<%@include file="/WEB-INF/views/common/meta.jsp"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			loadGridData();
		});
		function loadGridData(){
			$("#stackoverflowlist").datagrid({
				width : 'auto',
				higth : '500',
				striped : true,
				singleSelect : true,
				url : contextPath+'/stackoverflow/findQuestionList',
				loadMsg : "数据加载中...",
				pagination : true,
				rownumbers : true,
				columns : [[
				            {field: 'content',title:'Item ID',align:'center',width:500}]]
			});
		}
	</script>
</head>
<body>
<h2>stackoverflow</h2>
</body>
<div>
<!-- 
<table class="easyui-datagrid" title="Basic DataGrid" style="width:100%;height:500px"
			data-options="singleSelect:true,
						  collapsible:true,
						  method:'get',
						  rownumbers:true,
						  pagination:true,
						  pageSize:10">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">Item ID</th>
				<th data-options="field:'productid',width:100">Product</th>
				<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
				<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
				<th data-options="field:'attr1',width:250">Attribute</th>
				<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
		</thead>
	</table> -->
<table id="stackoverflowlist"> </table>
</div>
</html>
