package com.example.demo.app.app.authors.generated;

import com.example.demo.app.app.authors.Authors;
import com.example.demo.app.app.authors.AuthorsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.BiLongToIntFunction;
import com.speedment.common.function.LongToBooleanFunction;
import com.speedment.common.function.LongToByteFunction;
import com.speedment.common.function.LongToCharFunction;
import com.speedment.common.function.LongToFloatFunction;
import com.speedment.common.function.LongToShortFunction;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreComparator;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreCompareTo;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStorePredicate;
import com.speedment.enterprise.datastore.runtime.util.SerializerUtil;
import com.speedment.runtime.config.identifier.ColumnIdentifier;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;

/**
 * Serializes and deserializes instances of Authors.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsEntityStoreSerializerImpl implements EntityStoreSerializer<Authors> {
    
    private final LongFunction<ByteBuffer> bufferFinder;
    private final LongToIntFunction offsetFinder;
    private static final int FIELD_ID = 0;
    private static final int VARSIZE_BEGINS = 8;
    
    protected GeneratedAuthorsEntityStoreSerializerImpl(final LongFunction<ByteBuffer> bufferFinder, final LongToIntFunction offsetFinder) {
        this.bufferFinder = requireNonNull(bufferFinder);
        this.offsetFinder = requireNonNull(offsetFinder);
    }
    
    @Override
    public BiConsumer<ByteBuffer, Authors> serializer() {
        return (buffer, entity) -> {
            buffer.putLong(FIELD_ID, entity.getId());
            buffer.position(0);
            buffer.limit(VARSIZE_BEGINS);
        };
    }
    
    @Override
    public LongConsumer decorator(DataStoreHolder holder) {
        return DO_NOTHING;
    }
    
    @Override
    public LongFunction<Authors> deserializer() {
        return ref -> {
            final ByteBuffer buffer = bufferFinder.apply(ref);
            final int offset = offsetFinder.applyAsInt(ref);
            final Authors entity = new AuthorsImpl();
            entity.setId(buffer.getLong(offset + FIELD_ID));
            return entity;
        };
    }
    
    @Override
    public Class<?> deserializedType(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return long.class;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final ColumnIdentifier<Authors> colId, final ColumnIdentifier<FK_ENTITY> fkColId) {
        return finder(singletonList(colId), singletonList(fkColId));
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final List<ColumnIdentifier<Authors>> cols, final List<ColumnIdentifier<FK_ENTITY>> fkCols) {
        throw new UnsupportedOperationException("Authors has no foreign references.");
    }
    
    @Override
    public LongUnaryOperator finder(final String fkName) {
        throw new UnsupportedOperationException("Authors has no foreign references.");
    }
    
    @Override
    public LongPredicate isNull(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return ALWAYS_FALSE;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongPredicate isPresent(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return ALWAYS_TRUE;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToByteFunction byteDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToShortFunction shortDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction intDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongUnaryOperator longDeserializer(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return ref -> bufferFinder.apply(ref).getLong(offsetFinder.applyAsInt(ref) + FIELD_ID);
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToFloatFunction floatDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToDoubleFunction doubleDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToCharFunction charDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToBooleanFunction booleanDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongFunction<?> objectDeserializer(final ColumnIdentifier<Authors> colId) {
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction comparator(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return (aRef, bRef) -> Long.compare(
                bufferFinder.apply(aRef).getLong(offsetFinder.applyAsInt(aRef) + FIELD_ID),
                bufferFinder.apply(bRef).getLong(offsetFinder.applyAsInt(bRef) + FIELD_ID)
            );
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction comparatorNullsLast(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return (aRef, bRef) -> Long.compare(
                bufferFinder.apply(aRef).getLong(offsetFinder.applyAsInt(aRef) + FIELD_ID),
                bufferFinder.apply(bRef).getLong(offsetFinder.applyAsInt(bRef) + FIELD_ID)
            );
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToByte(final ColumnIdentifier<Authors> colId, final byte value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToShort(final ColumnIdentifier<Authors> colId, final short value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToInt(final ColumnIdentifier<Authors> colId, final int value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToLong(final ColumnIdentifier<Authors> colId, final long value) {
        if ("id".equals(colId.getColumnId())) {
            {
                final long operand = value;
                return ref -> Long.compare(
                    bufferFinder.apply(ref).getLong(offsetFinder.applyAsInt(ref) + FIELD_ID),
                    operand
                );
            }
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToFloat(final ColumnIdentifier<Authors> colId, final float value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToDouble(final ColumnIdentifier<Authors> colId, final double value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToBoolean(final ColumnIdentifier<Authors> colId, final boolean value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToChar(final ColumnIdentifier<Authors> colId, final char value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToObject(final ColumnIdentifier<Authors> colId, final Object value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type object.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToNull(final ColumnIdentifier<Authors> colId) {
        if ("id".equals(colId.getColumnId())) {
            return ALWAYS_LESS;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongPredicate newPredicate(final ColumnIdentifier<Authors> colId, final EntityStorePredicate predicate) {
        if ("id".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int rowOffset = offsetFinder.applyAsInt(ref);
                final int begins = rowOffset + FIELD_ID;
                return predicate.test(buffer, begins, begins + Long.BYTES);
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction newCompareTo(final ColumnIdentifier<Authors> colId, final EntityStoreCompareTo compareTo) {
        if ("id".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int rowOffset = offsetFinder.applyAsInt(ref);
                final int begins = rowOffset + FIELD_ID;
                return compareTo.compare(buffer, begins, begins + Long.BYTES);
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction newComparator(final ColumnIdentifier<Authors> colId, final EntityStoreComparator comparator) {
        if ("id".equals(colId.getColumnId())) {
            return (aRef, bRef) -> {
                final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                final int aRowOffset = offsetFinder.applyAsInt(aRef);
                final int bRowOffset = offsetFinder.applyAsInt(bRef);
                final int aBegins = aRowOffset + FIELD_ID;
                final int bBegins = bRowOffset + FIELD_ID;
                return comparator.compare(
                    aBuffer, aBegins, aBegins + Long.BYTES,
                    bBuffer, bBegins, bBegins + Long.BYTES
                );
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction sizeOf() {
        return ref -> VARSIZE_BEGINS;
    }
}