package com.bw.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.bw.beans.Shop;

public class TestMybaits {
    //测试列表查询
	@Test
	public void testList() throws IOException{
		//加载mybatisde 核心
		InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(is);		
	    SqlSession session = sf.openSession();
	
	    //调用查询的方法，第一种参数是映射文件中的方法
	    //List<Shop> selectList = session.selectList("findShop");
	    //调查查询的方法，第二种参数是映射文件中的方法名
	    //List<Shop> selectList = session.selectList("com.bw.beans.ShopMapper.findShop");
	    
	    Shop s = new Shop();
	    s.setPage(0);
	    s.setRows(20);
	    s.setSname("球");
	    s.setBrief("好");
	    List<Shop> selectList = session.selectList("com.bw.beans.ShopMapper.findShop",s);
	    
	    for (Shop shop : selectList) {
			System.out.println(shop);
		}
	}
}
