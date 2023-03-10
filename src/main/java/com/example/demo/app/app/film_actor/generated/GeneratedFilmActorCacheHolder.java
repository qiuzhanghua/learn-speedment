package com.example.demo.app.app.film_actor.generated;

import com.example.demo.app.app.film_actor.FilmActor;
import com.example.demo.app.app.film_actor.FilmActorEntityStoreSerializerImpl;
import com.example.demo.app.app.film_actor.FilmActorManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfShort;
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
 * FilmActorManager}.
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
public final class GeneratedFilmActorCacheHolder implements EntityStoreHolder<FilmActor> {
    
    private final EntityStore<FilmActor> entityStore;
    private final OfShort fieldFilmIdCache;
    private final OfShort fieldActorIdCache;
    
    public GeneratedFilmActorCacheHolder(
            EntityStore<FilmActor> entityStore,
            OfShort fieldFilmIdCache,
            OfShort fieldActorIdCache) {
        
        this.entityStore       = requireNonNull(entityStore);
        this.fieldFilmIdCache  = requireNonNull(fieldFilmIdCache);
        this.fieldActorIdCache = requireNonNull(fieldActorIdCache);
    }
    
    @Override
    public EntityStore<FilmActor> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<FilmActor> columnId) {
        if (columnId instanceof FilmActor.Identifier) {
            final FilmActor.Identifier _id = (FilmActor.Identifier) columnId;
            switch (_id) {
                case FILM_ID  : return (CACHE) fieldFilmIdCache;
                case ACTOR_ID : return (CACHE) fieldActorIdCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "film_id"  : return (CACHE) fieldFilmIdCache;
                case "actor_id" : return (CACHE) fieldActorIdCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<FilmActor> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedFilmActorCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            FilmActorEntityStoreSerializerImpl::new,
            TableIdentifier.of("app", "app", "film_actor")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<FilmActor> recycleAndPersist(PersistOperation<FilmActor> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<FilmActor> recycleAndRemove(RemoveOperation<FilmActor> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<FilmActor> recycleAndUpdate(UpdateOperation<FilmActor> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<FilmActor> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<FilmActor>, FieldCache<?>>>of(
            Tuples.of(FilmActor.FILM_ID, fieldFilmIdCache),
            Tuples.of(FilmActor.ACTOR_ID,fieldActorIdCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<FilmActor>> columnIdentifiers = Stream.<HasIdentifier<FilmActor>>of(
            FilmActor.FILM_ID,
            FilmActor.ACTOR_ID
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
    
    public static CompletableFuture<GeneratedFilmActorCacheHolder> reload(CompletableFuture<EntityStore<FilmActor>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldFilmIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, FilmActor.FILM_ID, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldActorIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, FilmActor.ACTOR_ID, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedFilmActorCacheHolder(
                    entityStore,
                    fieldFilmIdCacheFuture.get(),
                    fieldActorIdCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldFilmIdCache.close();
        fieldActorIdCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                FilmActor.Identifier.FILM_ID,
                FilmActor.Identifier.ACTOR_ID
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}