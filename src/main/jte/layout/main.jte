@param gg.jte.Content content
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JTE app</title>
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
                            <a href="/" class="bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium" aria-current="page">Dashboard</a>
                            <a href="/team" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Team</a>
                            <a href="/projects" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Projects</a>
                            <a href="/user-form-template" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">User form</a>
                            <a href="/to-do" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">To do</a>
                            <a href="/tail-wind" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Stile</a>
                            <a href="/layout-jte" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">vertical-menu</a>

                            <form action="/change-language" method="post">
                                <select name="language" id="language" onchange="this.form.submit()">
                                    <option value="">choose language</option>
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
            ${content}
        </div>
    </main>
</div>
</body>
</html>