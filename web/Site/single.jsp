<%@page import="modelo.Marca"%>
<%@page import="dao.MarcaDAO"%>
<%@page import="modelo.Categoria"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>


<%
//instanciar  a DAO
   



   CategoriaDAO dao1 = new CategoriaDAO();
    List<Categoria> lista1;

    
   MarcaDAO dao2 = new MarcaDAO();
    List<Marca> lista2;
    lista2 = dao2.listar();
    
    ProdutoDAO dao = new ProdutoDAO();
    List<Produto> lista;
    lista = dao.listar();

    if (request.getParameter("filtro") != null) {
        lista1 = dao1.filtro(request.getParameter("filtro"));
    } else {
        lista1 = dao1.listar();
    }
 if (request.getParameter("filtro") != null) {
        lista = dao.filtro(request.getParameter("filtro"));
    } else {
        lista = dao.listar();
    }
 
 if (request.getParameter("filtro") != null) {
        lista2 = dao2.filtro(request.getParameter("filtro"));
    } else {
        lista2 = dao2.listar();
    }

%>
<html>
<head>
<title>Swim Wear a E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Single :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/owl.carousel.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Swim Wear Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="js/jquery.min.js"></script>

<!-- cart -->
		<script src="js/simpleCart.min.js"> </script>
	<!-- cart -->
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<script src="js/imagezoom.js"></script>

						<!-- FlexSlider -->
  <script defer src="js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<script>
// Can also be used with $(document).ready()
$(window).load(function() {
  $('.flexslider').flexslider({
    animation: "slide",
    controlNav: "thumbnails"
  });
});
</script>



</head>
<body>
	<!--header-->
		<div class="header">
			<div class="header-top">
			<div class="container">
				 <div class="lang_list">
					<select tabindex="4" class="dropdown1">
						<option value="" class="label" value="">En</option>
						<option value="1">English</option>
						<option value="2">French</option>
						<option value="3">German</option>
					</select>
   			</div>
				<div class="top-right">
				<ul>
					<li class="text"><a href="login.jsp">login</a>
					<li><div class="cart box_1">
							<a href="checkout.jsp">
								 <span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span>) 
							</a>	
							<p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
							<div class="clearfix"> </div>
						</div></li>
				</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
			<div class="header-bottom">
					<div class="container">
<!--/.content-->

<div class="content white">
	<nav class="navbar navbar-default" role="navigation">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
	        <h1 class="navbar-brand"><a  href="index.jsp">swim wear</a></h1>
	    </div>
	    <!--/.navbar-header-->
	
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                
	        <ul class="nav navbar-nav">
			<li><a href="index.jsp">Home</a></li>
		        <li class="dropdown">
                            
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Categoria<b class="caret"></b></a>
                            
		            <ul class="dropdown-menu multi-column columns-3">
                                
			            <div class="row">
				                  <% for (Categoria cat : lista1) {%>
				            <div class="col-sm-4">
					            <ul class="multi-column-dropdown">
						            <li><a class="list" href="products.jsp"><%=cat.getNome()%></a></li>
						         
                                                    </ul>
				            </div>
				         
				         <%}%>
			            </div>
		            </ul>
		        </li>
		     
					
	        </ul>
	    </div>
	    <!--/.navbar-collapse-->
	</nav>
	<!--/.navbar-->
