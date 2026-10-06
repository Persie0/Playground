package p000;

import android.content.Context;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jix {

    /* JADX INFO: renamed from: a */
    public static final Method f34145a;

    /* JADX INFO: renamed from: b */
    public static final Method f34146b;

    /* JADX INFO: renamed from: c */
    private static final Method f34147c;

    /* JADX INFO: renamed from: d */
    private static final Method f34148d;

    /* JADX INFO: renamed from: e */
    private static Boolean f34149e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception e) {
            method = null;
        }
        f34147c = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception e2) {
            method2 = null;
        }
        f34148d = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e3) {
            method3 = null;
        }
        f34145a = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception e5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", new Class[0]);
        } catch (Exception e6) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e6);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e7) {
            Log.w("WorkSourceUtil", TVkaNXnfP.WOkS, e7);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", new Class[0]);
            try {
                method4.setAccessible(true);
            } catch (Exception e8) {
            }
        } catch (Exception e9) {
            method4 = null;
        }
        f34146b = method4;
        f34149e = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m13237a(WorkSource workSource, int i, String str) {
        Method method = f34148d;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = f34147c;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m13238b(Context context) {
        Boolean bool = f34149e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(abx.m170b(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
        f34149e = boolValueOf;
        return boolValueOf.booleanValue();
    }
}
