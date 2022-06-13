package com.sumin.shoppinglist.domain.usecase

import com.sumin.shoppinglist.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(id: Int) {
        shopListRepository.editShopItem(id)
    }
}