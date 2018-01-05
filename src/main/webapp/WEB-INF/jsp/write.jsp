<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 쓰기</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/bootstrap/css/datepicker3.css" />
<script type="text/javascript" src="${contextPath}/resources/bootstrap/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="${contextPath}/resources/bootstrap/js/bootstrap-datepicker.kr.js"></script> 

<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script> 

<script type="text/javascript">
$(function(){
    $("#diary_date").datepicker({
        format: "dd MM yyyy"
    });
});
</script> 

</head>

<body>

	<h2> 일기 쓰기 </h2>
	<div class="container">
	    <form action="/writeProc" method="post">
	      <div class="form-group">
       		<label for="id">작성자</label>
        	<input type="text" class="form-control" id="id" name="id">
      	  </div>

	      <div class="form-group">
	        <label for="diary_date">날짜</label>
	 		 <input type="text"  id="diary_date"><br>
	      </div>
	     
	      <div class="form-group">
	        <label for="content">내용</label>
	        <textarea class="form-control" id="content" name="content" rows="3"></textarea>
	      </div>
	      <button type="submit" class="btn btn-primary">등록</button>
	    </form>
	</div>

</body>
</html>