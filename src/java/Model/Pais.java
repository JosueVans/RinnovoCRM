package Model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PAIS"
    ,schema="ADMIN_CRM"
)
public class Pais  implements java.io.Serializable {


     private Integer idPais;
     private String pais;
     private Set<Empresa> empresas = new HashSet<Empresa>(0);

    public Pais() {
    }
    
    public Pais(String pais, Set<Empresa> empresas) {
       this.pais = pais;
       this.empresas = empresas;
    }
   
     @Id 

    
    @Column(name="ID_PAIS", unique=true, nullable=false, precision=22, scale=0)
    public Integer getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    
    @Column(name="PAIS", length=60)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pais")
    public Set<Empresa> getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set<Empresa> empresas) {
        this.empresas = empresas;
    }




}


