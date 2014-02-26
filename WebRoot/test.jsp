<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
Now is:
<s:bean name="java.util.Date" id="date">
			<s:param name="time" value="#date.time - 70*24*60*60*1000"/>
</s:bean>
<s:date name="date" format="yyyy-MM-dd HH:mm:ss"/>
<br />
<p>message board</p> 

<s:if test="contents.size > 0">  

	<table> 
		<tr>
						<td>
							username
						</td>

						<td>
							content 
						</td>
						<td>
							time
						</td>
						
						<td>
							IP
						</td>
						
				<td>
		<s:iterator value="contents">
			
			<tr id="row_<s:property value="cid"/>">
						<td>
							<s:property value="name" />
						</td>

						<td>
							<s:property value="content" /> 
						</td>
				
						<td>
							<s:property value="data" />
						</td>
						<td>
							
							
							<s:property value="ipaddress" />
							
						</td>
						<td>
							<s:if test="name==#session.user.amname">
							<s:url id="removeUrls" action="removeContent">
								<s:param name="cid" value="cid" />
							</s:url>
							<sx:a href="%{removeUrls}" targets="contents">Del</sx:a>
							</s:if>
						</td>
			</tr>
			
			
                 
		</s:iterator>
		 
	</table>
	
</s:if>


</body>
</html>