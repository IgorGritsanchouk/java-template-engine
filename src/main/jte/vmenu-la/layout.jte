@import com.jte.util.MessageSourceWithLocale
@import com.jte.domain.IgPage
@param gg.jte.Content content
@param MessageSourceWithLocale messages
@param IgPage igPage

@template.vmenu-la.page(
page = igPage,

header = @`
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
                                <a href="/layout-jte" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">vertical-menu</a>

                                <form action="/change-language" method="post">
                                    <select name="language" id="language" onchange="this.form.submit()">
                                        <option value="">${messages.getInterMessage("choose_language.label")}</option>
                                        <option value="en" >English</option>
                                        <option value="fr" >Français</option>
                                        <option value="es" >Español</option>
                                        <option value="de" >Deutsch</option>
                                        <option value="it" >Italiano</option>
                                    </select>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
    </body>
    </html>
`,

content = @`
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Collapsible Sidebar</title>
        <script src="https://cdn.jsdelivr.net/npm/alpinejs@3.13.5/dist/cdn.min.js" defer></script>
 <!--       <script src="https://cdn.tailwindcss.com"></script>  -->
        <link href="main.css" rel="stylesheet" />
    </head>
    <body class="bg-gray-100">

    <div x-data="{ open: true }" class="flex">
        <!-- Sidebar -->
        <nav :class="open ? 'w-44' : 'w-16'" class="bg-gray-800 h-screen transition-all duration-300 flex flex-col p-4">
            <!-- Toggle Button -->
            <button @click="open = !open" class="text-white mb-4 p-2 rounded bg-gray-700">
                <span x-show="open">⬅ Collapse</span>
                <span x-show="!open">➡</span>
            </button>

            <!-- Navigation Links -->
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">🏠</span> <span x-show="open">Home</span>
            </a>
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">ℹ️</span> <span x-show="open">About</span>
            </a>
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">💼</span> <span x-show="open">Services</span>
            </a>
            <a href="#" class="text-white flex items-center py-2 px-2 hover:bg-gray-700 rounded">
                <span class="mr-2">📞</span> <span x-show="open">Contact</span>
            </a>
        </nav>

        <!-- Main Content -->
        <div class="flex-1 p-6">
            <h1 class="text-2xl font-bold">Main Content</h1>
            <div class="mx-auto max-w-7xl py-6 sm:px-6 lg:px-8">
                <!-- https://jte.gg/syntax/#content -->
                <!--  at template.pages.home(username="Philip")  another way to include templates  -->
                <p>Name: ${igPage.getName()}.</p>
                <p>Title:  ${igPage.getTitle()}.</p>
                <p>Description:  ${igPage.getDescription()}.</p>
            </div>
            <p>This is the main content area. Click the button to toggle the sidebar.</p>
        </div>
    </div>

    </body>
    </html>
`,

footer = @`
    <p>Thanks for visiting, come again soon!</p>
`
)