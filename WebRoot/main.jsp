<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>

<%@include file="/commons/head.jsp" %>

		
	
        <div style="width: 600px;border-style: solid">
        	<div style="text-align: right;">
    			<sx:a id="d" notifyTopics="/refresh">Refresh</sx:a>
    		</div>
    		
    	<sx:div id="contents" theme="ajax" href="%{descrsUrls}"  listenTopics="/refresh"/>
    		
        </div>
		 
        <br/>
		
		<div style="width: 300px;border-style: solid">
			<p>message board</p>
			<s:form action="addContent.action" >
			    <s:textfield id="cid" name="content.cid" cssStyle="display:none"/>
				<s:hidden name="content.name" value="%{#session.user.amname}"> </s:hidden>
				<s:textarea id="content" label="content" name="content.content"/>

				
				<sx:submit targets="contents" />
			</s:form>
		</div>
	<s:property value="#request."></s:property>
    <%=request.getRemoteAddr()%>
	
  	  
<%@include file="/commons/foot.jsp" %>