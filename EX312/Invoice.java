public class Invoice {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    
    if (quantity > 0) {
      this.quantity = quantity;
    }

    if (pricePerItem > 0.0) {
      this.pricePerItem = pricePerItem;
    }
  }

  public String getPartNumber() {
    return this.partNumber;
  }
  
  public String getPartDescription() {
    return this.partDescription;
  }
  
  public int getQuantity() {
    return this.quantity;
  }
  
  public double getPricePerItem() {
    return this.pricePerItem;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }
  
  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
  }
  
  public void setQuantity(int quantity) {
    if (quantity > 0) {
      this.quantity = quantity;
    } else {
      this.quantity = 0;
    }
  }
  
  public void setPricePerItem(double price) {
    if (price > 0.0) {
      this.pricePerItem = price;
    } else {
      this.pricePerItem = 0.0;
    }
  }

  public double getInvoiceAmount() {
    return getQuantity() * getPricePerItem();
  }
}