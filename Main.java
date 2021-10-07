import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Enumeration;
import java.lang.Math;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Main {
  public static void main(String[] args) {
    System.out.println("*************Areglos*************");
    int num[]; // heredada de C
    int[] num1; // Recomendada

    num1 = new int[10];
    int[] num2 = { 1, 2, 3, 4, 5 };
    System.out.println("*************For each*************");
    for (int o : num2) {
      System.out.println(o);
    }

    System.out.println("*************Concatenar Cadenas*************");
    String s = new String("Hola Mundo"); // Objeto
    String s1 = "Hola Mundo s1"; // Primitica -> Recomendada

    System.out.println(s);
    System.out.println(s1);

    String nombre = "Santiago";
    String apellido = "Gonzalez";

    String nombreCompleto = nombre + " " + apellido;
    System.out.println(nombreCompleto);
    System.out.println("*************Operador Punto*************");
    System.out.println("Numero de elemento del arreglo: " + num2.length);
    System.out.println("Elementos de apellido: " + apellido.length());

    System.out.println(nombreCompleto.toUpperCase());
    System.out.println(nombreCompleto);
    System.out.println("*************Wrapper y Autoboxing*************");
    int l = 25; // primitivo
    Integer k = new Integer(50); // Wrapper //Objeto
    Integer m = 66; // primitivo

    String s3 = k.toString();
    System.out.println(s3);
    int r = m;
    String s4 = r + "";
    System.out.println(s4);

    System.out.println("*************Colecciones*************");

    System.out.println("*************ArrayList*************");

    ArrayList<Integer> miArrayList = new ArrayList<Integer>();
    miArrayList.add(99);
    miArrayList.add(6);
    miArrayList.size();
    System.out.println(miArrayList.size());
    System.out.println(miArrayList.get(0));
    miArrayList.add(77);
    miArrayList.add(0, -9);
    System.out.println("******");
    for (Integer e : miArrayList)
      System.out.println(e);

    System.out.println("*************Hashtable*************");
    Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();
    miTabla.put("Santiago", 55555555);
    miTabla.put("Ramiro", 4444444);
    miTabla.put("Maria", 8888888);
    System.out.println("Numero de elmentos en tabla " + miTabla.size());

    System.out.println("*************Enumeracion*************");
    String clave;
    Integer valor;

    Enumeration<String> iteraClaves = miTabla.keys();
    while (iteraClaves.hasMoreElements()) {
      clave = iteraClaves.nextElement();
      valor = miTabla.get(clave);
      System.out.println("Clave: " + clave + "  Valor: " + valor);
    }

    System.out.println("*************Math*************");
    System.out.println(Math.PI);
    System.out.println(Math.abs(-9));
    System.out.println(Math.pow(2.5, 3));
    System.out.println(Math.sqrt(9));
    System.out.println(Math.max(6, 99));

    System.out.println("*************Date*************");
    Date hoy = new Date();
    System.out.println(hoy);

    System.out.println("*************Forato Date*************");
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println(formatoFecha.format(hoy));

    System.out.println("*************Calendar*************");
    Calendar calendarioHoy = Calendar.getInstance();
    System.out.println(calendarioHoy);

    System.out.println("*************Formato Calendar*************");
    String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
    fechaActual += (calendarioHoy.get(Calendar.MONTH) + 1) + " de ";
    fechaActual += calendarioHoy.get(Calendar.YEAR);
    System.out.println(fechaActual);
  }
}
