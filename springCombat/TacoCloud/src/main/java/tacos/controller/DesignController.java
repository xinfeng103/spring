package tacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.entity.Taco;
import tacos.entity.TacoIngredient.Type;
import tacos.entity.TacoIngredient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignController {
    @GetMapping
    public String showDesignForm(Model model){
        List<TacoIngredient> ingredients = Arrays.asList(
                new TacoIngredient("FLTO", "Flour Tortilla", TacoIngredient.Type.WRAP),
                new TacoIngredient("COTO", "Corn Tortilla", TacoIngredient.Type.WRAP),
                new TacoIngredient("GRBF", "Ground Beef", TacoIngredient.Type.PROTEIN),
                new TacoIngredient("CARN", "Carnitas", TacoIngredient.Type.PROTEIN),
                new TacoIngredient("TMTO", "Diced Tomatoes", TacoIngredient.Type.VEGGIES),
                new TacoIngredient("LETC", "Lettuce", TacoIngredient.Type.VEGGIES),
                new TacoIngredient("CHED", "Cheddar", TacoIngredient.Type.CHEESE),
                new TacoIngredient("JACK", "Monterrey Jack", TacoIngredient.Type.CHEESE),
                new TacoIngredient("SLSA", "Salsa", TacoIngredient.Type.SAUCE),
                new TacoIngredient("SRCR", "Sour Cream", TacoIngredient.Type.SAUCE)
        );

        Type[] types = TacoIngredient.Type.values();
        for(Type type:types){
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients,type));
        }
        model.addAttribute("design", new Taco());
        return "design";
    }

    private List<TacoIngredient> filterByType(List<TacoIngredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x->x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
