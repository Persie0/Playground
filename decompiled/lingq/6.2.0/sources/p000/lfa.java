package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class lfa {
    /* JADX INFO: renamed from: c */
    public static View m16159c(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16160d(Context context, int i) {
        if (!m16161e(i, context, "com.google.android.gms")) {
            return false;
        }
        try {
            return wo3.m24090a(context).m24093b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16161e(int i, Context context, String str) {
        C3722wh c3722whM16702a = m9b.m16702a(context);
        c3722whM16702a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c3722whM16702a.f66813a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract pg5 mo16162a(Context context, String str, WorkerParameters workerParameters);

    /* JADX INFO: renamed from: b */
    public pg5 m16163b(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        pg5 pg5VarMo16162a = mo16162a(context, str, workerParameters);
        if (pg5VarMo16162a == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(pg5.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    pg5VarMo16162a = (pg5) objNewInstance;
                } catch (Throwable th) {
                    oj5.m18040f().m18044e(a9b.f390a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                oj5.m18040f().m18044e(a9b.f390a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!pg5VarMo16162a.m19129b()) {
            return pg5VarMo16162a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
