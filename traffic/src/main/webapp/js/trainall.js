function huanfn(){
	var decity=$("#start").val();
	var arrcity=$("#dest").val();
	$("#start").val(arrcity);
	$("#dest").val(decity);
}
function up(){
	$(".pkg_filter_item").css("height","105px");
	$(".slideup").css("display","none");
	$(".slidesign").css("display","block");
}
function sign(){
	$(".pkg_filter_item").css("height","308px");
	$(".slideup").css("display","block");
	$(".slidesign").css("display","none");
}
function moveon(){
	$(".APP_buy_detail").css("display","block");
}
function remove(){
	$(".APP_buy_detail").css("display","none");
}
/*function timebig(){
	$(".change1").css("font-size","150%");
}
function timenormal(){
	$(".change1").css("font-size","100%");
}*/