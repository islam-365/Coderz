package com.example.Coderz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Coderz.entity.Data;
import com.example.Coderz.repository.DataRepository;

@Service
public class DataServiceImp implements DataService{

  @Autowired
  DataRepository dataRepository;

  @Override
  public Data saveData(Data data) {
    return dataRepository.save(data);
  }
}
