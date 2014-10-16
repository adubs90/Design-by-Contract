package shopping;

public class ItemOrder
{
  // public invariant my_quantity >= 0; (if we can't return things)
  
  private /*@ spec_public @*/ final Item my_item;
  private /*@ spec_public @*/ final int my_quantity;

  //@ ensures my_item == the_item;
  //@ ensures my_quantity == the_quantity;
  public ItemOrder(final Item the_item, final int the_quantity)
  {
    my_item = the_item;
    my_quantity = the_quantity;
  }

  //@ ensures \result == my_item.priceFor(my_quantity);
  public /*@ pure @*/ double getPrice()
  {
    assert false;
    return 0.0;
  }

  //@ ensures \result == my_item;
  public Item getItem()
  {
    assert false;
    return null;
  }
}
