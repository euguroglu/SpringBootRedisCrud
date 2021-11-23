package com.enesuguroglu.Controller;


import com.enesuguroglu.Model.Product;
import com.enesuguroglu.Repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class RedisController {

    @Autowired
    private ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productDao.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id){
        return productDao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id){
        return productDao.deleteProduct(id);
    }
}
