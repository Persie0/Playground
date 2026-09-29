package com.google.android.gms.common.wrappers;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class InstantApps {

    /* JADX INFO: renamed from: a */
    public static Context f14001a;

    /* JADX INFO: renamed from: b */
    public static Boolean f14002b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static synchronized boolean isInstantApp(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f14001a;
        if (context2 != null && (bool = f14002b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f14002b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f14002b = boolValueOf;
        f14001a = applicationContext;
        return boolValueOf.booleanValue();
    }
}
