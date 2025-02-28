package am.martirosyan.mydeliver.controller;

import am.martirosyan.mydeliver.model.Order;
import am.martirosyan.mydeliver.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController extends AbstractController<Order> {
    private final OrderRepository orderRepository;

    @Override
    public ResponseEntity<Order> get(@PathVariable Integer id) {
        return orderRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Iterable<Order>> getAll() {
        return ResponseEntity.ok(orderRepository.findAll());
    }

    @Override
    public ResponseEntity<Order> create(@RequestBody Order order) {
        return ResponseEntity.ok(orderRepository.save(order));
    }

    @Override
    public ResponseEntity<Order> update(Order order) {
        return ResponseEntity.ok(orderRepository.save(order));
    }
}
