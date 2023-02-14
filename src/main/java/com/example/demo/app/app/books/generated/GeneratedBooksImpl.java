package com.example.demo.app.app.books.generated;

import com.example.demo.app.app.books.Books;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.OptionalLong;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.app.app.books.Books}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBooksImpl implements Books {
    
    private long id;
    private Long authorId;
    
    protected GeneratedBooksImpl() {}
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public OptionalLong getAuthorId() {
        return OptionalUtil.ofNullable(authorId);
    }
    
    @Override
    public Books setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Books setAuthorId(Long authorId) {
        this.authorId = authorId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "       + Objects.toString(getId()));
        sj.add("authorId = " + Objects.toString(OptionalUtil.unwrap(getAuthorId())));
        return "BooksImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Books)) { return false; }
        final Books thatBooks = (Books)that;
        if (this.getId() != thatBooks.getId()) { return false; }
        if (!Objects.equals(this.getAuthorId(), thatBooks.getAuthorId())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAuthorId()));
        return hash;
    }
}