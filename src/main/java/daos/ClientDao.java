package daos;

import java.util.List;

public interface  ClientDao <T> {

    public T findById(int id);
    public List findAll();
    public Boolean update(long id, String newAddress);
    public T create(T dto);
    public void delete(int id);

}
