<%@page import="com.liferay.portal.kernel.service.CompanyLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserGroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@ include file="../init.jsp" %>


<%
Game game = null;
int usersCount = UserLocalServiceUtil.getUsersCount();
long companyId = CompanyLocalServiceUtil.getCompanyIdByUserId(user.getPrimaryKey());
List<User> siteMembers = UserLocalServiceUtil.getUsers(0, usersCount);

siteMembers = UserLocalServiceUtil.getCompanyUsers(
		PortalUtil.getDefaultCompanyId(), -1, -1);

%>


<liferay-portlet:renderURL var="addRoundURL">
	<liferay-portlet:param name="mvcPath" value="/game/add_round.jsp"/>
	<liferay-portlet:param name="redirect" value="<%= currentURL %>"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="addGame" var="addGameURL">
	<liferay-portlet:param name="redirect" value="${addRoundURL }"/><!-- value="${currentURL }" -->
</liferay-portlet:actionURL>

<aui:form action="<%= addGameURL %>" name="fm" method="post">

	<aui:model-context bean="<%= user %>" model="<%= User.class %>" />
	<aui:row>
		<aui:col width="50">
			<aui:fieldset label="Choose youre opponent">
				<aui:input name="userId" type="hidden" value="<%=user.getPrimaryKey() %>"></aui:input>
				<aui:select name="opponentId" label="Opponent">
					<c:forEach var="opponent" items="<%=siteMembers %>">
						<c:if test="${opponent.primaryKey != user.primaryKey}">
							<aui:option value="${opponent.primaryKey }">
								${opponent.fullName }
							</aui:option>
						</c:if>
					</c:forEach>
				</aui:select>
			</aui:fieldset>
		</aui:col>
	</aui:row>


	<aui:button-row>
		<aui:button type="submit" value="Start New Game"></aui:button>
	</aui:button-row>
</aui:form>








