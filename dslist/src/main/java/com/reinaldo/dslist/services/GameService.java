package com.reinaldo.dslist.services;

import com.reinaldo.dslist.dto.GameMinDTO;
import com.reinaldo.dslist.entities.Game;
import com.reinaldo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findALl() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
