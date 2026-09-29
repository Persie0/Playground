package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lgd {
    /* JADX INFO: renamed from: a */
    public static String m16184a(Context context, String str, boolean z) {
        String packageName = context.getPackageName();
        if (str == null) {
            str = packageName;
        }
        if (z) {
            if (!m16186c(context)) {
                return ux5.m22990m(str, "_noBadge");
            }
        } else if (m16186c(context)) {
            return ux5.m22990m(str, "_noBadge");
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16185b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("itbl")) {
            return false;
        }
        return new mc4(bundle.getString("itbl")).f51071d;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16186c(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getBoolean("iterable_notification_badging", true);
            }
        } catch (PackageManager.NameNotFoundException e) {
            eh0.m11135p("IterableNotification", e.getLocalizedMessage() + " Failed to read notification badge settings. Setting to defaults - true");
        }
        return true;
    }
}
