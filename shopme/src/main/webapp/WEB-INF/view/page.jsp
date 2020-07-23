<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var= "contextRoot" value= "${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<html lang="en">
<head>
<script type="7a28d88736ca3ada5306e3b6-text/javascript">
    var host = "startbootstrap.com";
    if ((host == window.location.host) && (window.location.protocol != "https:"))
      window.location.protocol = "https";
  </script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Start Bootstrap">
<meta name="google-site-verification" content="37Tru9bxB3NrqXCt6JT5Vx8wz2AJQ0G4TkC-j8WL3kw">

<title> shopme-  ${title}  </title>

<script>
	window.menu = '${title}'
</script>

<meta name="description" content="">

<link rel="canonical" href="http://startbootstrap.com/previews/shop-homepage/">

<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.12.0/css/all.css" integrity="sha384-ekOryaXPbeCpWQNxMwSWVvQ0+1VrStoPJq54shlYhR8HzQgig1v5fas6YgOqLoKz" crossorigin="anonymous">

<link rel="stylesheet" href="${css}/style-template.css">

<!-- Bootstrap core CSS -->

<link rel="stylesheet" href="${css}/bootstrap.min.css">

<!-- Custom styles for this template -->

<link rel="stylesheet" href="${css}/shopme-homepage.css">


<link type="application/atom+xml" rel="alternate" href="http://startbootstrap.com/feed.xml" title="startbootstrap" />
<script type="7a28d88736ca3ada5306e3b6-text/javascript">
  // Google Analytics Tracking Script
  (function(i, s, o, g, r, a, m) {
    i['GoogleAnalyticsObject'] = r;
    i[r] = i[r] || function() {
      (i[r].q = i[r].q || []).push(arguments)
    }, i[r].l = 1 * new Date();
    a = s.createElement(o),
      m = s.getElementsByTagName(o)[0];
    a.async = 1;
    a.src = g;
    m.parentNode.insertBefore(a, m)
  })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');
  ga('create', 'UA-38417733-17', 'startbootstrap.com');
  ga('send', 'pageview');
</script>
<meta name='ir-site-verification-token' value='-28223945'>

<meta property="og:title" content="Shop Homepage - Template Preview">
<meta property="og:site_name" content="Start Bootstrap">
<meta property="og:type" content="website">
<meta property="og:description" content="">
<meta property="og:image" content="http://startbootstrap.com/assets/img/branding/og-start-bootstrap.png">
<meta property="og:url" content="http://startbootstrap.com/previews/shop-homepage/">
<meta property="og:image:alt" content="Shop Homepage - Template Preview">

<meta name="twitter:card" content="summary">
<meta name="twitter:image" content="http://startbootstrap.com/assets/img/branding/start-bootstrap-logo-500x500.png">
<meta name="twitter:site" content="@SBootstrap">

<link rel="apple-touch-icon" sizes="180x180" href="${images}/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="${images}/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="${images}/icons/favicon-16x16.png">
<link rel="manifest" href="${images}/site.webmanifest">
<link rel="mask-icon" href="${image}/safari-pinned-tab.svg" color="#dd3d31">
<meta name="msapplication-TileColor" content="#dd3d31">
<meta name="theme-color" content="#ffffff">
<script type="7a28d88736ca3ada5306e3b6-text/javascript" src="//m.servedby-buysellads.com/monetization.js"></script>

<script type="7a28d88736ca3ada5306e3b6-text/javascript">
    !function(f,b,e,v,n,t,s)
    {if(f.fbq)return;n=f.fbq=function(){n.callMethod?
    n.callMethod.apply(n,arguments):n.queue.push(arguments)};
    if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';
    n.queue=[];t=b.createElement(e);t.async=!0;
    t.src=v;s=b.getElementsByTagName(e)[0];
    s.parentNode.insertBefore(t,s)}(window, document,'script',
    'https://connect.facebook.net/en_US/fbevents.js');
    fbq('init', '581173015940795');
    fbq('track', 'PageView');
  </script>
<noscript><img height="1" width="1" style="display:none"
    src="https://www.facebook.com/tr?id=581173015940795&ev=PageView&noscript=1"
  /></noscript>

</head>
<body class="preview-page">

	<div class="wrapper">
		<!-- Navigation -->

		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			<!-- Page Content -->
			<!-- Loads only home content -->
			<c:if test="${userClickHome== true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- User clicks about -->
			<c:if test="${userClickAbout== true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- User clicks contact -->

			<c:if test="${userClickContact== true}">
				<%@include file="contact.jsp"%>
			</c:if>

		</div>


		<!--  Footer  -->
		<%@include file="./shared/footer.jsp"%>

		<!--  Jquery -->

		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.map"></script>

		<!--  My Scripts -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>
</html>