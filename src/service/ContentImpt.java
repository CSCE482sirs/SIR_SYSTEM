package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import pojo.test;
import dao.ContentDao;;
 

public class ContentImpt implements ContentService
{
	ContentDao contentDao;
	
	public ContentDao getContentDao() {
		return contentDao;
	}

	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}
	
	public List<test> ListAll()
	{
		return contentDao.ListAll();
	}
	public void addContent(test content)
	{
		contentDao.create(content);
	}
	public void remove(Integer cid)
	{
		contentDao.remove(cid);
	}
	public test find(Integer cid)
	{
		return contentDao.find(cid);
	}
	
	public String getTime()
	{
		return contentDao.getDate();
	}

	public String getIP(HttpServletRequest request) 
	{
		String ip = request.getHeader("x-forwarded-for");      
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
            ip = request.getHeader("Proxy-Client-IP");      
        }      
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
            ip = request.getHeader("WL-Proxy-Client-IP");      
        }      
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
            ip = request.getRemoteAddr();      
        }      
        return ip;      
		// TODO Auto-generated method stub
		
	}


	
	


	
	 
}
