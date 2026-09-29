package p000;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h58 implements m53 {

    /* JADX INFO: renamed from: j */
    public static final Random f41804j = new Random();

    /* JADX INFO: renamed from: k */
    public static final HashMap f41805k = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f41807b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f41808c;

    /* JADX INFO: renamed from: d */
    public final q43 f41809d;

    /* JADX INFO: renamed from: e */
    public final x43 f41810e;

    /* JADX INFO: renamed from: f */
    public final m43 f41811f;

    /* JADX INFO: renamed from: g */
    public final uo7 f41812g;

    /* JADX INFO: renamed from: h */
    public final String f41813h;

    /* JADX INFO: renamed from: a */
    public final HashMap f41806a = new HashMap();

    /* JADX INFO: renamed from: i */
    public final HashMap f41814i = new HashMap();

    public h58(Context context, ScheduledExecutorService scheduledExecutorService, q43 q43Var, x43 x43Var, m43 m43Var, uo7 uo7Var) {
        this.f41807b = context;
        this.f41808c = scheduledExecutorService;
        this.f41809d = q43Var;
        this.f41810e = x43Var;
        this.f41811f = m43Var;
        this.f41812g = uo7Var;
        q43Var.m19644a();
        this.f41813h = q43Var.f57254c.f261b;
        AtomicReference atomicReference = g58.f40242a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = g58.f40242a;
        if (atomicReference2.get() == null) {
            g58 g58Var = new g58();
            while (!atomicReference2.compareAndSet(null, g58Var)) {
                if (atomicReference2.get() != null) {
                }
            }
            j70.m14308b(application);
            j70.f45129e.m14309a(g58Var);
        }
        Tasks.m5973a(new ng1(this, 2), scheduledExecutorService);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX INFO: renamed from: a */
    public final synchronized l53 m13057a(q43 q43Var, String str, x43 x43Var, m43 m43Var, Executor executor, qg1 qg1Var, qg1 qg1Var2, qg1 qg1Var3, xg1 xg1Var, zg1 zg1Var, eh1 eh1Var, ny8 ny8Var) {
        m43 m43Var2;
        if (!this.f41806a.containsKey(str)) {
            if (str.equals("firebase")) {
                q43Var.m19644a();
                if (q43Var.f57253b.equals("[DEFAULT]")) {
                    m43Var2 = m43Var;
                } else {
                    m43Var2 = null;
                }
            } else {
                m43Var2 = null;
            }
            Context context = this.f41807b;
            synchronized (this) {
                ScheduledExecutorService scheduledExecutorService = this.f41808c;
                b64 b64Var = new b64();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                b64Var.f8006a = linkedHashSet;
                b64Var.f8007b = new ch1(q43Var, x43Var, xg1Var, qg1Var2, context, str, linkedHashSet, eh1Var, scheduledExecutorService);
                l53 l53Var = new l53(m43Var2, executor, qg1Var, qg1Var2, qg1Var3, xg1Var, zg1Var, eh1Var, b64Var, ny8Var);
                qg1Var2.m19940b();
                qg1Var3.m19940b();
                qg1Var.m19940b();
                this.f41806a.put(str, l53Var);
                f41805k.put(str, l53Var);
            }
        }
        return (l53) this.f41806a.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    /* JADX INFO: renamed from: b */
    public final synchronized l53 m13058b(String str) throws Throwable {
        Throwable th;
        fs6 fs6Var;
        try {
            try {
                qg1 qg1VarM13059c = m13059c(str, "fetch");
                qg1 qg1VarM13059c2 = m13059c(str, "activate");
                qg1 qg1VarM13059c3 = m13059c(str, "defaults");
                try {
                    eh1 eh1Var = new eh1(this.f41807b.getSharedPreferences("frc_" + this.f41813h + "_" + str + "_settings", 0));
                    zg1 zg1Var = new zg1(this.f41808c, qg1VarM13059c2, qg1VarM13059c3);
                    q43 q43Var = this.f41809d;
                    uo7 uo7Var = this.f41812g;
                    q43Var.m19644a();
                    if (q43Var.f57253b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                fs6Var = new fs6(uo7Var);
                            } else {
                                fs6Var = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        fs6Var = null;
                    }
                    if (fs6Var != null) {
                        f58 f58Var = new f58(fs6Var);
                        synchronized (zg1Var.f71517a) {
                            zg1Var.f71517a.add(f58Var);
                        }
                    }
                    fs6 fs6Var2 = new fs6(16);
                    fs6Var2.f39590b = qg1VarM13059c2;
                    fs6Var2.f39591c = qg1VarM13059c3;
                    ScheduledExecutorService scheduledExecutorService = this.f41808c;
                    ny8 ny8Var = new ny8(10);
                    ny8Var.f53417e = Collections.newSetFromMap(new ConcurrentHashMap());
                    ny8Var.f53414b = qg1VarM13059c2;
                    ny8Var.f53415c = fs6Var2;
                    ny8Var.f53416d = scheduledExecutorService;
                    return m13057a(this.f41809d, str, this.f41810e, this.f41811f, this.f41808c, qg1VarM13059c, qg1VarM13059c2, qg1VarM13059c3, m13060d(str, qg1VarM13059c, eh1Var), zg1Var, eh1Var, ny8Var);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final qg1 m13059c(String str, String str2) {
        fh1 fh1Var;
        qg1 qg1Var;
        String strM17738m = AbstractC3393o1.m17738m(ux5.m23000w("frc_", this.f41813h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f41808c;
        Context context = this.f41807b;
        HashMap map = fh1.f39100c;
        synchronized (fh1.class) {
            try {
                HashMap map2 = fh1.f39100c;
                if (!map2.containsKey(strM17738m)) {
                    map2.put(strM17738m, new fh1(context, strM17738m));
                }
                fh1Var = (fh1) map2.get(strM17738m);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = qg1.f57741d;
        synchronized (qg1.class) {
            try {
                String str3 = fh1Var.f39102b;
                HashMap map4 = qg1.f57741d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new qg1(scheduledExecutorService, fh1Var));
                }
                qg1Var = (qg1) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qg1Var;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized xg1 m13060d(String str, qg1 qg1Var, eh1 eh1Var) {
        x43 x43Var;
        Object cd1Var;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        q43 q43Var;
        try {
            x43Var = this.f41810e;
            q43 q43Var2 = this.f41809d;
            q43Var2.m19644a();
            cd1Var = q43Var2.f57253b.equals("[DEFAULT]") ? this.f41812g : new cd1(9);
            scheduledExecutorService = this.f41808c;
            random = f41804j;
            q43 q43Var3 = this.f41809d;
            q43Var3.m19644a();
            str2 = q43Var3.f57254c.f260a;
            q43Var = this.f41809d;
            q43Var.m19644a();
        } catch (Throwable th) {
            throw th;
        }
        return new xg1(x43Var, cd1Var, scheduledExecutorService, random, qg1Var, new ConfigFetchHttpClient(this.f41807b, q43Var.f57254c.f261b, str2, str, eh1Var.f37250a.getLong("fetch_timeout_in_seconds", 60L), eh1Var.f37250a.getLong("fetch_timeout_in_seconds", 60L)), eh1Var, this.f41814i);
    }
}
