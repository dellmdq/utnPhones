package edu.utnPhone.controller;

import edu.utnPhone.domain.Province;
import edu.utnPhone.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/province")
public class ProvinceController {

    private final ProvinceService provinceService;

    @Autowired
    public ProvinceController (ProvinceService provinceService){
        this.provinceService=provinceService;
    }

    @PostMapping ("/")
    public void addProvince (@RequestBody @Valid Province province){
        provinceService.add(province);
    }

    @GetMapping ("/")
    public List<Province> getAll(){
       return provinceService.getAll();
    }
}
