import java.util.ArrayList;

public class Arrays {

    String names[] = {"Karanda","Dim Tree","Mudster","Bheg","Kzarka","Nouver","Kutum","Red Nose"};
    int hours[] = {1,2,4,5,7,8,9,11,12,15,16,18,19,21,23,23};
    int minutes[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,15,0,15};
    String region[] = {"EU","NA","EU","NA","NA","EU","NA","EU","NA","EU","NA","EU","NA","EU","NA","EU"};
    String name;
    String name2;

    public ArrayList<Boss> monday = new ArrayList<Boss>();
    public ArrayList<Boss> tuesday = new ArrayList<Boss>();
    public ArrayList<Boss> wednesday = new ArrayList<Boss>();
    public ArrayList<Boss> thursday = new ArrayList<Boss>();
    public ArrayList<Boss> friday = new ArrayList<Boss>();
    public ArrayList<Boss> saturday = new ArrayList<Boss>();
    public ArrayList<Boss> sunday = new ArrayList<Boss>();

    public ArrayList<Boss> generateMonday() {

        for(int i=0; i<16;i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[0];
            } else if(i == 1) {
                name = names[1];
                name2 = names[2];
            } else if(i == 2) {
                name = names[4];
                name2 = names[7];
            } else if(i == 3) {
                name = names[4];
                name2 = names[5];
            } else if(i == 4) {
                name = names[0];
                name = names[6];
            } else if(i == 5) {
                name = names[4];
            } else if(i == 6) {
                name = names[0];
            } else if(i == 7) {
                name = names[5];
                name2 = names[1];
            } else if(i == 8) {
                name = names[4];
                name2 = names[7];
            } else if(i == 9) {
                name = names[6];
                name2 = names[7];
            } else if(i == 10) {
                name = names[4];
            } else if(i == 11) {
                name = names[4];
                name2 = names[2];
            } else if(i == 12) {
                name = names[5];
                name2 = names[1];
            } else if(i == 13) {
                name = names[4];
                name2 = names[3];
            } else if(i == 14) {
                name = names[6];
                name2 = names[7];
            } else if(i == 15) {
                name = names[0];
                name2 = names[1];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                monday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                monday.add(boss);
            }
        }
        return monday;
    }

    public ArrayList<Boss> generateTuesday() {
        for(int i=0; i<16; i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[6];
                name2 = names[2];
            } else if(i == 1) {
                name = names[5];
                name2 = names[2];
            } else if(i == 2) {
                name = names[4];
                name2 = names[1];
            } else if(i == 3) {
                name = names[4];
                name2 = names[3];
            } else if(i == 4) {
                name = names[0];
                name = names[1];
            } else if(i == 5) {
                name = names[6];
            } else if(i == 6) {
                name = names[6];
                name2 = names[2];
            } else if(i == 7) {
                name = names[4];
                name2 = names[2];
            } else if(i == 8) {
                name = names[4];
                name2 = names[1];
            } else if(i == 9) {
                name = names[5];
                name2 = names[1];
            } else if(i == 10) {
                name = names[6];
            } else if(i == 11) {
                name = names[0];
                name2 = names[7];
            } else if(i == 12) {
                name = names[4];
                name2 = names[2];
            } else if(i == 13) {
                name = names[4];
                name2 = names[5];
            } else if(i == 14) {
                name = names[5];
                name2 = names[1];
            } else if(i == 15) {
                name = names[6];
                name2 = names[3];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                tuesday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                tuesday.add(boss);
            }
        }
        return tuesday;
    }

    public ArrayList<Boss> generateWednesday() {
        for(int i=0; i<16; i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[0];
                name2 = names[7];
            } else if(i == 1) {
                name = names[0];
                name2 = names[7];
            } else if(i == 2) {
                name = names[1];
            } else if(i == 3) {
                name = names[4];
                name2 = names[5];
            } else if(i == 4) {
                name = names[3];
                name = names[6];
            } else if(i == 5) {
                name = names[0];
                name2 = names[4];
            } else if(i == 6) {
                name = names[0];
                name2 = names[7];
            } else if(i == 7) {
                name = names[5];
                name2 = names[2];
            } else if(i == 8) {
                name = names[1];
            } else if(i == 9) {
                name = names[4];
            } else if(i == 10) {
                name = names[0];
                name2 = names[4];
            } else if(i == 11) {
                name = names[6];
                name2 = names[1];
            } else if(i == 12) {
                name = names[5];
                name2 = names[2];
            } else if(i == 13) {
                name = names[0];
                name2 = names[4];
            } else if(i == 14) {
                name = names[4];
            } else if(i == 15) {
                name = names[5];
                name2 = names[7];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                wednesday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                wednesday.add(boss);
            }
        }
        return wednesday;
    }

    public ArrayList<Boss> generateThursday() {
        for(int i=0; i<16; i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[6];
                name2 = names[1];
            } else if(i == 1) {
                name = names[6];
                name2 = names[1];
            } else if(i == 2) {
                name = names[4];
                name2 = names[7];
            } else if(i == 3) {
                name = names[0];
                name2 = names[4];
            } else if(i == 4) {
                name = names[5];
                name = names[7];
            } else if(i == 5) {
                name = names[6];
                name2 = names[2];
            } else if(i == 6) {
                name = names[6];
                name2 = names[1];
            } else if(i == 7) {
                name = names[5];
                name2 = names[4];
            } else if(i == 8) {
                name = names[4];
                name2 = names[7];
            } else if(i == 9) {
                name = names[6];
                name2 = names[1];
            } else if(i == 10) {
                name = names[6];
                name2 = names[2];
            } else if(i == 11) {
                name = names[4];
            } else if(i == 12) {
                name = names[5];
                name2 = names[4];
            } else if(i == 13) {
                name = names[0];
            } else if(i == 14) {
                name = names[6];
                name2 = names[1];
            } else if(i == 15) {
                name = names[7];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                thursday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                thursday.add(boss);
            }
        }
        return thursday;
    }

    public ArrayList<Boss> generateFriday() {
        for(int i=0; i<16; i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[5];
                name2 = names[3];
            } else if(i == 1) {
                name = names[4];
            } else if(i == 2) {
                name = names[0];
                name2 = names[2];
            } else if(i == 3) {
                name = names[0];
            } else if(i == 4) {
                name = names[7];
            } else if(i == 5) {
                name = names[6];
                name2 = names[7];
            } else if(i == 6) {
                name = names[5];
                name2 = names[3];
            } else if(i == 7) {
                name = names[0];
                name2 = names[1];
            } else if(i == 8) {
                name = names[0];
                name2 = names[1];
            } else if(i == 9) {
                name = names[5];
                name2 = names[4];
            } else if(i == 10) {
                name = names[6];
                name2 = names[7];
            } else if(i == 11) {
                name = names[4];
                name2 = names[3];
            } else if(i == 12) {
                name = names[0];
                name2 = names[1];
            } else if(i == 13) {
                name = names[6];
                name2 = names[4];
            } else if(i == 14) {
                name = names[5];
                name = names[4];
            } else if(i == 15) {
                name = names[0];
                name2 = names[1];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                friday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                friday.add(boss);
            }
        }
        return friday;
    }

    public ArrayList<Boss> generateSaturday() {
        for(int i=0; i<16; i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[2];
            } else if(i == 1) {
                name = names[4];
                name2 = names[3];
            } else if(i == 2) {
                name = names[5];
                name2 = names[3];
            } else if(i == 3) {
                name = names[6];
                name2 = names[4];
            } else if(i == 4) {
                name = names[0];
                name = names[1];
            } else if(i == 5) {
                name = names[6];
                name2 = names[1];
            } else if(i == 6) {
                name = names[2];
            } else if(i == 7) {
                name = names[5];
                name2 = names[7];
            } else if(i == 8) {
                name = names[5];
                name2 = names[3];
            } else if(i == 9) {
                name = names[3];
            } else if(i == 10) {
                name = names[6];
                name2 = names[1];
            } else if(i == 11) {
                name = names[4];
                name2 = names[0];
            } else if(i == 12) {
                name = names[5];
                name2 = names[7];
            } else if(i == 13) {
                name = names[7];
                name2 = names[1];
            } else if(i == 14) {
                name = names[3];
            } else if(i == 15) {
                name = names[5];
                name2 = names[6];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                saturday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                saturday.add(boss);
            }
        }
        return saturday;
    }

    public ArrayList<Boss> generateSunday() {
        for(int i=0; i<16; i++) {
            name = null;
            name2 = null;
            if(i == 0) {
                name = names[4];
                name2 = names[7];
            } else if(i == 1) {
                name = names[4];
                name2 = names[0];
            } else if(i == 2) {
                name = names[6];
                name2 = names[1];
            } else if(i == 3) {
                name = names[7];
                name2 = names[1];
            } else if(i == 4) {
                name = names[5];
                name2 = names[6];
            } else if(i == 5) {
                name = names[5];
                name2 = names[4];
            } else if(i == 6) {
                name = names[4];
                name2 = names[7];
            } else if(i == 7) {
                name = names[4];
            } else if(i == 8) {
                name = names[6];
                name2 = names[1];
            } else if(i == 9) {
                name2 = names[1];
            } else if(i == 10) {
                name = names[5];
                name = names[4];
            } else if(i == 11) {
                name = names[2];
                name2 = names[1];
            } else if(i == 12) {
                name = names[4];
            } else if(i == 13) {
                name = names[4];
                name2 = names[5];
            } else if(i == 14) {
                name = names[1];
            } else if(i == 15) {
                name = names[6];
                name2 = names[0];
            }
            if (name != null) {
                Boss boss = new Boss(name,hours[i],minutes[i],region[i]);
                sunday.add(boss);
            }
            if (name2 != null) {
                Boss boss = new Boss(name2,hours[i],minutes[i],region[i]);
                sunday.add(boss);
            }
        }
        return sunday;
    }

}
