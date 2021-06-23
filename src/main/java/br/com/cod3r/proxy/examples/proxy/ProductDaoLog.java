package br.com.cod3r.proxy.examples.proxy;

import br.com.cod3r.proxy.examples.model.Product;
import br.com.cod3r.proxy.examples.model.ProductDao;

public class ProductDaoLog extends ProductDao {

  public ProductDaoLog() {
    super();
  }

  @Override
  public Product createProduct(Long id) {
    System.out.println("Creating product with id " + id);
    return super.createProduct(id);

  }

}
