package am.martirosyan.mydeliver.repository;

import am.martirosyan.mydeliver.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
}
