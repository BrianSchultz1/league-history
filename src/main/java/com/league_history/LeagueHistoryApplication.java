package com.league_history;

import com.league_history.aplication.AskChampionsUseCase;
import com.league_history.aplication.ListChampionsUseCase;
import com.league_history.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LeagueHistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeagueHistoryApplication.class, args);
    }

    @Bean
    public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository) {
        return new ListChampionsUseCase(repository);
    }

    @Bean
    public AskChampionsUseCase provideAskChampionsUseCase(ChampionsRepository repository) {
        return new AskChampionsUseCase(repository);
    }

}
