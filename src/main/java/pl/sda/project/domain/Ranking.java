package pl.sda.project.domain;

import lombok.AllArgsConstructor;


import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


@AllArgsConstructor

public class Ranking {

    private List<RatedPhoto> ranking = new ArrayList<RatedPhoto>();

    public List<RatedPhoto> getRanking() {
        return ranking.stream().sorted(Comparator.comparingInt(RatedPhoto::getRating)).collect(Collectors.toList());
    }
}
