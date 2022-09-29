public class U2L3_Runner {
    public static void main(String[] args) {

        Rectangle r1= new Rectangle(150, 200);
        Rectangle r2= new Rectangle(100);
        Rectangle r3= new Rectangle();

        r1.setWidth(125);
        r2.setWidth(125);
        r2.setLength(125);
        r3.setWidth(125);

        r2.calculatePerimeter();
        r2.printPerimeter();

        int sumOfPeri =  r1.calculatePerimeter() + r2.calculatePerimeter()+ r3.calculatePerimeter();
        int sumOfArea= +r1.calculateArea()+ r1.calculateArea()+ r1.calculateArea();

        System.out.print("You will need about " +sumOfPeri+" feet of fencing and about "+sumOfArea+" square feet of seeding.");


    }
}