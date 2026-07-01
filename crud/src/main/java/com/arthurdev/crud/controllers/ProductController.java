package com.arthurdev.crud.controllers;

import com.arthurdev.crud.dtos.ProductsDto;
import com.arthurdev.crud.model.Product;
import com.arthurdev.crud.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping
    public ResponseEntity getAll() {
        List<Product> listProducts = repository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable(value = "id") Integer id) {

        Optional product = repository.findById(id);

        if(product.isEmpty()){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");

        }

        return ResponseEntity.status(HttpStatus.FOUND).body(product.get());
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ProductsDto dto) {

        var product = new Product();
        BeanUtils.copyProperties(dto, product);

        return  ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Integer id) {

            Optional<Product> product = repository.findById(id);

            if(product.isEmpty()){

                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");

            }

            repository.delete(product.get());
            return ResponseEntity.status(HttpStatus.OK).body("Produto deletado");

    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable(value = "id") Integer id, @RequestBody ProductsDto dto) {

        Optional<Product> product = repository.findById(id);

        if(product.isEmpty()){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto atualizado");

        }

        var productModel = product.get();

        BeanUtils.copyProperties(dto, productModel);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(productModel));

    }

}
