import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Cart keranjang = new Cart();

        keranjang.tambahProduk("Topi Putih", 2);
        keranjang.tambahProduk("Kemeja Hitam", 3);
        keranjang.tambahProduk("Sepatu Merah", 1);
        keranjang.tambahProduk("Sepatu Merah", 4);
        keranjang.tambahProduk("Sepatu Merah", 2);
        keranjang.hapusProduk("Kemeja Hitam");
        keranjang.hapusProduk("Baju Hijau");

        keranjang.tampilkanCart();
    }
}

class Cart{
    HashMap<String, Product> cart = new HashMap<>();

    public void tambahProduk(String kodeProduk, int kuantitas) {
        Product product = new Product(kodeProduk, kuantitas);
        cart.put(kodeProduk, new Product(kodeProduk, kuantitas));

    }

    public void hapusProduk(String kodeProduk){
        cart.remove(kodeProduk);
    }

    public void tampilkanCart(){
        System.out.println(cart.entrySet());
    }
}

class Product{
    String name;
    int quantity;
    int total = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        total += quantity;
        return total;
    }

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

}
