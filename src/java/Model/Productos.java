package Model;
// Generated 03-13-2018 02:30:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Productos generated by hbm2java
 */
@Entity
@Table(name="PRODUCTOS"
    ,schema="ADMIN_CRM"
)
public class Productos  implements java.io.Serializable {


     private BigDecimal idProducto;
     private Fabricante fabricante;
     private String nombreProducto;
     private String modelo;
     private Date creaciondate;
     private Date modificaciondate;
     private String creadopor;
     private String modificadopor;
     private String status;
     private Set<ProductosCliente> productosClientes = new HashSet<ProductosCliente>(0);

    public Productos() {
    }

	
    public Productos(BigDecimal idProducto, Fabricante fabricante) {
        this.idProducto = idProducto;
        this.fabricante = fabricante;
    }
    public Productos(BigDecimal idProducto, Fabricante fabricante, String nombreProducto, String modelo, Date creaciondate, Date modificaciondate, String creadopor, String modificadopor, String status, Set<ProductosCliente> productosClientes) {
       this.idProducto = idProducto;
       this.fabricante = fabricante;
       this.nombreProducto = nombreProducto;
       this.modelo = modelo;
       this.creaciondate = creaciondate;
       this.modificaciondate = modificaciondate;
       this.creadopor = creadopor;
       this.modificadopor = modificadopor;
       this.status = status;
       this.productosClientes = productosClientes;
    }
   
     @Id 

    
    @Column(name="ID_PRODUCTO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_FABRICANTE", nullable=false)
    public Fabricante getFabricante() {
        return this.fabricante;
    }
    
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    
    @Column(name="NOMBRE_PRODUCTO", length=60)
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    @Column(name="MODELO", length=20)
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREACIONDATE", length=7)
    public Date getCreaciondate() {
        return this.creaciondate;
    }
    
    public void setCreaciondate(Date creaciondate) {
        this.creaciondate = creaciondate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MODIFICACIONDATE", length=7)
    public Date getModificaciondate() {
        return this.modificaciondate;
    }
    
    public void setModificaciondate(Date modificaciondate) {
        this.modificaciondate = modificaciondate;
    }

    
    @Column(name="CREADOPOR", length=75)
    public String getCreadopor() {
        return this.creadopor;
    }
    
    public void setCreadopor(String creadopor) {
        this.creadopor = creadopor;
    }

    
    @Column(name="MODIFICADOPOR", length=75)
    public String getModificadopor() {
        return this.modificadopor;
    }
    
    public void setModificadopor(String modificadopor) {
        this.modificadopor = modificadopor;
    }

    
    @Column(name="STATUS", length=25)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="productos")
    public Set<ProductosCliente> getProductosClientes() {
        return this.productosClientes;
    }
    
    public void setProductosClientes(Set<ProductosCliente> productosClientes) {
        this.productosClientes = productosClientes;
    }




}


