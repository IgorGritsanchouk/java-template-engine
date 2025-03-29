@import com.ui.util.InterMessage
@import com.ui.model.CurrentPage
@param InterMessage messages
@param CurrentPage currentPage
<div class="bg-white shadow rounded-lg p-6">
    <p>${messages.getMessage("greeting.message","Visitor")}</p>
    <h1 class="text-2xl font-bold mb-4">${messages.getMessage("welcome.message")}</h1>
    <p class="text-gray-600">${messages.getMessage("dashboard.message")}</p>
    <p>Language: ${currentPage.getLang()}</p>
</div>