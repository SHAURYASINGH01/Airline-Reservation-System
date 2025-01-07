<!-- Include JSTL taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Display user details -->
<h2>Welcome, ${user.name}!</h2>
<p>Email: ${user.email}</p>

<!-- Display Reservations List -->
<c:forEach var="reservation" items="${reservations}">
    <p>${reservation.flightNumber} - ${reservation.date}</p>
</c:forEach>
