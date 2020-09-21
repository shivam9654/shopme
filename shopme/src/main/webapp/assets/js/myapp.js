$(function() {
	
	// solving the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');	
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	default:
		$('#products').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
	
	
	// code for jquery datatable
	
	var $table= $('#productListTable');
	
	
	if($table.length) {
		
		var jsonUrl = '';
		if (window.categoryId == '') {
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}
		
		
		
		$table.DataTable({
			
			lengthMenu: [[1,3,5,-1],['One Record','Three Record','Five Record','ALL']],
			pageLength: 3,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
			
			columns: [
				
				{
					data : 'code',
					bSortable : false,
					mRender : function(data, type, row) {

						return '<img src="' + window.contextRoot
								+ '/resources/images/' + data
								+ '.jpg" class="dataTableImg"/>';

					}
				},
				
				{
					data: 'name'
				},
				
				{
					data: 'brand'
				},
				
				{
					data: 'unitPrice',
					mRender : function(data, type, row) {
						return '&#8377; ' + data
					}
				},
				
				{
					data: 'quantity'
				},
				{
					data : 'id',
					bSortable : false,
					mRender : function(data, type, row) {

						var str = '';
						str += '<a href="'
								+ window.contextRoot
								+ '/show/'
								+ data
								+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';

						
						
								str += '<a href="'
										+ window.contextRoot
										+ '/cart/add/'
										+ data
										+ '/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
							
						
						
						return str;

					}

				}
				
				
			]
			
		});
		
		
	}
	
});
