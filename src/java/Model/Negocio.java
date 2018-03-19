package Model;
// Generated 03-13-2018 02:30:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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

/**
 * Negocio generated by hbm2java
 */
@Entity
@Table(name="NEGOCIO"
    ,schema="ADMIN_CRM"
)
public class Negocio  implements java.io.Serializable {


     private Integer idNegocio;
     private EstadoNegocio estadoNegocio;
     private Oportunidades oportunidades;
     private TipoNegocio tipoNegocio;
     private Date fechaIni;
     private Date fechaFin;
     private BigDecimal precioOfertaNegocio;
     private BigDecimal precioOfertaFinal;
     private String nombreNegocio;
     private Date fechaCierreNegocio;
     private Date creaciondate;
     private Date modificaciondate;
     private String creadopor;
     private String modificadopor;
     private Set<DetalleNegocio> detalleNegocios = new HashSet<DetalleNegocio>(0);

    public Negocio() {
        this.oportunidades=new Oportunidades();
        this.estadoNegocio=new EstadoNegocio();
        this.tipoNegocio=new TipoNegocio();
    }

    public Negocio(BigDecimal idNegocio, EstadoNegocio estadoNegocio, Oportunidades oportunidades, TipoNegocio tipoNegocio, Date fechaIni, Date fechaFin, BigDecimal precioOfertaNegocio, BigDecimal precioOfertaFinal, String nombreNegocio, Date fechaCierreNegocio, Date creaciondate, Date modificaciondate, String creadopor, String modificadopor, Set<DetalleNegocio> detalleNegocios) {
       this.estadoNegocio = estadoNegocio;
       this.oportunidades = oportunidades;
       this.tipoNegocio = tipoNegocio;
       this.fechaIni = fechaIni;
       this.fechaFin = fechaFin;
       this.precioOfertaNegocio = precioOfertaNegocio;
       this.precioOfertaFinal = precioOfertaFinal;
       this.nombreNegocio = nombreNegocio;
       this.fechaCierreNegocio = fechaCierreNegocio;
       this.creaciondate = creaciondate;
       this.modificaciondate = modificaciondate;
       this.creadopor = creadopor;
       this.modificadopor = modificadopor;
       this.detalleNegocios = detalleNegocios;
    }
   
     @Id 
    @SequenceGenerator(name = "seq", sequenceName = "NEGOCIO_AUTO_INC")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @Column(name="ID_NEGOCIO", unique=true, nullable=false, precision=22, scale=0)
    public Integer getIdNegocio() {
        return this.idNegocio;
    }
    
    public void setIdNegocio(Integer idNegocio) {
        this.idNegocio = idNegocio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ESTADO_NEGOCIO", nullable=false)
    public EstadoNegocio getEstadoNegocio() {
        return this.estadoNegocio;
    }
    
    public void setEstadoNegocio(EstadoNegocio estadoNegocio) {
        this.estadoNegocio = estadoNegocio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_OPORTUNIDAD", nullable=false)
    public Oportunidades getOportunidades() {
        return this.oportunidades;
    }
    
    public void setOportunidades(Oportunidades oportunidades) {
        this.oportunidades = oportunidades;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_NEGOCIO", nullable=false)
    public TipoNegocio getTipoNegocio() {
        return this.tipoNegocio;
    }
    
    public void setTipoNegocio(TipoNegocio tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_INI", length=7)
    public Date getFechaIni() {
        return this.fechaIni;
    }
    
    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_FIN", length=7)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    @Column(name="PRECIO_OFERTA_NEGOCIO", precision=22, scale=0)
    public BigDecimal getPrecioOfertaNegocio() {
        return this.precioOfertaNegocio;
    }
    
    public void setPrecioOfertaNegocio(BigDecimal precioOfertaNegocio) {
        this.precioOfertaNegocio = precioOfertaNegocio;
    }

    
    @Column(name="PRECIO_OFERTA_FINAL", precision=22, scale=0)
    public BigDecimal getPrecioOfertaFinal() {
        return this.precioOfertaFinal;
    }
    
    public void setPrecioOfertaFinal(BigDecimal precioOfertaFinal) {
        this.precioOfertaFinal = precioOfertaFinal;
    }

    
    @Column(name="NOMBRE_NEGOCIO", length=80)
    public String getNombreNegocio() {
        return this.nombreNegocio;
    }
    
    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_CIERRE_NEGOCIO", length=7)
    public Date getFechaCierreNegocio() {
        return this.fechaCierreNegocio;
    }
    
    public void setFechaCierreNegocio(Date fechaCierreNegocio) {
        this.fechaCierreNegocio = fechaCierreNegocio;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="negocio")
    public Set<DetalleNegocio> getDetalleNegocios() {
        return this.detalleNegocios;
    }
    
    public void setDetalleNegocios(Set<DetalleNegocio> detalleNegocios) {
        this.detalleNegocios = detalleNegocios;
    }




}


