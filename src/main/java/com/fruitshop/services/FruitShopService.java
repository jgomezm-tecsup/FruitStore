package com.fruitshop.services;

import java.util.Map;

import com.fruitshop.entities.ProductOrder;

public interface FruitShopService {

	ProductOrder calculateBill(Map<String, String> prodsPriceRaw, Map<String, String> prodsQuantityRaw);

}
