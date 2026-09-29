package p000;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m8b {

    /* JADX INFO: renamed from: a */
    public static final Method f50768a;

    /* JADX INFO: renamed from: b */
    public static final Method f50769b;

    /* JADX INFO: renamed from: c */
    public static Boolean f50770c;

    static {
        Method method;
        Method method2;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f50768a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f50769b = method2;
        try {
            WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
        }
        try {
            WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
        } catch (Exception unused6) {
        }
        f50770c = null;
    }
}
