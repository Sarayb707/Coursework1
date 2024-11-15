int vanilla = 94;       
int chocolate = 10;     
int strawberry = 0;    

System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavour = System.console().readLine().trim();

int pricePerScoop = 0;
switch (flavour) {
    case "v" -> pricePerScoop = vanilla;
    case "c" -> pricePerScoop = chocolate;
    case "s" -> pricePerScoop = strawberry;
    default -> {
        System.out.println("We don't have that flavour.");
        return;
    }
}

System.out.println("How many scoops would you like?");
int scoops = Integer.parseInt(System.console().readLine().trim());

if (scoops < 1) {
    System.out.println("We don't sell just a cone.");
    return;
} else if (scoops > 3) {
    System.out.println("That's too many scoops to fit in a cone.");
    return;
}

int coneCost = 100; // 100 pence for a cone
int totalCost = coneCost + scoops * pricePerScoop;

System.out.printf("That will be %.2f pounds please.%n", totalCost / 100.0);
