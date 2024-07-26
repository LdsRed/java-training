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
    public static void main( String[] args ) throws SQLException {




            ClienteRepository<Cliente> repositorioCliente = new ClienteRepositoryImp();

            repositorioCliente.listarClientes().forEach(System.out::println);





    }
}
