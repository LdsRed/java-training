package org.jlarcher.repository;

import java.util.List;

public interface PedidoRepository<T> {

    List<T> listarPedidos();
    T buscarPedidoPorId(Long id);
    void registrarPedido(T t);
    void eliminarPedido(Long id);
}
