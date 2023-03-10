package com.example.demo.app.app.film.generated;

import com.example.demo.app.app.film.Film;
import com.example.demo.app.app.language.Language;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.app.app.film.Film}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmImpl implements Film {
    
    private short filmId;
    private String title;
    private String description;
    private Timestamp lastUpdate;
    private Short length;
    private String rating;
    private Short rentalDuration;
    private BigDecimal rentalRate;
    private BigDecimal replacementCost;
    private String specialFeatures;
    private byte languageId;
    
    protected GeneratedFilmImpl() {}
    
    @Override
    public short getFilmId() {
        return filmId;
    }
    
    @Override
    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Optional<Short> getLength() {
        return Optional.ofNullable(length);
    }
    
    @Override
    public Optional<String> getRating() {
        return Optional.ofNullable(rating);
    }
    
    @Override
    public Optional<Short> getRentalDuration() {
        return Optional.ofNullable(rentalDuration);
    }
    
    @Override
    public Optional<BigDecimal> getRentalRate() {
        return Optional.ofNullable(rentalRate);
    }
    
    @Override
    public Optional<BigDecimal> getReplacementCost() {
        return Optional.ofNullable(replacementCost);
    }
    
    @Override
    public Optional<String> getSpecialFeatures() {
        return Optional.ofNullable(specialFeatures);
    }
    
    @Override
    public byte getLanguageId() {
        return languageId;
    }
    
    @Override
    public Film setFilmId(short filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public Film setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public Film setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public Film setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Film setLength(Short length) {
        this.length = length;
        return this;
    }
    
    @Override
    public Film setRating(String rating) {
        this.rating = rating;
        return this;
    }
    
    @Override
    public Film setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }
    
    @Override
    public Film setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
        return this;
    }
    
    @Override
    public Film setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
        return this;
    }
    
    @Override
    public Film setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
        return this;
    }
    
    @Override
    public Film setLanguageId(byte languageId) {
        this.languageId = languageId;
        return this;
    }
    
    @Override
    public Language findLanguageId(Manager<Language> foreignManager) {
        return foreignManager.stream().filter(Language.LANGUAGE_ID.equal(getLanguageId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("filmId = "          + Objects.toString(getFilmId()));
        sj.add("title = "           + Objects.toString(OptionalUtil.unwrap(getTitle())));
        sj.add("description = "     + Objects.toString(getDescription()));
        sj.add("lastUpdate = "      + Objects.toString(getLastUpdate()));
        sj.add("length = "          + Objects.toString(OptionalUtil.unwrap(getLength())));
        sj.add("rating = "          + Objects.toString(OptionalUtil.unwrap(getRating())));
        sj.add("rentalDuration = "  + Objects.toString(OptionalUtil.unwrap(getRentalDuration())));
        sj.add("rentalRate = "      + Objects.toString(OptionalUtil.unwrap(getRentalRate())));
        sj.add("replacementCost = " + Objects.toString(OptionalUtil.unwrap(getReplacementCost())));
        sj.add("specialFeatures = " + Objects.toString(OptionalUtil.unwrap(getSpecialFeatures())));
        sj.add("languageId = "      + Objects.toString(getLanguageId()));
        return "FilmImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Film)) { return false; }
        final Film thatFilm = (Film)that;
        if (this.getFilmId() != thatFilm.getFilmId()) { return false; }
        if (!Objects.equals(this.getTitle(), thatFilm.getTitle())) { return false; }
        if (!Objects.equals(this.getDescription(), thatFilm.getDescription())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatFilm.getLastUpdate())) { return false; }
        if (!Objects.equals(this.getLength(), thatFilm.getLength())) { return false; }
        if (!Objects.equals(this.getRating(), thatFilm.getRating())) { return false; }
        if (!Objects.equals(this.getRentalDuration(), thatFilm.getRentalDuration())) { return false; }
        if (!Objects.equals(this.getRentalRate(), thatFilm.getRentalRate())) { return false; }
        if (!Objects.equals(this.getReplacementCost(), thatFilm.getReplacementCost())) { return false; }
        if (!Objects.equals(this.getSpecialFeatures(), thatFilm.getSpecialFeatures())) { return false; }
        if (this.getLanguageId() != thatFilm.getLanguageId()) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getFilmId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTitle()));
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLength()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRating()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRentalDuration()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRentalRate()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getReplacementCost()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSpecialFeatures()));
        hash = 31 * hash + Byte.hashCode(getLanguageId());
        return hash;
    }
}