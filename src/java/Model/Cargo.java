package Model;

import java.math.BigDecimal;
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
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * Cargo generated by hbm2java
 */
@Entity
@Table(name = "CARGO",
         schema = "ADMIN_CRM"
)
@NamedQueries(
        {
            @NamedQuery(name = "Cargo.buscarTodos", query = "SELECT d FROM Cargo d")
            , // @NamedQuery(name="Usuarios.buscarPorId", query ="SELECT d FROM Usuarios d WHERE d.idDep= :idDep"),
            @NamedQuery(name = "Cargo.buscarCargoPorRol", query = "SELECT d FROM Cargo d Where Id_Rol= :Id_Rol")
        }
)
public class Cargo implements java.io.Serializable {

    private Integer idCargo;
    private Rol rol;
    private String cargo;
    private Set<Empleados> empleadoses = new HashSet<Empleados>(0);

    public Cargo() {
        this.rol = new Rol();
    }

    public Cargo(Rol rol, String cargo, Set<Empleados> empleadoses) {
        this.rol = rol;
        this.cargo = cargo;
        this.empleadoses = empleadoses;
    }

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "CARGO_AUTO_INC")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @Column(name = "ID_CARGO", unique = true, nullable = false, precision = 22, scale = 0)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ROL", nullable = false)
    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Column(name = "CARGO", length = 60)
    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cargo")
    public Set<Empleados> getEmpleadoses() {
        return this.empleadoses;
    }

    public void setEmpleadoses(Set<Empleados> empleadoses) {
        this.empleadoses = empleadoses;
    }

}
