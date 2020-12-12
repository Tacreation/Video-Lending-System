<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>AKST</title>
<link rel="stylesheet" type="text/css" href="CSS/home.css">
<link href="https://fonts.googleapis.com/css?family=Comfortaa"
	rel="stylesheet">
</head>
<body>

	<div class="main">

		<div class="heads">
			<div class="h_left">
				<div class="dropDown">
					<button class="dropbtn">Categories</button>
					<div class="dropdown-content">

						<a href="#">Action</a> <a href="#">Adventure</a> <a href="#">Animation</a>
						<a href="#">Biography</a> <a href="#">Comedy</a> <a href="#">Crime</a>
						<a href="#">Horror</a> <a href="#">Action</a> <a href="#">Adventure</a>
						<a href="#">Animation</a> <a href="#">Biography</a> <a href="#">Comedy</a>
						<a href="#">Crime</a> <a href="#">Horror</a> <a href="#">Action</a>
						<a href="#">Adventure</a> <a href="#">Animation</a> <a href="#">Biography</a>
						<a href="#">Comedy</a> <a href="#">Crime</a> <a href="#">Horror</a>
						<br>
					</div>
				</div>
			</div>
			<div class="navi">

				<ul>
					<li><a href="#home">Home</a></li>
					<li><a href="#news">News</a></li>
					<li><a href="#contact">Contact</a></li>
					<li><a href="#about">About</a></li>
				</ul>
				<div class="search-container">
					<form action="/action_page.php">
						<input type="text" placeholder=":  Quick Search" name="search">
						<button type="submit">
							<b> > </b>
						</button>
					</form>
				</div>

			</div>
			<div class="h_center1">
				<img src="Pictures/logo.png">
			</div>
			<div class="h_center2">
				<h2>AKSTVedios</h2>
			</div>
			<div class="h_center3"></div>
			<div class="h_right"></div>
		</div>

		<div class="bodys">
			<div class="body_left">

				<div class="display">

					<hr
						style="background-color: crimson; height: 3px; border-style: none; border-radius: 1px">
					<br>
					<div class="displaytop">

						<h1>
							<b> <c:forEach var="deadpool" items="${deadpool}">
                                                        
                            Latest : ${deadpool.vName}
                            </c:forEach></b>
						</h1>
					</div>

					<div class="display1">
						<table style="margin-left: 40px">
							<tr>
								<td><c:forEach var="deadpool" items="${deadpool}" begin="0"
										end="0">
                            ${deadpool.vEmberded}
                            </c:forEach></td>
								<td><b><c:forEach var="deadpool" items="${deadpool}">
											<form name="button" action="VideoDescriptionServlet"
												method="get">
												<button value='${deadpool.vId}' name="vId"
													style="border: none; background: none">
													<p>${deadpool.vDescription}</p>
												</button>
											</form>

										</c:forEach> </b><br></td>
							</tr>
						</table>

					</div>
					<br>
					<hr
						style="background-color: crimson; height: 3px; border-style: none; border-radius: 1px">
					<br>

					<div class="display2">
						<h3>New Arrivals</h3>

						<table cellspacing=" 10px;">
							<tr class="tr">

								<c:forEach var="latest" items="${latest}" begin="0" end="3">
									<td>
										<div class="emberded">${latest.vEmberded}</div>
										<hr
											style="margin-top: 10px; background: gray; height: 1px; border-style: none; border-radius: 1px">

										<form name="button" action="VideoDescriptionServlet"
											method="get">
											<button value='${latest.vId}' name="vId"
												style="border: none; background: none">
												<h4>${latest.vName}</h4>
												<h5>${latest.vYear}</h5>
											</button>
										</form>

									</td>
								</c:forEach>
							</tr>

						</table>

						<br>
						<br>

						<h3>Action movies</h3>

						<table cellspacing=" 10px;">
							<tr class="tr">

								<c:forEach var="Action" items="${Action}" begin="0" end="3">
									<td>
										<div class="emberded">${Action.vEmberded}</div>
										<hr
											style="margin-top: 10px; background: gray; height: 1px; border-style: none; border-radius: 1px">

										<form name="button" action="VideoDescriptionServlet"
											method="get">
											<button value='${Action.vId}' name="vId"
												style="border: none; background: none">
												<h4>${Action.vName}</h4>
												<h5>${Action.vYear}</h5>
											</button>
										</form>


									</td>
								</c:forEach>
							</tr>

						</table>


						<br>
						<br>

						<h3>Horror movies</h3>

						<table cellspacing=" 10px;">
							<tr class="tr">

								<c:forEach var="Horror" items="${Horror}" begin="0" end="3">
									<td>
										<div class="emberded">${Horror.vEmberded}</div>
										<hr
											style="margin-top: 10px; background: gray; height: 1px; border-style: none; border-radius: 1px">

										<form name="button" action="VideoDescriptionServlet"
											method="get">
											<button value='${Horror.vId}' name="vId"
												style="border: none; background: none">
												<h4>${Horror.vName}</h4>
												<h5>${Horror.vYear}</h5>
											</button>
										</form>


									</td>
								</c:forEach>
							</tr>

						</table>


						<br>
						<br>

						<h3>Thriller movies</h3>

						<table cellspacing=" 10px;">
							<tr class="tr">

								<c:forEach var="Thriller" items="${Thriller}" begin="0" end="3">
									<td>
										<div class="emberded">${Thriller.vEmberded}</div>
										<hr
											style="margin-top: 10px; background: gray; height: 1px; border-style: none; border-radius: 1px">

										<form name="button" action="VideoDescriptionServlet"
											method="get">
											<button value='${Thriller.vId}' name="vId"
												style="border: none; background: none">
												<h4>${Thriller.vName}</h4>
												<h5>${Thriller.vYear}</h5>
											</button>
										</form>


									</td>
								</c:forEach>
							</tr>

						</table>


					</div>
				</div>

			</div>
			<div class="body_right">
				<div class="cart">

					<h3>Cart</h3>

				</div>
			</div>
		</div>

		<div class="footers"></div>
		<div class="L_container"></div>
		<div class="R_container"></div>

	</div>

</body>
</html>