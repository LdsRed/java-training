package org.jlarcher.repository;

import org.jlarcher.jdbc.AdministradorDeConexiones;
import org.jlarcher.model.Pedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepositoryImp implements PedidoRepository<Pedido>{

    private Connection getConnection() throws SQLException {
        return AdministradorDeConexiones.getConnection();
    }

    @Override
    public List<Pedido> listarPedidos() {

        List<Pedido> pedidos = new ArrayList<>();

        try(Statement stmt = getConnection().createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM pedidos")){

            //Se debe crear un cliente al cual se le mapeara los datos extraidos de la bd y posteriormente
            //agregados a la lista creada anteriormente


            while (resultSet.next()){
                Pedido pedido = crearPedido(resultSet);
                pedidos.add(pedido);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return pedidos;

    }

    @Override
    public Pedido buscarPedidoPorId(Long id) {
        Pedido pedido = null;

        try(PreparedStatement stmt = getConnection().
                prepareStatement("SELECT * FROM pedidos WHERE id_pedidos = ? ")){
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                pedido = crearPedido(resultSet);
            }
            resultSet.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }


        return pedido;
    }

    @Override
    public void registrarPedido(Pedido pedido) {
        String sql;

        //Dependiendo del valor del ID se creara o se actualizará el pedido

        if (pedido.getId_pedidos() != null && pedido.getId_pedidos() > 0) {
            sql = "UPDATE pedidos SET nombre_producto = ?, cantidad_productos =?, numero_serie = ? WHERE id_cliente = ?";
        }else {
            sql = "INSERT INTO pedidos(nombre_producto, cantidad_productos, numero_serie, id_cliente) VALUES(?,?,?,?)";
        }

        try(PreparedStatement stmt = getConnection().prepareStatement(sql)){
            stmt.setString(1, pedido.getNombre_producto());
            stmt.setInt(2, pedido.getCantidad_productos());
            stmt.setInt(3, pedido.getNumero_serie());
            stmt.setLong(4, pedido.getId_cliente());

            if (pedido.getId_cliente() != null && pedido.getId_cliente() > 0 ){
                stmt.setLong(4, pedido.getId_cliente());
            }

            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarPedido(Long id) {

        try(PreparedStatement stmt = getConnection().
                prepareStatement("DELETE FROM pedidos WHERE id_pedido = ? ")){
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();

            resultSet.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Pedido crearPedido(ResultSet resultSet) throws SQLException {
        Pedido pedido = new Pedido();
        pedido.setNombre_producto(resultSet.getString("nombre_producto"));
        pedido.setCantidad_productos(resultSet.getInt("cantidad_productos"));
        pedido.setNumero_serie(resultSet.getInt("numero_serie"));
        pedido.setId_cliente(resultSet.getLong("id_cliente"));
        return pedido;
    }
}
