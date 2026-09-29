package com.p011gu.toolargetool;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.EmptyList;
import p000.C3823z7;
import p000.c8d;
import p000.if3;
import p000.l99;
import p000.mj5;
import p000.oc3;
import p000.rj5;
import p000.ux5;
import p000.x24;

/* JADX INFO: loaded from: classes2.dex */
public final class TooLargeTool {
    public static final TooLargeTool INSTANCE = new TooLargeTool();
    private static C3823z7 activityLogger;

    private TooLargeTool() {
    }

    /* JADX INFO: renamed from: KB */
    private final float m6888KB(int i) {
        return i / 1000.0f;
    }

    public static final String bundleBreakdown(Bundle bundle) {
        bundle.getClass();
        ArrayList<l99> arrayList = new ArrayList(bundle.size());
        Bundle bundle2 = new Bundle(bundle);
        try {
            int iM4403b = c8d.m4403b(bundle);
            for (String str : bundle2.keySet()) {
                bundle.remove(str);
                int iM4403b2 = c8d.m4403b(bundle);
                str.getClass();
                arrayList.add(new l99(iM4403b - iM4403b2, str, EmptyList.f47638a));
                iM4403b = iM4403b2;
            }
            bundle.putAll(bundle2);
            String strConcat = String.format(Locale.UK, "%s contains %d keys and measures %,.1f KB when serialized as a Parcel", Arrays.copyOf(new Object[]{ux5.m22988k(System.identityHashCode(bundle), "Bundle"), Integer.valueOf(arrayList.size()), Float.valueOf(INSTANCE.m6888KB(c8d.m4403b(bundle)))}, 3));
            for (l99 l99Var : arrayList) {
                strConcat = strConcat.concat(String.format(Locale.UK, "\n* %s = %,.1f KB", Arrays.copyOf(new Object[]{l99Var.f49347a, Float.valueOf(INSTANCE.m6888KB(l99Var.f49348b))}, 2)));
            }
            return strConcat;
        } catch (Throwable th) {
            bundle.putAll(bundle2);
            throw th;
        }
    }

    public static final boolean isLogging() {
        C3823z7 c3823z7 = activityLogger;
        c3823z7.getClass();
        return c3823z7.f71000d;
    }

    public static /* synthetic */ void isLogging$annotations() {
    }

    public static final void logBundleBreakdown(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        Log.println(3, str, bundleBreakdown(bundle));
    }

    public static final void startLogging(Application application, oc3 oc3Var, rj5 rj5Var) {
        application.getClass();
        oc3Var.getClass();
        rj5Var.getClass();
        if (activityLogger == null) {
            activityLogger = new C3823z7(oc3Var, rj5Var);
        }
        C3823z7 c3823z7 = activityLogger;
        c3823z7.getClass();
        if (c3823z7.f71000d) {
            return;
        }
        C3823z7 c3823z8 = activityLogger;
        c3823z8.getClass();
        c3823z8.f71000d = true;
        if3 if3Var = c3823z8.f70998b;
        if (if3Var != null) {
            if3Var.f44039d = true;
        }
        application.registerActivityLifecycleCallbacks(activityLogger);
    }

    public static /* synthetic */ void startLogging$default(Application application, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            str = "TooLargeTool";
        }
        startLogging(application, i, str);
    }

    public static final void stopLogging(Application application) {
        application.getClass();
        C3823z7 c3823z7 = activityLogger;
        c3823z7.getClass();
        if (c3823z7.f71000d) {
            C3823z7 c3823z8 = activityLogger;
            c3823z8.getClass();
            c3823z8.f71000d = false;
            c3823z8.f70999c.clear();
            if3 if3Var = c3823z8.f70998b;
            if (if3Var != null) {
                if3Var.f44039d = false;
            }
            application.unregisterActivityLifecycleCallbacks(activityLogger);
        }
    }

    public static final void logBundleBreakdown(String str, int i, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        Log.println(i, str, bundleBreakdown(bundle));
    }

    public static final void startLogging(Application application, int i) {
        application.getClass();
        startLogging$default(application, i, null, 4, null);
    }

    public static final void startLogging(Application application, int i, String str) {
        application.getClass();
        str.getClass();
        startLogging(application, new x24(), new mj5(i, str));
    }

    public static final void startLogging(Application application) {
        application.getClass();
        startLogging$default(application, 0, null, 6, null);
    }
}
