package productapp.com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import productapp.com.example.models.Product;

public interface ProductRepositories extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String name);
}
