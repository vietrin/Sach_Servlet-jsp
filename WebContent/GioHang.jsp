<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

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

</head>
<body>
    <!-- Navigation -->
  	<jsp:include page="Header.jsp"></jsp:include>
                <div>
                    <h2 style="text-align:center">THÔNG TIN GIỎ HÀNG</h2>
                    <table align="center" border="1">
                        <tbody>
                            <tr style="text-align:center; font-weight:bold">
                                <td>  Mã sách </td>
                                <td> Tên sách </td>
                                <td> Ảnh bìa </td>
                                <td> Số lượng </td>
                                <td> Đơn giá </td>
                                <td> Thành tiền </td>
                                <td width="50px"></td>
                                <td width="50px"></td>
                                <td width="50px"></td>
                            </tr>
                            <c:forEach var="s" items="${sessionScope.SachDaMua}">
                            <tr style="text-align:center; font-weight:bold">
                                <td> ${s.masach } </td>
                                <td> ${s.tensach }</td>
                                <td><img src="${s.anhbia }" style="height: 100px ; width: 100px"></td>
                                <form action="Gio-hang" method="post">
                                	<td>
                                    	<input type="number" min="1" name="txtSoluong" value="${s.soluong }" style="background-color:yellow">
                                	</td>
                                	<td>${s.giaban } </td>
                               	 	<td>${s.thanhtien} </td>
                                	<td> <a href="#"> Chi tiết </a></td>                            	
                                	<input type="hidden" name="ms2" value="${s.masach}">
                        <!--        <td> <a href="/Gio-hang?masach=${s.masach}">Xóa</a></td>  --> 
                                	<td> <button type="submit" value="xoa">Xóa </button> </td>
                                	<td> <button type="submit"  value="capnhap">Cập nhập  </button> </td>
                                </form>
                            </tr>
                          	</c:forEach>
                            <tr style="font-weight: bold; text-align:right; color:red">
                                <td colspan="4"> Số lượng sách: ${gio} </td>
                                <td colspan="5"> Tổng tiền: ${thanhtien } VNĐ </td>
                            </tr>
                            <tr style="font-weight: bold; color:blue; text-align:right ">
                                <td colspan="9">
                                    <a href="/Giohang/XoaTatcaGiohang">Xóa Giỏ Hàng</a>
                                </td>
                            </tr>
                            <tr style="font-weight: bold; color:blue; text-align:right ">
                                <td colspan="9" align="center">
                                    <a href="/GioHang/Dathang">ĐẶT HÀNG</a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
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
