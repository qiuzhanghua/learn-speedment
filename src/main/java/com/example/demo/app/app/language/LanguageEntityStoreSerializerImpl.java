package com.example.demo.app.app.language;

import com.example.demo.app.app.language.generated.GeneratedLanguageEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named language.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author example
 */
public final class LanguageEntityStoreSerializerImpl extends GeneratedLanguageEntityStoreSerializerImpl {
    
    public LanguageEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}