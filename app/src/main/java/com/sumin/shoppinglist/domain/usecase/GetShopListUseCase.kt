package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.ShopItem
import com.sumin.shoppinglist.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}