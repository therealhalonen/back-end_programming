package s23.vko2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Vko2Controller {

    private List<String> friends = new ArrayList<>();

    @GetMapping("/index")
    public String index(@RequestParam(required = false) String friend, Model model) {
        if (friend != null && !friend.isEmpty()) {
            friends.add(friend);
        }
        model.addAttribute("friends", friends);
        return "index";
    }
}