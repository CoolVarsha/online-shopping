<div class="container">

	<div class="row">

		<!-- would be to display sidebar-->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual products -->
		<div class="col-md-9">

			<!-- Added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<table id="productListTable"
						class="table table-striped table-bored">

						<thead>

							<tr>

								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty.Available</th>
								<th></th>

							</tr>

						</thead>
						<tfoot>

							<tr>
                                <th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty.Available</th>

							</tr>

						</tfoot>


					</table>

					<c:if test="${userClickAllProducts ==true}">

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>


						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts ==true}">

						<script>
							window.categoryId = '${category.id}';
						</script>


						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>

				</div>
			</div>

		</div>


	</div>


</div>