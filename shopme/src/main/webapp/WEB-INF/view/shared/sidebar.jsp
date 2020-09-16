<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items= "${catagories}" var= "category">
	<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id= "a_${category.name}">${category.name}</a>
</c:forEach>