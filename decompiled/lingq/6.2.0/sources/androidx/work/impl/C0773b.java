package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.ExistingWorkPolicy;
import com.lingq.AbstractApplicationC1226a;
import java.util.List;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.by8;
import p000.cc4;
import p000.e8b;
import p000.fc3;
import p000.foa;
import p000.gl7;
import p000.hh1;
import p000.il7;
import p000.iy5;
import p000.l8b;
import p000.m83;
import p000.n83;
import p000.nn1;
import p000.oj5;
import p000.pvc;
import p000.tfa;
import p000.um8;
import p000.ux6;
import p000.vl1;
import p000.vu2;
import p000.vz1;
import p000.w7b;
import p000.w8a;
import p000.web;
import p000.y47;

/* JADX INFO: renamed from: androidx.work.impl.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0773b {

    /* JADX INFO: renamed from: k */
    public static C0773b f7201k;

    /* JADX INFO: renamed from: l */
    public static C0773b f7202l;

    /* JADX INFO: renamed from: m */
    public static final Object f7203m;

    /* JADX INFO: renamed from: a */
    public final Context f7204a;

    /* JADX INFO: renamed from: b */
    public final hh1 f7205b;

    /* JADX INFO: renamed from: c */
    public final WorkDatabase f7206c;

    /* JADX INFO: renamed from: d */
    public final e8b f7207d;

    /* JADX INFO: renamed from: e */
    public final List f7208e;

    /* JADX INFO: renamed from: f */
    public final il7 f7209f;

    /* JADX INFO: renamed from: g */
    public final cc4 f7210g;

    /* JADX INFO: renamed from: h */
    public boolean f7211h = false;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f7212i;

    /* JADX INFO: renamed from: j */
    public final w8a f7213j;

    static {
        oj5.m18041h("WorkManagerImpl");
        f7201k = null;
        f7202l = null;
        f7203m = new Object();
    }

    public C0773b(Context context, final hh1 hh1Var, e8b e8bVar, final WorkDatabase workDatabase, final List list, il7 il7Var, w8a w8aVar) {
        int i = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            C3386nv.m17633t("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        oj5 oj5Var = new oj5(hh1Var.f42354h);
        synchronized (oj5.f54462b) {
            try {
                if (oj5.f54463c == null) {
                    oj5.f54463c = oj5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7204a = applicationContext;
        this.f7207d = e8bVar;
        this.f7206c = workDatabase;
        this.f7209f = il7Var;
        this.f7213j = w8aVar;
        this.f7205b = hh1Var;
        this.f7208e = list;
        nn1 nn1Var = e8bVar.f36848b;
        nn1Var.getClass();
        vl1 vl1VarM23619a = vz1.m23619a(nn1Var);
        this.f7210g = new cc4(workDatabase);
        final by8 by8Var = e8bVar.f36847a;
        String str = um8.f64079a;
        il7Var.m14012a(new vu2() { // from class: tm8
            @Override // p000.vu2
            /* JADX INFO: renamed from: b */
            public final void mo2918b(a8b a8bVar, boolean z) {
                by8Var.execute(new oc0(list, a8bVar, hh1Var, workDatabase, 3));
            }
        });
        e8bVar.f36847a.execute(new fc3(applicationContext, this));
        String str2 = tfa.f62235a;
        if (gl7.m12735a(applicationContext, hh1Var)) {
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15525d(new n83(i, AbstractC3584sr.m21590A(workDatabase.mo2909z().f63598a, false, new String[]{"workspec"}, new foa(16)), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, null)), -1)), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(applicationContext, null), 2), vl1VarM23619a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0773b m2910c(Context context) {
        C0773b c0773bM2910c;
        Object obj = f7203m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        c0773bM2910c = f7201k;
                        if (c0773bM2910c == null) {
                            c0773bM2910c = f7202l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c0773bM2910c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0773bM2910c == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof AbstractApplicationC1226a)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m2911d(applicationContext, ((AbstractApplicationC1226a) applicationContext).m6993a());
            c0773bM2910c = m2910c(applicationContext);
        }
        return c0773bM2910c;
    }

    /* JADX INFO: renamed from: d */
    public static void m2911d(Context context, hh1 hh1Var) {
        synchronized (f7203m) {
            try {
                C0773b c0773b = f7201k;
                if (c0773b != null && f7202l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c0773b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f7202l == null) {
                        f7202l = AbstractC0774c.m2919a(applicationContext, hh1Var);
                    }
                    f7201k = f7202l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2912a(l8b l8bVar) {
        l8bVar.getClass();
        List listM23604J = vz1.m23604J(l8bVar);
        if (listM23604J.isEmpty()) {
            C3386nv.m17626m("enqueue needs at least one WorkRequest.");
        } else {
            new w7b(this, listM23604J).m23805a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final web m2913b(String str, ExistingWorkPolicy existingWorkPolicy, ux6 ux6Var) {
        existingWorkPolicy.getClass();
        ux6Var.getClass();
        return new w7b(this, str, existingWorkPolicy, vz1.m23604J(ux6Var)).m23805a();
    }

    /* JADX INFO: renamed from: e */
    public final void m2914e() {
        synchronized (f7203m) {
            try {
                this.f7211h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f7212i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f7212i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2915f() {
        iy5 iy5Var = this.f7205b.f42359m;
        y47 y47Var = new y47(this, 21);
        iy5Var.getClass();
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            try {
                pvc.m19517m("ReschedulingWork");
            } finally {
                if (zIsEnabled) {
                    Trace.endSection();
                }
            }
        }
        y47Var.mo0a();
    }
}
