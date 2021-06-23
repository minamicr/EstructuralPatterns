package br.com.cod3r.proxy.examples.service;

import br.com.cod3r.proxy.examples.model.Product;
import br.com.cod3r.proxy.examples.model.ProductDao;

public class ProductService {
  private ProductDao productDAO;

  public ProductService(ProductDao productDAO) {
    this.productDAO = productDAO;
  }

  public Product createProduct(Long id){
    return productDAO.createProduct(id);
  }
}
