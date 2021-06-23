package br.com.cod3r.proxy.examples.model;

public class ProductDao {

  public ProductDao(){
    delayOnProcess();
  }

  public Product createProduct(Long id){
    delayOnProcess();
    return new Product(id, "Caneta", "Caneta BIC azul");
  }

  private void delayOnProcess(){
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
