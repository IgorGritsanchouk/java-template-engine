@import com.ui.util.InterMessage
@import com.ui.model.CurrentPage
@param InterMessage messages
@param CurrentPage currentPage
@param com.ui.model.User user

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personal Information Form</title>
    <!--    <script src="https://cdn.tailwindcss.com"></script> -->
    <link href="main.css" rel="stylesheet" />
</head>


<body class="bg-gray-100 p-6">

<div class="max-w-3xl mx-auto bg-white rounded-xl shadow-md overflow-hidden">
    <form class="p-6" action="/save-user-vm" method="post">
        <div class="border-b border-gray-900/10 pb-12">
            <h2 class="text-base font-semibold leading-7 text-gray-900">${messages.getMessage("personal.ifo.label")}</h2>
            <p class="mt-1 text-sm leading-6 text-gray-600">${messages.getMessage("personal.address.message")}</p>
            <p class="mt-1 text-sm leading-6 text-gray-500">${messages.getMessage("fields.required.message")}</p>

            @if(currentPage.getMessage() != null)
                <div class="mt-4 p-4 bg-green-100 text-green-700 rounded">
                    ${currentPage.getMessage()}
                </div>
            @endif

            @if(currentPage.getError() != null)
                <div class="mt-4 p-4 bg-red-100 text-red-700 rounded">
                    ${currentPage.getError()}
                </div>
            @endif

            <div class="mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6">
                <div class="sm:col-span-3">
                    <label for="firstName" class="block text-sm font-medium leading-6 text-gray-900">
                        ${messages.getMessage("first.name.label")} <span class="text-red-500">*</span>
                    </label>
                    <div class="mt-2">
                        <input type="text"
                               name="firstName"
                               id="firstName"
                               value="${user.getFirstName()}"
                               class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-3">
                    <label for="lastName" class="block text-sm font-medium leading-6 text-gray-900">
                        ${messages.getMessage("last.name.label")} <span class="text-red-500">*</span>
                    </label>
                    <div class="mt-2">
                        <input type="text"
                               name="lastName"
                               id="lastName"
                               value="${user.getLastName()}"
                               class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-4">
                    <label for="email" class="block text-sm font-medium leading-6 text-gray-900">${messages.getMessage("email.address.label")}</label>
                    <div class="mt-2">
                        <input type="email" name="email" id="email" value="${user.getEmail()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-3">
                    <label for="country" class="block text-sm font-medium leading-6 text-gray-900">${messages.getMessage("country.label")}</label>
                    <div class="mt-2">
                        <select id="country" name="country" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select a country</option>
                            <option value="UK" selected="${user.getCountry()  != null && user.getCountry().equals("UK")}">United Kingdom</option>
                            <!-- Add more countries as needed -->
                        </select>
                    </div>
                </div>

                <div class="col-span-full">
                    <label for="streetAddress" class="block text-sm font-medium leading-6 text-gray-900">${messages.getMessage("street.address.label")}</label>
                    <div class="mt-2">
                        <input type="text" name="streetAddress" id="streetAddress" value="${user.getStreetAddress()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2 sm:col-start-1">
                    <label for="city" class="block text-sm font-medium leading-6 text-gray-900">${messages.getMessage("city.label")}</label>
                    <div class="mt-2">
                        <input type="text" name="city" id="city" value="${user.getCity()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="region" class="block text-sm font-medium leading-6 text-gray-900">${messages.getMessage("state.province.label")}</label>
                    <div class="mt-2">
                        <select id="region" name="region" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select a county</option>
                            <option value="BERK" selected="${user.getRegion() != null && user.getRegion().equals("BERK")}">Berkshire</option>
                            <option value="HERT" selected="${user.getRegion() != null && user.getRegion().equals("HERT")}">Hertfordshire</option>
                            <option value="OXFD" selected="${user.getRegion() != null && user.getRegion().equals("OXFD")}">Oxfordshire</option>
                            <!-- Add more states as needed -->
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="postalCode" class="block text-sm font-medium leading-6 text-gray-900">${messages.getMessage("postal.code.label")}</label>
                    <div class="mt-2">
                        <input type="text" name="postalCode" id="postalCode" value="${user.getPostalCode()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>
            </div>
        </div>

        <div class="mt-6 flex items-center justify-end gap-x-6">
            <button type="button" class="text-sm font-semibold leading-6 text-gray-900">${messages.getMessage("cancel.label")}</button>
            <button type="submit" class="rounded-md bg-indigo-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600">${messages.getMessage("save.label")}</button>
        </div>
    </form>
</div>
</body>
</html>
