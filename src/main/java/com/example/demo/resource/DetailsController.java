package com.example.demo.resource;

import com.example.demo.model.Details;
import com.example.demo.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DetailsController {

    @Autowired
    private DetailsRepository repository;

    @PostMapping("/addDetails")
    public String saveDetails(@RequestBody Details details){
        repository.save(details);
        return "Added Details with id:"+ details.getId();
    }
    @GetMapping("/findAllDetails")
    public List<Details> getDetails(){
        return repository.findAll();
    }

    @GetMapping("/findAllDetails/{id}")
    public Optional<Details> getDetail(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDetails(@PathVariable int id){
        repository.deleteById(id);
        return "Details deleted with id:"+id;
    }
}
