package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage, Long> {

    @Override
    @RestResource(exported = false)
    void delete(TourPackage entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
