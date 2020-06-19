package com.maoc.service.impl;

import com.maoc.dao.MotorDao;
import com.maoc.domain.Motor;
import com.maoc.service.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("motorService")
public class MotorServiceImpl implements MotorService {

    @Autowired
    private MotorDao motorDao;

    public Motor findMotorByName(String Name) {
        return motorDao.findByName(Name);
    }
}
