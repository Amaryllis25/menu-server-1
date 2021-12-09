package com.cicdlectures.menuserver.service;

import java.util.List;

import com.cicdlectures.menuserver.repository.MenuRepository;
//import com.cicdlectures.menuserver.repository.DistRepository;
import com.cicdlectures.menuserver.dto.MenuDto;
import com.cicdlectures.menuserver.dto.DishDto;
import com.cicdlectures.menuserver.model.Menu;
import com.cicdlectures.menuserver.model.Dish;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//import static junit.jupiter.api.Assertions.assertEquals;

public class ListMenuServiceTests {

    private ListMenuService subject;
    private MenuRepository repository;

    @BeforeEach
    public void init() {
      this.repository = mock(MenuRepository.class);
      this.subject = new ListMenuService(this.repository);
    }

    @Test
    @DisplayName("lists all known menus")
    public void listsKnownMenus() {
      // Quand le repository reçoit l'appel findAll
      // Alors il retourne la valeur null.
      when(repository.findAll()).thenReturn(null);
    }
}
