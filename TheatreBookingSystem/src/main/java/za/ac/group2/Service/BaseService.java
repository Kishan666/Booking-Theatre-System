package za.ac.group2.Service;

public interface BaseService <E, ID> {
    E save(E id);
    E findById(ID id);
    E update(E id);
    void delete(E id);
}
