package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.DAO.GenericDAO;
import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.DAO.Interface.ICitasDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author cristo
 */
@Stateless
public class CitaDAO_JPA extends GenericDAO<Cita, Integer> implements ICitasDAO {

    public CitaDAO_JPA() {
        super(Cita.class);
    }

    @Override
    public void nuevaCita(String idU, String des, String fecha) {

        try {

            Query query = em.createNativeQuery("INSERT INTO cita(id_usuario,fecha_hora,descripcion,id_agenda,id_estado_cita) VALUES (?,?,?,?,?)");
            query.setParameter(1, idU);
            query.setParameter(2, fecha);
            query.setParameter(3, des);
            query.setParameter(4, "1");
            query.setParameter(5, "1");
            query.executeUpdate();

        } catch (Exception e) {
            System.out.println("error guardar cita: " + e.getLocalizedMessage());
        }

    }

    @Override
    public List<Cita> obtenerID(int id) {
        return null;
    }

    @Override
    public void ActualizarCita(int idE, int idC, String des, String fecha) {
        try {
            Query query = em.createNativeQuery("UPDATE cita SET fecha_hora = ? , descripcion = ?, id_estado_cita = ? WHERE id_cita = ?");
            query.setParameter(1, fecha);
            query.setParameter(2, des);
            query.setParameter(3, idE);
            query.setParameter(4, idC);

            query.executeUpdate();
        } catch (Exception e) {
            System.out.println("error actualizar cita: " + e.getMessage());
        }

    }

    @Override
    public List<Cita> newList() {
        try {
            TypedQuery<Cita> tq = em.createNamedQuery("Cita.getAllCita", className);
            List<Cita> lista = tq.getResultList();
            if (lista.isEmpty()) {
                System.out.println(lista);
                return null;
            } else {
                System.out.println("si hay lista");
                return (List<Cita>) lista.get(0);
            }
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean compararFechas(String fecha) {
        try {
            System.out.println("fecha desde jpq " + fecha);
            Query query = em.createNativeQuery("SELECT  * FROM cita   WHERE fecha_hora = ?");
            query.setParameter(1, fecha);
            query.executeUpdate();

            return false;

        } catch (Exception e) {
            System.out.println("error al comparar citas: " + e.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public List<Cita> existeCit(String id) {

        return null;

    }

    @Override
    public void eliminarCita(String idC) {

        try {

            Query query = em.createNativeQuery("DELETE FROM cita WHERE id_cita = ?");
            query.setParameter(1, idC);
            query.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al eliminar Cita" + e.getMessage());
        }

    }

    @Override
    public void existeCita(String id) {
        System.out.println("id en jpa" + id);
        try {
            Query query = em.createNativeQuery("SELECT * FROM cita WHERE id_usuario = ?");
            query.setParameter(1, id);
            query.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
