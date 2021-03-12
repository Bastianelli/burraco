package it.bastianelli.personale.burraco.portlet.portlet.actions;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import it.bastianelli.personale.burraco.model.Game;
import it.bastianelli.personale.burraco.portlet.constants.BurracoGamePortletKeys;
import it.bastianelli.personale.burraco.portlet.portlet.BurracoGamePortlet;
import it.bastianelli.personale.burraco.service.GameLocalService;



/**
 * @author Michele Bastinelli
 */
@Component(
	immediate = true,
	property = {
	"javax.portlet.name=" + BurracoGamePortletKeys.BURRACOGAME,
	"mvc.command.name=addGame"
	},
	service = MVCActionCommand.class
)
public class AddGameCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse) 
		throws Exception {
		// TODO Add game command
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Game.class.getName(), actionRequest);
		
		long userId = ParamUtil.getLong(actionRequest, "userId");
		long opponentId = ParamUtil.getLong(actionRequest, "opponentId");
		
		_log.info("addGameCommand");
		
		Game game = _gameLocalService.addGame
				(userId, opponentId, serviceContext);
		actionRequest.setAttribute("game", game);
//		actionResponse.setRenderParameter("gameId", Long.toString(
//				game.getPrimaryKey()));
//		
//		actionResponse.setRenderParameter(
//				"mvcPath", "/game/add_round.jsp");
		
	}

	
	private static final Log _log = LogFactoryUtil.getLog(
			BurracoGamePortlet.class);

	@Reference
	private GameLocalService _gameLocalService;

}
