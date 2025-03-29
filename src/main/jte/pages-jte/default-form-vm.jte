@import com.ui.model.CurrentPage
@import com.ui.util.InterMessage
@param InterMessage messages
@param CurrentPage currentPage
@param com.ui.model.Order order

<!DOCTYPE html>
<html xmlns:jte="https://www.jte.dev">
<head>
    <meta charset="UTF-8">
    <title>Date Picker Example</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
</head>
<body>
<h1>Date Picker Form</h1>
<form action="/save-default-vm" method="post">
    <label for="date">Select Date:</label>
    <input type="text" id="requiredDate" name="requiredDate" jte:value="2025-12-07" class="form-control" placeholder="Required date" required>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<script>
        $(document).ready(function() {
            $('#date').datepicker({
                format: 'yyyy-mm-dd',
                autoclose: true
            });
        });
    </script>
</body>
</html>


<!--
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personal Information Form</title>
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

-->
