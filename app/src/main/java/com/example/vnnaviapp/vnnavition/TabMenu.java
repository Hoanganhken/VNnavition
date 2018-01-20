package com.example.vnnaviapp.vnnavition;

/**
 * Created by Hoang Anh Ken on 20-Jan-18.
 */

public class TabMenu {
    public static String get(int menuItemId, boolean isReselection) {
        String message = "Content for ";

        switch (menuItemId) {
            case R.id.tab_recents:
                message += "Dia diem";
                break;
            case R.id.tab_favorites:
                message += "bang tin";
                break;
            case R.id.tab_nearby:
                message += "dia diem";
                break;
            case R.id.tab_friends:
                message += "dich vu";
                break;
            case R.id.tab_food:
                message += "ca nhan";
                break;
        }

        if (isReselection) {
            message += " WAS RESELECTED! YAY!";
        }

        return message;
    }

}
