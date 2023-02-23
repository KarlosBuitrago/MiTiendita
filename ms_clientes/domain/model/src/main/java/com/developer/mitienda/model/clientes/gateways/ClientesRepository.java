package com.developer.mitienda.model.clientes.gateways;

import java.util.List;
@Repository
public interface ClientesRepository {
    public Clientes save(Clientes cliente);
    public void saveAll(List<Clientes> listClients);
    public Clientes findById(Long id);
    public List<Clientes> findAll();
    public void updateClient(Long id);

}
