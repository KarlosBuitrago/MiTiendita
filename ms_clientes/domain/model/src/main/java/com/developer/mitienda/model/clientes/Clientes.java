package com.developer.mitienda.model.clientes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Clientes {
    private Long id;
    private String documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
}
