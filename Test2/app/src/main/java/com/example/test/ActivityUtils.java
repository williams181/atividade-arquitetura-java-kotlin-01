package com.example.test;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public class ActivityUtils {
    public static void disableActivities(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName1 = new ComponentName(context, Activity2.class);
        ComponentName componentName2 = new ComponentName(context, Activity3.class);

        packageManager.setComponentEnabledSetting(componentName1,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);

        packageManager.setComponentEnabledSetting(componentName2,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    public static void enableActivities(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName1 = new ComponentName(context, Activity2.class);
        ComponentName componentName2 = new ComponentName(context, Activity2.class);

        packageManager.setComponentEnabledSetting(componentName1,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);

        packageManager.setComponentEnabledSetting(componentName2,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }
}
