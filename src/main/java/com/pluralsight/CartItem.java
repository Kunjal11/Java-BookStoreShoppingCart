package com.pluralsight;

public class CartItem {
    private Book book;
    private int quantity;

    public CartItem(Book book, int quantity) {
      this.book = book;
      this.quantity = quantity;
    }

    public String getTitle() {
        return book.getTitle();
    }
    public String getAuthor() {
        return book.getAuthor();
    }
    public float getPrice() {
        return book.getPrice();
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getTotalCost() {
        return book.getPrice()*this.quantity;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CartItem cartItem = (CartItem) object;
        return quantity == cartItem.quantity &&
                book.equals(cartItem.book);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), book, quantity);
    }
}
