package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Categoria;
import gaes5.mouth.system.maven.Models.Inventario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-19T21:23:15")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Date> fecha_ven;
    public static volatile SingularAttribute<Productos, String> des_prod;
    public static volatile SingularAttribute<Productos, Categoria> id_categoria;
    public static volatile SingularAttribute<Productos, Inventario> id_inventario;
    public static volatile SingularAttribute<Productos, Integer> id;
    public static volatile SingularAttribute<Productos, Integer> cantidad;
    public static volatile SingularAttribute<Productos, String> nom_prod;

}