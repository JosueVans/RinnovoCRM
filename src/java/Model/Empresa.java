package Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPRESA",
         schema = "ADMIN_CRM"
)
public class Empresa implements java.io.Serializable {

    private Integer idempresa;
    private Pais pais;
    private String nombreEmpresa;
    private Date creaciondate;
    private Date modificaciondate;
    private String creadopor;
    private String modificadopor;
    private Set<Oportunidades> oportunidadeses = new HashSet<Oportunidades>(0);
    private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public Empresa() {
        this.pais = new Pais();
    }

    public Empresa(Pais pais, String nombreEmpresa, Date creaciondate, Date modificaciondate, String creadopor, String modificadopor, Set<Oportunidades> oportunidadeses, Set<Cliente> clientes) {
        this.pais = pais;
        this.nombreEmpresa = nombreEmpresa;
        this.creaciondate = creaciondate;
        this.modificaciondate = modificaciondate;
        this.creadopor = creadopor;
        this.modificadopor = modificadopor;
        this.oportunidadeses = oportunidadeses;
        this.clientes = clientes;
    }

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "EMPRESA_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @Column(name = "IDEMPRESA", unique = true, nullable = false, precision = 22, scale = 0)
    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAIS", nullable = false)
    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Column(name = "NOMBRE_EMPRESA", length = 400)
    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CREACIONDATE", length = 7)
    public Date getCreaciondate() {
        return this.creaciondate;
    }

    public void setCreaciondate(Date creaciondate) {
        this.creaciondate = creaciondate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "MODIFICACIONDATE", length = 7)
    public Date getModificaciondate() {
        return this.modificaciondate;
    }

    public void setModificaciondate(Date modificaciondate) {
        this.modificaciondate = modificaciondate;
    }

    @Column(name = "CREADOPOR", length = 75)
    public String getCreadopor() {
        return this.creadopor;
    }

    public void setCreadopor(String creadopor) {
        this.creadopor = creadopor;
    }

    @Column(name = "MODIFICADOPOR", length = 75)
    public String getModificadopor() {
        return this.modificadopor;
    }

    public void setModificadopor(String modificadopor) {
        this.modificadopor = modificadopor;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
    public Set<Oportunidades> getOportunidadeses() {
        return this.oportunidadeses;
    }

    public void setOportunidadeses(Set<Oportunidades> oportunidadeses) {
        this.oportunidadeses = oportunidadeses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

}
