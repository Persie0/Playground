package p000;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.C0778d;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class il7 {

    /* JADX INFO: renamed from: l */
    public static final String f44266l = oj5.m18041h("Processor");

    /* JADX INFO: renamed from: b */
    public final Context f44268b;

    /* JADX INFO: renamed from: c */
    public final hh1 f44269c;

    /* JADX INFO: renamed from: d */
    public final e8b f44270d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f44271e;

    /* JADX INFO: renamed from: g */
    public final HashMap f44273g = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f44272f = new HashMap();

    /* JADX INFO: renamed from: i */
    public final HashSet f44275i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final ArrayList f44276j = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f44267a = null;

    /* JADX INFO: renamed from: k */
    public final Object f44277k = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f44274h = new HashMap();

    public il7(Context context, hh1 hh1Var, e8b e8bVar, WorkDatabase workDatabase) {
        this.f44268b = context;
        this.f44269c = hh1Var;
        this.f44270d = e8bVar;
        this.f44271e = workDatabase;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14011d(String str, C0778d c0778d, int i) {
        String str2 = f44266l;
        if (c0778d == null) {
            oj5.m18040f().m18042a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c0778d.m2926b(i);
        oj5.m18040f().m18042a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m14012a(vu2 vu2Var) {
        synchronized (this.f44277k) {
            this.f44276j.add(vu2Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0778d m14013b(String str) {
        C0778d c0778d = (C0778d) this.f44272f.remove(str);
        boolean z = c0778d != null;
        if (!z) {
            c0778d = (C0778d) this.f44273g.remove(str);
        }
        this.f44274h.remove(str);
        if (z) {
            synchronized (this.f44277k) {
                try {
                    if (this.f44272f.isEmpty()) {
                        try {
                            this.f44268b.startService(op9.m18197d(this.f44268b));
                        } catch (Throwable th) {
                            oj5.m18040f().m18044e(f44266l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f44267a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f44267a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c0778d;
    }

    /* JADX INFO: renamed from: c */
    public final C0778d m14014c(String str) {
        C0778d c0778d = (C0778d) this.f44272f.get(str);
        return c0778d == null ? (C0778d) this.f44273g.get(str) : c0778d;
    }
}
