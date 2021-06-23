package br.com.cod3r.proxy.examples;

import br.com.cod3r.proxy.examples.model.ProductDao;
import br.com.cod3r.proxy.examples.proxy.ProductDaoLog;
import br.com.cod3r.proxy.examples.service.ProductService;

public class Example1 {

  public static void main(String[] args) {
    ProductDao productDAO = new ProductDaoLog();
    ProductService productService = new ProductService(productDAO);

    productService.createProduct(1L);
    productService.createProduct(2L);
    productService.createProduct(3L);
  }

}
