package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.common.base.AbstractC1083c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class kjc implements uoc {

    /* JADX INFO: renamed from: a0 */
    public static volatile kjc f47413a0;

    /* JADX INFO: renamed from: H */
    public final C1043b f47414H;

    /* JADX INFO: renamed from: I */
    public final jwb f47415I;

    /* JADX INFO: renamed from: J */
    public final fyc f47416J;

    /* JADX INFO: renamed from: K */
    public final String f47417K;

    /* JADX INFO: renamed from: L */
    public jbc f47418L;

    /* JADX INFO: renamed from: M */
    public v4d f47419M;

    /* JADX INFO: renamed from: N */
    public qob f47420N;

    /* JADX INFO: renamed from: O */
    public tac f47421O;

    /* JADX INFO: renamed from: P */
    public oyc f47422P;

    /* JADX INFO: renamed from: R */
    public Boolean f47424R;

    /* JADX INFO: renamed from: S */
    public long f47425S;

    /* JADX INFO: renamed from: T */
    public volatile Boolean f47426T;

    /* JADX INFO: renamed from: U */
    public volatile boolean f47427U;

    /* JADX INFO: renamed from: V */
    public int f47428V;

    /* JADX INFO: renamed from: W */
    public int f47429W;

    /* JADX INFO: renamed from: Y */
    public final long f47431Y;

    /* JADX INFO: renamed from: Z */
    public final long f47432Z;

    /* JADX INFO: renamed from: a */
    public final Context f47433a;

    /* JADX INFO: renamed from: b */
    public final boolean f47434b;

    /* JADX INFO: renamed from: c */
    public final s46 f47435c;

    /* JADX INFO: renamed from: d */
    public final cmb f47436d;

    /* JADX INFO: renamed from: e */
    public final qfc f47437e;

    /* JADX INFO: renamed from: f */
    public final xcc f47438f;

    /* JADX INFO: renamed from: g */
    public final tic f47439g;

    /* JADX INFO: renamed from: h */
    public final s6d f47440h;

    /* JADX INFO: renamed from: i */
    public final rad f47441i;

    /* JADX INFO: renamed from: j */
    public final rbc f47442j;

    /* JADX INFO: renamed from: k */
    public final gr7 f47443k;

    /* JADX INFO: renamed from: l */
    public final j0d f47444l;

    /* JADX INFO: renamed from: Q */
    public boolean f47423Q = false;

    /* JADX INFO: renamed from: X */
    public final AtomicInteger f47430X = new AtomicInteger(0);

    public kjc(d74 d74Var) {
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context applicationContext;
        Context context = d74Var.f35077a;
        s46 s46Var = new s46(18);
        this.f47435c = s46Var;
        bma.f8697b = s46Var;
        this.f47433a = context;
        this.f47434b = d74Var.f35079c;
        this.f47426T = (Boolean) d74Var.f35081e;
        this.f47417K = d74Var.f35080d;
        this.f47427U = true;
        if (kzc.f48831b == null && context != null) {
            Object obj = kzc.f48830a;
            synchronized (obj) {
                try {
                    if (kzc.f48831b == null) {
                        synchronized (obj) {
                            try {
                                kwc kwcVar = kzc.f48831b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (kwcVar == null || kwcVar.f48530a != applicationContext2) {
                                    if (kwcVar != null) {
                                        owc.m18544a();
                                        g0d.m12275a();
                                    }
                                    kzc.f48831b = new kwc(applicationContext2, AbstractC1083c.m6269a(new uxc(applicationContext2, 2)));
                                    kzc.f48832c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f47443k = gr7.f41237b;
        ltc ltcVar = new ltc(context, grc.f41252a, InterfaceC3691vn.f65627m, mo3.f51630c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        i44 i44VarM13651b = i44.m13651b();
        i44VarM13651b.f43482c = new qfa(strConcat, new String[0]);
        ltcVar.m17569c(0, i44VarM13651b.m13652a());
        AtomicReference atomicReference = C0962f.f11841k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                C0962f.m5408b();
                t9a.m21916f(Level.WARNING, (Executor) C0962f.f11843m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = (Long) d74Var.f35083g;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.f47443k.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f47431Y = jCurrentTimeMillis;
        Long l2 = (Long) d74Var.f35084h;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.f47443k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f47432Z = jElapsedRealtime;
        cmb cmbVar = new cmb(this);
        cmbVar.f10289d = ho5.f42688H;
        this.f47436d = cmbVar;
        qfc qfcVar = new qfc(this);
        qfcVar.m18193G();
        this.f47437e = qfcVar;
        xcc xccVar = new xcc(this);
        xccVar.m18193G();
        this.f47438f = xccVar;
        rad radVar = new rad(this);
        radVar.m18193G();
        this.f47441i = radVar;
        this.f47442j = new rbc(new ggc(d74Var, this));
        this.f47415I = new jwb(this);
        j0d j0dVar = new j0d(this);
        j0dVar.m13745F();
        this.f47444l = j0dVar;
        C1043b c1043b = new C1043b(this);
        c1043b.m13745F();
        this.f47414H = c1043b;
        s6d s6dVar = new s6d(this);
        s6dVar.m13745F();
        this.f47440h = s6dVar;
        fyc fycVar = new fyc(this);
        fycVar.m18193G();
        this.f47416J = fycVar;
        tic ticVar = new tic(this);
        ticVar.m18193G();
        this.f47439g = ticVar;
        zzdb zzdbVar = (zzdb) d74Var.f35082f;
        boolean z = zzdbVar == null || zzdbVar.f11875b == 0;
        if (this.f47433a.getApplicationContext() instanceof Application) {
            m15279k(c1043b);
            if (((kjc) c1043b.f60774a).f47433a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((kjc) c1043b.f60774a).f47433a.getApplicationContext();
                if (c1043b.f12325c == null) {
                    c1043b.f12325c = new C3600t6(c1043b, 4);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(c1043b.f12325c);
                    application.registerActivityLifecycleCallbacks(c1043b.f12325c);
                    xcc xccVar2 = ((kjc) c1043b.f60774a).f47438f;
                    m15280l(xccVar2);
                    xccVar2.f68076I.m17923a("Registered activity lifecycle callback");
                }
            }
        } else {
            m15280l(xccVar);
            xccVar.f68083i.m17923a("Application context is not an Application");
        }
        ticVar.m22076M(new u62(7, this, d74Var));
    }

    /* JADX INFO: renamed from: i */
    public static final void m15277i(g4c g4cVar) {
        if (g4cVar != null) {
            return;
        }
        C3386nv.m17633t("Component not created");
    }

    /* JADX INFO: renamed from: j */
    public static final void m15278j(AbstractC3572sf abstractC3572sf) {
        if (abstractC3572sf != null) {
            return;
        }
        C3386nv.m17633t("Component not created");
    }

    /* JADX INFO: renamed from: k */
    public static final void m15279k(i9c i9cVar) {
        if (i9cVar == null) {
            C3386nv.m17633t("Component not created");
        } else {
            if (i9cVar.f43749b) {
                return;
            }
            C3386nv.m17633t("Component not initialized: ".concat(String.valueOf(i9cVar.getClass())));
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m15280l(ooc oocVar) {
        if (oocVar == null) {
            C3386nv.m17633t("Component not created");
        } else {
            if (oocVar.f54663b) {
                return;
            }
            C3386nv.m17633t("Component not initialized: ".concat(String.valueOf(oocVar.getClass())));
        }
    }

    /* JADX INFO: renamed from: r */
    public static kjc m15281r(Context context, zzdb zzdbVar, Long l, Long l2) {
        Bundle bundle;
        if (zzdbVar != null) {
            Bundle bundle2 = zzdbVar.f11877d;
            zzdbVar = new zzdb(zzdbVar.f11874a, zzdbVar.f11875b, zzdbVar.f11876c, bundle2, null);
        }
        lda.m16130p(context);
        lda.m16130p(context.getApplicationContext());
        if (f47413a0 == null) {
            synchronized (kjc.class) {
                try {
                    if (f47413a0 == null) {
                        f47413a0 = new kjc(new d74(context, zzdbVar, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzdbVar != null && (bundle = zzdbVar.f11877d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            lda.m16130p(f47413a0);
            f47413a0.f47426T = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        lda.m16130p(f47413a0);
        return f47413a0;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: a */
    public final s46 mo5907a() {
        return this.f47435c;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: b */
    public final xcc mo5909b() {
        xcc xccVar = this.f47438f;
        m15280l(xccVar);
        return xccVar;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: c */
    public final gr7 mo5911c() {
        return this.f47443k;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: d */
    public final tic mo5913d() {
        tic ticVar = this.f47439g;
        m15280l(ticVar);
        return ticVar;
    }

    @Override // p000.uoc
    /* JADX INFO: renamed from: e */
    public final Context mo5915e() {
        return this.f47433a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15282f() {
        return m15283g() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m15283g() {
        tic ticVar = this.f47439g;
        m15280l(ticVar);
        ticVar.mo12359D();
        cmb cmbVar = this.f47436d;
        if (cmbVar.m4872R()) {
            return 1;
        }
        m15280l(ticVar);
        ticVar.mo12359D();
        if (!this.f47427U) {
            return 8;
        }
        qfc qfcVar = this.f47437e;
        m15278j(qfcVar);
        qfcVar.mo12359D();
        Boolean boolValueOf = qfcVar.m19930H().contains("measurement_enabled") ? Boolean.valueOf(qfcVar.m19930H().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        s46 s46Var = ((kjc) cmbVar.f60774a).f47435c;
        Boolean boolM4871Q = cmbVar.m4871Q("firebase_analytics_collection_enabled");
        if (boolM4871Q != null) {
            return boolM4871Q.booleanValue() ? 0 : 4;
        }
        return (this.f47426T == null || this.f47426T.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX INFO: renamed from: h */
    public final boolean m15284h() {
        rad radVar;
        Context context;
        boolean z = false;
        if (!this.f47423Q) {
            C3386nv.m17633t("AppMeasurement is not initialized");
            return false;
        }
        tic ticVar = this.f47439g;
        m15280l(ticVar);
        ticVar.mo12359D();
        Boolean bool = this.f47424R;
        gr7 gr7Var = this.f47443k;
        if (bool == null || this.f47425S == 0) {
            gr7Var.getClass();
            this.f47425S = SystemClock.elapsedRealtime();
            radVar = this.f47441i;
            m15278j(radVar);
            if (radVar.m20543f0("android.permission.INTERNET") && radVar.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f47433a;
                if (m9b.m16702a(context).m23950c() || this.f47436d.m4861G() || (rad.m20513x0(context) && rad.m20506Y(context))) {
                    z = true;
                }
            }
            this.f47424R = Boolean.valueOf(z);
            if (z) {
                this.f47424R = Boolean.valueOf(radVar.m20524J(m15289q().m21929K()));
            }
        } else if (!bool.booleanValue()) {
            gr7Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f47425S) > 1000) {
                gr7Var.getClass();
                this.f47425S = SystemClock.elapsedRealtime();
                radVar = this.f47441i;
                m15278j(radVar);
                if (radVar.m20543f0("android.permission.INTERNET")) {
                    context = this.f47433a;
                    if (m9b.m16702a(context).m23950c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.f47424R = Boolean.valueOf(z);
                if (z) {
                    this.f47424R = Boolean.valueOf(radVar.m20524J(m15289q().m21929K()));
                }
            }
        }
        return this.f47424R.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final rbc m15285m() {
        return this.f47442j;
    }

    /* JADX INFO: renamed from: n */
    public final jbc m15286n() {
        m15279k(this.f47418L);
        return this.f47418L;
    }

    /* JADX INFO: renamed from: o */
    public final v4d m15287o() {
        m15279k(this.f47419M);
        return this.f47419M;
    }

    /* JADX INFO: renamed from: p */
    public final qob m15288p() {
        m15280l(this.f47420N);
        return this.f47420N;
    }

    /* JADX INFO: renamed from: q */
    public final tac m15289q() {
        m15279k(this.f47421O);
        return this.f47421O;
    }
}
