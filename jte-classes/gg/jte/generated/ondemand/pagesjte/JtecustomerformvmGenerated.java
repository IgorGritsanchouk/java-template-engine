package gg.jte.generated.ondemand.pagesjte;
import com.ui.util.InterMessage;
import com.ui.model.CurrentPage;
import java.util.Map;
import java.lang.String;
import org.springframework.validation.BindingResult;
public final class JtecustomerformvmGenerated {
	public static final String JTE_NAME = "pages-jte/customer-form-vm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,5,5,17,17,27,27,27,28,28,28,29,29,29,31,31,33,33,33,35,35,37,37,39,39,39,41,41,52,52,52,52,52,52,52,52,52,55,55,57,57,57,59,59,70,70,70,70,70,70,70,70,70,73,73,75,75,75,77,77,85,85,85,85,85,86,86,86,86,86,87,87,87,87,87,88,91,91,93,93,93,95,95,101,101,101,101,101,101,101,101,101,108,108,108,108,108,108,108,108,108,117,117,117,117,117,118,118,118,118,118,119,119,119,119,119,120,128,128,128,128,128,128,128,128,128,137,138,138,139,139,139,139,139,139,139,139,139,139,139,139,139,140,140,140,142,142,146,146,148,148,148,150,150,156,156,156,156,156,156,156,156,156,164,164,164,165,165,165,170,170,170,5,6,7,8,9,9,9,9};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, InterMessage messages, CurrentPage currentPage, com.ui.model.Customer customer, java.util.Map<String, String> countries, BindingResult bindingResult) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Personal Information Form</title>\r\n    ");
		jteOutput.writeContent("\r\n    <link href=\"main.css\" rel=\"stylesheet\" />\r\n</head>\r\n\r\n\r\n<body class=\"bg-gray-100 p-6\">\r\n\r\n<div class=\"max-w-3xl mx-auto bg-white rounded-xl shadow-md overflow-hidden\">\r\n    <form class=\"p-6\" action=\"/save-customer-vm\" method=\"post\">\r\n        <div class=\"border-b border-gray-900/10 pb-12\">\r\n            <h2 class=\"text-base font-semibold leading-7 text-gray-900\">");
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
		jteOutput.writeContent("\r\n\r\n            <div class=\"mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6\">\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"companyName\" class=\"block text-sm font-medium leading-6 text-gray-900\">\r\n                        Company Name <span class=\"text-red-500\">*</span>\r\n                    </label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\"\r\n                               name=\"companyName\"\r\n                               id=\"companyName\"\r\n                              ");
		var __jte_html_attribute_0 = customer.getCompanyName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\r\n                               class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("companyName")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("companyName").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"contactName\" class=\"block text-sm font-medium leading-6 text-gray-900\">\r\n                        Contact Name <span class=\"text-red-500\">*</span>\r\n                    </label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\"\r\n                               name=\"contactName\"\r\n                               id=\"contactName\"\r\n                              ");
		var __jte_html_attribute_1 = customer.getContactName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\r\n                               class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("contactName")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("contactName").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"contactTitle\" class=\"block text-sm font-medium leading-6 text-gray-900\">Contact Title<span class=\"text-red-500\">*</span></label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"contactTitle\" name=\"contactTitle\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select contact title</option>\r\n                            <option value=\"Mr\"");
		var __jte_html_attribute_2 = customer.getContactTitle() != null && customer.getContactTitle().equals("Mr");
		if (__jte_html_attribute_2) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Mr</option>\r\n                            <option value=\"Mrs\"");
		var __jte_html_attribute_3 = customer.getContactTitle() != null && customer.getContactTitle().equals("Mrs");
		if (__jte_html_attribute_3) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Mrs</option>\r\n                            <option value=\"Miss\"");
		var __jte_html_attribute_4 = customer.getContactTitle() != null && customer.getContactTitle().equals("Miss");
		if (__jte_html_attribute_4) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Miss</option>\r\n                            ");
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("contactTitle")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("contactTitle").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"col-span-full\">\r\n                    <label for=\"address\" class=\"block text-sm font-medium leading-6 text-gray-900\">Address</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"address\" id=\"streetAddress\"");
		var __jte_html_attribute_5 = customer.getAddress();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_5);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2 sm:col-start-1\">\r\n                    <label for=\"city\" class=\"block text-sm font-medium leading-6 text-gray-900\">City</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"city\" id=\"city\"");
		var __jte_html_attribute_6 = customer.getCity();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_6);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"region\" class=\"block text-sm font-medium leading-6 text-gray-900\">Region</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"region\" name=\"region\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select a county</option>\r\n                            <option value=\"BERK\"");
		var __jte_html_attribute_7 = customer.getRegion() != null && customer.getRegion().equals("BERK");
		if (__jte_html_attribute_7) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Berkshire</option>\r\n                            <option value=\"HERT\"");
		var __jte_html_attribute_8 = customer.getRegion() != null && customer.getRegion().equals("HERT");
		if (__jte_html_attribute_8) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Hertfordshire</option>\r\n                            <option value=\"OXFD\"");
		var __jte_html_attribute_9 = customer.getRegion() != null && customer.getRegion().equals("OXFD");
		if (__jte_html_attribute_9) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Oxfordshire</option>\r\n                            ");
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"postalCode\" class=\"block text-sm font-medium leading-6 text-gray-900\">Postal code</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"postalCode\" id=\"postalCode\"");
		var __jte_html_attribute_10 = customer.getPostalCode();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_10)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_10);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"country\" class=\"block text-sm font-medium leading-6 text-gray-900\">Country<span class=\"text-red-500\">*</span></label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"country\" name=\"country\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                                <option value=\"\">Select a country</option>\r\n                            ");
		jteOutput.writeContent("\r\n                            ");
		for (Map.Entry<String, String> entry : countries.entrySet()) {
			jteOutput.writeContent("\r\n                                <option");
			var __jte_html_attribute_11 = entry.getKey();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_11)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_11);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			var __jte_html_attribute_12 = customer.getCountry() != null && customer.getCountry().equals(entry.getKey());
			if (__jte_html_attribute_12) {
			jteOutput.writeContent(" selected");
			}
			jteOutput.writeContent(">\r\n                                    ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(entry.getValue());
			jteOutput.writeContent("\r\n                                </option>\r\n                            ");
		}
		jteOutput.writeContent("\r\n\r\n                        </select>\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("country")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("country").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"phone\" class=\"block text-sm font-medium leading-6 text-gray-900\">Phone</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"phone\" id=\"phone\"");
		var __jte_html_attribute_13 = customer.getPhone();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_13)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_13);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n            </div>\r\n        </div>\r\n\r\n        <div class=\"mt-6 flex items-center justify-end gap-x-6\">\r\n            <button type=\"button\" class=\"text-sm font-semibold leading-6 text-gray-900\">");
		jteOutput.setContext("button", null);
		jteOutput.writeUserContent(messages.getMessage("cancel.label"));
		jteOutput.writeContent("</button>\r\n            <button type=\"submit\" class=\"rounded-md bg-indigo-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600\">");
		jteOutput.setContext("button", null);
		jteOutput.writeUserContent(messages.getMessage("save.label"));
		jteOutput.writeContent("</button>\r\n        </div>\r\n    </form>\r\n</div>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		InterMessage messages = (InterMessage)params.get("messages");
		CurrentPage currentPage = (CurrentPage)params.get("currentPage");
		com.ui.model.Customer customer = (com.ui.model.Customer)params.get("customer");
		java.util.Map<String, String> countries = (java.util.Map<String, String>)params.get("countries");
		BindingResult bindingResult = (BindingResult)params.get("bindingResult");
		render(jteOutput, jteHtmlInterceptor, messages, currentPage, customer, countries, bindingResult);
	}
}
