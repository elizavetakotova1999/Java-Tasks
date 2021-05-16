package MyTasks;

public class MathMethods {
    public static void main(String[] args) {
        //Все математические методы статичны.
        int x = 44;
        int y = 23;
        double dx = 23.4;
        double dy = 65.6;

        //abs (x) - Возвращает модуль значения
        System.out.println("abs(): " + Math.abs(x));
        //acos(x) - Возвращает арккосинус x в радианах, удвоенный.
        System.out.println("acos(): " + Math.acos(0.5));
        //asin(x) - Возвращает арксинус x в радианах double
        System.out.println("asin(): " + Math.asin(0.5));
        //atan(x) - Возвращает арктангенс x как числовое значение между -PI/2 и PI/2 радиан удваивается.
        System.out.println("atan(): " + Math.atan(0.5));
        //atan2(y, x) - Возвращает угол theta из преобразования прямоугольных координат(x,y) в полярные координаты(r, theta). двойной
        System.out.println("atan2(): " + Math.atan2(0.5,30));
        //cbrt(x) - Возвращает кубический корень из x double
        System.out.println("cbrt(): " + Math.cbrt(x));
        //ceil(x) - Возвращает значение x, округленное в большую сторону до ближайшего целого числа double
        System.out.println("ceil(): " + Math.ceil(x));
        //copySign(x, y) - Возвращает первую плавающую точку x со знаком второй плавающей запятой y double
        System.out.println("copySign(): " + Math.copySign(x,y));
        //cos(x) - Возвращает косинус x(x в радианах) double
        System.out.println("acos(): " + Math.acos(0.5));
        //cosh(x) - Возвращает гиперболический косинус двойного значения double
        System.out.println("cos(): " + Math.cos(0.5));
        //exp(x) - Возвращает значение Ex double
        System.out.println("exp(): " + Math.exp(dx));
        //expm1(x) - Возвращает ex -1 double
        System.out.println("expm1(): " + Math.expm1(dx));
        //floor(x) - Возвращает значение x, округленное в меньшую сторону до ближайшего целого числа double
        System.out.println("floor(): " + Math.floor(dx));
        //getExponent(x) - Возвращает несмещенную экспоненту, используемую в x int
        System.out.println("getExponent(): " + Math.getExponent(x));
        //hypot(x, y) - Возвращает sqrt(x2 + y2) без промежуточного переполнения или двойного переполнения
        System.out.println("hypot(): " + Math.hypot(x,y));
        //IEEEremainder(x, y) - Вычисляет операцию остатка по x и y в соответствии со стандартом IEEE 754 double
        System.out.println("IEEEremainder(): " + Math.IEEEremainder(dx,dy));
        //log(x) - Возвращает натуральный логарифм(основание E) числа x double.
        System.out.println("log(): " + Math.log(0.5));
        //log10(x) - Возвращает десятичный логарифм числа x double.
        System.out.println("log10(): " + Math.log10(0.5));
        //log1p(x) - Возвращает натуральный логарифм(основание E) суммы x и 1 двойной точности.
        System.out.println("log1p(): " + Math.log1p(0.5));
        //max(х,y) - Возвращает число с наибольшим значением
        System.out.println("max(): " + Math.max(x,y));
        //min(x, y) - Возвращает число с наименьшим значением
        System.out.println("min(): " + Math.min(dx,dy));
        //nextAfter(x, y) - Возвращает число с плавающей запятой, смежное с x, в направлении y double | float
        System.out.println("nextAfter(): " + Math.nextAfter(dx,dy));
        //nextUp(x) - Возвращает значение с плавающей запятой рядом с x в направлении положительной бесконечности double | float
        System.out.println("nextUp(): " + Math.nextUp(dx));
        //pow(x, y) - Возвращает значение x в степени y double
        System.out.println("pow(): " + Math.pow(dx,dy));
        //random() - Возвращает случайное число от 0 до 1 с двойной точностью
        System.out.println("random(): " + Math.random());
        //round(x) - Возвращает значение x, округленное до ближайшего целого числа int.
        System.out.println("round(): " + Math.round(x));
        //rint() - Возвращает значение типа double, ближайшее к x и равное математическому целому числу double
        System.out.println("rint(): " + Math.rint(dx));
        //signum(x) - Возвращает знак x double
        System.out.println("signum(): " + Math.signum(dx));
        //sin(x) - Возвращает синус x(x в радианах) double
        System.out.println("sin(): " + Math.sin(0.8));
        //sinh(x) - Возвращает гиперболический синус двойного значения double
        System.out.println("sinh(): " + Math.sinh(0.9));
        //sqrt(x) - Возвращает квадратный корень из x double
        System.out.println("sqrt(): " + Math.sqrt(dx));
        //tan(x) - Возвращает тангенс угла в два раза.
        System.out.println("tan(): " + Math.tan(0.3));
        //tanh(x) - Возвращает гиперболический тангенс двойного значения double.
        System.out.println("tanh(): " + Math.tanh(0.7));
        //toDegrees(x) - Преобразует угол, измеренный в радианах, в прибл.эквивалентный угол, измеренный в градусах, удвоенный
        System.out.println("toDegrees(): " + Math.toDegrees(x));
        //toRadians(x) - Преобразует угол, измеренный в градусах, в прибл. угол, измеряемый в радианах, удваивается
        System.out.println("toRadians(): " + Math.toRadians(x));
        //ulp(x) - Возвращает размер единицы наименьшей точности(ulp) x double | float
        System.out.println("ulp(): " + Math.ulp(dx));
    }
}
