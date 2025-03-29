package gg.jte.generated.ondemand.pagesjte;
import com.ui.util.InterMessage;
import com.ui.model.CurrentPage;
public final class JteuserformvmGenerated {
	public static final String JTE_NAME = "pages-jte/user-form-vm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,12,12,22,22,22,23,23,23,24,24,24,26,26,28,28,28,30,30,32,32,34,34,34,36,36,41,41,41,47,47,47,47,47,47,47,47,47,54,54,54,60,60,60,60,60,60,60,60,60,66,66,66,68,68,68,68,68,68,68,68,68,73,73,73,77,77,77,77,77,78,84,84,84,86,86,86,86,86,86,86,86,86,91,91,91,93,93,93,93,93,93,93,93,93,98,98,98,102,102,102,102,102,103,103,103,103,103,104,104,104,104,104,105,111,111,111,113,113,113,113,113,113,113,113,113,120,120,120,121,121,121,127,127,127,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, InterMessage messages, CurrentPage currentPage, com.ui.model.User user) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Personal Information Form</title>\r\n    ");
		jteOutput.writeContent("\r\n    <link href=\"main.css\" rel=\"stylesheet\" />\r\n</head>\r\n\r\n\r\n<body class=\"bg-gray-100 p-6\">\r\n\r\n<div class=\"max-w-3xl mx-auto bg-white rounded-xl shadow-md overflow-hidden\">\r\n    <form class=\"p-6\" action=\"/save-user-vm\" method=\"post\">\r\n        <div class=\"border-b border-gray-900/10 pb-12\">\r\n            <h2 class=\"text-base font-semibold leading-7 text-gray-900\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(messages.getMessage("personal.ifo.label"));
		jteOutput.writeContent("</h2>\r\n            <p class=\"mt-1 text-sm leading-6 text-gray-600\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(messages.getMessage("personal.address.message"));
		jteOutput.writeContent("</p>\r\n            <p class=\"mt-1 text-sm leading-6 text-gray-500\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(messages.getMessage("fields.required.message"));
		jteOutput.writeContent("</p>\r\n\r\n            ");
		if (currentPage.getMessage() != null) {
			jteOutput.writeContent("\r\n                <div class=\"mt-4 p-4 bg-green-100 text-green-700 rounded\">\r\n                    ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(currentPage.getMessage());
			jteOutput.writeContent("\r\n                </div>\r\n            ");
		}
		jteOutput.writeContent("\r\n\r\n            ");
		if (currentPage.getError() != null) {
			jteOutput.writeContent("\r\n                <div class=\"mt-4 p-4 bg-red-100 text-red-700 rounded\">\r\n                    ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(currentPage.getError());
			jteOutput.writeContent("\r\n                </div>\r\n            ");
		}
		jteOutput.writeContent("\r\n\r\n            <div class=\"mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6\">\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"firstName\" class=\"block text-sm font-medium leading-6 text-gray-900\">\r\n                        ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("first.name.label"));
		jteOutput.writeContent(" <span class=\"text-red-500\">*</span>\r\n                    </label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\"\r\n                               name=\"firstName\"\r\n                               id=\"firstName\"\r\n                              ");
		var __jte_html_attribute_0 = user.getFirstName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\r\n                               class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"lastName\" class=\"block text-sm font-medium leading-6 text-gray-900\">\r\n                        ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("last.name.label"));
		jteOutput.writeContent(" <span class=\"text-red-500\">*</span>\r\n                    </label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\"\r\n                               name=\"lastName\"\r\n                               id=\"lastName\"\r\n                              ");
		var __jte_html_attribute_1 = user.getLastName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\r\n                               class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-4\">\r\n                    <label for=\"email\" class=\"block text-sm font-medium leading-6 text-gray-900\">");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("email.address.label"));
		jteOutput.writeContent("</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"email\" name=\"email\" id=\"email\"");
		var __jte_html_attribute_2 = user.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"country\" class=\"block text-sm font-medium leading-6 text-gray-900\">");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("country.label"));
		jteOutput.writeContent("</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"country\" name=\"country\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select a country</option>\r\n                            <option value=\"UK\"");
		var __jte_html_attribute_3 = user.getCountry()  != null && user.getCountry().equals("UK");
		if (__jte_html_attribute_3) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">United Kingdom</option>\r\n                            ");
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"col-span-full\">\r\n                    <label for=\"streetAddress\" class=\"block text-sm font-medium leading-6 text-gray-900\">");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("street.address.label"));
		jteOutput.writeContent("</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"streetAddress\" id=\"streetAddress\"");
		var __jte_html_attribute_4 = user.getStreetAddress();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_4);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2 sm:col-start-1\">\r\n                    <label for=\"city\" class=\"block text-sm font-medium leading-6 text-gray-900\">");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("city.label"));
		jteOutput.writeContent("</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"city\" id=\"city\"");
		var __jte_html_attribute_5 = user.getCity();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_5);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"region\" class=\"block text-sm font-medium leading-6 text-gray-900\">");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("state.province.label"));
		jteOutput.writeContent("</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"region\" name=\"region\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select a county</option>\r\n                            <option value=\"BERK\"");
		var __jte_html_attribute_6 = user.getRegion() != null && user.getRegion().equals("BERK");
		if (__jte_html_attribute_6) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Berkshire</option>\r\n                            <option value=\"HERT\"");
		var __jte_html_attribute_7 = user.getRegion() != null && user.getRegion().equals("HERT");
		if (__jte_html_attribute_7) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Hertfordshire</option>\r\n                            <option value=\"OXFD\"");
		var __jte_html_attribute_8 = user.getRegion() != null && user.getRegion().equals("OXFD");
		if (__jte_html_attribute_8) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Oxfordshire</option>\r\n                            ");
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"postalCode\" class=\"block text-sm font-medium leading-6 text-gray-900\">");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(messages.getMessage("postal.code.label"));
		jteOutput.writeContent("</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"postalCode\" id=\"postalCode\"");
		var __jte_html_attribute_9 = user.getPostalCode();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_9)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_9);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n\r\n        <div class=\"mt-6 flex items-center justify-end gap-x-6\">\r\n            <button type=\"button\" class=\"text-sm font-semibold leading-6 text-gray-900\">");
		jteOutput.setContext("button", null);
		jteOutput.writeUserContent(messages.getMessage("cancel.label"));
		jteOutput.writeContent("</button>\r\n            <button type=\"submit\" class=\"rounded-md bg-indigo-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600\">");
		jteOutput.setContext("button", null);
		jteOutput.writeUserContent(messages.getMessage("save.label"));
		jteOutput.writeContent("</button>\r\n        </div>\r\n    </form>\r\n</div>\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		InterMessage messages = (InterMessage)params.get("messages");
		CurrentPage currentPage = (CurrentPage)params.get("currentPage");
		com.ui.model.User user = (com.ui.model.User)params.get("user");
		render(jteOutput, jteHtmlInterceptor, messages, currentPage, user);
	}
}
