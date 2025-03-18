package dio.CepApi.Repository;

import dio.CepApi.Entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdressRepository extends JpaRepository<Adress,Long> {
    Optional<Adress> findByCep(String cep);
}
