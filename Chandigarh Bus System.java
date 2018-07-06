package com.company;

import java.util.Scanner;

class Route{
    static int rn;
    void routes(){
        Scanner x = new Scanner (System.in);
        System.out.println("\n1. Phase 7 to ISBT Sector 43                             -  Up/Down");
        System.out.println("2. Sector 43 to Airpot/Attawa                            -  Up/Down");
        System.out.println("3. Sector 43 to I.T. Park                                -  Up/Down");
        System.out.println("4. Sector 43 to Landran/Kharar                           -  Up/Down");
        System.out.println("5. Sector 43 to Sector 17                                -  Up/Down");
        System.out.println("6. Sector 17 to ISBT-Mohali(Ph-9, Ph-10, Ph-11)          -  Up/Down");
        System.out.println("7. Sector 17 to Zirakpur/18-Mkt/19-Mkt                   -  Up/Down");
        System.out.println("8. Sector 17 to High Court/Rock Garden/Sukhna Lake       -  Up/Down");
        System.out.println("9. PGI to Railway Station                                -  Up/Down");
        System.out.println("10. Railway Station to Panchkula                         -  Up/Down\n");
        System.out.println("(enter number like 1 for \"1. Phase 7 to ISBT Sector 43  -  Up/Down\")..");
        rn = x.nextInt();
    }
}

