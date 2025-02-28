package am.martirosyan.mydeliver.controller;

import am.martirosyan.mydeliver.utils.JwtTokenUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final String USERNAME = "I_MART0";
    private final String PASSWORD = "Imartirosyan1809";

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password"); // Здесь должна быть проверка в БД

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            String token = JwtTokenUtil.generateToken(username);
            return Map.of("token", token);
        }
        throw new RuntimeException("Invalid credentials");
    }
}
