package pl.sda.repository;

import java.util.Optional;


public interface Repository<T, K> {
    void save(T entity);
    T merge(T entity);
    void deleteById(K id);
    void delete(T entity);
    Optional<T> findByRank(K rank);
}