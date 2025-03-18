package dio.CepApi.Service;

import dio.CepApi.Entity.Adress;
import dio.CepApi.Entity.Costumer;
import dio.CepApi.Repository.AdressRepository;
import dio.CepApi.Repository.CostumerRepository;
import dio.CepApi.Service.IMPL.CostumerStrategy;
import dio.CepApi.Service.IMPL.ViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CostumerService implements CostumerStrategy {
    @Autowired
    private CostumerRepository costumerRepository;
    @Autowired
    private AdressRepository adressRepository;
    @Autowired
    private ViaCep viaCep;


    @Override
    public Iterable<Costumer> findAll() {
        return costumerRepository.findAll();
    }

    @Override
    public Optional<Costumer> findByID(long id) {
        return costumerRepository.findById(id);
    }

    @Override
    public void insertCostumer(Costumer costumer) {
        Adress cep = findCep(costumer.getUser_adress().getCep());
        costumer.setUser_adress(cep);
        costumerRepository.save(costumer);
    }


    @Override
    public void updateCostumer(long id, Costumer costumer) {
        Optional<Costumer> costumerDB = costumerRepository.findById(id);
        if (costumerDB.isEmpty()){
            throw new RuntimeException("user not find");
        }
        Costumer updatedCostumer = costumerDB.get();
        updatedCostumer.setUser_adress(findCep(costumer.getUser_adress().getCep()));
    }

    @Override
    public void delete(long id) {
        costumerRepository.deleteById(id);
    }
    private Adress findCep( String cep){
        return adressRepository.findByCep(cep).orElseGet(()->{
            Adress newCep = viaCep.findByCep(cep);
            return adressRepository.save(newCep);
    });
    } // method

}
