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
						<script>
							window.categoryId= '';
						</script>
						
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId= '${catagory.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${catagory.name}</li>
							
						</ol>
					</c:if>



				</div>
			</div>
			
						
			<div class="row">
			
				<div class="col-xs-12">
				
					
					<table id="productListTable" class="table table-striped table-borderd">
					
					
						<thead>
							
							<tr>
							    <th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>		
								<th> </th>					
							</tr>
						
						</thead>
						
					</table>
				
				</div>
			
			</div>

		</div>

	</div>

</div>

</div>