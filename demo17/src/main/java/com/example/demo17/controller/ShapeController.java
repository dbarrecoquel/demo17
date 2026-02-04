package com.example.demo17.controller;


import com.example.demo17.dto.AreaResponse;
import com.example.demo17.interfaces.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shapes")
public class ShapeController {

    @PostMapping("/area")
    public AreaResponse computeArea(@RequestBody Shape shape) {

        double area = switch (shape) {
            case Circle c    -> c.area();
            case Rectangle r -> r.area();
        };

        return new AreaResponse(
                shape.getClass().getSimpleName(),
                area
        );
    }
}
