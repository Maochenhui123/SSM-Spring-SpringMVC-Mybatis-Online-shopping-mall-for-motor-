package com.maoc.service;

import com.maoc.domain.Inventory;
import com.maoc.domain.Item;

public interface InventoryService {

    Inventory findNumberfromdealer(Item item);

    Inventory findByNameAndId(Inventory inventory);

    void updateInventory(Inventory inventory);
}
