/*
点击上面的div, 切换登录和注册, 顺便改变样式
*/
function show() {
	var obj = event.target;
	// alert(obj.id);
	if(obj.id == "login") {
		// alert(true);
		login.style.backgroundColor = "#fff";
		login.style.color = "#34BB60";
		register.style.backgroundColor = "#34BB60";
		register.style.color = "#fff";
		loginForm.style.display = "block";
		registerForm.style.display = "none";
		var spans = registerForm.getElementsByTagName("span");
		for(var i=0; i<spans.length; i++) {
			spans[i].style.display = "none";
		}
	}
	if(obj.id == "register") {
		register.style.backgroundColor = "#fff";
		register.style.color = "#34BB60";
		login.style.backgroundColor = "#34BB60";
		login.style.color = "#fff";
		loginForm.style.display = "none";
		registerForm.style.display = "block";
		var spans = loginForm.getElementsByTagName("span");
		for(var i=0; i<spans.length; i++) {
			spans[i].style.display = "none";
		}
	}
}

/*
点击登录和注册按钮会进行校验
判断每个单选框是否为空, 若为空则提示不能为空
注册的时候判断两次输入的密码是否相同, 若不相同, 则提示两次密码输入不同
点击的时候判断验证码, 是否和生成的相同, 若不相同, 则提示验证码输入错误
 */
function loginConfirm() {

	// 用户名不填写的话, 显示用户名为空
	var loginNameVal = loginName.value;
	if(loginNameVal == "" || loginNameVal == null) {
		login_name_info.style.display = "inline-block";
	}
			
	// 密码不填写的话, 显示密码为空
	var loginPwdVal = loginPwd.value;
	if(loginPwdVal == "" || loginPwdVal == null) {
		login_pwd_info.style.display = "inline-block";
	}
	

	
	// 若验证码不填写则显示验证码为空
	var loginCodeVal = loginCode.value;
	if(loginCodeVal == "" || loginCodeVal == null) {
		login_code_info.style.display = "inline-block";
	}
	
			
}

function registerConfirm() {
	// 用户名不填写的话, 显示用户名为空
	var registerNameVal = registerName.value;
	if(registerNameVal == "" || registerNameVal == null) {
		register_name_info.style.display = "inline-block";
	}
			
	// 密码不填写的话, 显示密码为空
	var registerPwdVal = registerPwd.value;
	if(registerPwdVal == "" || registerPwdVal == null) {
		registerpwd_info.style.display = "inline-block";
	}
	
	// 若两次填写密码不同, 则显示两次输入密码不同
	var registerAgainPwdVal = register_again_pwd.value;
	if(registerAgainPwdVal == "" || registerAgainPwdVal == null) {
		register_again_pwd_info.innerText = "第二次输入的密码为空";
		register_again_pwd_info.style.display = "inline-block";
	}
	if(registerPwdVal!=registerAgainPwdVal) {
		register_again_pwd_info.style.display = "inline-block";
	}

	
	// 若验证码不填写则显示验证码为空
	var registerCodeVal = registerCode.value;
	if(registerCodeVal == "" || registerCodeVal == null) {
		register_code_info.style.display = "inline-block";
	}
	
}