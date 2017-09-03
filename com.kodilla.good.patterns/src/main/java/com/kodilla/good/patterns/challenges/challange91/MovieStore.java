package com.kodilla.good.patterns.challenges.challange91;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public void showAllTitlesInOneLine() {
        List<String> movies = getMovies().entrySet().stream()
                .flatMap(movieList -> movieList.getValue().stream())
                .collect(Collectors.toList());

        IntStream.range(0, movies.size())
                .filter(n -> n % 2 == 0)
                .mapToObj(movies::get)
                .map(movie -> movie + " ! ")
                .forEach(System.out::print);
    }

}
