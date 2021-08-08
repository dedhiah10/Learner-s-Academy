<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<style>
	*{
	    margin: 0;
	    padding: 0;
	    box-sizing: border-box;
	    font-family: 'Open Sans', sans-serif;
	}
	label{padding: 3px 7px 5px 2px; margin: 3px 7px 5px 2px;}
	input {
		max-width: 100%;
		justify-self: center;
		padding: 3px 5px 10px 5px;
	}
	.inputs {
		width: 100%;
		font-size: 14px;
		padding: 5px;
	}
	input[type=text], input[type=date], input[type=number] {border-radius: 7px;}
	.onethird {width :25%; border-right: 1px solid red; border-left: 1px solid red;}
	.buttons {color: white; background-color: #4B0082; border: 2px solid black; border-radius: 5px;}
	div {display: flex; align-items: center;}
	form {padding: 2px 5px;}
</style>
</head>
<body>	
	<div style= 'align-self: center;'>
		<span class='onethird'>
			<form action="DatabaseAdder" method= "post">
				<label for="studentName">Student's Name:</label><br/>	
				<input type="text" id="studentName" name="studentName" required/><br/>
				<label>Student's Standard:</label><br/>				
				<label for="standard"><input type="radio" id="standard" name="standard" value="1" checked required/> 1</label><br/>
				<label>Student's Class:</label><br/>			
				<label for="A"><input type="radio" name="className" id="A" value="A" required/> A</label>				
				<label for="B"><input type="radio" name="className" id="B" value="B" required/> B</label>					
				<label for="C"><input type="radio" name="className" id="C" value="C" required/> C</label><hr/>	
				<input type="hidden" name="formNum" value="1"/>	
				<input class="inputs buttons" type= "submit" value="Add a Student"/>
			</form>
		</span><br/>	
			
		<span class='onethird'>
			<form action="DatabaseAdder" method= "post">
				<label for="teacherName">Teacher's Name:</label><br/>	
				<input type="text" id="teacherName" name="teacherName" required/><br/>
				<label for="teacherSalary">Teacher's Salary:</label><br/>
				<input type="number" id="teacherSalary" name="teacherSalary" required/><br/>
				<label for="dateOfBirth">Date of Birth:</label><br/>
				<input type="date" id="dateOfBirth" name="dateOfBirth" placeholder="yyyy-mm-dd" required/><br/><hr/>
				<input type="hidden" name="formNum" value="2"/>
				<input class="inputs buttons" type = "submit" value="Add a Teacher"/><br/>
			</form>
		</span><br/>
		
		<span class='onethird'>
			<form action="DatabaseAdder" method= "post">
				<label for="subjectName">Subject's Name</label><br/>
				<input type="text" id="subjectName" name="subjectName" required/><br/><hr/>
				<input type="hidden" name="formNum" value="3"/>
				<input class="inputs buttons" type = "submit" value="Add a Subject"/>
			</form>
		</span><br/>
		
		<span class='onethird'>
			<form action="TimeScheduler" method= "post">
				<input class="inputs buttons" type = "submit" value="Show Time-Table?"/>
			</form>
		</span><br/>	
		
		<!-- <span class='onethird'>
			<form action="" method= "post">
				<input class="inputs" type = "submit" value="Add a lecture"/>
			</form>
		</span><br/>-->		
	</div>
</body>
</html>