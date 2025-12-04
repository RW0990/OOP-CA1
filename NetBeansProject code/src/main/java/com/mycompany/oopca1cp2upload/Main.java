package com.mycompany.oopca1cp2upload;

import com.mycompany.oopca1cp2upload.FoodTracker;
import com.mycompany.oopca1cp2upload.MoodTracker;
import com.mycompany.oopca1cp2upload.HydrationTracker;
import com.mycompany.oopca1cp2upload.SimpleUser;
import com.mycompany.oopca1cp2upload.Forum;
import com.mycompany.oopca1cp2upload.Dashboard;
import com.mycompany.oopca1cp2upload.SleepInput;
import com.mycompany.oopca1cp2upload.SleepAnalyzer;
import com.mycompany.oopca1cp2uploadNEW.UserGui;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new UserGui().setVisible(true);

            }

        });

            }
}
