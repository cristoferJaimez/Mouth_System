package gaes5.mouth.system.maven.Internazional;



import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


/**
 *
 * @author Cristo
 */
@SessionScoped
@Named("internazionalizacionBean")
public class internazionalBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String localidad;
    private static Map< String, Object> listaPaises;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, Object> getListaPaises() {
        return listaPaises;
    }

    public static void setListaPaises(Map<String, Object> listaPaises) {
        internazionalBean.listaPaises = listaPaises;
    }

    // llenar lista de paises
    //intanciamos
    static {
        listaPaises = new LinkedHashMap<>();

        Locale espanol = new Locale("es", "CO");
        listaPaises.put("Español", espanol);
        listaPaises.put("English", Locale.ENGLISH);
    }

    public void cambiarIdioma(ValueChangeEvent e) {

        String newIdioma = e.getNewValue().toString();

        listaPaises.entrySet().stream().filter((entry) -> (entry.getValue().toString().equals(newIdioma))).forEachOrdered((entry) -> {
            FacesContext.getCurrentInstance().getViewRoot()
                    .setLocale((Locale) entry.getValue());
        });

    }
}
