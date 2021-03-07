package com.tts.weatherapp.repository;

import com.tts.weatherapp.model.ZipCode;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {
//    List<ZipCode> findAll();
//    List findByZipCode(String zipCode);
//
//    default ZipCode deleteById() {
//        return deleteById();
//    }




}
