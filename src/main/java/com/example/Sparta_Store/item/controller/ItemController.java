package com.example.Sparta_Store.item.controller;

import com.example.Sparta_Store.item.entity.Item;
import com.example.Sparta_Store.item.service.ItemService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    // 판매량 기준 인기 상품 조회 (최근 30일)
    @GetMapping("/popular/sales")
    public List<Item> getPopularProductsBySales(@RequestParam(defaultValue = "30") int days) { // 클라이언트가 값을 입력 안하면 30일로
        return itemService.getMostPopularItems(days);
    }
}

