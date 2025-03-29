@import com.ui.util.InterMessage
@import com.ui.model.CurrentPage
@import java.sql.Date
@import java.util.Map
@import java.lang.String
@import org.springframework.validation.BindingResult
@param InterMessage messages
@param CurrentPage currentPage
@param com.ui.model.OrderForm orderForm
@param com.ui.model.Order order
@param BindingResult bindingResult

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Form</title>
    <link href="main.css" rel="stylesheet" />
</head>

<body class="bg-gray-100 p-6">

<div class="max-w-3xl mx-auto bg-white rounded-xl shadow-md overflow-hidden">
    <form class="p-6" action="/save-order-vm" method="post">
        <div class="border-b border-gray-900/10 pb-12">
            <h2 class="text-base font-semibold leading-7 text-gray-900">${messages.getMessage("order.info.label")}</h2>
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
                    <label for="customerId" class="block text-sm font-medium leading-6 text-gray-900">Customers<span class="text-red-500">*</span></label>
                    <div class="mt-2">
                        <select id="customerId" name="customerId" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select a customer</option>
                            <!-- Loop through the map of customers -->
                            @for (Map.Entry<Long, String> entry : orderForm.getCustomerDropDown().entrySet())
                                <option value="${entry.getKey()}" selected="${order.getCustomerId() != null && order.getCustomerId().equals(entry.getKey())}">
                                    ${entry.getValue()}
                                </option>
                            @endfor
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-3">
                    <label for="employeeId" class="block text-sm font-medium leading-6 text-gray-900">Employees<span class="text-red-500">*</span></label>
                    <div class="mt-2">
                        <select id="employeeId" name="employeeId" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select an employee</option>
                            <!-- Loop through the map of employees -->
                            @for (Map.Entry<Long, String> entry : orderForm.getEmployeeDropDown().entrySet())
                                <option value="${entry.getKey()}" selected="${order.getEmployeeId() != null && order.getEmployeeId().equals(entry.getKey())}">
                                    ${entry.getValue()}
                                </option>
                            @endfor
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="shippName" class="block text-sm font-medium leading-6 text-gray-900">Shipment Name</label>
                    <div class="mt-2">
                        <input type="text" name="shippName" id="shippName" value="${order.getShippName()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("shippName"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("shippName").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-2">
                    <label for="requiredDate" class="block text-sm font-medium leading-6 text-gray-900">Required date</label>
                    <div class="mt-2">
                        <input type="date" placeholder="Select Date" name="requiredDate" id="requiredDate" value="${order.getRequiredDate().toString()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("requiredDate"))
                        <div style="color: red; font-size: 10px;">
                            ${messages.getMessage(bindingResult.getFieldError("requiredDate").getDefaultMessage())}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-2">
                    <label for="shippedVia" class="block text-sm font-medium leading-6 text-gray-900">Fulfilment Center<span class="text-red-500">*</span></label>
                    <div class="mt-2">
                        <select id="shippedVia" name="shippedVia" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select Fulfilment Centre</option>
                            <option value="11" selected="${order.getShippedVia() != null && order.getShippedVia().equals("11")}">Center1</option>
                            <option value="22" selected="${order.getShippedVia() != null && order.getShippedVia().equals("22")}">Center2</option>
                            <option value="33" selected="${order.getShippedVia() != null && order.getShippedVia().equals("33")}">Center3</option>
                            <!-- Add more centers as needed -->
                        </select>
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("shippedVia"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("shippedVia").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="col-span-full">
                    <label for="shippAddress" class="block text-sm font-medium leading-6 text-gray-900">Shipment Address</label>
                    <div class="mt-2">
                        <input type="text" name="shippAddress" id="shippAddress" value="${order.getShippAddress()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2 sm:col-start-1">
                    <label for="shippCity" class="block text-sm font-medium leading-6 text-gray-900">Shipment City</label>
                    <div class="mt-2">
                        <input type="text" name="shippCity" id="shippCity" value="${order.getShippCity()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="shippRegion" class="block text-sm font-medium leading-6 text-gray-900">Shipment Region</label>
                    <div class="mt-2">
                        <select id="shippRegion" name="shippRegion" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select a county</option>
                            <option value="BERK" selected="${order.getShippRegion() != null && order.getShippRegion().equals("BERK")}">Berkshire</option>
                            <option value="HERT" selected="${order.getShippRegion() != null && order.getShippRegion().equals("HERT")}">Hertfordshire</option>
                            <option value="OXFD" selected="${order.getShippRegion() != null && order.getShippRegion().equals("OXFD")}">Oxfordshire</option>
                            <!-- Add more states / counties as needed -->
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="shippPostalCode" class="block text-sm font-medium leading-6 text-gray-900">Postal code</label>
                    <div class="mt-2">
                        <input type="text" name="shippPostalCode" id="shippPostalCode" value="${order.getShippPostalCode()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-3">
                    <label for="shippingCountry" class="block text-sm font-medium leading-6 text-gray-900">Shipping country<span class="text-red-500">*</span></label>
                    <div class="mt-2">
                        <select id="shippingCountry" name="shippingCountry" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select a country</option>
                            <!-- Loop through the map of countries -->
                            @for (Map.Entry<String, String> entry : orderForm.getCountries().entrySet())
                                <option value="${entry.getKey()}" selected="${order.getShippingCountry() != null && order.getShippingCountry().equals(entry.getKey())}">
                                    ${entry.getValue()}
                                </option>
                            @endfor

                        </select>
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("shippingCountry"))
                        <div style="color: red; font-size: 10px;">
                            ${bindingResult.getFieldError("shippingCountry").getDefaultMessage()}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-2">
                    <label for="orderStatus" class="block text-sm font-medium leading-6 text-gray-900">Order Status</label>
                    <div class="mt-2">
                        <select id="orderStatus" name="orderStatus" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select order status</option>
                            <option value="On Hold" selected="${order.getOrderStatus() != null && order.getOrderStatus().equals("On Hold")}">On Hold</option>
                            <option value="Pending" selected="${order.getOrderStatus() != null && order.getOrderStatus().equals("Pending")}">Pending</option>
                            <option value="Send" selected="${order.getOrderStatus() != null && order.getOrderStatus().equals("Send")}">Send</option>
                            <option value="Delivered" selected="${order.getOrderStatus() != null && order.getOrderStatus().equals("Delivered")}">Delivered</option>
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2 sm:col-start-1">
                    <label for="totalAmount" class="block text-sm font-medium leading-6 text-gray-900">Total Amount</label>
                    <div class="mt-2">
                        <input type="number" min="0.00" step="0.01" name="totalAmount" id="totalAmount" value="${order.getTotalAmount()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="paymentMethod" class="block text-sm font-medium leading-6 text-gray-900">Payment method</label>
                    <div class="mt-2">
                        <select id="paymentMethod" name="paymentMethod" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select payment method</option>
                            <option value="cash" selected="${order.getPaymentMethod() != null && order.getPaymentMethod().equals("cash")}">cash</option>
                            <option value="credit card" selected="${order.getPaymentMethod() != null && order.getPaymentMethod().equals("credit card")}">credit card</option>
                            <option value="present voucher" selected="${order.getPaymentMethod() != null && order.getPaymentMethod().equals("present voucher")}">present voucher</option>
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="paymentStatus" class="block text-sm font-medium leading-6 text-gray-900">Payment Status</label>
                    <div class="mt-2">
                        <select id="paymentStatus" name="paymentStatus" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6">
                            <option value="">Select payment status</option>
                            <option value="On Hold" selected="${order.getPaymentStatus() != null && order.getPaymentStatus().equals("On Hold")}">On Hold</option>
                            <option value="Pending" selected="${order.getPaymentStatus() != null && order.getPaymentStatus().equals("Pending")}">Pending</option>
                            <option value="Payment compleated" selected="${order.getPaymentStatus() != null && order.getPaymentStatus().equals("Payment completed")}">Payment completed</option>
                        </select>
                    </div>
                </div>

                <div class="sm:col-span-2">
                    <label for="shippedDate" class="block text-sm font-medium leading-6 text-gray-900">Shipped date</label>
                    <div class="mt-2">
                        <input type="date" placeholder="Select Date" name="shippedDate" id="shippedDate" value="${order.getShippedDate().toString()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
                    </div>
                    @if(bindingResult!=null && bindingResult.hasFieldErrors("shippedDate"))
                        <div style="color: red; font-size: 10px;">
                            ${messages.getMessage(bindingResult.getFieldError("shippedDate").getDefaultMessage())}
                        </div>
                    @endif
                </div>

                <div class="sm:col-span-2">
                    <label for="trackingNumber" class="block text-sm font-medium leading-6 text-gray-900">Tracking Number</label>
                    <div class="mt-2">
                        <input type="text" name="trackingNumber" id="trackingNumber" value="${order.getTrackingNumber()}" class="block w-full rounded-md border-0 px-3 py-2 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6">
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