package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import modelo.Marca;
import util.Quant;

public class MarcaDAO extends GenericDAO<Marca, Integer> {

    public MarcaDAO() {
        
        super(Marca.class);
    }
    
     public List<Quant> contagemProd() {
        Quant quant;
        int cont = 0;
        List<Object[]> o = em.createNativeQuery("Select m.codigo,m.nome,count(p.destaque) from marca m left join produto p on m.codigo = p.codmarca group by m.codigo,m.nome").getResultList();
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
