package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.ShopItem
import com.sumin.shoppinglist.domain.repository.ShopListRepository

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun removeShopItem(shopItem: ShopItem) {
        shopListRepository.removeShopItem(shopItem)
    }
}