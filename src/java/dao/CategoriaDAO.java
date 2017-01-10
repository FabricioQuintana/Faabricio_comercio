package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import util.Quant;

public class CategoriaDAO extends GenericDAO<Categoria, Integer> {

    public CategoriaDAO() {
        
        super(Categoria.class);
    }
    public List<Quant> contagemProd() {
        Quant quant;
        int cont = 0;
        List<Object[]> o = em.createNativeQuery("Select c.codigo,c.nome,count(p.destaque) from categoria c left join produto p on c.codigo = p.codcategoria group by c.codigo,c.nome").getResultList();
        List<Quant> qlista = new ArrayList();
        if (o != null && o.get(0)[0] != null) {
            for (int i = 0; i < o.size(); i++) {
                quant = new Quant();
                quant.setCodigo(Long.parseLong(o.get(i)[cont].toString()));
                cont++;
                quant.setNome(o.get(i)[cont].toString());
                cont++;
                quant.setQuant(Integer.parseInt(o.get(i)[cont].toString()));
                qlista.add(quant);
                cont = 0;
            }
        }
        return qlista;
    }

}
