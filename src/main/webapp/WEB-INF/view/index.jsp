<!DOCTYPE html>

<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>O'Mar</title>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

</head>

<body>
	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">O'Mar v0.1</a>
			</div>

			<div class="navbar-default sidebar">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li><a href="<%=request.getContextPath()%>/loadingPartureSubmit.do?code=${company.codCompany}"><i
								class="fa fa-table fa-fw"></i>Partenze</a></li>
						<li><a href="<%=request.getContextPath()%>/loadingFormSubmit.do?code=${company.codCompany}"><i
								class="fa fa-edit fa-fw"></i>Inserisci Partenze</a></li>
					</ul>
				</div>
			</div>
		</nav>

		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Piano di viaggio : <b> ${company.nameCompany} - ${dateToday} </b></div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table class="table table-striped table-bordered table-hover"
								id="dataTables">
								<thead>
									<tr>
										<th>Orario</th>
										<th>Partenza Per</th>
										<th>Compagnia</th>
										<th>Stato</th>
										<th>Gate</th>
										<th>Note</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${lineSegregated}" var="informationLine">
										<tr>
											<td style="display: none;">${informationLine.idLine}</td>
											<td>${informationLine.timeDeparture}</td>
											<td>${informationLine.leaveFrom}</td>
											<td>${informationLine.codRefCompany.nameCompany}</td>
											<td>${informationLine.state}</td>
											<td>${informationLine.gate}</td>
											<td>${informationLine.note}</td>
											<td><button id="button_${informationLine.idLine}" name="button_${informationLine.idLine}" data-toggle="modal"
												data-target="#myModal">Modifica</button></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- /#wrapper -->
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<c:set var="companyCode" scope="session" value="1" />
					<%@include file="popUp.jsp"%>
				</div>
				<!-- <div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div> -->
			</div>
		</div>
	</div>


	<!-- jQuery -->
	<script src="vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="vendor/raphael/raphael.min.js"></script>
	<script src="vendor/morrisjs/morris.min.js"></script>
	<script src="data/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="dist/js/sb-admin-2.js"></script>

	<script>
		$( "#button_14" ).click(function() {
			$("#hour").val("07");
			$("#minute").val("30");
			$("#company").val("SNAV");
			$("#gate").val("1");
			$("#state").val("IN PARTENZA");
			$("#textNote").val("Festivi e Feriali");
		});
	</script>
</body>

</html>