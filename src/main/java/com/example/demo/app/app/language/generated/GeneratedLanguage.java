package com.example.demo.app.app.language.generated;

import com.example.demo.app.app.language.Language;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.example.demo.app.app.language.Language}-interface representing entities
 * of the {@code language}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedLanguage {
    
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getLanguageId()} method.
     */
    ByteField<Language, Byte> LANGUAGE_ID = DatastoreFields.createByteField(
        Identifier.LANGUAGE_ID,
        Language::getLanguageId,
        Language::setLanguageId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getName()} method.
     */
    StringField<Language, String> NAME = DatastoreFields.createStringField(
        Identifier.NAME,
        Language::getName,
        Language::setName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the languageId of this Language. The languageId field corresponds
     * to the database column app.app.language.language_id.
     * 
     * @return the languageId of this Language
     */
    byte getLanguageId();
    
    /**
     * Returns the name of this Language. The name field corresponds to the
     * database column app.app.language.name.
     * 
     * @return the name of this Language
     */
    String getName();
    
    /**
     * Sets the languageId of this Language. The languageId field corresponds to
     * the database column app.app.language.language_id.
     * 
     * @param languageId to set of this Language
     * @return           this Language instance
     */
    Language setLanguageId(byte languageId);
    
    /**
     * Sets the name of this Language. The name field corresponds to the
     * database column app.app.language.name.
     * 
     * @param name to set of this Language
     * @return     this Language instance
     */
    Language setName(String name);
    
    enum Identifier implements ColumnIdentifier<Language> {
        
        LANGUAGE_ID ("language_id"),
        NAME        ("name");
        
        private final String columnId;
        private final TableIdentifier<Language> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "app";
        }
        
        @Override
        public String getSchemaId() {
            return "app";
        }
        
        @Override
        public String getTableId() {
            return "language";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Language> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}