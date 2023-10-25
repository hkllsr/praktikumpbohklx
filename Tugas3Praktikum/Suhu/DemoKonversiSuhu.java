class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double Celcius = 25.0;
        double Fahrenheit = konversi.CelciusToFahrenheit(Celcius);
        double Reamur = konversi.CelciusToReamur(Celcius);
        double FahrenheitToReamur = konversi2.FahrenheitToReamur(Fahrenheit);

        System.out.println("Hasil Konversi Suhu:");
        System.out.println(Celcius + " Celsius       = " + Fahrenheit + " Fahrenheit");
        System.out.println(Celcius + " Celsius       = " + Reamur + " Reamur");
        System.out.println(Fahrenheit + " Fahrenheit    = " + FahrenheitToReamur + " Reamur");
    }
}