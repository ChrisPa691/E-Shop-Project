package PaymentMethod;

import java.util.Date;

public abstract class Payment {
    private double paymentAmount;
    private String currency;
    private Date dateOfPurchase;
    
    public Payment(double paymentAmount, String currency) {
      this.paymentAmount = paymentAmount;
      this.currency = currency;
      this.dateOfPurchase = new Date();
    }
    
    public double getPaymentAmount() {
      return paymentAmount;
    }
    
    public void setPaymentAmount(double paymentAmount) {
      this.paymentAmount = paymentAmount;
    }
    
    public String getCurrency() {
      return currency;
    }
    
    public void setCurrency(String currency) {
      this.currency = currency;
    }
    
    public Date getDateOfPurchase() {
      return dateOfPurchase;
    }
    
    public abstract String getPaymentInfo();
  }