class DisplayBus extends Route{
    Scanner x = new Scanner (System.in);
    char d;
    void display(int slctn){
        switch (slctn) {
            case 1:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.00 - 20.00 hrs.     35 Min         28 Km         4");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.00 - 10.00 hrs.      35 Min         28 Km         4A");
                        System.out.println("10.00 - 15.00 hrs.     35 Min         28 Km         4B");
                        System.out.println("15.00 - 18.00 hrs.     35 Min         28 Km         4C");
                        System.out.println("18.00 - 20.00 hrs.     35 Min         28 Km         4D");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 2:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.10 - 17.10 hrs.     1 hr           17 Km         2");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.10 - 12.00 hrs.      1 hr         17 Km         2A");
                        System.out.println("12.00 - 17.10 hrs.     1 hr         17 Km         2B");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 3:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("6.00 - 20.10 hrs.     20 Min         20 Km         7");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("6.00  -  7.00 hrs.     20 Min         20 Km         7A");
                        System.out.println("7.00  -  8.00 hrs.     20 Min         20 Km         7B");
                        System.out.println("8.00  -  9.00 hrs.     20 Min         20 Km         7C");
                        System.out.println("9.00  - 10.00 hrs.     20 Min         20 Km         7D");
                        System.out.println("10.00 - 12.00 hrs.     20 Min         20 Km         7E");
                        System.out.println("14.00 - 16.00 hrs.     20 Min         20 Km         7F");
                        System.out.println("18.00 - 20.10 hrs.     20 Min         20 Km         7G");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 4:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.30 - 20.30 hrs.     40 Min         25 Km         6");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.30  -  9.00 hrs.     40 Min         25 Km         6A");
                        System.out.println("9.00  - 10.00 hrs.     40 Min         25 Km         6B");
                        System.out.println("10.00 - 11.00 hrs.     40 Min         25 Km         6C");
                        System.out.println("11.00 - 14.00 hrs.     40 Min         25 Km         6D");
                        System.out.println("14.00 - 17.00 hrs.     40 Min         25 Km         6E");
                        System.out.println("17.00 - 20.30 hrs.     40 Min         25 Km         6F");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 5:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.00 - 19.00 hrs.     25 Min         19 Km         3");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.00  - 10.00 hrs.     25 Min         19 Km         3A");
                        System.out.println("10.00 - 14.30 hrs.     25 Min         19 Km         3B");
                        System.out.println("14.30 - 19.00 hrs.     25 Min         19 Km         3C");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 6:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.35 - 19.35 hrs.     35 Min         30 Km         4");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.35  -  9.35 hrs.     35 Min         30 Km         1A");
                        System.out.println("9.35  - 12.35 hrs.     35 Min         30 Km         1B");
                        System.out.println("12.35 - 16.35 hrs.     35 Min         30 Km         1C");
                        System.out.println("16.35 - 19.35 hrs.     35 Min         30 Km         1D");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 7:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.35 - 19.00 hrs.     20 Min         20 Km         5");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.35  -  9.35 hrs.     20 Min         20 Km         5A");
                        System.out.println("9.35  - 12.35 hrs.     20 Min         20 Km         5B");
                        System.out.println("12.35 - 14.35 hrs.     20 Min         20 Km         5C");
                        System.out.println("14.35 - 16.35 hrs.     20 Min         20 Km         5D");
                        System.out.println("16.35 - 19.00 hrs.     20 Min         20 Km         5E");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 8:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("8.00 - 18.00 hrs.     40 Min         30 Km         3");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("8.00  - 10.00 hrs.     40 Min         30 Km         8A");
                        System.out.println("10.00 - 14.00 hrs.     40 Min         30 Km         8B");
                        System.out.println("14.00 - 18.00 hrs.     40 Min         30 Km         8C");
                    }
                    else{
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 9:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("6.00 - 21.00 hrs.     20 Min         30 Km         5");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("6.00 -  13.35 hrs.     20 Min         30 Km         9A");
                        System.out.println("13.35 - 15.35 hrs.     20 Min         30 Km         9B");
                        System.out.println("15.35 - 17.35 hrs.     20 Min         30 Km         9C");
                        System.out.println("17.35 - 19.35 hrs.     20 Min         30 Km         9D");
                        System.out.println("19.35 - 21.00 hrs.     20 Min         30 Km         9E");
                    }
                    else {
                    }
                }
                else {
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            case 10:
                System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                System.out.println("\nWant to see details of the route? (Y/N)");
                d = x.next().charAt(0);
                if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                    if(d == 'Y' || d == 'y') {
                        System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                        System.out.println("7.00 -  14.00 hrs.     25 Min         20 Km         10A");
                        System.out.println("14.00 - 16.00 hrs.     25 Min         20 Km         10B");
                        System.out.println("16.00 - 18.00 hrs.     25 Min         20 Km         10C");
                        System.out.println("18.00 - 20.00 hrs.     25 Min         20 Km         10D");
                    }
                    else {
                    }
                }
                else{
                    System.out.println("Invalid Entry!");
                }
                reroute();
                break;
            default:
                System.out.println("Invalid Entry!");
                break;
        }
    }

    void display(int src, int dst){
        switch (src) {
            case 34:
                switch(dst){
                    case 35:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.30 - 19.00 hrs.     40 Min         35 Km         3");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.30  - 10.00 hrs.     40 Min         35 Km         11A");
                                System.out.println("10.00 - 14.00 hrs.     40 Min         35 Km         11B");
                                System.out.println("14.00 - 19.00 hrs.     40 Min         35 Km         11C");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 42:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.35 - 20.30 hrs.     30 Min         25 Km         2");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.35  - 14.00 hrs.     30 Min         25 Km         12A");
                                System.out.println("14.00 - 20.30 hrs.     30 Min         25 Km         12B");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 43:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.35 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         13A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         13B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         13C");
                                System.out.println("16.00 - 20.35 hrs.     25 Min         20 Km         13D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    default:
                        System.out.println("Sorry,No Route Found!");
                        reroute();
                        break;
                }
                break;
            case 35:
                switch(dst){
                    case 34:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.30 - 19.00 hrs.     40 Min         35 Km         3");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.30  - 10.00 hrs.     40 Min         35 Km         11A");
                                System.out.println("10.00 - 14.00 hrs.     40 Min         35 Km         11B");
                                System.out.println("14.00 - 19.00 hrs.     40 Min         35 Km         11C");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 42:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         14A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         14B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         14C");
                                System.out.println("16.00 - 20.00 hrs.     25 Min         20 Km         14D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 43:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         15A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         15B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         15C");
                                System.out.println("16.00 - 20.00 hrs.     25 Min         20 Km         15D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    default:
                        System.out.println("Sorry,No Route Found!");
                        reroute();
                        break;
                }
                break;
            case 42:
                switch(dst){
                    case 34:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.35 - 20.30 hrs.     30 Min         25 Km         2");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.35  - 14.00 hrs.     30 Min         25 Km         12A");
                                System.out.println("14.00 - 20.30 hrs.     30 Min         25 Km         12B");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 35:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         14A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         14B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         14C");
                                System.out.println("16.00 - 20.00 hrs.     25 Min         20 Km         14D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 43:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         16A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         16B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         16C");
                                System.out.println("16.00 - 20.00 hrs.     25 Min         20 Km         16D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    default:
                        System.out.println("Sorry,No Route Found!");
                        reroute();
                        break;
                }
                break;
            case 43:
                switch(dst){
                    case 34:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.35 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         13A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         13B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         13C");
                                System.out.println("16.00 - 20.35 hrs.     25 Min         20 Km         13D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 35:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         15A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         15B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         15C");
                                System.out.println("16.00 - 20.00 hrs.     25 Min         20 Km         15D");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    case 42:
                        System.out.println("Departure-Arrival   Travel Time    Distance    No. of Buses");
                        System.out.println("7.00 - 20.00 hrs.     25 Min         20 Km         4");
                        System.out.println("\nWant to see details of the route? (Y/N)");
                        d = x.next().charAt(0);
                        if (d == 'Y' || d == 'N' || d == 'y' || d == 'n') {
                            if(d == 'Y' || d == 'y') {
                                System.out.println("Departure-Arrival   Travel Time    Distance    Bus Number");
                                System.out.println("7.00  -  9.00 hrs.     25 Min         20 Km         16A");
                                System.out.println("9.00 -  12.00 hrs.     25 Min         20 Km         16B");
                                System.out.println("12.00 - 16.00 hrs.     25 Min         20 Km         16D");
                                System.out.println("16.00 - 20.00 hrs.     25 Min         20 Km         16C");
                            }
                            else{
                            }
                        }
                        else {
                            System.out.println("Invalid Entry!");
                        }
                        reroute();
                        break;
                    default:
                        System.out.println("Sorry,No Route Found!");
                        reroute();
                        break;
                }
                break;
            default:
                System.out.println("Sorry,No Route Found!");
                reroute();
                break;
        }
    }

    void reroute(){
        Scanner x = new Scanner (System.in);
        int rn2;
        char ar,ps;
        System.out.println("\nTry another route? (Y/N)");
        ar = x.next().charAt(0);
        if(ar == 'Y' || ar == 'y'){
            System.out.println("Enter route number:");
            rn2 = x.nextInt();
            display(rn2);
        }
        else if(ar == 'N' || ar == 'n'){
            System.out.println("Didn't satisfied?\nTo put your Sectors press 'Y' otherwise press 'N'..");
            ps = x.next().charAt(0);
            if(ps == 'Y' || ps == 'y'){
                int src,dst;
                System.out.println("Enter source sector:");
                src = x.nextInt();
                System.out.println("Enter destination sector:");
                dst = x.nextInt();
                display(src,dst);
            }
            else if(ps == 'N' || ps == 'n'){
            }
            else{
                System.out.println("Invalid Entry!");
            }
        }
        else{
            System.out.println("Invalid Entry!");
        }
    }
}

public class Main extends DisplayBus{

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("\n                    CHANDIGARH LOCAL BUS SYSTEM");
        System.out.println("              (Timings/Travel time/Distance/No. of buses)");
        System.out.println("\nChoose the route you want to travel:");
        Main m = new Main();
        m.routes();
        if((rn > 0) && (rn <= 10)){
            m.display(rn);
        }
        else{
            System.out.println("Invalid Entry!");
        }
        System.out.println("\nThanks for your time..Have a nice day..");
    }
}
