<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Index</title>

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

#Datmua a {
	clear: both;
	background-color: red;
	color: white;
	width: 120px;
	height: 35px;
	display: block;
	float: right;
	text-align: center;
	padding-top: 10px;
	text-decoration: none;
	font-weight: bold;
}

#Datmua a:hover {
	background-color: gray;
	color: red;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<div>
		<h3 style="Text-align: Center; color: red">SÁCH MỚI</h3>
		<div class="row">
			<c:forEach var="sach" items="${list}">
				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<a href="ChiTietSach.jsp?ma=${sach.masach}"> <img alt=""
							src="${sach.anhbia}" width="200" height="200" />
							<div>
								<h4 style="text-align: center">${sach.tensach}</h4>
							</div>
							<div class="ratings">
								<p class="pull-right">${sach.giaban }</p>
								<p>
								
									<span class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span>
								</p>
							</div>
						</a>
						<div>
							<div id="Datmua">
								<a
									href="Gio-hang?masach=${sach.masach}&&tensach=${sach.tensach}&&anhbia=${sach.anhbia}&&gia=${sach.giaban }"
									class="list-group-item"> ĐẶT MUA</a>
							</div>
						</div>
					</div>
				</div>
				
			</c:forEach>
		</div>
		<div class="MenuTrang">
			<div class="pagination-container">
				<ul class="pagination">
					<li class="active"><a>1</a></li>
					<li><a href="/BookStore?page=2">2</a></li>
					<li><a href="/BookStore?page=3">3</a></li>
					<li class="PagedList-skipToNext"><a href="/BookStore?page=2"
						rel="next">»</a></li>
				</ul>
			</div>
		</div>
	</div>
	</div>
	</div>
	</div>
	<!-- /.container -->
	<div class="container">
		<hr>
		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; MVC 5</p>
				</div>
			</div>
		</footer>
	</div>
	<!-- /.container -->
	<!-- jQuery -->
	<script src="/Scripts/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/Scripts/bootstrap.min.js"></script>
</body>
</html>

