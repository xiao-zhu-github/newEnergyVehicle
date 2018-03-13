<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/css/themes/default.css" id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/css/responsive.css">
<!-- STYLESHEETS -->
<!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/css/themes/default.css" id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/css/responsive.css">


<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<!-- TABLE CLOTH -->
<!-- <link rel="stylesheet" type="text/css"
	href="/GreenCarWeb/company/js/tablecloth/css/tablecloth.min.css" /> -->
<link rel="stylesheet"
	href="/GreenCarWeb/company/css/bootstrap-table.css">
<link rel="stylesheet" href="/GreenCarWeb/company/css/bootstrap.min.css">
<!-- FONTS -->
<script src="/GreenCarWeb/company/js/jquery/jquery-2.0.3.min.js"></script>
<script>
function getDriverInfo(){
	$('#driverInfoTable').bootstrapTable('refresh',{limit:5,offset:0});
}

</script>
</head>
<body>
	<div class="box border purple" style="height: 100%">
		<div class="box-title">
			<h4>
				<i class="fa fa-list-ul"></i>公司驾驶人员信息
			</h4>
		</div>
		<div class="box-body" style="height: 100%">
			<!-- ORDERS -->
			<div class="row">
				<!-- ORDER SCROLL -->

				<!-- /ORDER SCROLL -->
				<!-- ORDER DETAILS -->
				<div class="col-md-8">
					<div class="box-body center"></div>
					<!-- BOX -->
					<div class="box border blue" style="margin-bottom: 10px">
						<div class="box-title">
							<h4>
								<i class="fa fa-table"></i>公司驾驶人员
							</h4>

						</div>
						<div class="box-body">
							<table>
								<tr>
									<td>车队号:<select id="teamNum">
											<option value="all">全部车队</option>
											<option value="carTeam001">车队一</option>
											<option value="carTeam002">车队二</option>
											<option value="carTeam003">车队三</option>
											<option value="carTeam004">车队四</option>
											<option value="carTeam005">车队五</option>
											<option value="carTeam006">车队六</option>
									</select>
									</td>
									<td>搜索关键字：<input type="text" id="keyword"
										name="keyword" />
									</td>
									<td><input type="submit" value="查询" onclick="getDriverInfo()" /></td>

									<td>
										<button class="btn btn-primary btn-lg" data-toggle="modal"
											data-target="#myModal">增加驾驶员</button>
									</td>


								</tr>
							</table>

							<table class="table table-striped" id="driverInfoTable">

								<!--表在这里  -->
							</table>
						</div>

					</div>
					<!-- /BOX -->
				</div>
				<!-- /ORDER DETAILS -->
			</div>
			<!-- ORDERS -->
		</div>
	</div>


	<!-- JQUERY UI-->
	<!-- <script
		src="/GreenCarWeb/company/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script> -->
	<!-- BOOTSTRAP -->
	<!-- <script src="bootstrap-dist/js/bootstrap.min.js"></script> -->


	<!-- DATE RANGE PICKER -->
	<script
		src="/GreenCarWeb/company/js/bootstrap-daterangepicker/moment.min.js"></script>

	<script
		src="/GreenCarWeb/company/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript"
		src="/GreenCarWeb/company/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="/GreenCarWeb/company/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript"
		src="/GreenCarWeb/company/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<!-- TABLE CLOTH -->
	<!-- <script type="text/javascript"
		src="/GreenCarWeb/company/js/tablecloth/js/jquery.tablecloth.js"></script>
	<script type="text/javascript"
		src="/GreenCarWeb/company/js/tablecloth/js/jquery.tablesorter.min.js"></script> -->
	<!-- COOKIE -->
	<!-- <script type="text/javascript"
		src="/GreenCarWeb/company/js/jQuery-Cookie/jquery.cookie.min.js"></script> -->
	<!-- CUSTOM SCRIPT -->
	<script src="/GreenCarWeb/company/js/script.js"></script>
	<script src="/GreenCarWeb/company/js/bootstrap.min.js"></script>
	<script
		src="/GreenCarWeb/company/js/bootstrap-table/bootstrap-table.js"></script>
	<script
		src="/GreenCarWeb/company/js/bootstrap-table/bootstrap-table-zh-CN.js"></script>
	<script src="/GreenCarWeb/company/js/companyDriver.js"></script>



</body>
</html>