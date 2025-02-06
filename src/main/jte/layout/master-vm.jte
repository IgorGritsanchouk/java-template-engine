@import com.jte.util.FinalVal
@import com.jte.util.MessageSourceWithLocale
@import com.jte.domain.CurrentPage
@param com.jte.domain.User user
@param MessageSourceWithLocale messages
@param CurrentPage currentPage

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Spring Boot App</title>
    <!--  <script src="https://cdn.tailwindcss.com"></script>  -->
    <link href="main.css" rel="stylesheet" />
</head>
<body class="bg-gray-100">
<div class="min-h-full">
    <!-- Navigation -->
    <nav class="bg-gray-800">
        <div class="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
            <div class="flex h-16 items-center justify-between">
                <div class="flex items-center">
                    <div class="flex-shrink-0">
                        <img class="h-8 w-8" src="/mark.svg?color=indigo&shade=500" alt="Your Company">
                    </div>
                    <div class="hidden md:block">
                        <div class="ml-10 flex items-baseline space-x-4">
                            <a href="/home-vm" class="bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium" aria-current="page">${messages.getInterMessage("dashboard.label")}</a>
                            <a href="/user-form-vm" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("user_form.label")}</a>

                            <form action="/change-language" method="post">
                                <select name="language" id="language" onchange="this.form.submit()">
                                    <option value="en" selected="${currentPage.isSelected(FinalVal.LANGUAGE_EN)}" >English</option>
                                    <option value="fr" selected="${currentPage.isSelected(FinalVal.LANGUAGE_FR)}" >Français</option>
                                    <option value="es" selected="${currentPage.isSelected(FinalVal.LANGUAGE_ES)}" >Español</option>
                                    <option value="de" selected="${currentPage.isSelected(FinalVal.LANGUAGE_DE)}" >Deutsch</option>
                                    <option value="it" selected="${currentPage.isSelected(FinalVal.LANGUAGE_IT)}" >Italiano</option>
                                </select>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </nav>

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Collapsible Sidebar</title>
        <script src="js/alpine.min.js" defer></script>
        <!--       <script src="https://cdn.jsdelivr.net/npm/alpinejs@3.13.5/dist/cdn.min.js" defer></script>  -->
        <!--       <script src="https://cdn.tailwindcss.com"></script>  -->
        <link href="main.css" rel="stylesheet" />
    </head>
    <body class="bg-gray-100">

    <div x-data="{ open: true }" class="flex">
        <!-- Sidebar -->
        <nav :class="open ? 'w-44' : 'w-16'" class="bg-gray-800 min-h-screen transition-all duration-700 flex flex-col p-4">
 <!--       <nav :class="open ? 'w-44' : 'w-16'" class="bg-gray-800 h-screen transition-all duration-700 flex flex-col p-4">  -->
            <!-- Toggle Button -->
            <button @click="open = !open" class="text-white mb-4 p-2 rounded bg-gray-700">
                <span x-show="open">⬅ Collapse</span>
                <span x-show="!open">➡</span>
            </button>

            <!-- Navigation Links -->
            <a href="/home-vm" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">🏠</span> <span x-show="open">${messages.getInterMessage("home.label")}</span>
            </a>
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">ℹ️</span> <span x-show="open">${messages.getInterMessage("about.label")}</span>
            </a>
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">💼</span> <span x-show="open">${messages.getInterMessage("services.label")}</span>
            </a>
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">📞</span> <span x-show="open">${messages.getInterMessage("contact.label")}</span>
            </a>
            <a href="/user-form-vm" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">😊</span> <span x-show="open">${messages.getInterMessage("user_form.label")}</span>
            </a>
        </nav>

        <!-- Master-vm content -->
        <master-vm>
            <div class="bg-white shadow rounded-lg p-6">
                @if (currentPage.getTemplateName() == "home-vm")
                    @template.pages-jte.home-vm(currentPage= currentPage, messages= messages)
                @endif
                @if (currentPage.getTemplateName() == "user-form-vm")
                    @template.pages-jte.user-form-vm(messages= messages, user= user, currentPage= currentPage)
                @endif
            </div>
        </master-vm>

    </div>
    </body>
    </html>

</div>
</body>
</html>

