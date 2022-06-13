package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.ShopItem
import com.sumin.shoppinglist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}