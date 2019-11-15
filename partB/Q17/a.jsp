

<html>
<body>

<%

    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");

    int i = Integer.parseInt(num1);
    int j = Integer.parseInt(num2);
    int k=0;

    String option = request.getParameter("op");

    if(option.equals("add"))
        k=i+j;
    else if(option.equals("mul"))
        k=i*j;
    else if(option.equals("div"))
        k=i/j;


%>

<h1>Result : <%= k %></h1>

</body>

</html>