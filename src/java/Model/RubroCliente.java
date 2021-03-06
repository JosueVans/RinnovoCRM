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
 * RubroCliente generated by hbm2java
 */
@Entity
@Table(name="RUBRO_CLIENTE"
    ,schema="ADMIN_CRM"
)
public class RubroCliente  implements java.io.Serializable {


     private Integer idRubrocliente;
     private String rubroCliente;
     private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public RubroCliente() {
    }

    public RubroCliente(String rubroCliente, Set<Cliente> clientes) {
       this.rubroCliente = rubroCliente;
       this.clientes = clientes;
    }
   
     @Id 

    
    @Column(name="ID_RUBROCLIENTE", unique=true, nullable=false, precision=22, scale=0)
    public Integer getIdRubrocliente() {
        return this.idRubrocliente;
    }
    
    public void setIdRubrocliente(Integer idRubrocliente) {
        this.idRubrocliente = idRubrocliente;
    }

    
    @Column(name="RUBRO_CLIENTE", length=60)
    public String getRubroCliente() {
        return this.rubroCliente;
    }
    
    public void setRubroCliente(String rubroCliente) {
        this.rubroCliente = rubroCliente;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rubroCliente")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }




}


