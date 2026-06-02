package org.prueba.acciones;

import com.opensymphony.xwork2.ActionSupport;

public class Accion extends ActionSupport {

    // Estas son las propiedades JavaBean del texto
    private String nombre;
    // EL CAMBIO: mensaje ya no es un String suelto, ahora es un objeto del Modelo
    private MessageStore messageStore;

    // 1. El interceptor 'workflow' llamará a este method automáticamente
    @Override
    public void validate() {
        if (nombre == null || nombre.trim().isEmpty()) {
            // Registramos un error específico para el atributo "nombre"
            addFieldError("nombre", getText("user.required"));
        }
    }

    @Override
    public String execute() {
//        if (usuario.isNuevo()) {
//            return "primer_acceso"; // <-- Un String inventado por ti
//        }
        // 1. El controlador usa getText() para traer la frase traducida del properties.
        // Además, reemplaza el {0} con el nombre del usuario automáticamente.
        String mensajeTraducido = getText("accion.exito", new String[]{nombre});

        // 2. Le pasamos el mensaje ya internacionalizado al Modelo
        this.messageStore = new MessageStore(mensajeTraducido);

        return SUCCESS;
    }

    // Getters y Setters necesarios
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 3. EL CAMBIO: Cambiamos el getter del antiguo String por el getter del objeto MessageStore
    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
