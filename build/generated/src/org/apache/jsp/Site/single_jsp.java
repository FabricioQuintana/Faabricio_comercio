package org.apache.jsp.Site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Marca;
import dao.MarcaDAO;
import modelo.Categoria;
import dao.CategoriaDAO;
import java.util.List;
import modelo.Produto;
import dao.ProdutoDAO;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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


      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Swim Wear a E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Single :: w3layouts</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Swim Wear Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- cart -->\n");
      out.write("\t\t<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("\t<!-- cart -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"js/imagezoom.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- FlexSlider -->\n");
      out.write("  <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Can also be used with $(document).ready()\n");
      out.write("$(window).load(function() {\n");
      out.write("  $('.flexslider').flexslider({\n");
      out.write("    animation: \"slide\",\n");
      out.write("    controlNav: \"thumbnails\"\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-->\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t <div class=\"lang_list\">\n");
      out.write("\t\t\t\t\t<select tabindex=\"4\" class=\"dropdown1\">\n");
      out.write("\t\t\t\t\t\t<option value=\"\" class=\"label\" value=\"\">En</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">English</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">French</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">German</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("   \t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-right\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"text\"><a href=\"login.jsp\">login</a>\n");
      out.write("\t\t\t\t\t<li><div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t\t\t\t\t <span class=\"simpleCart_total\"> $0.00 </span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"> 0 </span>) \n");
      out.write("\t\t\t\t\t\t\t</a>\t\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("<!--/.content-->\n");
      out.write("\n");
      out.write("<div class=\"content white\">\n");
      out.write("\t<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t    <div class=\"navbar-header\">\n");
      out.write("\t        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t        </button>\n");
      out.write("\t        <h1 class=\"navbar-brand\"><a  href=\"index.jsp\">swim wear</a></h1>\n");
      out.write("\t    </div>\n");
      out.write("\t    <!--/.navbar-header-->\n");
      out.write("\t\n");
      out.write("\t    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                \n");
      out.write("\t        <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("                            \n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Categoria<b class=\"caret\"></b></a>\n");
      out.write("                            \n");
      out.write("\t\t            <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                \n");
      out.write("\t\t\t            <div class=\"row\">\n");
      out.write("\t\t\t\t                  ");
 for (Categoria cat : lista1) {
      out.write("\n");
      out.write("\t\t\t\t            <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t            <ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t            <li><a class=\"list\" href=\"products.jsp\">");
      out.print(cat.getNome());
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t         \n");
      out.write("                                                    </ul>\n");
      out.write("\t\t\t\t            </div>\n");
      out.write("\t\t\t\t         \n");
      out.write("\t\t\t\t         ");
}
      out.write("\n");
      out.write("\t\t\t            </div>\n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t        </li>\n");
      out.write("\t\t     \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t        </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <!--/.navbar-collapse-->\n");
      out.write("\t</nav>\n");
      out.write("\t<!--/.navbar-->\n");
      out.write("</div><!-- search-scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--header-->\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 single-grid\">\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/si.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"thumb-image\"> <img src=\"images/si.jpg\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/si1.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"thumb-image\"> <img src=\"images/si1.jpg\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/si2.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"thumb-image\"> <img src=\"images/si2.jpg\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 single-grid simpleCart_shelfItem\">\t\t\n");
      out.write("\t\t\t\t\t\t<h3>Obey Wasted Years Camo Zip Bandeau Bikini Top</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Condition  New With the boom of the swimwear market, there are so many places providing swimming costumes that you may not know where to look first. If you want to facilitate your search, drop in at our one-stop store, and you?ll be able to equip yourself properly for water activities.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"size\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Size</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">25</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">26</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">27</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">28</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">29</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">30</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">31</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">32</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">33</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"size\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Length</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">32</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">34</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"galry\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prices\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"item_price\">$95.00</h5>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"qty\"> Qty :  </p><input min=\"1\" type=\"number\" id=\"quantity\" name=\"quantity\" value=\"1\" class=\"form-control input-small\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn_form\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-cart item_add\">Adicionar ao carrinho</a>\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tag\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Category : <a href=\"#\"> Bikinis </a></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Tag : <a href=\"#\"> Lorem ipsum </a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("<!-- collapse -->\n");
      out.write("\t\t\n");
      out.write("<!-- collapse -->\n");
      out.write("\t\t<div class=\"related-products\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<h3>Produtos</h3>\n");
      out.write("\t\t\t\t<div class=\"product-model-sec single-product-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"product-grid single-product\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"more-product\"><span> </span></div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-img b-link-stripe b-animate-go  thickbox\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/m1.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"b-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"b-animate b-from-left  b-delay03\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<button> + </button>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-info simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-info-cust prt_name\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Product #1</h4>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"item_price\">$187.95</span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ofr\">\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"pric1\"><del>Rs 280</del></p>\n");
      out.write("\t\t\t\t\t\t          <p class=\"disc\">[12% Off]</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"product-grid single-product\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"more-product\"><span> </span></div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-img b-link-stripe b-animate-go  thickbox\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/m2.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"b-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"b-animate b-from-left  b-delay03\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<button> + </button>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-info simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-info-cust prt_name\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Product #1</h4>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"item_price\">$187.95</span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ofr\">\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"pric1\"><del>Rs 280</del></p>\n");
      out.write("\t\t\t\t\t\t          <p class=\"disc\">[12% Off]</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"product-grid single-product\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"more-product\"><span> </span></div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-img b-link-stripe b-animate-go  thickbox\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/m3.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"b-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"b-animate b-from-left  b-delay03\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<button> + </button>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-info simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-info-cust prt_name\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Product #1</h4>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"item_price\">$187.95</span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ofr\">\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"pric1\"><del>Rs 280</del></p>\n");
      out.write("\t\t\t\t\t\t          <p class=\"disc\">[12% Off]</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"product-grid single-product\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"more-product\"><span> </span></div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-img b-link-stripe b-animate-go  thickbox\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/m4.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"b-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"b-animate b-from-left  b-delay03\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<button> + </button>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"product-info simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-info-cust prt_name\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Product #1</h4>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"item_price\">$187.95</span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ofr\">\n");
      out.write("\t\t\t\t\t\t\t\t  <p class=\"pric1\"><del>Rs 280</del></p>\n");
      out.write("\t\t\t\t\t\t          <p class=\"disc\">[12% Off]</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("\t<!--footer-->\n");
      out.write("\t\t<div class=\"footer-section\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>company</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.html\">products</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Work Here</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Team</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Happenings</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Dealer Locator</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>service</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Support</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Warranty</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>order & returns</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Order Status</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Shipping Policy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Return Policy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Digital Gift Card</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>legal</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Terms and Conditions</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Social Responsibility</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-grid1\">\n");
      out.write("\t\t\t\t\t<div class=\"social-icons\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon1\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon2\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon3\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon4\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Copyright &copy; 2015 Swim Wear. All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!--footer-->\n");
      out.write("\t\t\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
