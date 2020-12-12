<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
<meta charset="UTF-8">

<title>AKST : <c:forEach var="description"
		items="${description}">${description.vName}</c:forEach></title>

<link rel="stylesheet" type="text/css" href="CSS/vId.css">
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
					<li><a href="NewArrivalServlet">Home</a></li>
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


					<div class="vId">



						<div class="display">


							<div class="displaytop">
								<hr
									style="background-color: crimson; height: 3px; border-style: none; border-radius: 1px">
								<br>

								<h1>
									<b> <c:forEach var="description" items="${description}">
                                                        
                            ${description.vName}
                            </c:forEach></b>
								</h1>
							</div>

							<div class="display1">
								<table style="margin-left: 40px">

									<tr>
										<td><c:forEach var="description" items="${description}"
												begin="0" end="0">
												<img src="${description.vPicture}" width="150">
											</c:forEach></td>
										<td><b><c:forEach var="description"
													items="${description}">
													<div class="table">
														<table>
															<tr>

																<th></th>
																<th style="color: goldenrod">Name</th>
																<th></th>
																<th>:</th>
																<th></th>
																<th style="color: crimson; text-align: center">${description.vName}
																</th>
																<th></th>
																<th></th>

															</tr>
															<tr>

																<th></th>
																<th style="color: goldenrod">Year</th>
																<th></th>
																<th>:</th>
																<th></th>
																<th style="color: crimson; text-align: center">
																	${description.vYear}</th>
																<th></th>
																<th></th>

															</tr>
															<tr>

																<th></th>
																<th style="color: goldenrod">Catogary</th>
																<th></th>
																<th>:</th>
																<th></th>
																<th style="color: crimson; text-align: center">${description.vCatogary}
																</th>
																<th></th>
																<th></th>

															</tr>
															<tr>

																<th></th>
																<th style="color: goldenrod">Price</th>
																<th></th>
																<th>:</th>
																<th></th>
																<th style="color: crimson; text-align: center">Rs
																	${description.vPrice}.00</th>
																<th></th>
																<th></th>

															</tr>

															<tr>
																<th></th>
																<th style="color: goldenrod">Likes</th>
																<th></th>
																<th>:</th>
																<th></th>
																<th style="color: crimson; text-align: center">
																	${description.vRate}</th>
																<th></th>
																<th></th>
															</tr>	
															
															<tr>	
																<th></th>
																<th></th>
																<th><form action="UserDislikesServlet"
																		method="get">
																	
																		<button class="send" value="${description.vId}" name="dislike"
																			type="submit"
																			style="margin: 10px; background: #cd5c5c;">Dislike</button></form></th>
																<th></th>
																			<th>
																			
																	<form action="UserLikesServlet"
																		method="get">	
																		<button class="send" value="${description.vId}" name="like"
																			type="submit"
																			style="margin: 10px; background: #1E90FF;">Like</button></form>

																	</th>					
																<th></th>
													
																<th></th>
																<th></th>
														
															</tr>




														</table>


													</div>

												</c:forEach> </b><br></td>
									</tr>
								</table>
								<br> <br>
								<button class="purchase">
									<b>Add to Cart</b><img src="videos_pics/cart1.png" width="32">
								</button>


								<button class="add">
									<img src="videos_pics/purchase.png" width="32"><b>Purchase
										now</b>
								</button>
							</div>
						</div>

					</div>
					<br>

					<div class="display2">

						<div class="displaytop">
							<hr
								style="background-color: crimson; height: 3px; border-style: none; border-radius: 1px">
							<br>

							<h3 style="background: crimson">
								<b>Official Trailer</b>
							</h3>


							<c:forEach var="extended" items="${extended}">
                 
                 					${extended.vExtended_Emberded}
                 		<br>
								<br>
								<br>
								<br>

							</c:forEach>



							<c:forEach var="description" items="${description}">


								<h4>
									<b style="color: crimson; font-size: 16px">Description</b><br>
									${description.vDescription}
								</h4>
							</c:forEach>
						</div>

					</div>


				</div>

			</div>
			<div class="body_right">
				<div class="cart">



					<h3>Cart</h3>

				</div>


				<div class="response">


					<h3>Response</h3>

					<div class="res">

						<c:forEach var="description" items="${description}">
							<form action="VideoCommentServlet" method="get">
								<input class="input" type="text" placeholder="  Leave a comment"
									name="cmt">
								<button class="send" value='${description.vId}' name="vId"
									type="submit">${description.vId}</button>
							</form>


						</c:forEach>

						<h4>Your Comments...!</h4>
						<c:forEach var="ucomments" items="${ucomments}">

							<table style="background: black;">

								<tr style="background: black;">

									<th
										style="width: 10px; margin-left: 10px; cellspacing =10px; padding-left: 10px; padding-right: 10px; font-size: 8px;">${ucomments.cId}
									</th>
									<th
										style="width: 10px; margin-left: 10px; cellspacing =10px; padding-left: 10px; padding-right: 10px; font-size: 8px;">
										:</th>
									<th style="width: 350px; font-size: 8px; overflow: visible;">${ucomments.cComment}</th>
									<th style="width: 180px;"><h5
											style="font-size: 6px; text-align: right; color: crimson; margin-right: 5px;">${ucomments.cDate}</h5>

										<form action="DeleteUserCommentsServlet" method="get">
											<button class="delete"
												style="font-size: 10px; float: right; margin-right: 5px;"
												name="delete" type="submit" value='${ucomments.cComment}'>delete</button>
										</form>
								</tr>
							</table>

						</c:forEach>

						<br>
						<h4>Other user's Comments...!</h4>

						<c:forEach var="comments" items="${comments}">
							<table>

								<tr>

									<th
										style="width: 10px; margin-left: 10px; cellspacing =10px; padding-left: 10px; padding-right: 10px; font-size: 8px;">${comments.cId}</th>
									<th
										style="width: 10px; margin-left: 10px; cellspacing =10px; padding-left: 10px; padding-right: 10px; font-size: 8px;">
										:</th>
									<th style="width: 350px; font-size: 8px;">${comments.cComment}</th>
									<th style="width: 180px;"><h5
											style="font-size: 6px; text-align: right; color: crimson; margin-right: 5px;">${comments.cDate}</h5>
								</tr>




							</table>

							<form class="reply_form" action="VideoCommentServlet"
								method="post">
								<input class="reply" type="text" placeholder="  Leave a Reply"
									name="reply">
								<button class="send" value='${comments.cId}' name="cId"
									type="submit">Reply</button>
							</form>

							<table>
								<tr>


								</tr>
							</table>
						</c:forEach>



					</div>


				</div>

			</div>




		</div>

		<div class="footers"></div>
		<div class="L_container"></div>
		<div class="R_container"></div>

	</div>

</body>
</html>