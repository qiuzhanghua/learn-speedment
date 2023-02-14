package com.example.demo.app.app.authors.generated;

import com.example.demo.app.app.authors.Authors;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.app.app.authors.Authors}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsImpl implements Authors {
    
    private long id;
    
    protected GeneratedAuthorsImpl() {}
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public Authors setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        return "AuthorsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Authors)) { return false; }
        final Authors thatAuthors = (Authors)that;
        if (this.getId() != thatAuthors.getId()) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        return hash;
    }
}