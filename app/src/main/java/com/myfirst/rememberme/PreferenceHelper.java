package com.myfirst.rememberme;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {

    private static final String SHARED_PREFERENCE_KEY = "com.myfirst.rememberme";

    public static SharedPreferences getSharedPreference(Context context){
        return context.getSharedPreferences(SHARED_PREFERENCE_KEY,Context.MODE_PRIVATE);
    }

    public static void putIntToSharedPreference(Context context,String key,int value){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }
    public static void putStringToSharedPreference(Context context,String key,String value){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }
    public static int getIntFromSharedPreference(Context context,String key){
        return getSharedPreference(context).getInt(key,0);
    }
    public static String getStringFromSharedPreference(Context context,String key){
        return getSharedPreference(context).getString(key,null);
    }

}
