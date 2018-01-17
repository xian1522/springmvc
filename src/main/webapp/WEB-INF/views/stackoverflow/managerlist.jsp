<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
				title:'stackoverflow',
				columns : [[
							{field: 'title',title:'标题',align:'center',width:500},
				            {field: 'content',title:'内容',align:'center',width:500}]],
				toolbar : [{
					  	text:'新增',
					  	iconCls:'icon-add',
					  	handler: addQuestion,
					  },
					  {
						text:'删除',
						iconCls:'icon-cut',
						handler:function(){alert('delete');}
					  }
					]
			});
		}
		//新增页面
		function addQuestion(){
			alert("adds");
		}
	</script>
</head>
<body>
<h2>stackoverflow</h2>
</body>
<div>
<table id="stackoverflowlist"> </table>
</div>
</html>
