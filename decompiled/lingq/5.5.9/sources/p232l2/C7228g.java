package p232l2;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7228g {
    /* JADX INFO: renamed from: a */
    public static int m14557a(AppOpsManager appOpsManager, String str, int i10, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i10, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m14558b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static AppOpsManager m14559c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
