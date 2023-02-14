package com.example.demo.app.app.language.generated;

import com.example.demo.app.app.language.Language;
import com.example.demo.app.app.language.LanguageEntityStoreSerializerImpl;
import com.example.demo.app.app.language.LanguageManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfByte;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * LanguageManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedLanguageCacheHolder implements EntityStoreHolder<Language> {
    
    private final EntityStore<Language> entityStore;
    private final OfByte fieldLanguageIdCache;
    private final OfString fieldNameCache;
    
    public GeneratedLanguageCacheHolder(
            EntityStore<Language> entityStore,
            OfByte fieldLanguageIdCache,
            OfString fieldNameCache) {
        
        this.entityStore          = requireNonNull(entityStore);
        this.fieldLanguageIdCache = requireNonNull(fieldLanguageIdCache);
        this.fieldNameCache       = requireNonNull(fieldNameCache);
    }
    
    @Override
    public EntityStore<Language> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Language> columnId) {
        if (columnId instanceof Language.Identifier) {
            final Language.Identifier _id = (Language.Identifier) columnId;
            switch (_id) {
                case LANGUAGE_ID : return (CACHE) fieldLanguageIdCache;
                case NAME        : return (CACHE) fieldNameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "language_id" : return (CACHE) fieldLanguageIdCache;
                case "name"        : return (CACHE) fieldNameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Language> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedLanguageCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            LanguageEntityStoreSerializerImpl::new,
            TableIdentifier.of("app", "app", "language")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Language> recycleAndPersist(PersistOperation<Language> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Language> recycleAndRemove(RemoveOperation<Language> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Language> recycleAndUpdate(UpdateOperation<Language> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Language> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Language>, FieldCache<?>>>of(
            Tuples.of(Language.LANGUAGE_ID,fieldLanguageIdCache),
            Tuples.of(Language.NAME,       fieldNameCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Language>> columnIdentifiers = Stream.<HasIdentifier<Language>>of(
            Language.LANGUAGE_ID,
            Language.NAME
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedLanguageCacheHolder> reload(CompletableFuture<EntityStore<Language>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfByte> fieldLanguageIdCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, Language.LANGUAGE_ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Language.NAME, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedLanguageCacheHolder(
                    entityStore,
                    fieldLanguageIdCacheFuture.get(),
                    fieldNameCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldLanguageIdCache.close();
        fieldNameCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Language.Identifier.LANGUAGE_ID,
                Language.Identifier.NAME
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}