package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import pojo.test;
public interface ContentService 
{
	public List<test> ListAll();
	public void addContent(test content);
	public void remove(Integer cid);
	public test find(Integer cid);
	public String getTime();
	public String getIP(HttpServletRequest request);
}
