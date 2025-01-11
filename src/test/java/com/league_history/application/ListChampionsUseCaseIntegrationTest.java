package com.league_history.application;

import com.league_history.aplication.ListChampionsUseCase;
import com.league_history.domain.model.Champion;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {
    @Autowired
    private ListChampionsUseCase listChampionsUseCase;

    @Test
    public void testListChampions() {
        List<Champion> champions = listChampionsUseCase.findAll();

        Assertions.assertEquals(12, champions.size());
    }
}
