package com.maoc.service;

import com.maoc.domain.Dealer;

import java.util.List;

public interface DealerService {

    Dealer findByDealerName(String dealerName);

    List<Dealer> findByProvince(String province);
}
