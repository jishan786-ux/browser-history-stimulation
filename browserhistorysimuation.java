import java.util.*;

public class browserhistorysimuation {
    private LinkedList<String> list = new LinkedList<>();
    private ListIterator<String> listItr = list.listIterator();
    private String currentpage = null;

    void visitpage(String url) {
        while (listItr.hasNext()) {
            listItr.remove();
        }
        listItr.add(url);
        currentpage = url;
        System.out.println("visited " + url);
    }

    void goback() {
        if (listItr.hasPrevious()) {
            currentpage = listItr.previous();
            System.out.println("back to: " + currentpage);

        } else {
            System.out.println("no previous page exit");
        }
    }

    void goforward() {
        if (listItr.hasNext()) {
            currentpage = listItr.next();
            System.out.println("forwaordto: " + currentpage);

        } else {
            System.out.println("no foward page exit");
        }

    }

    void showcurrentpage() {
        System.out.println("current page :" + currentpage);

    }

    public static void main(String[] args) {
        browserhistorysimuation broswer = new browserhistorysimuation();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("**********************************");
            System.out.println("mini project browser history simulation");
            System.out.println("**********************************");

            System.out.println("-----------broswer menu-------------");
            System.out.println("1. visit new page");
            System.out.println("2. go back");
            System.out.println("3. go farward");
            System.out.println("4. show the current page ");
            System.out.println("5. exit");

            System.out.println("enter youer choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    System.out.println("enter your url");
                    String url = sc.nextLine();
                    broswer.visitpage(url);

                    break;

                case 2:
                    broswer.goback();
                    ;
                    break;

                case 3:
                    broswer.goforward();
                    break;

                case 4:
                    broswer.showcurrentpage();
                    break;
                case 5:
                    System.out.println("exiting..........");
                    return;

                default:
                    System.out.println("invaild choice please try again later");
                    break;
            }

        }

    }
}