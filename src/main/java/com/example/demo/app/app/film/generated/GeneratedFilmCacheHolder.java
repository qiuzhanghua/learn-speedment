package com.example.demo.app.app.film.generated;

import com.example.demo.app.app.film.Film;
import com.example.demo.app.app.film.FilmEntityStoreSerializerImpl;
import com.example.demo.app.app.film.FilmManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfByte;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfComparable;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfShort;
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

import java.math.BigDecimal;
import java.sql.Timestamp;
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
 * FilmManager}.
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
public final class GeneratedFilmCacheHolder implements EntityStoreHolder<Film> {
    
    private final EntityStore<Film> entityStore;
    private final OfShort fieldFilmIdCache;
    private final OfString fieldTitleCache;
    private final OfString fieldDescriptionCache;
    private final OfComparable<Timestamp> fieldLastUpdateCache;
    private final OfShort fieldLengthCache;
    private final OfString fieldRatingCache;
    private final OfShort fieldRentalDurationCache;
    private final OfComparable<BigDecimal> fieldRentalRateCache;
    private final OfComparable<BigDecimal> fieldReplacementCostCache;
    private final OfString fieldSpecialFeaturesCache;
    private final OfByte fieldLanguageIdCache;
    
    public GeneratedFilmCacheHolder(
            EntityStore<Film> entityStore,
            OfShort fieldFilmIdCache,
            OfString fieldTitleCache,
            OfString fieldDescriptionCache,
            OfComparable<Timestamp> fieldLastUpdateCache,
            OfShort fieldLengthCache,
            OfString fieldRatingCache,
            OfShort fieldRentalDurationCache,
            OfComparable<BigDecimal> fieldRentalRateCache,
            OfComparable<BigDecimal> fieldReplacementCostCache,
            OfString fieldSpecialFeaturesCache,
            OfByte fieldLanguageIdCache) {
        
        this.entityStore               = requireNonNull(entityStore);
        this.fieldFilmIdCache          = requireNonNull(fieldFilmIdCache);
        this.fieldTitleCache           = requireNonNull(fieldTitleCache);
        this.fieldDescriptionCache     = requireNonNull(fieldDescriptionCache);
        this.fieldLastUpdateCache      = requireNonNull(fieldLastUpdateCache);
        this.fieldLengthCache          = requireNonNull(fieldLengthCache);
        this.fieldRatingCache          = requireNonNull(fieldRatingCache);
        this.fieldRentalDurationCache  = requireNonNull(fieldRentalDurationCache);
        this.fieldRentalRateCache      = requireNonNull(fieldRentalRateCache);
        this.fieldReplacementCostCache = requireNonNull(fieldReplacementCostCache);
        this.fieldSpecialFeaturesCache = requireNonNull(fieldSpecialFeaturesCache);
        this.fieldLanguageIdCache      = requireNonNull(fieldLanguageIdCache);
    }
    
