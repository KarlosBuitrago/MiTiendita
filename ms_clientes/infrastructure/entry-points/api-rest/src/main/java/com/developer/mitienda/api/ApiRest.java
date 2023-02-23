package com.developer.mitienda.api;
import com.developer.mitienda.usecase.registrarclientes.RegistrarClientesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
//    private final MyUseCase useCase;

    private final RegistrarClientesUseCase useCase;


    @PostMapping(path = "/Guardar")
    public Clientes guardarCliente(Clientes cliente) {
        return useCase.save(cliente);
    }

    public Clientes obtenerCliente(Long id){
        return useCase.getClient(id);
    }


}
