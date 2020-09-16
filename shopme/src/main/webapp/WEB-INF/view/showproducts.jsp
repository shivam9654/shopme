<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="container">

	<div class="row">

		<!-- It is used to display the sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- It would be used to display products -->

		<div class="col-md-9">

			<div class="row">

				<div class="col-md-12">

					<c:if test="${userClickProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${catagory.name}</li>
							
						</ol>
					</c:if>



				</div>
			</div>

		</div>

	</div>

</div>

</div>