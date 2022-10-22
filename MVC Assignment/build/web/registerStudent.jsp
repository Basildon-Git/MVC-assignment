<%-- 
    Document   : index
    Created on : Sep 22, 2022, 4:43:14 PM
    Author     : Desenhador Solutions
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MVC Assignment</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    </head>
    <body
        <div class="container">
            <h1>Register Student</h1>
            <form class="row g-3" method="POST" action="studreg">
                <div class="row g-3">
                    <div class="col">
                        <label for="fname" class="form-label">First Name</label>
                        <input type="text" class="form-control" id="fname" name="fname" value="" placeholder="Your Name" aria-label="First name" required>
                    </div>
                    <div class="col">
                        <label for="sname" class="form-label">Surname</label>
                        <input type="text" class="form-control" id="sname" name="sname" value="" placeholder="Your Surname" aria-label="Last name" required>
                    </div>
                </div>
                <div class="row g-3">
                    <div class="col">
                        <label for="program" class="form-label">Program</label>
                        <input type="text" class="form-control" id="program" name="program" value="" placeholder="Your program" aria-label="program" required>
                    </div>
                    <div class="col">
                        <label for="uname" class="form-label">Username</label>
                        <input type="text" class="form-control" id="uname" name="uname" value="" placeholder="Your Username" aria-label="Last name" required>
                    </div>
                </div>
                <div class="row g-3">
                    <div class="col">
                        <label for="pass" class="form-label">Password</label>
                        <input type="password" class="form-control" id="pass" name="pass" value="" aria-label="program" required>
                    </div>
                    <div class="col">
                        <label for="dob" class="form-label">Date of Birth</label>
                        <input type="date" class="form-control" id="dob" name="dob" value=""  aria-label="Last name" required>
                    </div>
                </div>
                <div class="mb-3">
                    <p><a href="loginStudent.jsp">You already have student account? Sign in</a></p>
                </div>
                <div class="col-12">
                    <button type="submit" value="Register" class="btn btn-success">Register</button>
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>
