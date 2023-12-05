<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
    <link rel = "stylesheet"
          href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <title>Welecome!</title>
</head>
<body>
    <!--메뉴바 모둘화-->
    <%@ include file="menu.jsp"%>
    <%! String greeting = "조선 컴팔이에 오신 것을 환영합니다.";
        String taggline = "Welcome to Web Computer Shop";%>

    <div class = "jumbotron">
        <div class = "container">
            <h1 class = "display-3">
                <%= greeting %>
            </h1>
        </div>
    </div>

    <main role = "main">
        <div class = "container">
            <div class = "text_center">
                <h3>
                    <%= taggline %>
                </h3>

                <div id="clock"></div>
                <script>
                    function updateClock() {
                        var now = new Date();
                        var hours = now.getHours();
                        var minutes = now.getMinutes();
                        var seconds = now.getSeconds();

                        // Add leading zero if needed
                        hours = hours < 10 ? '0' + hours : hours;
                        minutes = minutes < 10 ? '0' + minutes : minutes;
                        seconds = seconds < 10 ? '0' + seconds : seconds;

                        var timeString = hours + ':' + minutes + ':' + seconds;

                        // Display the time on the page
                        document.getElementById('clock').innerHTML = timeString;
                    }

                    // Update the clock every second
                    setInterval(updateClock, 1000);

                    // Initial call to display the time immediately
                    updateClock();
                </script>

            </div>
            <hr>
        </div>
    </main>
    <%@ include file="footer.jsp"%>
</body>
</html>