package ru.ilnaz.springcontractmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.ilnaz.springcontractmanager.models.ExternalActs;

public interface ExternalActsRepository extends JpaRepository<ExternalActs, Integer>, JpaSpecificationExecutor<ExternalActs> {

}