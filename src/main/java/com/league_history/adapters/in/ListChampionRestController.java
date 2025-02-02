package com.league_history.adapters.in;

import com.league_history.aplication.ListChampionsUseCase;
import com.league_history.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public record ListChampionRestController(ListChampionsUseCase useCase) {
    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }

}
