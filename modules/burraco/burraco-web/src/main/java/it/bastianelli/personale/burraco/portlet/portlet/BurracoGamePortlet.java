package it.bastianelli.personale.burraco.portlet.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import it.bastianelli.personale.burraco.portlet.constants.BurracoGamePortletKeys;
import it.bastianelli.personale.burraco.service.GameLocalService;
import it.bastianelli.personale.burraco.service.RoundLocalService;

/**
 * @author miche
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=BurracoGame",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/game/view.jsp",
		"javax.portlet.name=" + BurracoGamePortletKeys.BURRACOGAME,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class BurracoGamePortlet extends MVCPortlet {
	

	@Reference
	private GameLocalService _gameLocalService;
	
	@Reference
	private RoundLocalService _roundLocalService;
}