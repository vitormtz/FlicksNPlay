package Support;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IAdapter<T, E> {

    // CRUD
    public void create(T objeto) throws KeyViolationException, InvalidKeyException, SQLException;

    public T read(E primaryKey) throws NotFoundException;

    public ArrayList<T> readAll();

    public ArrayList<T> readAll(Filter<T> filtro);

    public void update(T objeto) throws NotFoundException;

    public void delete(E primaryKey) throws NotFoundException;
}
