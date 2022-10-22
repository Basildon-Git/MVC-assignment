 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <title>MVC Assignment</title>
    </head>
    <body id="back">
        <div id='form-back' class='container'>
            <form method="POST"  action="signin">
                <div class="title-1">
                    <h1>Student Login</h1>
                </div>
                <br>
                <div class="row g-3">
                    <div class="col">
                        <div class="mb-3">
                            <input type="text" class="form-control" id="username" name="username" placeholder="username" required>
                        </div>
                        <div class="mb-3">
                            <input type="password" class="form-control" id="password" name="password" placeholder="your password" required>
                        </div>
                        <div class="mb-3">
                            <h5>Enter your credentials above to login</h5>
                        </div>
                        <div class="mb-3">
                            <p><a href="registerStudent.jsp">You have student account? Create new account</a></p>
                        </div>
                        <%
                            String msg = request.getParameter("msg");
                            if ("notexist".equals(msg)) {
                        %>
                        <h3 class="text-danger">Wrong login Credentials! Try Again!!</h3>
                        <%}%>
                        <button type="submit" class="btn btn-success">Sign In</button>
                    </div>
                    <div class="col">
                        <img src="images/coding.jpg">
                    </div>
                </div>
            </form>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

</body>
</html>