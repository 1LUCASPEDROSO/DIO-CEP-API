package dio.CepApi.Service.IMPL;

import dio.CepApi.Entity.Adress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCep",url = "https://viacep.com.br/ws")
public interface ViaCep {
    @GetMapping("/{cep}/json/")
    Adress findByCep(@PathVariable("cep") String cep);
}
