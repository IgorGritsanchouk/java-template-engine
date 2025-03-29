package gg.jte.generated.ondemand.pagesjte;
import com.ui.util.InterMessage;
import com.ui.model.CurrentPage;
public final class JtehomevmGenerated {
	public static final String JTE_NAME = "pages-jte/home-vm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,5,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, InterMessage messages, CurrentPage currentPage) {
		jteOutput.writeContent("<div class=\"bg-white shadow rounded-lg p-6\">\r\n    <p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(messages.getMessage("greeting.message","Visitor"));
		jteOutput.writeContent("</p>\r\n    <h1 class=\"text-2xl font-bold mb-4\">");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(messages.getMessage("welcome.message"));
		jteOutput.writeContent("</h1>\r\n    <p class=\"text-gray-600\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(messages.getMessage("dashboard.message"));
		jteOutput.writeContent("</p>\r\n    <p>Language: ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(currentPage.getLang());
		jteOutput.writeContent("</p>\r\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		InterMessage messages = (InterMessage)params.get("messages");
		CurrentPage currentPage = (CurrentPage)params.get("currentPage");
		render(jteOutput, jteHtmlInterceptor, messages, currentPage);
	}
}
