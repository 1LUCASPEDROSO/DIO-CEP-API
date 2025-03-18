package dio.CepApi.Controller;

import dio.CepApi.Entity.Costumer;
import dio.CepApi.Service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/costumers")
public class CostumerController {
    @Autowired
    private CostumerService costumerService;

    @PostMapping
    public ResponseEntity<Costumer> insertCostumer(@RequestBody Costumer costumer){
        costumerService.insertCostumer(costumer);
        return ResponseEntity.status(HttpStatus.CREATED).body(costumer);
    }
    @GetMapping
    public ResponseEntity<Iterable<Costumer>> listAllCostumers() {
        Iterable<Costumer> costumers = costumerService.findAll();
        return ResponseEntity.ok(costumers);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Costumer>> findCostumer( @PathVariable Long id) {
        return ResponseEntity.ok(costumerService.findByID(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Costumer> updateCostumer(@PathVariable Long id, @RequestBody Costumer costumer) {
        costumerService.updateCostumer(id, costumer);
        return ResponseEntity.ok(costumer);
    }
    @DeleteMapping("/{id}")
    public void deleteCostumer(@PathVariable Long id) {
        costumerService.delete(id);
    }
}
