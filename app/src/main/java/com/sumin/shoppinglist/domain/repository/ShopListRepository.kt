package com.sumin.shoppinglist.domain.repository

import com.sumin.shoppinglist.domain.ShopItem

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun removeShopItem(shopItem: ShopItem)

    fun getShopItemById(id: Int): ShopItem

    fun editShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)
}