package com.league_history.aplication;

import com.league_history.domain.exception.ChampionNotFoundException;
import com.league_history.domain.model.Champion;
import com.league_history.domain.ports.ChampionsRepository;

public record AskChampionsUseCase(ChampionsRepository repository) {
    public String askChampion(Long championId, String question) {
        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String champiomContext = champion.generateContextByQuestion(question);

        return champiomContext;
    }
}
