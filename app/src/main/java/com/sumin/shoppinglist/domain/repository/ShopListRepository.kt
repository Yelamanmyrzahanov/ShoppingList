package com.sumin.shoppinglist.domain.repository

import com.sumin.shoppinglist.domain.ShopItem

interface ShopListRepository {
    fun getShopList(): List<ShopItem>
    fun removeShopItem(id: Int)
    fun getShopItemById(id: Int): ShopItem
    fun editShopItem(id: Int)
    fun addShopItem(shopItem: ShopItem)
}