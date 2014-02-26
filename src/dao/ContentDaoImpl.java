package dao;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import javax.xml.ws.WebServiceContext;

import javax.xml.ws.handler.MessageContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

//import com.sun.tools.internal.ws.wsdl.document.http.HTTPConstants;

import pojo.test;
@Transactional
public class ContentDaoImpl implements ContentDao 
{
	private test contetn;
	@PersistenceContext//META-INF/persistence.xml
	private EntityManager em; 
	
	
	public void create(Object obj) 
	{
		// TODO Auto-generated method stub
		em.persist(obj);
	}

	
	public int getTottalCount(String hql) 
	{
		List list=em.createQuery(hql).getResultList();
		if(list.size()>0)
		{
			Number number=(Number) list.get(0);
			return number.intValue();
		}
		return 0;
	}

	//@SuppressWarnings("unchecked")
	public List list(String hql, int firstResult, int maxResults) {
		
		return em.createQuery(hql).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
		
	}

	
	@SuppressWarnings("unchecked")
	public List<test> ListAll() {
		// TODO Auto-generated method stub
		Query query = getEm().createQuery("select c FROM test c");
		
        return query.getResultList();
	}

	
	public void remove(Integer cid) 
	{
		// TODO Auto-generated method stub
		test content = find(cid);
        if (content != null) 
        {
            em.remove(content);
        }
	}
	
	
	public test find(Integer cid) 
	{
		return em.find(test.class, cid);
		
	}

	public test getContetn() 
	{
		return contetn;
	}

	public void setContetn(test contetn) 
	{
		this.contetn = contetn;
	}
	
	public EntityManager getEm() 
	{
		return em;
	}
	
	public void setEm(EntityManager em) 
	{
		this.em = em;
	}
	
	public String getDate()
	{
	
		
		Date time=new Date();
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetime = tempDate.format(time);
		
	    return datetime;
	     
	    
	}
}
