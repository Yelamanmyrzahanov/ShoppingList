package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.ShopItem
import com.sumin.shoppinglist.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItemById(id: Int): ShopItem {
        return shopListRepository.getShopItemById(id)
    }
}