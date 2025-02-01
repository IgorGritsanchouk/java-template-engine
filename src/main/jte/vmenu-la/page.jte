@import gg.jte.Content
@import com.jte.domain.IgPage
@param IgPage page
@param Content content
@param Content header = null
@param Content footer = null

<head>
    @if(page.getDescription() != null)
        <meta name="description" content="${page.getDescription()}">
    @endif
    <title>${page.getTitle()}</title>
</head>
<body>
<h1>${page.getTitle()}</h1>
<h1>Does page contain: ${page.getLocale()}</h1>
@if (header != null)
    <div class="header">
        ${header}
    </div>
@endif
<div class="content">
    ${content}
</div>
@if (footer != null)
    <div class="footer">
        ${footer}
    </div>
@endif
</body>