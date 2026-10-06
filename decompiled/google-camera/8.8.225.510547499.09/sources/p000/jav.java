package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jav {

    /* JADX INFO: renamed from: a */
    public static final Object f33628a = new Object();

    /* JADX INFO: renamed from: b */
    public static jpe f33629b;

    /* JADX INFO: renamed from: c */
    static Boolean f33630c;

    /* JADX INFO: renamed from: a */
    public static boolean m12809a(Context context) {
        jib.m13205j(context);
        Boolean bool = f33630c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zM12859d = jbx.m12859d(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f33630c = Boolean.valueOf(zM12859d);
        return zM12859d;
    }
}
