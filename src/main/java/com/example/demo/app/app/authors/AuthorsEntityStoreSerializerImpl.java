package com.example.demo.app.app.authors;

import com.example.demo.app.app.authors.generated.GeneratedAuthorsEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named authors.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author example
 */
public final class AuthorsEntityStoreSerializerImpl extends GeneratedAuthorsEntityStoreSerializerImpl {
    
    public AuthorsEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}