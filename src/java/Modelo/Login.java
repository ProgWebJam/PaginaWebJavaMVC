/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jhon
 */
public class Login {
    
    private int idLogin;
    private String usuario;
    private String contrasena;
    private int idTipoUsuario;

    public Login(int idLogin, String usuario, String contrasena, int idTipoUsuario) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    
    
    
}
