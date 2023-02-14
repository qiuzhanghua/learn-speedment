package com.example.demo.app.app.actor;

import com.example.demo.app.app.actor.generated.GeneratedActorEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named actor.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author example
 */
public final class ActorEntityStoreSerializerImpl extends GeneratedActorEntityStoreSerializerImpl {
    
    public ActorEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}