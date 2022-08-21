
$('document').ready(function() {
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href= $(this).attr('href');		
		
		$.get(href, function(figure , status){
			
			$('#idEdit').val(figure.id);
			$('#nameEdit').val(figure.name);
			
		$('#editModal').modal();
		
		});	
		
  });	
	
});	
