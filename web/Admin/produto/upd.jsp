
<%@page import="util.Upload"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="modelo.Categoria"%>
<%@page import="modelo.Marca"%>
<%@page import="dao.MarcaDAO"%>
<%@include file="../cabecalho.jsp" %>
<%
    String msg = "testando";
    String classe = "alert-danger";

    ProdutoDAO dao = new ProdutoDAO();
    Produto obj = new Produto();

    CategoriaDAO cDAO = new CategoriaDAO();
    MarcaDAO mDAO = new MarcaDAO();

    List<Categoria> cLista = cDAO.listar();
    List<Marca> mLista = mDAO.listar();

    Upload upd = new Upload();
    upd.setFolderUpload("arquivos");
    if (request.getMethod().equals("GET")) {
        obj = dao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("codigo")));
    }

    if (request.getMethod().equals("POST")) {

        if (upd.formProcess(getServletContext(), request)) {
            
               obj.setDescricao(upd.getForm().get("desc").toString());
                obj.setTitulo(upd.getForm().get("titu").toString());
             
                obj.setQuant(Integer.parseInt(upd.getForm().get("quant").toString()));
                obj.setPreco(BigDecimal.valueOf(Double.parseDouble(upd.getForm().get("preco").toString())));

                if (upd.getForm().get("codcat") != null && (!upd.getForm().get("codcat").toString().isEmpty())) {
                    obj.setCodcategoria(cDAO.buscarPorChavePrimaria(Integer.parseInt(upd.getForm().get("codcat").toString())));
                }

                if (upd.getForm().get("codmar") != null && (!upd.getForm().get("codmar").toString().isEmpty())) {
                    obj.setCodmarca(mDAO.buscarPorChavePrimaria(Integer.parseInt(upd.getForm().get("codmar").toString())));
                }

                if (upd.getForm().get("destaque") != null) {
                    obj.setDestaque(true);
                } else {
                    obj.setDestaque(false);
                }

  
       Boolean resultado = dao.alterar(obj);
    if (resultado) {
        msg = "Registo criado com sucesso";
        classe = "alert-success";
    } else {
        msg = "Não foi possivel criado";
        classe = "alert-danger";
    }

        }
 
    }


%>


<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Sistema de Comércio Eletrônico
            <small>Admin</small>
        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Área Administrativa</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i> Aqui vai o conteúdo de apresentação
            </li>
        </ol>
    </div>
</div>
<!-- /.row -->
<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">
            Produto
        </div>
        <div class="panel-body">

            <div class="alert <%=classe%>">
                <%=msg%>
            </div>
            <form action="upd.jsp" method="post" enctype="multipart/form-data">

                <div class="col-lg-6">

                    <div class="form-group">
                        <label>Código</label>
                        <input class="form-control" name="codigo" type="text" readonly  value="<%=obj.getCodigo()%>"  />
                    </div>

                    <div class="form-group">
                        <label>Descrição</label>
                        <input name="desc" class="form-control" type="text" required value="<%=obj.getDescricao()%>" />
                    </div>
                       <label>Destaque</label>
                        <input name="destaque" type="checkbox" <%if (obj.getDestaque()) {
                                out.print("checked");
                            }%> class="form-control" />
                      <div class="form-group">
                        <label>Preço</label>
                        <input name="preco" class="form-control" type="number" required value="<%=obj.getPreco() %>" />
                    </div>
                      <div class="form-group">s
                        <label>Quantidade</label>
                        <input name="quant" class="form-control" type="number" required value="<%=obj.getQuant()%>" />
                    </div>
                      <div class="form-group">
                        <label>Título</label>
                        <input name="titu" class="form-control" type="text" required value="<%=obj.getTitulo()%>" />
                    </div>
                    
                      <label>Categoria</label>
                        <select class="form-control" name="codcat">
                           
                            <%for (Categoria cat : cLista) {%>
                            <option value="<%=cat.getCodigo()%>"><%=cat.getNome()%></option>
                            <%}%>
                        </select>

                        <label>Marca</label>
                        <select  class="form-control" name="codmar">
                            <%for (Marca mar : mLista) {%>
                            <option value="<%=mar.getCodigo()%>"><%=mar.getNome()%></option>
                            <%}%>
                        </select>
                    
                       <label>Imagem 1</label>
                       <input name="imagem1" class="form-control" value="<%=obj.getImagem1()%>" readonly  />

                        <label>Imagem 2</label>
                        <input name="imagem2" class="form-control"   value="<%=obj.getImagem2()%>" readonly  />

                        <label>Imagem 3</label>
                        <input name="imagem3" class="form-control"   value="<%=obj.getImagem3()%>" readonly  />
                    </div>


                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>

            </form>

        </div>


    </div>
</div>
<!-- /.row -->
<%@include file="../rodape.jsp" %>