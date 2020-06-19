package com.maoc.service.impl;

import com.maoc.dao.InventoryDao;
import com.maoc.domain.Inventory;
import com.maoc.domain.Item;
import com.maoc.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("inventoryService")
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    InventoryDao inventoryDao;

    public Inventory findNumberfromdealer(Item item) {
        List<Inventory> inventories = inventoryDao.findNumberfromdealer(item);
        if(inventories.isEmpty())
            throw new RuntimeException("Not car found");
        return inventories.get(0);
    }

    public Inventory findByNameAndId(Inventory inventory){
        return inventoryDao.findByNameAndId(inventory);
    }
    public void updateInventory(Inventory inventory) {
        inventoryDao.updateInventory(inventory);
    }
}
