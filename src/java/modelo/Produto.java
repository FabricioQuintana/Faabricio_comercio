/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodigo", query = "SELECT p FROM Produto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produto.findByTitulo", query = "SELECT p FROM Produto p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByQuant", query = "SELECT p FROM Produto p WHERE p.quant = :quant"),
    @NamedQuery(name = "Produto.findByPreco", query = "SELECT p FROM Produto p WHERE p.preco = :preco"),
    @NamedQuery(name = "Produto.findByDestaque", query = "SELECT p FROM Produto p WHERE p.destaque = :destaque"),
    @NamedQuery(name = "Produto.findByImagem1", query = "SELECT p FROM Produto p WHERE p.imagem1 = :imagem1"),
    @NamedQuery(name = "Produto.findByImagem2", query = "SELECT p FROM Produto p WHERE p.imagem2 = :imagem2"),
    @NamedQuery(name = "Produto.findByImagem3", query = "SELECT p FROM Produto p WHERE p.imagem3 = :imagem3"),
    @NamedQuery(name = "Produto.filtro", query = "Select p from Produto p where p.titulo like :filtro OR p.descricao like :filtro OR p.codcategoria.nome like :filtro OR p.codmarca.nome like :filtro")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "quant")
    private int quant;
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;
    @Basic(optional = false)
    @Column(name = "destaque")
    private boolean destaque;
    @Column(name = "imagem1")
    private String imagem1;
    @Column(name = "imagem2")
    private String imagem2;
    @Column(name = "imagem3")
    private String imagem3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
    private Collection<Itemvenda> itemvendaCollection;
    @JoinColumn(name = "codcategoria", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Categoria codcategoria;
    @JoinColumn(name = "codmarca", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Marca codmarca;

    public Produto() {
    }

    public Produto(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto(Integer codigo, String titulo, String descricao, int quant, BigDecimal preco, boolean destaque) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.quant = quant;
        this.preco = preco;
        this.destaque = destaque;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public String getImagem1() {
        return imagem1;
    }

    public void setImagem1(String imagem1) {
        this.imagem1 = imagem1;
    }

    public String getImagem2() {
        return imagem2;
    }

    public void setImagem2(String imagem2) {
        this.imagem2 = imagem2;
    }

    public String getImagem3() {
        return imagem3;
    }

    public void setImagem3(String imagem3) {
        this.imagem3 = imagem3;
    }

    @XmlTransient
    public Collection<Itemvenda> getItemvendaCollection() {
        return itemvendaCollection;
    }

    public void setItemvendaCollection(Collection<Itemvenda> itemvendaCollection) {
        this.itemvendaCollection = itemvendaCollection;
    }

    public Categoria getCodcategoria() {
        return codcategoria;
    }

    public void setCodcategoria(Categoria codcategoria) {
        this.codcategoria = codcategoria;
    }

    public Marca getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Marca codmarca) {
        this.codmarca = codmarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Produto[ codigo=" + codigo + " ]";
    }
    
}
