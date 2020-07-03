<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>



<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script >

function Create() {

	var name = $('input#name').val();
	var age = $('input#age').val();

	data = {name : name,
			age : age}
	
	axios.post("create",data).then(function(res) {
		console.log(res);
	})	

}	
function deleteByName() {
	var name = $('input#deleteName').val();
	data = {name : name}
	axios.post("delete",data).then(function(res) {
		console.log(res);
	})	
}

var datas =[];

function  read() {
	var temp3;
	var temp2 = axios.get("read").then(new Promise(function(res) {
		temp3=res.data;
		return res.data;
	})).then(temp => {
		datas=temp;
		console.log(datas,"2");
		return datas;
	})
	console.log(datas,"4");
	var text = '';
		
		for(var i =0; i < datas.data.length; ++i) {
			text += '<li>' + datas.data[i].name+ '</li>'
			text += '<li>' +datas.data[i].age.toString()+ '</li>'+"<br/>"			
		}
	document.getElementById("v").innerHTML=text;
	
}



function update() {
	var name = $('input#updatename').val();
	var age = $('input#updateage').val();

	data = {name : name,
			age : age}
	
	axios.post("update",data).then(function(res) {
		console.log(res);
	})	
}
	
	
	
</script>

	<form  >
	insert
	name <input type = "text" id = "name"  />
	age <input type = "text" id = "age" />
	<button onclick = "Create()">전송</button>
 	</form>
 	<form  >
	update
	name <input type = "text" id = "updatename"  />
	age <input type = "text" id = "updateage" />
	<button onclick = "update()">전송</button>
 	</form>
 	
	<form  >
	deleteByName <input type = "text" id = "deleteName"  />
	<button onclick = "deleteByName()">삭제 실행</button>
 	</form>
	<button onclick = "read()">조회로그</button>

	<h1>HomeView</h1>
	<p id="v"></p>
	<c:forEach var="value" items="${datas.data}">
		<p><c:out value="${value.name}"/></p>
	</c:forEach>

</body>
</html>