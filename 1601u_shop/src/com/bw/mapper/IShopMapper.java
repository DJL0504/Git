package com.bw.mapper;

import java.util.List;

import com.bw.beans.Shop;

public interface IShopMapper {
	//��ѯ��Ʒ�б�����
	public List<Shop> findShops(Shop shop);
}