    @Override
    public EntityStore<Film> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Film> columnId) {
        if (columnId instanceof Film.Identifier) {
            final Film.Identifier _id = (Film.Identifier) columnId;
            switch (_id) {
                case FILM_ID          : return (CACHE) fieldFilmIdCache;
                case TITLE            : return (CACHE) fieldTitleCache;
                case DESCRIPTION      : return (CACHE) fieldDescriptionCache;
                case LAST_UPDATE      : return (CACHE) fieldLastUpdateCache;
                case LENGTH           : return (CACHE) fieldLengthCache;
                case RATING           : return (CACHE) fieldRatingCache;
                case RENTAL_DURATION  : return (CACHE) fieldRentalDurationCache;
                case RENTAL_RATE      : return (CACHE) fieldRentalRateCache;
                case REPLACEMENT_COST : return (CACHE) fieldReplacementCostCache;
                case SPECIAL_FEATURES : return (CACHE) fieldSpecialFeaturesCache;
                case LANGUAGE_ID      : return (CACHE) fieldLanguageIdCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "film_id"          : return (CACHE) fieldFilmIdCache;
                case "title"            : return (CACHE) fieldTitleCache;
                case "description"      : return (CACHE) fieldDescriptionCache;
                case "last_update"      : return (CACHE) fieldLastUpdateCache;
                case "length"           : return (CACHE) fieldLengthCache;
                case "rating"           : return (CACHE) fieldRatingCache;
                case "rental_duration"  : return (CACHE) fieldRentalDurationCache;
                case "rental_rate"      : return (CACHE) fieldRentalRateCache;
                case "replacement_cost" : return (CACHE) fieldReplacementCostCache;
                case "special_features" : return (CACHE) fieldSpecialFeaturesCache;
                case "language_id"      : return (CACHE) fieldLanguageIdCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Film> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedFilmCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            FilmEntityStoreSerializerImpl::new,
            TableIdentifier.of("app", "app", "film")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Film> recycleAndPersist(PersistOperation<Film> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Film> recycleAndRemove(RemoveOperation<Film> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Film> recycleAndUpdate(UpdateOperation<Film> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Film> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Film>, FieldCache<?>>>of(
            Tuples.of(Film.FILM_ID,         fieldFilmIdCache),
            Tuples.of(Film.TITLE,           fieldTitleCache),
            Tuples.of(Film.DESCRIPTION,     fieldDescriptionCache),
            Tuples.of(Film.LAST_UPDATE,     fieldLastUpdateCache),
            Tuples.of(Film.LENGTH,          fieldLengthCache),
            Tuples.of(Film.RATING,          fieldRatingCache),
            Tuples.of(Film.RENTAL_DURATION, fieldRentalDurationCache),
            Tuples.of(Film.RENTAL_RATE,     fieldRentalRateCache),
            Tuples.of(Film.REPLACEMENT_COST,fieldReplacementCostCache),
            Tuples.of(Film.SPECIAL_FEATURES,fieldSpecialFeaturesCache),
            Tuples.of(Film.LANGUAGE_ID,     fieldLanguageIdCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Film>> columnIdentifiers = Stream.<HasIdentifier<Film>>of(
            Film.FILM_ID,
            Film.TITLE,
            Film.DESCRIPTION,
            Film.LAST_UPDATE,
            Film.LENGTH,
            Film.RATING,
            Film.RENTAL_DURATION,
            Film.RENTAL_RATE,
            Film.REPLACEMENT_COST,
            Film.SPECIAL_FEATURES,
            Film.LANGUAGE_ID
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
    
    public static CompletableFuture<GeneratedFilmCacheHolder> reload(CompletableFuture<EntityStore<Film>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldFilmIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Film.FILM_ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldTitleCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Film.TITLE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldDescriptionCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Film.DESCRIPTION, 0);
        
        final CompletableFuture<FieldCache.OfComparable<Timestamp>> fieldLastUpdateCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, Film.LAST_UPDATE, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldLengthCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Film.LENGTH, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldRatingCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Film.RATING, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldRentalDurationCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Film.RENTAL_DURATION, 0);
        
        final CompletableFuture<FieldCache.OfComparable<BigDecimal>> fieldRentalRateCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, Film.RENTAL_RATE, 0);
        
        final CompletableFuture<FieldCache.OfComparable<BigDecimal>> fieldReplacementCostCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, Film.REPLACEMENT_COST, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSpecialFeaturesCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Film.SPECIAL_FEATURES, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldLanguageIdCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, Film.LANGUAGE_ID, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedFilmCacheHolder(
                    entityStore,
                    fieldFilmIdCacheFuture.get(),
                    fieldTitleCacheFuture.get(),
                    fieldDescriptionCacheFuture.get(),
                    fieldLastUpdateCacheFuture.get(),
                    fieldLengthCacheFuture.get(),
                    fieldRatingCacheFuture.get(),
                    fieldRentalDurationCacheFuture.get(),
                    fieldRentalRateCacheFuture.get(),
                    fieldReplacementCostCacheFuture.get(),
                    fieldSpecialFeaturesCacheFuture.get(),
                    fieldLanguageIdCacheFuture.get()
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
        fieldTitleCache.close();
        fieldDescriptionCache.close();
        fieldLastUpdateCache.close();
        fieldLengthCache.close();
        fieldRatingCache.close();
        fieldRentalDurationCache.close();
        fieldRentalRateCache.close();
        fieldReplacementCostCache.close();
        fieldSpecialFeaturesCache.close();
        fieldLanguageIdCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Film.Identifier.FILM_ID,
                Film.Identifier.TITLE,
                Film.Identifier.DESCRIPTION,
                Film.Identifier.LAST_UPDATE,
                Film.Identifier.LENGTH,
                Film.Identifier.RATING,
                Film.Identifier.RENTAL_DURATION,
                Film.Identifier.RENTAL_RATE,
                Film.Identifier.REPLACEMENT_COST,
                Film.Identifier.SPECIAL_FEATURES,
                Film.Identifier.LANGUAGE_ID
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}