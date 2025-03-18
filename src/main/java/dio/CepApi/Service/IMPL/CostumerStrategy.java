package dio.CepApi.Service.IMPL;

import dio.CepApi.Entity.Costumer;

import java.util.Optional;

public interface CostumerStrategy {
    /**
     * Interface for definition all methods to manipulate customer with concept of Strategy with this we can use mutiple times same method
     */
    Iterable<Costumer> findAll();
    Optional<Costumer> findByID(long id);
    void insertCostumer(Costumer costumer);
    void updateCostumer(long id, Costumer costumer);
    void delete(long id);
}






