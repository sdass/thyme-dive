partly following tutorial http://www.nakov.com/blog/2016/08/05/creating-a-blog-system-with-spring-mvc-thymeleaf-jpa-and-mysql/

Thymeleaf tips:
(1)	static resourcess (js, img, css) UNDER static folder accessed through relative path from the context root
(2)	during development cache busting needs two things: application.properties has spring.thymeleaf.cache=false  AND run as springboot app. Then thyme debugging need no server start.
(3)		<span th:text="#{welocme.home}"></span> will get the value from messages.properties
(4)	<article th:each="p1 : ${allposts}" and with $ sign it will get from the spring model attribute set in the controller
(5)	For src or link for (href, src link ofr image or js) must use @ as below
<link rel="icon" href="../public/img/favicon.ico" th:href="@{/img/favicon.ico}" />
<script src="../public/js/jquery-3.1.0.min.js" th:src="@{/js/jquery-3.1.0.min.js}"></script>
