package collections;
import java.util.*;

public class Collections{
    public static void main(String[] args) {
        
        ArrayList<String> Pelanggan = new ArrayList<>();
        Pelanggan.add("Tom");
        Pelanggan.add("Lili");
        Pelanggan.add("john");
        System.out.println("ArrayList :" + Pelanggan.toString());
        Pelanggan.add(0, "Daniel");
        System.out.println("ArrayList :" + Pelanggan.toString());
        Pelanggan.remove(1);
        System.out.println("ArrayList :" + Pelanggan.toString() + "\n");
        
        HashSet<String> color = new HashSet<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Red");
        System.out.println("HashSet :" + color.toString());
        if(color.contains("Red")){
            System.out.println("Ada warna Merah");
        }else{
            System.out.println("Tidak ada warna Merah");
        }
        color.clear();
        if(color.isEmpty()){
            System.out.println("Semua warna sudah dihapus");
        }
        System.out.println("HashSet :" + color.toString() + "\n");
        
        HashMap<String, String> Name = new HashMap<>();
        Name.put("Rafi", "Sutrisno");
        Name.put("Daniel", "Roma");
        Name.put("Ahmad", "Saiful");
        
        System.out.println("HashSet :\nNama Depan : " + Name.keySet() + "\nNama Belakang : " + Name.values());
        System.out.println(Name.get("Rafi"));
        System.out.println(Name.get("Daniel"));
        if(Name.containsKey("Rafi")){
           System.out.println("Ada yaitu\nNama Depan : Rafi\nNama Belakang : Sutrisno\n"); 
        }
        
        LinkedList<String> Car = new LinkedList<>();
        Car.push("Toyota");
        Car.push("Nissan");
        Car.push("Daihatsu");
        System.out.println("Stack : " + Car);
        while(!Car.isEmpty())
            System.out.println(Car.pop());
        
        Car.add("Toyota");
        Car.add("Nissan");
        Car.add("Daihatsu");
        System.out.println("\nQueue : "+Car);
        while(!Car.isEmpty())
            System.out.println(Car.pop());
        
        
        System.out.println("\nCompare To : ");
        if(Name.get("Rafi").compareTo(Name.get("Daniel")) == 0){
            System.out.println("Nama Belakang Rafi dan Daniel Sama");
        }if(Name.get("Rafi").compareTo(Name.get("Daniel")) > 0){
            System.out.println("Nama Belakang Rafi lebih panjang dari Daniel");
        }else{
            System.out.println("Nama Belakang Rafi lebih pendek dari Daniel");
        }
    }
}
