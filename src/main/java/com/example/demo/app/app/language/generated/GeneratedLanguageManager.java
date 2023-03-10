package com.example.demo.app.app.language.generated;

import com.example.demo.app.app.language.Language;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.demo.app.app.language.Language} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedLanguageManager extends Manager<Language> {
    
    TableIdentifier<Language> IDENTIFIER = TableIdentifier.of("app", "app", "language");
    List<Field<Language>> FIELDS = unmodifiableList(asList(
        Language.LANGUAGE_ID,
        Language.NAME
    ));
    
    @Override
    default Class<Language> getEntityClass() {
        return Language.class;
    }
}