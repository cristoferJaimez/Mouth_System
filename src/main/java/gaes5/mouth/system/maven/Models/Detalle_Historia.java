package gaes5.mouth.system.maven.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "detalle_historia")
public class Detalle_Historia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_historia")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_historia_clinica")
    private Historia_Clinica historia_clinica_id_historia_clinica;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico_id_medico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Historia_Clinica getHistoria_clinica_id_historia_clinica() {
        return historia_clinica_id_historia_clinica;
    }

    public void setHistoria_clinica_id_historia_clinica(Historia_Clinica historia_clinica_id_historia_clinica) {
        this.historia_clinica_id_historia_clinica = historia_clinica_id_historia_clinica;
    }

    public Medico getMedico_id_medico() {
        return medico_id_medico;
    }

    public void setMedico_id_medico(Medico medico_id_medico) {
        this.medico_id_medico = medico_id_medico;
    }

}