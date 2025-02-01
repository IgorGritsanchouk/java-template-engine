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