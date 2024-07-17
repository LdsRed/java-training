package org.jlarcher;

import org.jlarcher.jdbc.AdministradorDeConexiones;
import org.jlarcher.model.Cliente;
import org.jlarcher.repository.ClienteRepository;
import org.jlarcher.repository.ClienteRepositoryImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {


        try(Connection con = AdministradorDeConexiones.getConnection()) {

            ClienteRepository<Cliente> repositorioCliente = new ClienteRepositoryImp();

            repositorioCliente.listarClientes().forEach(System.out::println);

            //System.out.println(repositorioCliente.buscarPorId(1L));

            //Cliente cliente1 = new Cliente("Kevin Larcher", "Padre cerqueira 550", 2);
            Cliente cliente2 = new Cliente("Franco Larcher", "Marco Paz 240", 1);


            //repositorioCliente.registrarCliente(cliente1);

            //repositorioCliente.registrarCliente(cliente2);





        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
