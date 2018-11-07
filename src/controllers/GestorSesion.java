/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Dao.UsuarioDao;
import clases.Usuario;

/**
 *
 * @author Guido D'Antoni guidodantoni2335@gmail.com
 */
public class GestorSesion {

    private Usuario usuarioLogueado;
    
    
    public Boolean validarUsuario(int legajoUsuario, String tipoDeUsuario) {
        
        Boolean retorno = false;
        Usuario existeUsuario = new Usuario();
        UsuarioDao usuarioDao = new UsuarioDao();
        existeUsuario = usuarioDao.getUsuario(legajoUsuario, tipoDeUsuario);
        
        if(existeUsuario == null){
            
            retorno = false;
            
            }else if( existeUsuario.getTipo().equals(tipoDeUsuario)) {
                
                usuarioLogueado = existeUsuario;
                retorno = true;
            
        }
       
      return retorno;
    }

    public void setUsuarioLogueado(Usuario user) {
        this.usuarioLogueado=user;
    }

    public Usuario getUsuarioLogueado() {
        return this.usuarioLogueado;
    }
    
    
}
