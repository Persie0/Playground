package p232l2;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7227f {
    /* JADX INFO: renamed from: a */
    public static <T> T m14553a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: b */
    public static int m14554b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m14555c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m14556d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
