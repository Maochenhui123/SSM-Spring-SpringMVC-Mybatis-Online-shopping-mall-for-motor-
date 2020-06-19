package com.maoc.service.impl;

import com.maoc.dao.DealerDao;
import com.maoc.domain.Dealer;
import com.maoc.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dealerService")
public class DealerServiceImpl implements DealerService {

    @Autowired
    DealerDao dealerDao;

    @Override
    public Dealer findByDealerName(String dealerName) {
        return dealerDao.findByDealerName(dealerName);
    }

    public List<Dealer> findByProvince(String province) {
        return dealerDao.findByProvince(province);
    }
}
