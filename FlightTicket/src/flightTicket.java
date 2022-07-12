import java.util.Scanner ;

public class flightTicket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age, tripType ;
        double distance, pricePerKm = 0.10, normalPrice, totalPrice, discountedAmount,
                ageDiscount, ageDiscountRate , roundTripDiscount , roundTripDiscountRate = 0.2 ;

        System.out.print("Enter the distance in Km : ");
        distance = input.nextDouble();

        System.out.print("Enter your age : ");
        age = input.nextInt();

        System.out.print("Choose the trip type (1 For one way, 2 For round trip ) : ");
        tripType = input.nextInt();

        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)){
            normalPrice = (distance * pricePerKm);


           if (age < 12 && tripType == 2){
               ageDiscountRate = 0.5 ;
               ageDiscount = normalPrice * ageDiscountRate ;
               discountedAmount = normalPrice - ageDiscount ;
               roundTripDiscount = discountedAmount * 0.2 ;
               totalPrice = 2 * (discountedAmount - roundTripDiscount) ;
               System.out.println("Normal price is : " + normalPrice);
               System.out.println("Age discount is : " + ageDiscount);
               System.out.println("Round trip discount is : " + roundTripDiscount);
               System.out.println("Total discounted price is : " + totalPrice);

           } else if (age < 12 && tripType == 1){
               ageDiscountRate = 0.5 ;
               ageDiscount = normalPrice * ageDiscountRate ;
               discountedAmount = normalPrice - ageDiscount ;
               totalPrice = discountedAmount ;
               System.out.println("Normal price is : " + normalPrice);
               System.out.println("Age discount is : " + ageDiscount);
               System.out.println("Total discounted price is : " + totalPrice);

           }else if ((age >= 12 && age <= 24) && tripType == 2){
               ageDiscountRate = 0.1 ;
               ageDiscount = normalPrice * ageDiscountRate ;
               discountedAmount = normalPrice - ageDiscount ;
               roundTripDiscount = discountedAmount * 0.2 ;
               totalPrice = 2 * (discountedAmount - roundTripDiscount) ;
               System.out.println("Normal price is : " + normalPrice);
               System.out.println("Age discount is : " + ageDiscount);
               System.out.println("Round trip discount is : " + roundTripDiscount);
               System.out.println("Total discounted price is : " + totalPrice);

           }else if ((age >= 12 && age <= 24) && tripType == 1){
               ageDiscountRate = 0.1 ;
               ageDiscount = normalPrice * ageDiscountRate ;
               discountedAmount = normalPrice - ageDiscount ;
               totalPrice = discountedAmount ;
               System.out.println("Normal price is : " + normalPrice);
               System.out.println("Age discount is : " + ageDiscount);
               System.out.println("Total discounted price is : " + totalPrice);

           }else if ((age >= 65) && tripType == 2){
               ageDiscountRate = 0.3 ;
               ageDiscount = normalPrice * ageDiscountRate ;
               discountedAmount = normalPrice - ageDiscount ;
               roundTripDiscount = discountedAmount * 0.2 ;
               totalPrice = 2 * (discountedAmount - roundTripDiscount) ;
               System.out.println("Normal price is : " + normalPrice);
               System.out.println("Age discount is : " + ageDiscount);
               System.out.println("Round trip discount is : " + roundTripDiscount);
               System.out.println("Total discounted price is : " + totalPrice);

           }else if ((age >= 65) && tripType == 1){
               ageDiscountRate = 0.3 ;
               ageDiscount = normalPrice * ageDiscountRate ;
               discountedAmount = normalPrice - ageDiscount ;
               totalPrice = discountedAmount ;
               System.out.println("Normal price is : " + normalPrice);
               System.out.println("Age discount is : " + ageDiscount);
               System.out.println("Total discounted price is : " + totalPrice);

           }else if (tripType == 1){
               System.out.print("The price is " + normalPrice);

           }else if (tripType ==2){
               roundTripDiscount = normalPrice * roundTripDiscountRate ;
               totalPrice = 2 * (normalPrice - roundTripDiscount) ;
               System.out.print("Total discounted price is : " + totalPrice);
           }
        } else {
            System.out.print("You have entered incorrect data.");
        }

    }
}
