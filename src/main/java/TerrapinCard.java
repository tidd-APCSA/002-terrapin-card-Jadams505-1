public class TerrapinCard 
{
  /* --- Instance Variables --- */

  private double balance;

  /* --- Constructors --- */

  public TerrapinCard(double balance)
  {
    this.balance = balance;
  }

  /* --- Getter Methods --- */

  public double getBalance()
  {
    return balance;
  }

  /* --- Void Methods --- */

  public void payEconomical()
  {
    double cost = 2.5;  // Cost of one economical meal
    if(hasEnoughMoney(cost)) // If the user has enough money
    {
      balance -= cost; // Decrease their balance by the cost of the meal
    }
  }
  public void payGourmet()
  {
    double cost = 4.0; // Cost of one gourment meal
    if(hasEnoughMoney(cost)) // If the user has enough money
    {
      balance -= cost; // Decrease their balance by the cost of the meal
    }
  }

  public void loadMoney(double amount)
  {
    double maxBalance = 150; // The total in the balance should not exceed 150
    double newBalance = balance + amount; // the new balance in the account will be the old balance amount plus the new amount the user is loading

    if (amount < 0){ // If the amount of money to load is negative
      return; // Do nothing
    }
    if(newBalance > maxBalance) // If the new balance exceeds the max balance
    {
      balance = maxBalance; // The balance is set to the maximum of $150
    }
    else{
      balance = newBalance; // Otherwise The balance is set to the new balance
    }
    
  }

  /* --- toString Method Override --- */

  public String toString()
  {
    return "The card has " + balance + " dollars";
  }

  /* --- Private Methods --- */

  private boolean hasEnoughMoney(double cost)
  {
    if(balance - cost < 0) // If the user does not have enough money to pay
    {
      return false;
    }
    else
    {
      return true;
    }
  }

}
