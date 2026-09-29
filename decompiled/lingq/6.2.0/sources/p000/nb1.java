package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nb1 {

    /* JADX INFO: renamed from: a */
    public static final mp2 f52560a = new mp2("CommonUtils", "");

    /* JADX INFO: renamed from: a */
    public static String m17309a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            mp2 mp2Var = f52560a;
            if (!Log.isLoggable(mp2Var.f51686b, 6)) {
                return "";
            }
            String str = mp2Var.f51687c;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}
