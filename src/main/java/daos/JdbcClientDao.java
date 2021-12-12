package daos;

import models.Client;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;

public class JdbcClientDao implements  ClientDao <Client> {
    private JdbcTemplate jdbcTemplate;

    public JdbcClientDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public Client findById(int id) {
        Client client = null;
        String sql = " SELECT * FROM client WHERE client_id = ? ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql,id);
        while ( result.next()) {
            client = rowMap(result);

        }
        return client;
    }


    public List < Client> findAll() {
        List<Client> clientList = new ArrayList<>();
        String sql = " SELECT * FROM client ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        while( result.next()) {
            Client client = rowMap(result);
            clientList.add(client);
        }

        return clientList;
    }



    public Boolean update(long id, String newAddress) {

    String sql = "UPDATE Client SET address = ? WHERE client_id =?";
    return jdbcTemplate.update(sql,newAddress, id) == 1;

    }


    public Client create(Client dto) {
        String sql = " INSERT INTO client (ss_number,first_name, last_name, address, phone_number, fee_paid ) " +
                " VALUES (?,?,?,?,?,?)";
        int j =jdbcTemplate.update(sql,dto.getSs_number(),dto.getFirst_name(),dto.getLast_name(),dto.getAddress(),dto.getPhone_number(), dto.getFee_paid());
        return dto;
    }


    public void delete(int id) {
        String sql = " DELETE FROM client WHERE client_id = ?";
        jdbcTemplate.update(sql, id);

    }



    private Client rowMap(SqlRowSet result) {
        Client client = new Client();
        client.setClient_id(result.getLong("client_id"));
        client.setAddress(result.getString("address"));
        client.setFirst_name(result.getString("first_name"));
        client.setLast_name(result.getString("last_name"));
        client.setPhone_number(result.getString("phone_number"));
        client.setFee_paid(result.getDouble("fee_paid"));
        client.setSs_number(result.getInt("ss_number"));
        return client;
    }




}


