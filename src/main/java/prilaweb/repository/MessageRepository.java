package prilaweb.repository;

import org.springframework.data.repository.CrudRepository;
import prilaweb.domain.Message;

public interface MessageRepository extends CrudRepository<Message, Integer> {

}