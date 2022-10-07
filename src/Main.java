public class Main {
    public static void main(String[] args) {
//Индекс массы тела	Соответствие между массой человека и его ростом
//16 и менее	          Выраженный дефицит массы тела
//16—18,5	              Недостаточная (дефицит) масса тела
//18,5—25	              Норма
//25—30	                  Избыточная масса тела (предожирение)
//30—35	                  Ожирение 1 степени
//35—40	                  Ожирение 2 степени
//40 и более	          Ожирение 3 степени
// расчет индех = масса[кг] / (рост[м]*рост[м])

        BmiService service = new BmiService();
        double weight = 77.6; //вес в килограммах!!!
        double height = 1.8; //рост в метрах !!!

        int index = (int) (service.calculate(weight, height) * 100);
        double bmi = (double) index / 100;

        if (bmi < 18.5) {
            System.out.println("Индекс массы тела = " + bmi + ", маловато будет");
        } else if (bmi > 25) {
            System.out.println("Индекс массы тела = " + bmi + ", многовато будет");
        } else {
            System.out.println("Индекс массы тела = " + bmi + ", НОРМА!");
        }

    }

}
