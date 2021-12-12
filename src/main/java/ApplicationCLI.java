import daos.ClientDao;
import daos.JdbcClientDao;
import models.Client;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class ApplicationCLI {
//    private  ClientDao clientDao;

    public static void main (String... args) {
        BasicDataSource dataSource=getBasicDataSource();
        ClientDao clientDao = new JdbcClientDao(dataSource);
        Client client = new Client();
        client.setSs_number(985444);
        client.setFirst_name("Malick");
        client.setLast_name("TRAORE");
        client.setAddress("854 rue de new york, Paris, 75020");
        client.setFee_paid(890);
        client.setPhone_number("30923843");
        System.out.println(clientDao.create(client));
//      clientDao.delete(1);


    }

    private static BasicDataSource getBasicDataSource () {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/TAXSYSTEM");
        dataSource.setUsername("root");
        dataSource.setPassword("zipcode0");
        return dataSource;

    }


}
