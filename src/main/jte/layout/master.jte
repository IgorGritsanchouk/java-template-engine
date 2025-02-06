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
                            <a href="/home" class="bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium" aria-current="page">${messages.getInterMessage("dashboard.label")}</a>
                            <a href="/user-form" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("user_form.label")}</a>

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

    <!-- Master content -->
    <master>
        <div class="mx-auto max-w-7xl py-6 sm:px-6 lg:px-8">
            @if (currentPage.getTemplateName() == "home")
                @template.pages-jte.home(currentPage= currentPage, messages= messages)
            @endif
            @if (currentPage.getTemplateName() == "user-form")
                @template.pages-jte.user-form(messages= messages,user= user, currentPage= currentPage)
            @endif
        </div>
    </master>

</div>
</body>
</html>

