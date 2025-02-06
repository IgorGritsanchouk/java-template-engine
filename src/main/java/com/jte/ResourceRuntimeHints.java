package com.jte;

import gg.jte.generated.precompiled.JteindexGenerated;
import gg.jte.generated.precompiled.layout.JtemainGenerated;
import gg.jte.generated.precompiled.layout.JtemasterGenerated;
import gg.jte.generated.precompiled.layout.JtemastervmGenerated;
import gg.jte.generated.precompiled.pages.*;
import gg.jte.generated.precompiled.pagesjte.JtehomevmGenerated;
import gg.jte.generated.precompiled.pagesjte.JteuserformvmGenerated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.stereotype.Component;

@Component
public class ResourceRuntimeHints implements RuntimeHintsRegistrar {

    private static final Logger log = LoggerFactory.getLogger(ResourceRuntimeHints.class);
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader){
        log.info("Registering hints for resources");
        hints.resources()
                .registerPattern("**/*.bin");
        hints.reflection()
                .registerType(JteindexGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.resources()
                .registerPattern("**/pages/*.bin");
        hints.reflection()
                .registerType(JtehomeGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteprojectsGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteteamGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteteamGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JtetodoGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteuserformGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteuserformtemplateGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.resources()
                .registerPattern("**/pages-jte/*.bin");
        hints.reflection()
                .registerType(JtehomeGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JtehomevmGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteuserformGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JteuserformvmGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.resources()
                .registerPattern("**/layout/*.bin");
        hints.reflection()
                .registerType(JtemainGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JtemasterGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
        hints.reflection()
                .registerType(JtemastervmGenerated.class, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS, MemberCategory.INVOKE_DECLARED_METHODS);
    }
}
