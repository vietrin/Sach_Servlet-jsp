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
<style type="text/css">
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
					<h3>THÔNG TIN CHI TIẾT SÁCH</h3>
					<div>
						<div
							style="width: 40%; float: left; border-left: dotted 1px; border-color: azure">
							<img src="${sach.anhbia}" width="100%">
						</div>
						<div style="width: 60%; float: left; padding: 10px">
							<h4 style="font-weight: bold; color: red">Tên sách: ${sach.tensach}</h4>
							<p style="text-align: justify">
								<span style="font-weight: bold"> Mô tả: </span>Để thành công
								trong môi trường kinh doanh cạnh tranh hiện nay, các giám đốc dự
								án phải đạt được kết quả trong phạm thời gian và ngân sách đưa
								ra. Biết cách áp dụng các quy trình, phương pháp và kỹ thuật chỉ
								dẫn trong cuốn Quản Lý Dự Án này, bạn sẽ tăng tối đa khả năng
								thực hiện công việc và đảm bảo đạt kết quả tối ưu khi thực hiện
								dự án. Được thiết kế phù hợp với tất cả các nhà quản lý ở đủ mọi
								trình độ, cẩm nang này sẽ trang bị cho bạn những kiến thức cần
								thiết trong việc quản lý mọi dự án, dù lớn hay nhỏ, để đạt đến
								thành công. Từ việc khởi xướng một dự án, thúc đẩy, phát triển
								nhóm dự án đến việc vượt qua những khó khăn, trở ngại; mỗi một
								khía cạnh của quản lý dự án chuyện nghiệp đều được trình bày một
								cách rõ nét. Cẩm nang bao gồm các hướng dẫn từng bước về hoạch
								định dự án và 101 mẹo vặt cung cấp cho bạn những lời khuyên thực
								tế.
							</p>
							<p style="font-weight: bold">
								Giá bán: <span style="color: red; font-size: 16pt">
									61,000 VNĐ </span>
							</p>
						</div>
						<div>
							<div id="Datmua">
								<a
									href="/GioHang/ThemGiohang?iMasach=11&amp;strURL=http%3A%2F%2Flocalhost%3A1456%2FBookStore%2FDetails%2F11"
									class="list-group-item"> ĐẶT MUA </a>
							</div>
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
