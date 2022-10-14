package mintic.Reto31.Repository.CrudRepository;

import mintic.Reto31.Entities.Message;
import org.springframework.data.repository.CrudRepository;
public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
