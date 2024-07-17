package org.jlarcher.repository;

import java.util.List;

public interface ClienteRepository<T>
{

    List<T> listarClientes();
    T buscarPorId(Long id);
    void registrarCliente(T t);
    void eliminarCliente(Long id);


}
