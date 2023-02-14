package com.example.demo.app.app.authors.generated;

import com.example.demo.app.app.authors.Authors;
import com.example.demo.app.app.authors.AuthorsImpl;
import com.example.demo.app.app.authors.AuthorsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.example.demo.app.app.authors.Authors} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsManagerImpl 
extends AbstractManager<Authors> 
implements GeneratedAuthorsManager {
    
    private final TableIdentifier<Authors> tableIdentifier;
    
    protected GeneratedAuthorsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("app", "app", "authors");
    }
    
    @Override
    public Authors create() {
        return new AuthorsImpl();
    }
    
    @Override
    public TableIdentifier<Authors> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Authors>> fields() {
        return AuthorsManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Authors>> primaryKeyFields() {
        return Stream.of(
            Authors.ID
        );
    }
}