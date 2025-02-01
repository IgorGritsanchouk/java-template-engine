@import com.jte.util.MessageSourceWithLocale
@param MessageSourceWithLocale messages

@template.layout.main(content = @`
    <div class="bg-white shadow rounded-lg p-6">
        <h1 class="text-2xl font-bold mb-4">${messages.getInterMessage("welcome.message")}</h1>
        <p class="text-gray-600">${messages.getInterMessage("dashboard.message")}</p>
    </div>
`)