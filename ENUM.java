package org.itstep;

public class ENUM {
    public static void main (String[] args){
        Colors Bus_Color = Colors.Yellow;
        System.out.println("This bus is " + Bus_Color);
        Days today = Days.Wednesday;
        System.out.println("Today is " + today);
        System.out.println("This wall is " + Colors_New.White.getTitle());

    }
}
enum Colors {
    Black, White, Gray, Red, Orange, Yellow, Green, Blue, DarkBlue, Violet
};
enum Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};
enum Colors_New {
  Black ("Черный"),
  White ("Белый");
  private String title;
    Colors_New(String title) {
      this.title=title;
  }

    public String getTitle() {
        return title;
    }
};
