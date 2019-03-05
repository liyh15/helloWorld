<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人详情页</title>
<link rel="stylesheet" type="text/css" href="css/person_detail.css">
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/person_detail.js"></script>
</head>
<body>
	<div id="outer">
		<span id="title">基本信息</span>
		<form action="#" method="POST">
			<span><span class="red">*</span>昵称: </span><input type="text" name="nickname" value="未设置"><br>
			<span><span class="red">*</span>姓名: </span><input type="text" name="name" value="未设置"><br>
			<span>生日: </span><input type="text" name="phone" value="未设置"><br>
			<span><span class="red">*</span>性别: </span><input type="text" name="birthday" value="未设置"><br>
			<span>邮箱: </span><input type="text" name="email" value="未设置"><br>
			<span><span class="red">*</span>常住地: </span><input type="text" name="address" value="未设置"><br>
			<span>详细地址: </span><input type="text" name="address_detail" value="未设置"><br>
			<span>婚姻: </span><input type="text" name="" value="未设置"><br>
			<span><span class="red">*</span>职业: </span><input type="text" name="job" value="未设置"><br>
			<span>学历: </span><input type="text" name="" value="未设置"><br>
			<div id="head">
				<img alt="头像正在加载中..." src="image/head.png" >
				<input type="file" name="headImg" id="headImg" style="display: none">
				<label for="headImg">>>>更换头像</label>
			</div>
			<div>
				<input type="button" value="编辑" id="edit">
				<input type="submit" value="保存" id="save">
				<input type="reset" value="取消" id="cancel">
			</div>
		</form>
	</div>
	
</body>
</html>