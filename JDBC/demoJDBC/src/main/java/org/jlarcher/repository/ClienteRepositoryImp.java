package org.jlarcher.repository;

import org.jlarcher.jdbc.AdministradorDeConexiones;
import org.jlarcher.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImp implements ClienteRepository<Cliente>{

    private Connection getConnection() throws SQLException {
        return AdministradorDeConexiones.getConnection();
    }

    @Override
    public List<Cliente> listarClientes() {

       List<Cliente> clientes = new ArrayList<>();

       try(Statement stmt = getConnection().createStatement();
           ResultSet resultSet = stmt.executeQuery("SELECT * FROM clientess")){

           //Se debe crear un cliente al cual se le mapeara los datos extraidos de la bd y posteriormente
           //agregados a la lista creada anteriormente


           while (resultSet.next()){
               Cliente cliente = crearCliente(resultSet);
               clientes.add(cliente);
           }

       } catch (SQLSyntaxErrorException e) {
           e.printStackTrace();
       }catch (SQLException e){

       }


        return clientes;

    }

    @Override
    public Cliente buscarPorId(Long id) {
        Cliente cliente = null;

        try(PreparedStatement stmt = getConnection().
                prepareStatement("SELECT * FROM clientes WHERE id_cliente = ? ")){
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                cliente = crearCliente(resultSet);
            }
            resultSet.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }


        return cliente;
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        String sql;

        //Dependiendo del valor del ID se creara o se actualizará el cliente

        if (cliente.getId_cliente() != null && cliente.getId_cliente() > 0) {
            sql = "UPDATE clientes SET nombre = ?, direccion =?, cantidad_pedidos = ? WHERE id_cliente?";
        }else {
            sql = "INSERT INTO clientes(nombre, direccion, cantidad_pedidos) VALUES(?,?,?)";
        }

        try(PreparedStatement stmt = getConnection().prepareStatement(sql)){
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getDireccion());
            stmt.setInt(3, cliente.getCantidad_pedidos());

            if (cliente.getId_cliente() != null && cliente.getId_cliente() > 0 ){
                stmt.setLong(4, cliente.getId_cliente());
            }

            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarCliente(Long id) {

        try(PreparedStatement stmt = getConnection().
                prepareStatement("DELETE FROM clientes WHERE id_cliente = ? ")){
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();

            resultSet.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Cliente crearCliente(ResultSet resultSet) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId_cliente(resultSet.getLong("id_cliente"));
        cliente.setNombre(resultSet.getString("nombre"));
        cliente.setDireccion(resultSet.getString("direccion"));
        cliente.setCantidad_pedidos(resultSet.getInt("cantidad_pedidos"));
        return cliente;
    }
}
