package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Services.UsuarioServices;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@SessionScoped
@Named("signInController")
public class SignInController implements Serializable {

    //servicios jpa dao entidad
    @EJB
    private UsuarioServices usuarioServicios;
    private Datos_Usuario usuario;
    private Datos_Usuario usuarios;
    //private Datos_Usuario Editarusuarios = new Datos_Usuario();

    //private Datos_Usuario editUser = new Datos_Usuario();

    //variables de entorno
    private String msm;
    private String email;
    private String pw;

    public SignInController() {
    }

    /*
    @PostConstruct
    public void init() {
        this.usuario = new Datos_Usuario();
    }
*/

    public void signIn() {
        msm = "";
        usuarios = usuarioServicios.login(email, pw);
        if (usuario != null) {
            try {
                if (usuarios.getPw().equalsIgnoreCase(pw) && usuarios.getEmail().equalsIgnoreCase(email)) {
                    
                    try {
                       //solucionar de otra forma  
                        FacesContext.getCurrentInstance().getExternalContext().addResponseCookie("JSESSIONID", "ae9448b302e8e21acc19584bd520", null);
//msm = "usuarioOk";
                        FacesContext fc = FacesContext.getCurrentInstance();
                        fc.getExternalContext().redirect("Mouth_System/mouth_system.xhtml");
                    } catch (IOException e) {
                        msm = "msmErrorLogin01";
                    }

                } else if (!usuarios.getPw().equalsIgnoreCase(pw) || !usuarios.getEmail().equalsIgnoreCase(email)) {
                    msm = "msmErrorLogin02";
                }
            } catch (Exception e) {
                msm = "msmErrorLogin02";
            }

        } else {
            msm = "msmErrorLogin03";
        }
    }

//    editar usuario
    public void updateUser() {
        msm = "";
        try {
  //          usuarioServicios.actualizar(Editarusuarios);
            msm = "updateUserOk";
        } catch (Exception e) {
            msm = "updateError";
        }
        msm = "problemQuery";
    }
    
  
    //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public UsuarioServices getUsuarioServicios() {
        return usuarioServicios;
    }

    public void setUsuarioServicios(UsuarioServices usuarioServicios) {
        this.usuarioServicios = usuarioServicios;
    }
/*
    public Datos_Usuario getEditUser() {
        return editUser;
    }

    public void setEditUser(Datos_Usuario editUser) {
        this.editUser = editUser;
    }
*/
    public Datos_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Datos_Usuario usuario) {
        this.usuario = usuario;
    }

    public Datos_Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Datos_Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
//</editor-fold>

   // public Datos_Usuario getEditarusuarios() {
    //    return Editarusuarios;
    //}

    public void setEditarusuarios(Datos_Usuario Editarusuarios) {
      //  this.Editarusuarios = Editarusuarios;
    }
    
    
    
}