</div><!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->
					<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!--header-->
                                         
					<div class="col-md-4 single-grid">
                                                <% for (Produto item : lista)  {%>
						<div class="flexslider">
							<ul class="slides">
								<li data-thumb="../arquivos/<%=item.getImagem1()%>">
									<div class="thumb-image"> <img src="../arquivos/<%=item.getImagem1()%>" data-imagezoom="true" class="img-responsive"> </div>
								</li>
								<li data-thumb="../arquivos/<%=item.getImagem2()%>">
									 <div class="thumb-image"> <img src="../arquivos/<%=item.getImagem2()%>" data-imagezoom="true" class="img-responsive"> </div>
								</li>
								<li data-thumb="../arquivos/<%=item.getImagem3()%>">
								   <div class="thumb-image"> <img src="../arquivos/<%=item.getImagem3()%>" data-imagezoom="true" class="img-responsive"> </div>
								</li> 
							</ul>
						</div>
                                                                <%}%>
					</div>	
					<div class="col-md-4 single-grid simpleCart_shelfItem">		
                                            <% for (Produto item : lista)  {%>
                                       
                                            <h3><%=item.getTitulo()%></h3>
							<p><%=item.getDescricao()%> </p>
								
							<div class="galry">
								<div class="prices">
									<h5 class="item_price">Preço: <%=item.getPreco()%> </h5>
								</div>
								
								<div class="clearfix"></div>
							</div>
                                                        
								<p class="qty"> Quant:  </p><input min="1" type="number" id="quantity" name="quantity" value="1" class="form-control input-small">
							<div class="btn_form">
								<a href="#" class="add-cart item_add">Adicionar ao carrinho</a>	
							</div>
							<div class="tag">
                                                            <%  for (Categoria cat : lista1) { %>
								<p>Categoria : <a href="#"> <%=cat.getNome() %> </a></p>
                                                                <%}%>
							
							</div>
                                                                <%}%>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
<!-- collapse -->
		
<!-- collapse -->
		<div class="related-products">
			<div class="container">
				<h3>Produtos</h3>
				<div class="product-model-sec single-product-grids">
					<div class="product-grid single-product">
                                            <% for ( Produto item : lista) { %>
						<a href="single.jsp">
						<div class="more-product"><span> </span></div>						
						<div class="product-img b-link-stripe b-animate-go  thickbox">
							<img src="../arquivos/<%=item.getImagem1()%>" class="img-responsive" alt="">
							<div class="b-wrapper">
							<h4 class="b-animate b-from-left  b-delay03">							
							<button> + </button>
							</h4>
							</div>
						</div>
						</a>					
						<div class="product-info simpleCart_shelfItem">
							<div class="product-info-cust prt_name">
								<h4><%=item.getTitulo()%></h4>								
								<span class="item_price"><%=item.getPreco() %></span>
																<div class="clearfix"> </div>
							</div>												
						</div>
                                                <%}%>
					</div>
					
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
</div>
	<!--footer-->
		<div class="footer-section">
			<div class="container">
				<div class="footer-grids">
					<div class="col-md-2 footer-grid">
					<h4>company</h4>
					<ul>
						<li><a href="products.jsp">products</a></li>
						<li><a href="#">Work Here</a></li>
						<li><a href="#">Team</a></li>
						<li><a href="#">Happenings</a></li>
						<li><a href="#">Dealer Locator</a></li>
					</ul>
				</div>
					<div class="col-md-2 footer-grid">
					<h4>service</h4>
					<ul>
						<li><a href="#">Support</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Warranty</a></li>
						<li><a href="contact.jsp">Contact Us</a></li>
					</ul>
					</div>
					<div class="col-md-2 footer-grid">
					<h4>order & returns</h4>
					<ul>
						<li><a href="#">Order Status</a></li>
						<li><a href="#">Shipping Policy</a></li>
						<li><a href="#">Return Policy</a></li>
						<li><a href="#">Digital Gift Card</a></li>
					</ul>
					</div>
					<div class="col-md-2 footer-grid">
					<h4>legal</h4>
					<ul>
						<li><a href="#">Privacy</a></li>
						<li><a href="#">Terms and Conditions</a></li>
						<li><a href="#">Social Responsibility</a></li>
					</ul>
					</div>
					<div class="col-md-4 footer-grid1">
					<div class="social-icons">
						<a href="#"><i class="icon"></i></a>
						<a href="#"><i class="icon1"></i></a>
						<a href="#"><i class="icon2"></i></a>
						<a href="#"><i class="icon3"></i></a>
						<a href="#"><i class="icon4"></i></a>
					</div>
					<p>Copyright &copy; 2015 Swim Wear. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
					</div>
				<div class="clearfix"></div>
				</div>
			</div>
		</div>
	<!--footer-->
			
</body>
</html>