package p000;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdz {
    static {
        ayc.m2100b("PackageManagerHelper");
    }

    /* JADX INFO: renamed from: a */
    public static void m2261a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            ayc.m2099a();
            cls.getName();
        } catch (Exception e) {
            ayc.m2099a();
            cls.getName();
        }
    }
}
