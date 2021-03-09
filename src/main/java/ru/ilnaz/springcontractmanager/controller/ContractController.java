package ru.ilnaz.springcontractmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.ilnaz.springcontractmanager.models.Contract;
import ru.ilnaz.springcontractmanager.repository.Repository;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/api/contract")
@Validated

public class ContractController {
    @Autowired
    private Repository<Contract> contractRepository;

    @GetMapping("/get/{id}")
    public Contract getById(@PathVariable @Min(1) int id) {
        return contractRepository.getById(id);
    }

    @PostMapping("/add")
    public void addContract(@RequestBody @Valid Contract contract) {

        contractRepository.add(contract);
    }

    @PostMapping("/del")
    public void delContract(@RequestBody @Valid Contract contract) {
        contractRepository.delete(contract);
    }

    @PostMapping("/upd")
    public void updateContract(@RequestBody @Valid Contract contract) {
        contractRepository.update(contract);
    }
}
