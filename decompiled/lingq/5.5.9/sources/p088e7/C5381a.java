package p088e7;

import android.app.Application;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.clevertap.android.sdk.C2181a;

/* JADX INFO: renamed from: e7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5381a {
    /* JADX INFO: renamed from: a */
    public static void m11552a(Application application, Class cls) throws PackageManager.NameNotFoundException {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities;
        String name = cls.getName();
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (activityInfo.name.equals(name)) {
                C2181a.m6454f(name.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        C2181a.m6454f(name.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    /* JADX INFO: renamed from: b */
    public static void m11553b(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ActivityInfo activityInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 2).receivers) {
            if (activityInfo.name.equals(str)) {
                C2181a.m6454f(str.replaceFirst("com.clevertap.android.", "") + " is present");
                return;
            }
        }
        C2181a.m6454f(str.replaceFirst("com.clevertap.android.", "") + " not present");
    }

    /* JADX INFO: renamed from: c */
    public static void m11554c(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ServiceInfo serviceInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services) {
            if (serviceInfo.name.equals(str)) {
                C2181a.m6454f(str.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        C2181a.m6454f(str.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }
}
