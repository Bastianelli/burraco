<%@ include file="../init.jsp" %>

<portlet:renderURL var="addGameURL">
	<portlet:param name="mvcPath" value="/game/add_round.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
	<aui:button onClick="<%= addGameURL.toString() %>" value="Start New Game"></aui:button>
</aui:button-row>


