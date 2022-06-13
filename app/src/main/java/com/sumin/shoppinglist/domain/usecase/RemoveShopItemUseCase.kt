package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.repository.ShopListRepository

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun removeShopItem(id: Int) {
        shopListRepository.removeShopItem(id)
    }
}