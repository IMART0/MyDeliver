package am.martirosyan.mydeliver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public abstract class AbstractController<MODEL> {

    @GetMapping
    public abstract ResponseEntity<Iterable<MODEL>> getAll();

    @GetMapping("/{id}")
    public abstract ResponseEntity<MODEL> get(@PathVariable Integer id);

    @PostMapping
    public abstract ResponseEntity<MODEL> create(MODEL model);

    @PostMapping("/{id}")
    public abstract ResponseEntity<MODEL> update(MODEL model);
}
