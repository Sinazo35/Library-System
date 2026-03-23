/* IRepository.java
   Generic repository interface
   Author: Tiyani Ngwana (231266731)
   Date: 13 March 2026.
*/
package repository;

import java.util.Optional;

public interface IRepository<T> {
    T create(T t);
    T read(String id);
    T update(T t);
    boolean delete(String id);
    Collection<T> getAll();
}


