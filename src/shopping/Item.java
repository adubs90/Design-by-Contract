package shopping;

public class Item 
{
  //@ public invariant my_price >= 0;
  //@ public invariant my_bulk_price >= 0;
  //@ public invariant my_name.length() > 0 && my_name.equals(my_name.trim());
  //@ public invariant my_bulk_quantity >= 1;
  //@ public invariant my_bulk_quantity == 1 ==> my_price == my_bulk_price;
  
  private /*@ spec_public @*/ final String my_name;
  private /*@ spec_public @*/ final double my_price;
  private /*@ spec_public @*/ final int my_bulk_quantity;
  private /*@ spec_public @*/ final double my_bulk_price;

  
  //@ requires the_name.length() > 0 && the_name.equals(the_name.trim());
  //@ requires the_price >= 0;
  //@ ensures my_name.equals(the_name);
  //@ ensures my_price == the_price;
  //@ ensures my_bulk_quantity == 1;
  //@ ensures my_bulk_price == the_price;
  public Item(final String the_name, final double the_price) 
  {
    this(the_name, the_price, 1, the_price);
  }

  //@ requires the_name.length() > 0 && the_name.equals(the_name.trim());
  //@ requires the_price >= 0;
  //@ requires the_bulk_quantity >= 1;
  //@ requires the_bulk_price >= 0;
  //@ requires the_bulk_quantity == 1 ==> the_price == the_bulk_price;
  //@ ensures my_name.equals(the_name);
  //@ ensures my_price == the_price;
  //@ ensures my_bulk_quantity == the_bulk_quantity;
  //@ ensures my_bulk_price == the_bulk_price;
  public Item(final String the_name, final double the_price, 
              final int the_bulk_quantity, final double the_bulk_price) 
  {
    my_name = the_name;
    my_price = the_price;
    my_bulk_quantity = the_bulk_quantity;
    my_bulk_price = the_bulk_price;
  }

  /*@ ensures \result == (the_quantity / my_bulk_quantity) * my_bulk_price +
   *                     (the_quantity % my_bulk_quantity) * my_price; 
   */
  public /*@ pure @*/ double priceFor(final int the_quantity) 
  {
    assert false;
    return 0.0;
  }

  // methods overridden from java.lang.Object

  public /*@ pure @*/ String toString() 
  {
    assert false;
    return null;
  }
  
  /*@ also ensures \result <==> 
   *                   the_other instanceof Item &&
   *                   my_name.equals(((Item) the_other).my_name) &&
   *                   my_price == ((Item) the_other).my_price &&
   *                   my_bulk_quantity == ((Item) the_other).my_bulk_quantity &&
   *                   my_bulk_price == ((Item) the_other).my_bulk_price;                       
   */
  public /*@ pure @*/ boolean equals(final /*@ nullable @*/ Object the_other)
  {
    assert false;
    return false;
  }
  
  public /*@ pure @*/ int hashCode()
  {
    assert false;
    return 0;
  }
}
