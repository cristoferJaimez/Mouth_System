package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Detalle_Historia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-19T21:23:15")
@StaticMetamodel(Tratamiento.class)
public class Tratamiento_ { 

    public static volatile SingularAttribute<Tratamiento, String> reg_fotografico;
    public static volatile SingularAttribute<Tratamiento, Detalle_Historia> detalle_historia_id_detalle_historia;
    public static volatile SingularAttribute<Tratamiento, Date> fecha_inicio;
    public static volatile SingularAttribute<Tratamiento, Date> fecha_fin;
    public static volatile SingularAttribute<Tratamiento, String> obser_trata;
    public static volatile SingularAttribute<Tratamiento, String> nom_tratamiento;
    public static volatile SingularAttribute<Tratamiento, Integer> id;
    public static volatile SingularAttribute<Tratamiento, Integer> des_tratamiento;
    public static volatile SingularAttribute<Tratamiento, String> tipo_tratamiento;

}