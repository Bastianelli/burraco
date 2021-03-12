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
	<aui:row>
		<aui:col>
			<aui:input name="gameId" value="<%=gameId%>">
			</aui:input>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:fieldset label="Team A">
		
				<aui:row>
					<aui:col width="50">
						<aui:input label="Pot" name="pot" type="radio"/>
					</aui:col>
					<aui:col width="50">
						<aui:input label="Closing" name="closing" type="radio"/>
					</aui:col>
					
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<aui:input label="Clean Run" name="cleanRun" type="number"/>
						<aui:input label="Dirty Run" name="dirtyRun" type="number"/>
						<aui:input label="Score" name="score" type="number"/>
					</aui:col>
				</aui:row>
			</aui:fieldset>
		</aui:col>
		
		<aui:col width="50">
			<aui:fieldset label="Team B">
				<aui:row>
					<aui:col width="50">
						<aui:input label="Pot" name="opponentPot" type="radio"/>
					</aui:col>
					<aui:col width="50">
						<aui:input label="Closing" name="opponentClosing" type="radio"/>
					</aui:col>
					
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<aui:input label="Clean Run" name="opponentCleanRun" type="number"/>
						<aui:input label="Dirty Run" name="opponentDirtyRun" type="number"/>
						<aui:input label="Score" name="opponentScore" type="number"/>
					</aui:col>
				</aui:row>
				
			</aui:fieldset>
		</aui:col>
		

	</aui:row>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>




