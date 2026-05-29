package org.prueba.acciones;

import com.opensymphony.xwork2.ActionSupport;

public class Accion extends ActionSupport {

    // Estas son las propiedades JavaBean del texto
    private String nombre;
    private String mensaje;

    // 1. El interceptor 'workflow' llamará a este method automáticamente
    @Override
    public void validate() {
        if (nombre == null || nombre.trim().isEmpty()) {
            // Registramos un error específico para el atributo "nombre"
            addFieldError("nombre", "El nombre es obligatorio, no lo dejes vacío.");
        }
    }

    // 2. LA LÓGICA: Solo se ejecutará si el method validate() NO ha encontrado errores
    @Override
    public String execute() {
        // Como el workflow ya ha filtrado los errores, aquí ya sabemos al 100% que el nombre es correcto
        this.mensaje = "¡Hola, " + nombre + "! Validación de Struts superada con éxito.";
        return SUCCESS;
    }

    // Los Getters y Setters (imprescindibles para que Struts mueva los datos)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
