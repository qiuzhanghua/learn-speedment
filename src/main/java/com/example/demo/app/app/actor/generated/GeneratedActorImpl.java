package com.example.demo.app.app.actor.generated;

import com.example.demo.app.app.actor.Actor;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.app.app.actor.Actor}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedActorImpl implements Actor {
    
    private short actorId;
    private String firstName;
    private String lastName;
    
    protected GeneratedActorImpl() {}
    
    @Override
    public short getActorId() {
        return actorId;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public Actor setActorId(short actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public Actor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public Actor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorId = "   + Objects.toString(getActorId()));
        sj.add("firstName = " + Objects.toString(getFirstName()));
        sj.add("lastName = "  + Objects.toString(getLastName()));
        return "ActorImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Actor)) { return false; }
        final Actor thatActor = (Actor)that;
        if (this.getActorId() != thatActor.getActorId()) { return false; }
        if (!Objects.equals(this.getFirstName(), thatActor.getFirstName())) { return false; }
        if (!Objects.equals(this.getLastName(), thatActor.getLastName())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getActorId());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getLastName());
        return hash;
    }
}