package am.martirosyan.mydeliver.controller;

import am.martirosyan.mydeliver.model.User;
import am.martirosyan.mydeliver.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController extends AbstractController<User> {
    private final UserRepository userRepository;

    @Override
    public ResponseEntity<User> get(@PathVariable Integer id) {
        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Iterable<User>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @Override
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @Override
    public ResponseEntity<User> update(User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }
}
