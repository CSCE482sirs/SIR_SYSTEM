package action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import pojo.test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;


import service.ContentService;



public class ContentAction implements Preparable,ServletRequestAware
{
	private String time;
	private List<test> contents;
	private test content;
	private Integer cid;
	private ContentService contentservice;

	private int page;
	
	
	
	
	
	
	

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}


	HttpServletRequest request;
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<test> getContents() {
		return contents;
	}

	public void setContents(List<test> contents) {
		this.contents = contents;
	}

	public test getContent() {
		return content;
	}

	public void setContent(test content) {
		this.content = content;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	

	public ContentService getContentservice() {
		return contentservice;
	}

	public void setContentservice(ContentService contentservice) {
		this.contentservice = contentservice;
	}

	public void prepare() throws Exception 
	{
		// TODO Auto-generated method stub
		if (cid != null)
            content = contentservice.find(cid);
	}
	public String execute() 
	{
		
    	this.contents=contentservice.ListAll();
        return Action.SUCCESS;
    }
	public String add() throws ParseException 
	{
		
		//String timee=contentservice.getTime();
		//Date time=new Date();
		//SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//String datetime = tempDate.format(time);
		//System.out.println(time);
		//Date date = tempDate.parse( datetime );
		this.content.setDate(new Date());
		this.content.setIpaddress(contentservice.getIP(request));
		//System.out.print(new java.sql.Date(date.getTime()));
        this.contentservice.addContent(content);
        this.content = new test();
        return execute();
    }

    public String remove() {
    	//System.out.print(cid);
        contentservice.remove(cid);
        return execute();
    }

	public List<test> getCourseusers() {
		return contents;
	}
	@SuppressWarnings("unchecked")
	public String listAllcontent()
	{
        System.out.println(page);

		
    	this.contents=contentservice.ListAll();
		//this.contents = contentservice.ListAll();
        return "list";
	}
	public String Time()
	{
		this.time=contentservice.getTime();
		
		return Action.SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}
	public String gettime2()
	{
		//System.out.print(contentservice.getTime());
		this.time=contentservice.getTime();
		return Action.SUCCESS;
	}


}
