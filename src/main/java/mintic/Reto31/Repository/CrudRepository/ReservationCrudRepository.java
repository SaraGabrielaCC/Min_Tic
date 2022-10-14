package mintic.Reto31.Repository.CrudRepository;

import mintic.Reto31.Entities.Reservation;
import org.springframework.data.repository.CrudRepository;
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
