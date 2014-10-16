package shopping;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart
{
  public static final double DISCOUNT = 0.90;
  
  /*@ public invariant 
   *    (\forall Item i; my_orders.keys().contains(i); 
   *     my_orders.get(i).getItem().equals(i)); 
   */
  private /*@ spec_public @*/ final Map<Item, ItemOrder> my_orders;
  
  private /*@ spec_public @*/ boolean my_discount;
  
  //@ ensures my_orders.isEmpty();
  //@ ensures !my_discount;
  public ShoppingCart()
  {
    my_orders = new HashMap<Item, ItemOrder>();
  }

  //@ ensures my_orders.get(the_order.getItem()).equals(the_order);
  /*@ ensures 
   *    (\forall Item i; 
   *     \old(my_orders.keys()).contains(i) && !i.equals(the_order.getItem());
   *     \old(my_orders.get(i)) == my_orders.get(i));
   */
  public void add(final ItemOrder the_order)
  {
    assert false;
  }

  //@ ensures my_discount == the_discount;
  public void setDiscount(final boolean the_discount)
  {
    assert false;
  }

  /*@ ensures !my_discount ==> \result ==
   *    (\sum ItemOrder i; my_orders.values().contains(i); i.getPrice()); 
   */
  /*@ ensures my_discount ==> \result ==
   *    (\sum ItemOrder i; my_orders.values().contains(i); i.getPrice()) *
   *    DISCOUNT;
   */
  public double getTotal()
  {
    assert false;
    return 0.0;
  }
}
