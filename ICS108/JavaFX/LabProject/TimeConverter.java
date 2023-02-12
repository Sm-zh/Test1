package LabProject;

public class TimeConverter {
    public static int toIndex(int time) {
        return time - 7;
    }

    public static int toIndex(String day) {
        if (day.equals("U")) {
            return 0;
        }
        else if (day.equals("M")) {
            return 1;
        }
        else if (day.equals("T")) {
            return 2;
        }
        else if (day.equals("W")) {
            return 3;
        }
        else {
            return 4;
        }
    }

    public static int duration(int start, int end) {
        return  end - start;
    }
    
}
