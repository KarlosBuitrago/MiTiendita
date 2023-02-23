package com.developer.mitienda.usecase.registrarclientes;

import com.developer.mitienda.model.clientes.Clientes;
import com.developer.mitienda.model.clientes.gateways.ClientesRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RegistrarClientesUseCase {

    private ClientesRepository clientesRepository;

    public Clientes save(Clientes cliente) {
        return clientesRepository.save(cliente);
    }

    public Clientes getClient(Long id){
        return clientesRepository.findById(id);
    }

    public List<Clientes> listClients(){
        return clientesRepository.findAll();
    }

    public void saveAllClients(List<Clientes> misClientes){
        clientesRepository.saveAll(misClientes);
    }
}
