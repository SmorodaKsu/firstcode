public class first {
    public static void main(String[] args) {
       // Объявляем  переменные
        int price = 1897; // Стоимость билета
        int forOneBonusMile = 20; // Сколько рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль
        int bonusMiles = price / forOneBonusMile;
        System.out.println("Начислено миль: " + bonusMiles );
    }
}