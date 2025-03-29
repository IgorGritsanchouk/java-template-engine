package gg.jte.generated.ondemand.layout;
import com.ui.util.FINAL;
import com.ui.util.InterMessage;
import com.ui.model.CurrentPage;
import org.springframework.validation.BindingResult;
public final class JtemastervmGenerated {
	public static final String JTE_NAME = "layout/master-vm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,4,4,19,19,24,34,34,34,35,35,35,36,36,36,37,37,37,41,41,41,41,41,42,42,42,42,42,43,43,43,43,43,44,44,44,44,44,45,45,45,45,45,62,63,69,71,72,74,74,74,78,80,80,80,83,83,83,86,86,86,89,89,89,92,92,92,95,95,95,98,98,98,101,101,101,105,109,109,110,110,111,111,112,112,113,113,114,114,115,115,116,116,117,117,118,118,119,119,120,120,133,133,133,4,5,6,7,8,9,10,11,11,11,11};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, String> countries, com.ui.model.User user, com.ui.model.Customer customer, com.ui.model.Order order, com.ui.model.OrderForm orderForm, InterMessage messages, CurrentPage currentPage, BindingResult bindingResult) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>My Spring Boot App</title>\r\n    ");
		jteOutput.writeContent("\r\n    <link href=\"main.css\" rel=\"stylesheet\" />\r\n</head>\r\n<body class=\"bg-gray-100\">\r\n<div class=\"min-h-full\">\r\n    ");
		jteOutput.writeContent("\r\n    <nav class=\"bg-gray-800\">\r\n        <div class=\"mx-auto max-w-7xl px-4 sm:px-6 lg:px-8\">\r\n            <div class=\"flex h-16 items-center justify-between\">\r\n                <div class=\"flex items-center\">\r\n                    <div class=\"flex-shrink-0\">\r\n                        <img class=\"h-8 w-8\" src=\"/mark.svg?color=indigo&shade=500\" alt=\"Your Company\">\r\n                    </div>\r\n                    <div class=\"hidden md:block\">\r\n                        <div class=\"ml-10 flex items-baseline space-x-4\">\r\n                            <a href=\"/home-vm\" class=\"bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium\" aria-current=\"page\">");
		jteOutput.setContext("a", null);
		jteOutput.writeUserContent(messages.getMessage("dashboard.label"));
		jteOutput.writeContent("</a>\r\n                            <a href=\"/user-form-vm\" class=\"text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium\">");
		jteOutput.setContext("a", null);
		jteOutput.writeUserContent(messages.getMessage("user_form.label"));
		jteOutput.writeContent("</a>\r\n                            <a href=\"/customer-form-vm\" class=\"text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium\">");
		jteOutput.setContext("a", null);
		jteOutput.writeUserContent(messages.getMessage("customer.form.label"));
		jteOutput.writeContent("</a>\r\n                            <a href=\"/order-form-vm\" class=\"text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium\">");
		jteOutput.setContext("a", null);
		jteOutput.writeUserContent(messages.getMessage("menu.order.label"));
		jteOutput.writeContent("</a>\r\n\r\n                            <form action=\"/change-language\" method=\"post\">\r\n                                <select name=\"language\" id=\"language\" onchange=\"this.form.submit()\">\r\n                                    <option value=\"en\"");
		var __jte_html_attribute_0 = currentPage.isSelected(FINAL.LANGUAGE_EN);
		if (__jte_html_attribute_0) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(" >English</option>\r\n                                    <option value=\"fr\"");
		var __jte_html_attribute_1 = currentPage.isSelected(FINAL.LANGUAGE_FR);
		if (__jte_html_attribute_1) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(" >Français</option>\r\n                                    <option value=\"es\"");
		var __jte_html_attribute_2 = currentPage.isSelected(FINAL.LANGUAGE_ES);
		if (__jte_html_attribute_2) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(" >Español</option>\r\n                                    <option value=\"de\"");
		var __jte_html_attribute_3 = currentPage.isSelected(FINAL.LANGUAGE_DE);
		if (__jte_html_attribute_3) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(" >Deutsch</option>\r\n                                    <option value=\"it\"");
		var __jte_html_attribute_4 = currentPage.isSelected(FINAL.LANGUAGE_IT);
		if (__jte_html_attribute_4) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(" >Italiano</option>\r\n                                </select>\r\n                            </form>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </nav>\r\n\r\n    <!DOCTYPE html>\r\n    <html lang=\"en\">\r\n    <head>\r\n        <meta charset=\"UTF-8\">\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n        <title>Collapsible Sidebar</title>\r\n        <script src=\"js/alpine.min.js\" defer></script>\r\n        ");
		jteOutput.writeContent("\r\n        ");
		jteOutput.writeContent("\r\n        <link href=\"main.css\" rel=\"stylesheet\" />\r\n    </head>\r\n    <body class=\"bg-gray-100\">\r\n\r\n    <div x-data=\"{ open: true }\" class=\"flex\">\r\n        ");
		jteOutput.writeContent("\r\n        <nav :class=\"open ? 'w-44' : 'w-16'\" class=\"bg-gray-800 min-h-screen transition-all duration-700 flex flex-col p-4\">\r\n ");
		jteOutput.writeContent("\r\n            ");
		jteOutput.writeContent("\r\n            <button @click=\"open = !open\" class=\"text-white mb-4 p-2 rounded bg-gray-700\">\r\n                <span x-show=\"open\">⬅ ");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("menu.collapse.label"));
		jteOutput.writeContent("</span>\r\n                <span x-show=\"!open\">➡</span>\r\n            </button>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <a href=\"/home-vm\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">🏠</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("home.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"#\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">ℹ️</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("about.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"#\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">💼</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("services.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"#\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">📞</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("contact.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"/user-form-vm\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">😊</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("user_form.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"/customer-form-vm\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">👨‍💻</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("customer.form.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"/order-form-vm\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">🎁</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("menu.order.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n            <a href=\"/order-form-vm\" class=\"text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded\">\r\n                <span class=\"mr-2\">📭</span> <span x-show=\"open\">");
		jteOutput.setContext("span", null);
		jteOutput.writeUserContent(messages.getMessage("menu.send.label"));
		jteOutput.writeContent("</span>\r\n            </a>\r\n        </nav>\r\n\r\n        ");
		jteOutput.writeContent("\r\n        <master-vm>\r\n            <div class=\"bg-white shadow rounded-lg p-6\">\r\n\r\n                ");
		if (currentPage.getJteName() == "pages-jte/home-vm") {
			jteOutput.writeContent("\r\n                    ");
			gg.jte.generated.ondemand.pagesjte.JtehomevmGenerated.render(jteOutput, jteHtmlInterceptor, messages, currentPage);
			jteOutput.writeContent("\r\n                ");
		}
		jteOutput.writeContent("\r\n                ");
		if (currentPage.getJteName() == "pages-jte/user-form-vm") {
			jteOutput.writeContent("\r\n                    ");
			gg.jte.generated.ondemand.pagesjte.JteuserformvmGenerated.render(jteOutput, jteHtmlInterceptor, messages, currentPage, user);
			jteOutput.writeContent("\r\n                ");
		}
		jteOutput.writeContent("\r\n                ");
		if (currentPage.getJteName() == "pages-jte/customer-form-vm") {
			jteOutput.writeContent("\r\n                    ");
			gg.jte.generated.ondemand.pagesjte.JtecustomerformvmGenerated.render(jteOutput, jteHtmlInterceptor, messages, currentPage, customer, countries, bindingResult);
			jteOutput.writeContent("\r\n                ");
		}
		jteOutput.writeContent("\r\n                ");
		if (currentPage.getJteName() == "pages-jte/order-form-vm") {
			jteOutput.writeContent("\r\n                    ");
			gg.jte.generated.ondemand.pagesjte.JteorderformvmGenerated.render(jteOutput, jteHtmlInterceptor, messages, currentPage, orderForm, order, bindingResult);
			jteOutput.writeContent("\r\n                ");
		}
		jteOutput.writeContent("\r\n\r\n            </div>\r\n        </master-vm>\r\n\r\n    </div>\r\n    </body>\r\n    </html>\r\n\r\n</div>\r\n</body>\r\n</html>\r\n\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		java.util.Map<String, String> countries = (java.util.Map<String, String>)params.get("countries");
		com.ui.model.User user = (com.ui.model.User)params.get("user");
		com.ui.model.Customer customer = (com.ui.model.Customer)params.get("customer");
		com.ui.model.Order order = (com.ui.model.Order)params.get("order");
		com.ui.model.OrderForm orderForm = (com.ui.model.OrderForm)params.get("orderForm");
		InterMessage messages = (InterMessage)params.get("messages");
		CurrentPage currentPage = (CurrentPage)params.get("currentPage");
		BindingResult bindingResult = (BindingResult)params.get("bindingResult");
		render(jteOutput, jteHtmlInterceptor, countries, user, customer, order, orderForm, messages, currentPage, bindingResult);
	}
}
