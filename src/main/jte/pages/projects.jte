@import java.util.List
@import org.springframework.context.MessageSource
@import com.jte.util.MessageSourceWithLocale
@param MessageSourceWithLocale messages
@param List<String> projects
@param String ourProjectsLabel

@template.layout.main(content = @`
    <div class="bg-white shadow rounded-lg p-6">
        <h1 class="text-2xl font-bold mb-4">${messages.getInterMessage("our_projects.label")}</h1>
        <ul class="list-disc list-inside">
            @for(String project : projects)
                <li class="text-gray-600">${project}</li>
            @endfor
        </ul>
    </div>
`)