<%@page import="modelo.Venda"%>
<%@page import="dao.VendaDAO"%>
<%@include file="../cabecalho.jsp" %>
<%
    String msg = "testando";
    String classe = "alert-danger";

    VendaDAO dao = new VendaDAO();
    Venda obj = new Venda();
    if(request.getParameter("nome") != null){
    
    obj.setNome(request.getParameter("nome"));
    Boolean resultado = dao.incluir(obj);
    if (resultado) {
        msg = "Registo criado com sucesso";
        classe = "alert-success";
    } else {
        msg = "N�o foi possivel criado";
        classe = "alert-danger";
    }
    }

%>

%>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Sistema de Com�rcio Eletr�nico
            <small>Admin</small>
        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  <a href="index.jsp">�rea Administrativa</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i> Aqui vai o conte�do de apresenta��o
            </li>
        </ol>
    </div>
</div>
<!-- /.row -->
<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">
            Venda
        </div>
        <div class="panel-body">

            <div class="alert <%=classe%>">
                <%=msg%>
            </div>
            <form action="#" method="post">

                <div class="col-lg-6">

                    <div class="form-group">
                        <label>Nome</label>
                        <input name="nome" class="form-control" type="text" required />
                    </div>



                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>

            </form>

        </div>


    </div>
</div>
<!-- /.row -->
<%@include file="../rodape.jsp" %>