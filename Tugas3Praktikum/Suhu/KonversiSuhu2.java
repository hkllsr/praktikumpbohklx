class KonversiSuhu2 extends KonversiSuhu {
    public double FahrenheitToReamur(double Fahrenheit) {
        double Celcius = (Fahrenheit - 32) * 5/9;
        return Celcius * 4/5;
    }
}