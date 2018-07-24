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
    //�����б��ѯ
	@Test
	public void testList() throws IOException{
		//����mybatisde ����
		InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(is);		
	    SqlSession session = sf.openSession();
	
	    //���ò�ѯ�ķ�������һ�ֲ�����ӳ���ļ��еķ���
	    //List<Shop> selectList = session.selectList("findShop");
	    //�����ѯ�ķ������ڶ��ֲ�����ӳ���ļ��еķ�����
	    //List<Shop> selectList = session.selectList("com.bw.beans.ShopMapper.findShop");
	    
	    Shop s = new Shop();
	    s.setPage(0);
	    s.setRows(20);
	    s.setSname("��");
	    s.setBrief("��");
	    List<Shop> selectList = session.selectList("com.bw.beans.ShopMapper.findShop",s);
	    
	    for (Shop shop : selectList) {
			System.out.println(shop);
		}
	}
}
