package edu.utnPhone.service;

import edu.utnPhone.domain.Province;
import edu.utnPhone.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {

    private final ProvinceRepository provinceRepository;

    @Autowired
    public ProvinceService(ProvinceRepository provinceRepository){
        this.provinceRepository=provinceRepository;
    }

    public void add(final Province province){
        provinceRepository.save(province);
    }

    public List<Province> getAll(){
        return provinceRepository.findAll();
    }
}
