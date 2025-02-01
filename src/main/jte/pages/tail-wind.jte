@import com.jte.util.MessageSourceWithLocale
@param gg.jte.Content content
@param MessageSourceWithLocale messages

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
                            <a href="/" class="bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium" aria-current="page">${messages.getInterMessage("dashboard.label")}</a>
                            <a href="/team" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("team.label")}</a>
                            <a href="/projects" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("projects.label")}</a>
                            <a href="/user-form-template" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("user_form.label")}</a>
                            <a href="/to-do" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("to_do.label")}</a>
                            <a href="/tail-wind" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">${messages.getInterMessage("stile.label")}</a>

                            <form action="/change-language" method="post">
                                <select name="language" id="language" onchange="this.form.submit()">
                                    <option value="">${messages.getInterMessage("choose_language.label")}</option>
                                    <option value="en">English</option>
                                    <option value="fr">Français</option>
                                    <option value="es">Español</option>
                                    <option value="de">Deutsch</option>
                                    <option value="it">Italiano</option>
                                </select>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </nav>

    <!-- Main content -->
    <main>
        <div class="mx-auto max-w-7xl py-6 sm:px-6 lg:px-8">
            <!-- https://jte.gg/syntax/#content -->
            <!--  at template.pages.home(username="Philip")  another way to include templates  -->
            <header class="bg-white container mx-auto">
                <h1 class="text-4xl font-bold p-8">${messages.getInterMessage("welcome.message")}</h1>
            </header>
        </div>
    </main>
</div>
</body>
</html>