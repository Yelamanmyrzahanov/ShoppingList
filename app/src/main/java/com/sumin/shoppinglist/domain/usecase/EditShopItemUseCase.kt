package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.ShopItem
import com.sumin.shoppinglist.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}