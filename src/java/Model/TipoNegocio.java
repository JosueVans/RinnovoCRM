package Model;
// Generated 01-09-2018 11:33:30 AM by Hibernate Tools 4.3.1


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
 * TipoNegocio generated by hbm2java
 */
@Entity
@Table(name="TIPO_NEGOCIO"
    ,schema="ADMIN_CRM"
)
public class TipoNegocio  implements java.io.Serializable {


     private BigDecimal idTipoNegocio;
     private String tipoNegocio;
     private Set<Negocio> negocios = new HashSet<Negocio>(0);

    public TipoNegocio() {
    }

	
    public TipoNegocio(BigDecimal idTipoNegocio) {
        this.idTipoNegocio = idTipoNegocio;
    }
    public TipoNegocio(BigDecimal idTipoNegocio, String tipoNegocio, Set<Negocio> negocios) {
       this.idTipoNegocio = idTipoNegocio;
       this.tipoNegocio = tipoNegocio;
       this.negocios = negocios;
    }
   
     @Id 

    
    @Column(name="ID_TIPO_NEGOCIO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdTipoNegocio() {
        return this.idTipoNegocio;
    }
    
    public void setIdTipoNegocio(BigDecimal idTipoNegocio) {
        this.idTipoNegocio = idTipoNegocio;
    }

    
    @Column(name="TIPO_NEGOCIO", length=60)
    public String getTipoNegocio() {
        return this.tipoNegocio;
    }
    
    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoNegocio")
    public Set<Negocio> getNegocios() {
        return this.negocios;
    }
    
    public void setNegocios(Set<Negocio> negocios) {
        this.negocios = negocios;
    }




}


