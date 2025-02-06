@import com.jte.util.MessageSourceWithLocale
@import com.jte.domain.CurrentPage
@param MessageSourceWithLocale messages
@param CurrentPage currentPage
<div>
    <p>Messages: ${messages.getInterMessage("greeting.message","Igor")}</p>
    <p>Language: ${currentPage.getLocale()}</p>
</div>
