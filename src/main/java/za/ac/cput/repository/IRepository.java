package za.ac.cput.repository;

import java.util.List;

public interface IRepository <T, ID>
{
    T create(T entity);
    T findById(ID id);
    T update(T entity);
    boolean delete(ID id);
    List<T> getAll();
}
