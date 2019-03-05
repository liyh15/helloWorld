$(function(){
	    $(".div2").click(function(){
	    	 $(this).parent().toggleClass('close1');
	         $(this).parent().toggleClass('open1');
	         $(this).toggleClass('close2');
	         $(this).toggleClass('open2');
	    });   
	});
function huanfn(){
	var decity=$("#p1").val();
	var arrcity=$("#p2").val();
	$("#p1").val(arrcity);
	$("#p2").val(decity);
}