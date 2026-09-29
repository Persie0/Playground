package p232l2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: l2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7232k {

    /* JADX INFO: renamed from: l2.k$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Intent m14565a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m14566b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* JADX INFO: renamed from: c */
        public static boolean m14567c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Intent m14562a(Activity activity) {
        Intent intentM14565a = a.m14565a(activity);
        if (intentM14565a != null) {
            return intentM14565a;
        }
        try {
            String strM14564c = m14564c(activity, activity.getComponentName());
            if (strM14564c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strM14564c);
            try {
                return m14564c(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM14564c + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m14563b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM14564c = m14564c(context, componentName);
        if (strM14564c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM14564c);
        return m14564c(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: c */
    public static String m14564c(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle != null && (string = bundle.getString("android.support.PARENT_ACTIVITY")) != null) {
            if (string.charAt(0) != '.') {
                return string;
            }
            return context.getPackageName() + string;
        }
        return null;
    }
}
