package com.maoc.service.impl;

import com.maoc.dao.BankDao;
import com.maoc.dao.InventoryDao;
import com.maoc.dao.MotorDao;
import com.maoc.dao.OrderDao;
import com.maoc.domain.Bank;
import com.maoc.domain.Inventory;
import com.maoc.domain.Motor;
import com.maoc.domain.Orders;
import com.maoc.service.OrderService;
import com.maoc.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
    @Autowired
    BankDao bankDao;
    @Autowired
    InventoryDao inventoryDao;
    @Autowired
    MotorDao motorDao;

    public void insertOrder(Orders orders) throws RuntimeException{
        try {
            orderDao.insertOrder(orders);

            Bank bank = bankDao.findById(orders.getCredit());

            Motor motor = motorDao.findByName(orders.getName());

            Inventory inventory = new Inventory();
            inventory.setDealerId(orders.getDealerId());
            inventory.setName(orders.getName());
            inventory = inventoryDao.findByNameAndId(inventory);
            if(inventory.getNumber()<1)
                throw new RuntimeException("No enough car left");

            if(bank==null)
                throw new RuntimeException("No such a bank exist");

            String balance = StringUtils.subs(bank.getBalance(),motor.getPrice());
            if(balance==null)
                throw new RuntimeException("No sufficient balance in current card");

            bank.setBalance(balance);
            bankDao.updateBank(bank);

            inventory.setNumber((inventory.getNumber()-1));
            inventoryDao.updateInventory(inventory);
        } catch (RuntimeException e) {
            System.out.println("------------------------------------------------------");
            System.out.println("出问题了");
            e.printStackTrace();
            throw e;
        }
    }


}
