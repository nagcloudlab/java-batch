<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.example.entity.Transaction"%>
<html>

<head>
	<meta charset="UTF-8">
	<title>mts-v2</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" />
</head>

<body>

	<div class="container">

		<div class="display-1">mts-v2</div>
		<hr />

		<ul class="nav nav-pills">
			<li class="nav-item">
				<a class="nav-link" href="transfer-form.html">Transfer</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="statement">Statement</a>
			</li>
		</ul>
		<hr />


		<div class="row">
			<div class="col-8">
				<div class="card">
					<div class="card-header">Statement</div>
					<div class="card-body">
							<table class="table">
							<tbody>
							<%
								List<Transaction> transactions=(List<Transaction>)request.getAttribute("allTransactions");
								for(Transaction transaction:transactions){
							%>
							
							<tr>
								<td><%=transaction.getId() %></td>
								<td><%=transaction.getAmount() %></td>
								<td><%=transaction.getType() %></td>
							</tr>
								
							<%
								}
							%>
							</tbody>
							</table>
					</div>
				</div>
			</div>
		</div>


	</div>

</body>

</html>