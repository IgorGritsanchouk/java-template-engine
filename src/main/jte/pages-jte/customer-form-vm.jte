@import com.ui.util.InterMessage
@import com.ui.model.CurrentPage
@import java.util.Map
@import java.lang.String
@import org.springframework.validation.BindingResult
@param InterMessage messages
@param CurrentPage currentPage
@param com.ui.model.Customer customer
@param java.util.Map<String, String> countries
@param BindingResult bindingResult

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
    <form class="p-6" action="/save-customer-vm" method="post">
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
                    <label for="companyName" class="block text-sm font-medium leading-6 text-gray-900">
                        Company Name <span class="text-red-500">*</span>
                    </label>
                    <div class="mt-2">
                        <input type="text"
                               name="companyName"
                               id="companyName"
                               value="${customer.getCompanyName()}"
                               class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("companyName"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("companyName").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-3">
                    <label for="contactName" class="block text-sm font-medium leading-6 text-gray-900">
                        Contact Name <span class="text-red-500">*</span>
                    </label>
                    <div class="mt-2">
                        <input type="text"
                               name="contactName"
                               id="contactName"
                               value="${customer.getContactName()}"
                               class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("contactName"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("contactName").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-2">
                    <label for="contactTitle" class="block text-sm font-medium leading-6 text-gray-900">Contact Title<span class="text-red-500">*</span></label>
                    <div class="mt-2">
                        <select id="contactTitle" name="contactTitle" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select contact title</option>
                            <option value="Mr" selected="${customer.getContactTitle() != null && customer.getContactTitle().equals("Mr")}">Mr</option>
                            <option value="Mrs" selected="${customer.getContactTitle() != null && customer.getContactTitle().equals("Mrs")}">Mrs</option>
                            <option value="Miss" selected="${customer.getContactTitle() != null && customer.getContactTitle().equals("Miss")}">Miss</option>
                            <!-- Add more states as needed -->
                        </select>
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("contactTitle"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("contactTitle").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="col-span-full">
                    <label for="address" class="block text-sm font-medium leading-6 text-gray-900">Address</label>
                    <div class="mt-2">
                        <input type="text" name="address" id="streetAddress" value="${customer.getAddress()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2 sm:col-start-1">
                    <label for="city" class="block text-sm font-medium leading-6 text-gray-900">City</label>
                    <div class="mt-2">
                        <input type="text" name="city" id="city" value="${customer.getCity()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="region" class="block text-sm font-medium leading-6 text-gray-900">Region</label>
                    <div class="mt-2">
                        <select id="region" name="region" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select a county</option>
                            <option value="BERK" selected="${customer.getRegion() != null && customer.getRegion().equals("BERK")}">Berkshire</option>
                            <option value="HERT" selected="${customer.getRegion() != null && customer.getRegion().equals("HERT")}">Hertfordshire</option>
                            <option value="OXFD" selected="${customer.getRegion() != null && customer.getRegion().equals("OXFD")}">Oxfordshire</option>
                            <!-- Add more states as needed -->
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="postalCode" class="block text-sm font-medium leading-6 text-gray-900">Postal code</label>
                    <div class="mt-2">
                        <input type="text" name="postalCode" id="postalCode" value="${customer.getPostalCode()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-3">
                    <label for="country" class="block text-sm font-medium leading-6 text-gray-900">Country<span class="text-red-500">*</span></label>
                    <div class="mt-2">
                        <select id="country" name="country" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                                <option value="">Select a country</option>
                            <!-- Loop through the map of countries -->
                            @for (Map.Entry<String, String> entry : countries.entrySet())
                                <option value="${entry.getKey()}" selected="${customer.getCountry() != null && customer.getCountry().equals(entry.getKey())}">
                                    ${entry.getValue()}
                                </option>
                            @endfor

                        </select>
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("country"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("country").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-2">
                    <label for="phone" class="block text-sm font-medium leading-6 text-gray-900">Phone</label>
                    <div class="mt-2">
                        <input type="text" name="phone" id="phone" value="${customer.getPhone()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
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