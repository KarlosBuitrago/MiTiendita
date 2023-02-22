package com.developer.mitienda.model.clientes;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Clientes {
    private Long id;
    private String documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
}
