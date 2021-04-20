package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Models.Localidad_Usuario;
import gaes5.mouth.system.maven.Models.Pais_Usuario;
import gaes5.mouth.system.maven.Models.Region;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-19T21:23:14")
@StaticMetamodel(Direccion_Usuario.class)
public class Direccion_Usuario_ { 

    public static volatile SingularAttribute<Direccion_Usuario, Datos_Usuario> datos_usuario_id_usuario;
    public static volatile SingularAttribute<Direccion_Usuario, Region> region_id_region;
    public static volatile SingularAttribute<Direccion_Usuario, Integer> id;
    public static volatile SingularAttribute<Direccion_Usuario, Pais_Usuario> id_ciudad_usuario;
    public static volatile SingularAttribute<Direccion_Usuario, Pais_Usuario> id_pais_usuario;
    public static volatile SingularAttribute<Direccion_Usuario, Localidad_Usuario> id_localidad_usuario;

}