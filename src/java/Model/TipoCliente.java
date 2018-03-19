package Model;
// Generated 03-13-2018 02:30:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoCliente generated by hbm2java
 */
@Entity
@Table(name="TIPO_CLIENTE"
    ,schema="ADMIN_CRM"
)
public class TipoCliente  implements java.io.Serializable {


     private Integer idTipoCliente;
     private String tipoCliente;
     private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public TipoCliente() {
    }

	
    public TipoCliente(String tipoCliente, Set<Cliente> clientes) {
       this.tipoCliente = tipoCliente;
       this.clientes = clientes;
    }
   
     @Id 

    
    @Column(name="ID_TIPO_CLIENTE", unique=true, nullable=false, precision=22, scale=0)
    public Integer getIdTipoCliente() {
        return this.idTipoCliente;
    }
    
    public void setIdTipoCliente(Integer idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    
    @Column(name="TIPO_CLIENTE", length=60)
    public String getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoCliente")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }




}

