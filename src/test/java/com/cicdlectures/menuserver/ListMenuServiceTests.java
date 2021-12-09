package com.cicdlectures.menuserver.service;

//import com.cicdlectures.menuserver.repository.MenuRepository;
//import com.cicdlectures.menuserver.repository.DistRepository;
import com.cicdlectures.menuserver.dto.MenuDto;
import com.cicdlectures.menuserver.dto.DishDto;
import com.cicdlectures.menuserver.model.Menu;
import com.cicdlectures.menuserver.model.Dish;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

//import static org.mockito.Mockito.mock;
//omport static org.mockito.Mockito.when;

//import static junit.jupiter.api.Assertions.assertEquals;

public class ListMenuServiceTests {
    private ListMenuService subject;

    @BeforeEach
    public void init() {
      subject = new ListMenuService(null);
    }

    @Test
    @DisplayName("lists all known menus")
    public void listsKnownMenus() {
       List<MenuDto> got = subject.listMenus();
    }
}
