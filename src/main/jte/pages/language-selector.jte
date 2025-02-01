@import org.springframework.context.MessageSource
@import java.util.Locale
@import jakarta.servlet.http.HttpSession
@param HttpSession session
@param String locale
@param MessageSource messages
@param String titleMessage
@param String welcomeMessage
@param String languageLabel

<!DOCTYPE html>
<!-- <html lang="{locale}">  -->
<head>
    <meta charset="UTF-8">
    <title>${titleMessage}</title>
</head>
<body>
<form action="/change-language" method="post">
    <label for="language">${languageLabel}</label>
    <select name="language" id="language" onchange="this.form.submit()">
        <option value="en" >English</option>
        <option value="fr" >Français</option>
        <option value="es">Español</option>
        <option value="de">Deutsch</option>
        <option value="it">Italiano</option>
    </select>
</form>


<h1>${titleMessage}</h1>
<h1>${welcomeMessage}</h1>
</body>
</html>