package org.prueba.acciones;

public class MessageStore {
    private String message;

    // Constructor que monta el mensaje combinándolo con el nombre que le pase el controlador
    // Recibe el mensaje ya cocinado y traducido por el controlador
    public MessageStore(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
