package com.example.demo;

import com.example.demo.app.app.actor.Actor;
import com.example.demo.app.app.actor.ActorManager;
import com.example.demo.app.app.film.Film;
import com.example.demo.app.app.film.FilmManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.ToIntFunction;

/**
 * The entry point for the {@link com.speedment.runtime.config.Project} named
 * app
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author example
 */
@SpringBootApplication
public class DemoEntryPoint {
    
    public static void main(String... args) {
        SpringApplication.run(DemoEntryPoint.class, args);
    }

    private static void run(String... args) {

    }

    @Bean
    CommandLineRunner runner(final FilmManager films,
                             final ActorManager actors) {
        return args -> {
//            Actor actor = actors.create().setFirstName("张华").setLastName("邱");
//            try {
//                actors.persist(actor);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            Short actorId = actors.stream()
                    .filter(Actor.LAST_NAME.equalIgnoreCase("邱"))
                    .map(a -> a.getActorId())
                    .findAny()
                    .orElse(null);
            System.out.println(actorId);
        };
    }
}