package com.league_history.aplication;

import com.league_history.domain.model.Champion;
import com.league_history.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {
    public List<Champion> findAll() {
        return repository.findAll();
    }
}
