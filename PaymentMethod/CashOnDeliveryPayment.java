package PaymentMethod;

public class CashOnDeliveryPayment extends Payment {
  private double deliveryFee;
  
  public CashOnDeliveryPayment(double paymentAmount, String currency, double deliveryFee) {
    super(paymentAmount, currency);
    this.deliveryFee = deliveryFee;
  }
  
  public double getDeliveryFee() {
    return deliveryFee;
  }
  
  public void setDeliveryFee(double deliveryFee) {
    this.deliveryFee = deliveryFee;
  }
  
  @Override
  public String getPaymentInfo() {
    return "Cash on Delivery Payment: " + getPaymentAmount() + " " + getCurrency() + 
           ", Delivery Fee: " + deliveryFee;
  }
}
