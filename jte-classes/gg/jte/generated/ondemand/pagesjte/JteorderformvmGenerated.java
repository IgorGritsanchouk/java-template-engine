package gg.jte.generated.ondemand.pagesjte;
import com.ui.util.InterMessage;
import com.ui.model.CurrentPage;
import java.sql.Date;
import java.util.Map;
import java.lang.String;
import org.springframework.validation.BindingResult;
public final class JteorderformvmGenerated {
	public static final String JTE_NAME = "pages-jte/order-form-vm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,6,6,26,26,26,26,27,27,27,29,29,31,31,31,33,33,35,35,37,37,37,39,39,48,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,53,53,63,64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,68,68,76,76,76,76,76,76,76,76,76,78,78,80,80,80,82,82,88,88,88,88,88,88,88,88,88,90,90,92,92,92,94,94,102,102,102,102,102,103,103,103,103,103,104,104,104,104,104,105,108,108,110,110,110,112,112,118,118,118,118,118,118,118,118,118,125,125,125,125,125,125,125,125,125,134,134,134,134,134,135,135,135,135,135,136,136,136,136,136,137,145,145,145,145,145,145,145,145,145,154,155,155,156,156,156,156,156,156,156,156,156,156,156,156,156,157,157,157,159,159,163,163,165,165,165,167,167,175,175,175,175,175,176,176,176,176,176,177,177,177,177,177,178,178,178,178,178,186,186,186,186,186,186,186,186,186,195,195,195,195,195,196,196,196,196,196,197,197,197,197,197,207,207,207,207,207,208,208,208,208,208,209,209,209,209,209,217,217,217,217,217,217,217,217,217,219,219,221,221,221,223,223,229,229,229,229,229,229,229,229,229,237,237,237,238,238,238,244,244,244,6,7,8,9,10,10,10,10};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, InterMessage messages, CurrentPage currentPage, com.ui.model.OrderForm orderForm, com.ui.model.Order order, BindingResult bindingResult) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Order Form</title>\r\n    <link href=\"main.css\" rel=\"stylesheet\" />\r\n</head>\r\n\r\n<body class=\"bg-gray-100 p-6\">\r\n\r\n<div class=\"max-w-3xl mx-auto bg-white rounded-xl shadow-md overflow-hidden\">\r\n    <form class=\"p-6\" action=\"/save-order-vm\" method=\"post\">\r\n        <div class=\"border-b border-gray-900/10 pb-12\">\r\n            <h2 class=\"text-base font-semibold leading-7 text-gray-900\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(messages.getMessage("order.info.label"));
		jteOutput.writeContent("</h2>\r\n            <p class=\"mt-1 text-sm leading-6 text-gray-500\">");
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
		jteOutput.writeContent("\r\n\r\n            <div class=\"mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6\">\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"customerId\" class=\"block text-sm font-medium leading-6 text-gray-900\">Customers<span class=\"text-red-500\">*</span></label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"customerId\" name=\"customerId\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select a customer</option>\r\n                            ");
		jteOutput.writeContent("\r\n                            ");
		for (Map.Entry<Long, String> entry : orderForm.getCustomerDropDown().entrySet()) {
			jteOutput.writeContent("\r\n                                <option");
			var __jte_html_attribute_0 = entry.getKey();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_0);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			var __jte_html_attribute_1 = order.getCustomerId() != null && order.getCustomerId().equals(entry.getKey());
			if (__jte_html_attribute_1) {
			jteOutput.writeContent(" selected");
			}
			jteOutput.writeContent(">\r\n                                    ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(entry.getValue());
			jteOutput.writeContent("\r\n                                </option>\r\n                            ");
		}
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"employeeId\" class=\"block text-sm font-medium leading-6 text-gray-900\">Employees<span class=\"text-red-500\">*</span></label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"employeeId\" name=\"employeeId\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select an employee</option>\r\n                            ");
		jteOutput.writeContent("\r\n                            ");
		for (Map.Entry<Long, String> entry : orderForm.getEmployeeDropDown().entrySet()) {
			jteOutput.writeContent("\r\n                                <option");
			var __jte_html_attribute_2 = entry.getKey();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			var __jte_html_attribute_3 = order.getEmployeeId() != null && order.getEmployeeId().equals(entry.getKey());
			if (__jte_html_attribute_3) {
			jteOutput.writeContent(" selected");
			}
			jteOutput.writeContent(">\r\n                                    ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(entry.getValue());
			jteOutput.writeContent("\r\n                                </option>\r\n                            ");
		}
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"shippName\" class=\"block text-sm font-medium leading-6 text-gray-900\">Shipment Name</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"shippName\" id=\"shippName\"");
		var __jte_html_attribute_4 = order.getShippName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_4);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("shippName")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("shippName").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"requiredDate\" class=\"block text-sm font-medium leading-6 text-gray-900\">Required date</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"date\" placeholder=\"Select Date\" name=\"requiredDate\" id=\"requiredDate\"");
		var __jte_html_attribute_5 = order.getRequiredDate().toString();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_5);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("requiredDate")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(messages.getMessage(bindingResult.getFieldError("requiredDate").getDefaultMessage()));
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"shippedVia\" class=\"block text-sm font-medium leading-6 text-gray-900\">Fulfilment Center<span class=\"text-red-500\">*</span></label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"shippedVia\" name=\"shippedVia\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select Fulfilment Centre</option>\r\n                            <option value=\"11\"");
		var __jte_html_attribute_6 = order.getShippedVia() != null && order.getShippedVia().equals("11");
		if (__jte_html_attribute_6) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Center1</option>\r\n                            <option value=\"22\"");
		var __jte_html_attribute_7 = order.getShippedVia() != null && order.getShippedVia().equals("22");
		if (__jte_html_attribute_7) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Center2</option>\r\n                            <option value=\"33\"");
		var __jte_html_attribute_8 = order.getShippedVia() != null && order.getShippedVia().equals("33");
		if (__jte_html_attribute_8) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Center3</option>\r\n                            ");
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("shippedVia")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("shippedVia").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"col-span-full\">\r\n                    <label for=\"shippAddress\" class=\"block text-sm font-medium leading-6 text-gray-900\">Shipment Address</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"shippAddress\" id=\"shippAddress\"");
		var __jte_html_attribute_9 = order.getShippAddress();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_9)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_9);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2 sm:col-start-1\">\r\n                    <label for=\"shippCity\" class=\"block text-sm font-medium leading-6 text-gray-900\">Shipment City</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"shippCity\" id=\"shippCity\"");
		var __jte_html_attribute_10 = order.getShippCity();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_10)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_10);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"shippRegion\" class=\"block text-sm font-medium leading-6 text-gray-900\">Shipment Region</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"shippRegion\" name=\"shippRegion\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select a county</option>\r\n                            <option value=\"BERK\"");
		var __jte_html_attribute_11 = order.getShippRegion() != null && order.getShippRegion().equals("BERK");
		if (__jte_html_attribute_11) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Berkshire</option>\r\n                            <option value=\"HERT\"");
		var __jte_html_attribute_12 = order.getShippRegion() != null && order.getShippRegion().equals("HERT");
		if (__jte_html_attribute_12) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Hertfordshire</option>\r\n                            <option value=\"OXFD\"");
		var __jte_html_attribute_13 = order.getShippRegion() != null && order.getShippRegion().equals("OXFD");
		if (__jte_html_attribute_13) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Oxfordshire</option>\r\n                            ");
		jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"shippPostalCode\" class=\"block text-sm font-medium leading-6 text-gray-900\">Postal code</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"shippPostalCode\" id=\"shippPostalCode\"");
		var __jte_html_attribute_14 = order.getShippPostalCode();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_14)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_14);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-3\">\r\n                    <label for=\"shippingCountry\" class=\"block text-sm font-medium leading-6 text-gray-900\">Shipping country<span class=\"text-red-500\">*</span></label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"shippingCountry\" name=\"shippingCountry\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select a country</option>\r\n                            ");
		jteOutput.writeContent("\r\n                            ");
		for (Map.Entry<String, String> entry : orderForm.getCountries().entrySet()) {
			jteOutput.writeContent("\r\n                                <option");
			var __jte_html_attribute_15 = entry.getKey();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_15)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_15);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			var __jte_html_attribute_16 = order.getShippingCountry() != null && order.getShippingCountry().equals(entry.getKey());
			if (__jte_html_attribute_16) {
			jteOutput.writeContent(" selected");
			}
			jteOutput.writeContent(">\r\n                                    ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(entry.getValue());
			jteOutput.writeContent("\r\n                                </option>\r\n                            ");
		}
		jteOutput.writeContent("\r\n\r\n                        </select>\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("shippingCountry")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(bindingResult.getFieldError("shippingCountry").getDefaultMessage());
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"orderStatus\" class=\"block text-sm font-medium leading-6 text-gray-900\">Order Status</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"orderStatus\" name=\"orderStatus\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select order status</option>\r\n                            <option value=\"On Hold\"");
		var __jte_html_attribute_17 = order.getOrderStatus() != null && order.getOrderStatus().equals("On Hold");
		if (__jte_html_attribute_17) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">On Hold</option>\r\n                            <option value=\"Pending\"");
		var __jte_html_attribute_18 = order.getOrderStatus() != null && order.getOrderStatus().equals("Pending");
		if (__jte_html_attribute_18) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Pending</option>\r\n                            <option value=\"Send\"");
		var __jte_html_attribute_19 = order.getOrderStatus() != null && order.getOrderStatus().equals("Send");
		if (__jte_html_attribute_19) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Send</option>\r\n                            <option value=\"Delivered\"");
		var __jte_html_attribute_20 = order.getOrderStatus() != null && order.getOrderStatus().equals("Delivered");
		if (__jte_html_attribute_20) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Delivered</option>\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2 sm:col-start-1\">\r\n                    <label for=\"totalAmount\" class=\"block text-sm font-medium leading-6 text-gray-900\">Total Amount</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"number\" min=\"0.00\" step=\"0.01\" name=\"totalAmount\" id=\"totalAmount\"");
		var __jte_html_attribute_21 = order.getTotalAmount();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_21)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_21);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"paymentMethod\" class=\"block text-sm font-medium leading-6 text-gray-900\">Payment method</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"paymentMethod\" name=\"paymentMethod\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select payment method</option>\r\n                            <option value=\"cash\"");
		var __jte_html_attribute_22 = order.getPaymentMethod() != null && order.getPaymentMethod().equals("cash");
		if (__jte_html_attribute_22) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">cash</option>\r\n                            <option value=\"credit card\"");
		var __jte_html_attribute_23 = order.getPaymentMethod() != null && order.getPaymentMethod().equals("credit card");
		if (__jte_html_attribute_23) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">credit card</option>\r\n                            <option value=\"present voucher\"");
		var __jte_html_attribute_24 = order.getPaymentMethod() != null && order.getPaymentMethod().equals("present voucher");
		if (__jte_html_attribute_24) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">present voucher</option>\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"paymentStatus\" class=\"block text-sm font-medium leading-6 text-gray-900\">Payment Status</label>\r\n                    <div class=\"mt-2\">\r\n                        <select id=\"paymentStatus\" name=\"paymentStatus\" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6\">\r\n                            <option value=\"\">Select payment status</option>\r\n                            <option value=\"On Hold\"");
		var __jte_html_attribute_25 = order.getPaymentStatus() != null && order.getPaymentStatus().equals("On Hold");
		if (__jte_html_attribute_25) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">On Hold</option>\r\n                            <option value=\"Pending\"");
		var __jte_html_attribute_26 = order.getPaymentStatus() != null && order.getPaymentStatus().equals("Pending");
		if (__jte_html_attribute_26) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Pending</option>\r\n                            <option value=\"Payment compleated\"");
		var __jte_html_attribute_27 = order.getPaymentStatus() != null && order.getPaymentStatus().equals("Payment completed");
		if (__jte_html_attribute_27) {
		jteOutput.writeContent(" selected");
		}
		jteOutput.writeContent(">Payment completed</option>\r\n                        </select>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"shippedDate\" class=\"block text-sm font-medium leading-6 text-gray-900\">Shipped date</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"date\" placeholder=\"Select Date\" name=\"shippedDate\" id=\"shippedDate\"");
		var __jte_html_attribute_28 = order.getShippedDate().toString();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_28)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_28);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                    ");
		if (bindingResult!=null && bindingResult.hasFieldErrors("shippedDate")) {
			jteOutput.writeContent("\r\n                        <div style=\"color: red; font-size: 10px;\">\r\n                            ");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(messages.getMessage(bindingResult.getFieldError("shippedDate").getDefaultMessage()));
			jteOutput.writeContent("\r\n                        </div>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </div>\r\n\r\n                <div class=\"sm:col-span-2\">\r\n                    <label for=\"trackingNumber\" class=\"block text-sm font-medium leading-6 text-gray-900\">Tracking Number</label>\r\n                    <div class=\"mt-2\">\r\n                        <input type=\"text\" name=\"trackingNumber\" id=\"trackingNumber\"");
		var __jte_html_attribute_29 = order.getTrackingNumber();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_29)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_29);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" class=\"block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6\">\r\n                    </div>\r\n                </div>\r\n\r\n            </div>\r\n        </div>\r\n\r\n        <div class=\"mt-6 flex items-center justify-end gap-x-6\">\r\n            <button type=\"button\" class=\"text-sm font-semibold leading-6 text-gray-900\">");
		jteOutput.setContext("button", null);
		jteOutput.writeUserContent(messages.getMessage("cancel.label"));
		jteOutput.writeContent("</button>\r\n            <button type=\"submit\" class=\"rounded-md bg-indigo-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600\">");
		jteOutput.setContext("button", null);
		jteOutput.writeUserContent(messages.getMessage("save.label"));
		jteOutput.writeContent("</button>\r\n        </div>\r\n\r\n    </form>\r\n</div>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		InterMessage messages = (InterMessage)params.get("messages");
		CurrentPage currentPage = (CurrentPage)params.get("currentPage");
		com.ui.model.OrderForm orderForm = (com.ui.model.OrderForm)params.get("orderForm");
		com.ui.model.Order order = (com.ui.model.Order)params.get("order");
		BindingResult bindingResult = (BindingResult)params.get("bindingResult");
		render(jteOutput, jteHtmlInterceptor, messages, currentPage, orderForm, order, bindingResult);
	}
}
