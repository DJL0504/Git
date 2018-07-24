package com.bw.mapper;

import java.util.List;

import com.bw.beans.Shop;

public interface IShopMapper {
	//查询商品列表数据
	public List<Shop> findShops(Shop shop);
}

