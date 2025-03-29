@import com.ui.component.MessageSourceLookup
@import com.ui.model.CurrentPage
@param CurrentPage currentPage
@param MessageSourceLookup messages


<html>
<head><title>${currentPage.getTitle()}</title></head>
<body>
<h1>${currentPage.getTitle()}</h1>
<!-- <p>{SimpleJteTag.helloWorld()}</p>  -->
<h1>${messages.lookup("greeting", currentPage.getUserName())} </h1>
<!-- <h1>localizer.getLocalizedMessage("greeting", name)</h1> -->
</body>
</html>