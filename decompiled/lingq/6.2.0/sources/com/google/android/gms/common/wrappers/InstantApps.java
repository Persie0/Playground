package com.google.android.gms.common.wrappers;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class InstantApps {

    /* JADX INFO: renamed from: a */
    public static Context f11756a;

    /* JADX INFO: renamed from: b */
    public static Boolean f11757b;

    public static synchronized boolean isInstantApp(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f11756a;
        if (context2 != null && (bool = f11757b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f11757b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f11757b = boolValueOf;
        f11756a = applicationContext;
        return boolValueOf.booleanValue();
    }
}
