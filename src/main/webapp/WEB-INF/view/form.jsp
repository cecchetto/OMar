<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>O'Mar</title>

<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<input type="text" name="nameCompanyPass" class="form-control"
		id="nameCompanyPass" value="${company.nameCompany}"
		style="display: none;" />
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
			<!-- /.navbar-header -->
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li><a
							href="<%=request.getContextPath()%>/loadingPartureSubmit.do?code=${company.codCompany}"><i
								class="fa fa-table fa-fw"></i>Partenze</a></li>
						<li><a
							href="<%=request.getContextPath()%>/loadingFormSubmit.do?code=${company.codCompany}"><i
								class="fa fa-edit fa-fw"></i>Inserisci Partenze</a></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Inserisci nuova tratta</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-4">
									<form id="inputForm" name="inputForm">
										<div class="form-group">
											<label>Ora</label> <select id="hour">
												<option>01</option>
												<option>02</option>
												<option>03</option>
												<option>04</option>
												<option>05</option>
												<option>06</option>
												<option>07</option>
												<option>08</option>
												<option>09</option>
												<option>10</option>
												<option>11</option>
												<option>12</option>
												<option>13</option>
												<option>14</option>
												<option>15</option>
												<option>16</option>
												<option>17</option>
												<option>18</option>
												<option>19</option>
												<option>20</option>
											</select> <label>Minuti</label> <select id="minutes">
												<option>00</option>
												<option>01</option>
												<option>02</option>
												<option>03</option>
												<option>04</option>
												<option>05</option>
												<option>06</option>
												<option>07</option>
												<option>08</option>
												<option>09</option>
												<option>10</option>
												<option>11</option>
												<option>12</option>
												<option>13</option>
												<option>14</option>
												<option>15</option>
												<option>16</option>
												<option>17</option>
												<option>18</option>
												<option>19</option>
												<option>20</option>
												<option>21</option>
												<option>22</option>
												<option>23</option>
												<option>24</option>
												<option>25</option>
												<option>26</option>
												<option>27</option>
												<option>28</option>
												<option>29</option>
												<option>30</option>
												<option>31</option>
												<option>32</option>
												<option>33</option>
												<option>34</option>
												<option>35</option>
												<option>36</option>
												<option>37</option>
												<option>38</option>
												<option>39</option>
												<option>40</option>
												<option>41</option>
												<option>42</option>
												<option>43</option>
												<option>44</option>
												<option>45</option>
												<option>46</option>
												<option>47</option>
												<option>48</option>
												<option>49</option>
												<option>50</option>
												<option>51</option>
												<option>52</option>
												<option>53</option>
												<option>54</option>
												<option>55</option>
												<option>56</option>
												<option>57</option>
												<option>58</option>
												<option>59</option>
											</select> <label>Giorno</label> <select id="workinDay">
												<option>LUNEDI</option>
												<option>MARTEDI</option>
												<option>MERCOLEDI</option>
												<option>GIOVEDI</option>
												<option>VENERDI</option>
												<option>SABATO</option>
												<option>DOMENICA</option>
											</select>
										</div>
										<div class="form-group">
											<label>Partenza per</label> <select id="leaveFrom">
												<option>Capri</option>
												<option>Procida</option>
												<option>Forio via Ischia</option>
												<option>Casamicciola di Ischia</option>
												<option>Sorrento</option>
												<option>Forio</option>
												<option>Casimicciola</option>
											</select> <label>Gate</label> <select id="gate">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option>
												<option>6</option>
												<option>7</option>
												<option>8</option>
												<option>9</option>
												<option>10</option>
											</select>
										</div>
										<div class="form-group">
											<label>Compagnia</label> <select id="company">
												<option>SNAV</option>
												<option>NLG</option>
												<option>CAREMAR</option>
												<option>ALILAURO</option>
											</select> <label>Stato</label> <select id="state">
												<option>IN ORARIO</option>
												<option>IN PARTENZA</option>
												<option>PARTITO</option>
												<option>IN RITARDO</option>
												<option>SOSPESO</option>
											</select>
										</div>
										<div class="form-group">
											<label>Note</label>
											<textarea id="note" class="form-control" rows="3"></textarea>
										</div>
										<button type="submit" id="addButton">Inserisci</button>
									</form>
								</div>
							</div>
							<!-- /.row (nested) -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="dist/js/sb-admin-2.js"></script>

	<script>
		$(document).ready(function() {
			$("#company").val($("#nameCompanyPass").val());
			$("#company").prop('disabled', 'disabled');
			/* console.log($("#nameCompanyPass").val()); */
		});

		$('#inputForm').submit(
				function() {

					var formData = '';
					$('#inputForm').find('input, textarea, select').each(
							function(i, field) {
								formData += field.value + '&';
							});
					console.log(JSON.stringify(formData));

					jQuery.ajax({
						type : "POST",
						url : "${pageContext.request.contextPath}/addForm.do",
						dataType : "json",
						contentType : "application/json; charset=utf-8",
						data : JSON.stringify(formData),
						success : function(data) {
							alert(data);
						},
						failure : function(errMsg) {
							alert(errMsg);
						}
					});
					return false;

				});
	</script>
</body>

</html>