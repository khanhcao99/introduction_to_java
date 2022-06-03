package Read_numbers_into_words;

import java.util.Scanner;

public class readNumbersIntoWords {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Nhập vào số cần dịch: ");
        int number = value.nextInt();

//        Dịch hàng đơn vị
        int hdv = number % 10;
        String readhdv = "";
        switch (hdv) {
            case 1:
                readhdv = "one";
                break;
            case 2:
                readhdv = "two";
                break;
            case 3:
                readhdv = "three";
                break;
            case 4:
                readhdv = "four";
                break;
            case 5:
                readhdv = "five";
                break;
            case 6:
                readhdv = "six";
                break;
            case 7:
                readhdv = "seven";
                break;
            case 8:
                readhdv = "eight";
                break;
            case 9:
                readhdv = "nine";
                break;
        }

//        Dịch từ 10 đến 19

        int eltont = number % 100;
        String readeltont = "";
        switch (eltont) {
            case 10:
                readeltont = "ten";
                break;
            case 11:
                readeltont = "eleven";
                break;
            case 12:
                readeltont = "twelve";
                break;
            case 13:
                readeltont = "thỉrteen";
                break;
            case 14:
                readeltont = "fourteen";
                break;
            case 15:
                readeltont = "fifteen";
                break;
            case 16:
                readeltont = "sixteen";
                break;
            case 17:
                readeltont = "seventeen";
                break;
            case 18:
                readeltont = "eighteen";
                break;
            case 19:
                readeltont = "nineteen";
                break;
        }

//        Dịch hàng chục

        int hc = (number % 100 - hdv) / 10;
        String readhc = "";
        switch (hc) {
            case 2:
                readhc = "twenty";
                break;
            case 3:
                readhc = "thirty";
                break;
            case 4:
                readhc = "forty";
                break;
            case 5:
                readhc = "fifty";
                break;
            case 6:
                readhc = "sixty";
                break;
            case 7:
                readhc = "sixty";
                break;
            case 8:
                readhc = "eighty";
                break;
            case 9:
                readhc = "ninety";
                break;
        }

//        Dịch số hàng trăm

        int ht = number - (number % 100);
        String readht = "";
        switch (ht) {
            case 100:
                readht = "one hundred";
                break;
            case 200:
                readht = "two hundred";
                break;
            case 300:
                readht = "three hundred";
                break;
            case 400:
                readht = "four hundred";
                break;
            case 500:
                readht = "five hundred";
                break;
            case 600:
                readht = "six hundred";
                break;
            case 700:
                readht = "seven hundred";
                break;
            case 800:
                readht = "eight hundred";
                break;
            case 900:
                readht = "nine hundred";
                break;
        }
        if (number < 10) {
            System.out.println("Số được dịch là: " + readhdv);
        } else if (number < 20) {
            System.out.println("Số được dịch là: " + readeltont);
        } else if (number < 100) {
            System.out.println("Số được dịch là: " + readhc + " " + readhdv);
        } else if (number < 110) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 120) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        } else if (number < 200) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 210) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 220) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 300) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 310) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 320) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 400) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 410) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 420) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 500) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 510) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 520) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 600) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 610) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 620) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 700) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 710) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 720) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 800) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 810) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 820) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 900) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        } else if (number < 910) {
            System.out.println("Số được dịch là: " + readht + " " + readhdv);
        } else if (number < 920) {
            System.out.println("Số được dịch là: " + readht + " " + readeltont);
        }else if (number < 1000) {
            System.out.println("Số được dịch là: " + readht + " " + readhc + " " + readhdv);
        }


    }
}


