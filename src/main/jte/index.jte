@import com.jte.domain.Page
@import java.util.List
@param String name
@param Page page
@param List<String> items

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<!--    <title>Hello JTE !!!</title>  -->
    <title>${page.title()}</title>
    <meta name="description" content="${page.description()}" />
</head>
<body>

    <h1>Hello, ${name}!</h1>

    <%-- this is a comment and will not be rendered --%>

    @if(items.isEmpty())
        <p>No Items currently present</p>
    @else
        <ul>
            @for(String item : items)
                <li>${item}</li>
            @endfor
        </ul>
    @endif

    <p>you have ${items.size()} items</p>
</body>
</html>