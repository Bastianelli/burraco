<%@ include file="../init.jsp" %>


<% 

long roundId = ParamUtil.getLong(renderRequest, "roundId");

Round round = null;

long gameId = ParamUtil.getLong(renderRequest, "gameId");

%>


<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/game/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addRound" var="addRoundURL" />


<aui:form action="<%= addRoundURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= round %>" model="<%= Round.class %>" />

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="email" />
		<aui:input name="message" />
		<aui:input name="entryId" type="hidden" />
		<aui:input name="roundId" type="hidden" value='<%= round == null ? roundId : round.getRoundId() %>'/>

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>




