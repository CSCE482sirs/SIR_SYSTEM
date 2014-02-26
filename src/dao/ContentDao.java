package dao;

import java.util.List;

import pojo.test;;

public interface ContentDao 
{
	public void create(Object obj);
	public int getTottalCount(String hql);
	public List list(String hql,int firstResult, int maxResults);
	public List<test> ListAll();
	public void remove(Integer cid);
	public test find(Integer cid);
	public String getDate();
}
