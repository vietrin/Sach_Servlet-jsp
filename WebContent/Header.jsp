<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Trang chủ</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Shop Homepage - Start Bootstrap Template</title>
<!-- Bootstrap Core CSS -->
<link href="Content/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS -->
<link href="Content/shop-homepage.css" rel="stylesheet" />


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>
.MenuTrang li {
	display: inline;
}
</style>
<body>
<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="Trang-chu">Sachviet.com</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="Trang-chu">TRANG CHỦ</a></li>
				  	<c:choose>
								<c:when test="${sessionScope.account == null ||  sessionScope.account == ''}">
									<li><a href="Dang-ky">ĐĂNG K&#221;</a></li>
									<li><a href="Dang-nhap"> ĐĂNG NHẬP </a></li>
								</c:when>
								<c:otherwise>
									<li><a href="Trang-chu"> ${sessionScope.account},ĐĂNG XUẤT <%session.invalidate(); %> </a></li>
								</c:otherwise>
					</c:choose>
					<li><a href="Gio-hang"style="color: white; font-weight: bold; text-decoration: none;"><img src="images/giohang.gif" />Giỏ Hàng (${gio})</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">

				<p class="lead">CHỦ ĐỀ SÁCH</p>
				<div class="list-group">
					<a href="/Chu-de?ma=" class="list-group-item">Ngoại ngữ </a> 
					<a href="/BookStore/SPTheochude/2"class="list-group-item"> C&#244;ng nghệ th&#244;ng tin </a> 
					<a href="/BookStore/SPTheochude/3" class="list-group-item"> Luật</a> 
					<a href="/BookStore/SPTheochude/4" class="list-group-item"> Văn học </a> 
					<a href="/BookStore/SPTheochude/5"class="list-group-item"> Khoa học kỹ thuật </a> 
					<a href="/BookStore/SPTheochude/6" class="list-group-item">N&#244;ng nghiệp </a>
				</div>


				<p class="lead">NHÀ XUẤT BẢN</p>
				<div class="list-group">
					<a href="/BookStore/SPTheoNXB/1" class="list-group-item">
						Nh&#224; xuất bản Trẻ </a> <a href="/BookStore/SPTheoNXB/2"
						class="list-group-item"> NXB Thống k&#234; </a> <a
						href="/BookStore/SPTheoNXB/3" class="list-group-item"> Kim
						đồng </a> <a href="/BookStore/SPTheoNXB/4" class="list-group-item">
						Đại học quốc gia </a> <a href="/BookStore/SPTheoNXB/5"
						class="list-group-item"> Văn h&#243;a nghệ thuật </a> <a
						href="/BookStore/SPTheoNXB/6" class="list-group-item"> Văn
						h&#243;a </a> <a href="/BookStore/SPTheoNXB/7" class="list-group-item">
						Lao động - X&#227; hội </a> <a href="/BookStore/SPTheoNXB/8"
						class="list-group-item"> Khoa Học &amp; Kỹ Thuật </a>
				</div>




			</div>
			<div class="col-md-9">
				<div class="row carousel-holder">
					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carousel-example-generic" data-slide-to="0"
									class="active"></li>
								<li data-target="#carousel-example-generic" data-slide-to="1"></li>
								<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner">
								<div class="item active">
									<img class="slide-image" src="images/ancient-place.jpg" alt="">

								</div>
								<div class="item">
									<img class="slide-image" src="images/riverside-city.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="images/kayaks.jpg" alt="">
								</div>


							</div>
							<a class="left carousel-control" href="#carousel-example-generic"
								data-slide="prev"> <span
								class="glyphicon glyphicon-chevron-left"></span>
							</a> <a class="right carousel-control"
								href="#carousel-example-generic" data-slide="next"> <span
								class="glyphicon glyphicon-chevron-right"></span>
							</a>
						</div>
					</div>
				</div>

</body>
</html>