package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int  choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do{
            System.out.print("Select the root\n");
            System.out.print("            1. KelaniVally              \n");
            System.out.print("            2. Coastal              \n");
            System.out.print("            3. Puttalama            \n");
            System.out.print("            4. MainLine            \n");
            System.out.print("            5. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            StationMaster sm = new StationMaster();

            switch (choice) {
                case 1:
                {
                    sm.kelaniValleytLineTiketIssue();
                }
                break;
                case 2:
                {
                    sm.coastalLineTiketIssue();
                }
                break;
                case 3:
                {
                    sm.puttalamaLineTiketIssue();
                }
                break;
                case 4:
                {
                    sm.mainLineTiketIssue();
                }
                break;
                default:
                {
                    System.out.println("Thanks and come again");
                }
                return;
            }

        }while(choice!=5);
    }
}
