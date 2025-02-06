@import com.jte.util.MessageSourceWithLocale
@import com.jte.domain.CurrentPage
@param MessageSourceWithLocale messages
@param CurrentPage currentPage
<div class="bg-white shadow rounded-lg p-6">
    <p>Messages: ${messages.getInterMessage("greeting.message","Igor")}</p>
    <h1 class="text-2xl font-bold mb-4">${messages.getInterMessage("welcome.message")}</h1>
    <p class="text-gray-600">${messages.getInterMessage("dashboard.message")}</p>
    <p>Language: ${currentPage.getLocale()}</p>
</div>