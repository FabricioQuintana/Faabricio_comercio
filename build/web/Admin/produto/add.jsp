
<%@page import="java.math.BigDecimal"%>
<%@page import="util.Upload"%>
<%@page import="modelo.Marca"%>
<%@page import="dao.MarcaDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="modelo.Categoria"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>
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

    if (request.getMethod().equals("POST")) {

        if (upd.formProcess(getServletContext(), request)) {

            if (upd.getForm().get("tit") == null || upd.getForm().get("tit").toString().isEmpty()) {
            response.sendRedirect("index.jsp");
            
        }  else {

                obj.setTitulo(upd.getForm().get("tit").toString());
                obj.setDescricao(upd.getForm().get("des").toString());
                obj.setQuant(Integer.parseInt(upd.getForm().get("quant").toString()));
                obj.setPreco(BigDecimal.valueOf(Double.parseDouble(upd.getForm().get("preco").toString())));

             
                    obj.setCodcategoria(cDAO.buscarPorChavePrimaria(Integer.parseInt(upd.getForm().get("codcat").toString())));
             

                    obj.setCodmarca(mDAO.buscarPorChavePrimaria(Integer.parseInt(upd.getForm().get("codmar").toString())));
               
                if (upd.getForm().get("destaque") != null) {
                    obj.setDestaque(true);
                } else {
                    obj.setDestaque(false);
                }

                if (!upd.getFiles().isEmpty()) {
                    if (upd.getFiles().size() > 0) {
                        obj.setImagem1(upd.getFiles().get(0));

                        if (upd.getFiles().size() > 1) {
                            obj.setImagem2(upd.getFiles().get(1));

                            if (upd.getFiles().size() > 2) {
                                obj.setImagem3(upd.getFiles().get(2));
                            }
                        }
                    }
                }
      Boolean resultado = dao.incluir(obj);
    if (resultado) {
        msg = "Registo criado com sucesso";
        classe = "alert-success";
    } else {
        msg = "Não foi possivel criado";
        classe = "alert-danger";
    }

  
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
            <form action="#" method="post" enctype="multipart/form-data">

                <div class="col-lg-6">

                    <div class="form-group">
                        <label>Titulo</label>
                        <input name="tit" class="form-control" type="text" required />

                        <label>Descrição</label>
                        <input name="des" class="form-control" type="text" required />

                        <label>Quantidade</label>
                        <input name="quant" class="form-control" type="number" required />

                        <label>Preço</label>
                        <input name="preco" class="form-control" type="number" required />

                        <label>Categoria</label>
                        <select class="form-control" name="codcat">
                           
                            <%for (Categoria cat : cLista) {%>
                            <option value="<%=cat.getCodigo()%>"> <%=cat.getNome()%></option>
                            <%}%>
                        </select>

                        <label>Marca</label>
                        <select  class="form-control" name="codmar">
                            <%for (Marca mar : mLista) {%>
                            <option value="<%=mar.getCodigo()%>"> <%=mar.getNome()%></option>
                            <%}%>
                        </select>

                        <label>Destaque</label>
                        <input name="destaque" type="checkbox" class="form-control" />
                        <label>Imagem 1</label>
                        <input name="imagem1" class="form-control" type="file" required />

                        <label>Imagem 2</label>
                        <input name="imagem2" class="form-control" type="file" required />

                        <label>Imagem 3</label>
                        <input name="imagem3" class="form-control" type="file" required />
                    </div>



                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>
                </div>
            </form>




        </div>
    </div>
    <!-- /.row -->
    <%@include file="../rodape.jsp" %>