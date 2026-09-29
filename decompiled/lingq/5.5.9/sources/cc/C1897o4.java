package cc;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC2886w4;
import com.google.android.gms.internal.measurement.C2630d5;
import com.google.android.gms.internal.measurement.C2643e4;
import com.google.android.gms.internal.measurement.C2671g4;
import com.google.android.gms.internal.measurement.C2727k4;
import com.google.android.gms.internal.measurement.C2899x4;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import p041c5.C1702c;
import p080e.C5288t;
import p176ib.C6272i;
import p260m8.C7499b;
import p262mb.InterfaceC7528a;
import p295ob.C8032b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.o4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1897o4 implements InterfaceC1781b5 {

    /* JADX INFO: renamed from: c0 */
    public static volatile C1897o4 f10056c0;

    /* JADX INFO: renamed from: H */
    public final C1815f3 f10057H;

    /* JADX INFO: renamed from: I */
    public final C7499b f10058I;

    /* JADX INFO: renamed from: J */
    public final C1782b6 f10059J;

    /* JADX INFO: renamed from: K */
    public final C1934s5 f10060K;

    /* JADX INFO: renamed from: L */
    public final C1930s1 f10061L;

    /* JADX INFO: renamed from: M */
    public final C1970w5 f10062M;

    /* JADX INFO: renamed from: N */
    public final String f10063N;

    /* JADX INFO: renamed from: O */
    public C1806e3 f10064O;

    /* JADX INFO: renamed from: P */
    public C1881m6 f10065P;

    /* JADX INFO: renamed from: Q */
    public C1883n f10066Q;

    /* JADX INFO: renamed from: R */
    public C1788c3 f10067R;

    /* JADX INFO: renamed from: T */
    public Boolean f10069T;

    /* JADX INFO: renamed from: U */
    public long f10070U;

    /* JADX INFO: renamed from: V */
    public volatile Boolean f10071V;

    /* JADX INFO: renamed from: W */
    public final Boolean f10072W;

    /* JADX INFO: renamed from: X */
    public final Boolean f10073X;

    /* JADX INFO: renamed from: Y */
    public volatile boolean f10074Y;

    /* JADX INFO: renamed from: Z */
    public int f10075Z;

    /* JADX INFO: renamed from: a */
    public final Context f10076a;

    /* JADX INFO: renamed from: b */
    public final String f10078b;

    /* JADX INFO: renamed from: b0 */
    public final long f10079b0;

    /* JADX INFO: renamed from: c */
    public final String f10080c;

    /* JADX INFO: renamed from: d */
    public final String f10081d;

    /* JADX INFO: renamed from: e */
    public final boolean f10082e;

    /* JADX INFO: renamed from: f */
    public final C8573r0 f10083f;

    /* JADX INFO: renamed from: g */
    public final C1802e f10084g;

    /* JADX INFO: renamed from: h */
    public final C1986y3 f10085h;

    /* JADX INFO: renamed from: i */
    public final C1860k3 f10086i;

    /* JADX INFO: renamed from: j */
    public final C1879m4 f10087j;

    /* JADX INFO: renamed from: k */
    public final C1971w6 f10088k;

    /* JADX INFO: renamed from: l */
    public final C1900o7 f10089l;

    /* JADX INFO: renamed from: S */
    public boolean f10068S = false;

    /* JADX INFO: renamed from: a0 */
    public final AtomicInteger f10077a0 = new AtomicInteger(0);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C1897o4(C1808e5 c1808e5) {
        Context context;
        Bundle bundle;
        int i10 = 0;
        Context context2 = c1808e5.f9773a;
        C8573r0 c8573r0 = new C8573r0((Object) null);
        this.f10083f = c8573r0;
        C7499b.f41429d = c8573r0;
        this.f10076a = context2;
        this.f10078b = c1808e5.f9774b;
        this.f10080c = c1808e5.f9775c;
        this.f10081d = c1808e5.f9776d;
        this.f10082e = c1808e5.f9780h;
        this.f10071V = c1808e5.f9777e;
        this.f10063N = c1808e5.f9782j;
        boolean z10 = true;
        this.f10074Y = true;
        zzcl zzclVar = c1808e5.f9779g;
        if (zzclVar != null && (bundle = zzclVar.f14535g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f10072W = (Boolean) obj;
            }
            Object obj2 = zzclVar.f14535g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f10073X = (Boolean) obj2;
            }
        }
        if (AbstractC2886w4.f14485g == null && context2 != null) {
            Object obj3 = AbstractC2886w4.f14484f;
            synchronized (obj3) {
                if (AbstractC2886w4.f14485g == null) {
                    synchronized (obj3) {
                        C2643e4 c2643e4 = AbstractC2886w4.f14485g;
                        Context applicationContext = context2.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context2;
                        }
                        if (c2643e4 == null || c2643e4.f14167a != applicationContext) {
                            C2671g4.m7844c();
                            C2899x4.m8411a();
                            synchronized (C2727k4.class) {
                                try {
                                    C2727k4 c2727k4 = C2727k4.f14288c;
                                    if (c2727k4 != null && (context = c2727k4.f14289a) != null && c2727k4.f14290b != null) {
                                        context.getContentResolver().unregisterContentObserver(C2727k4.f14288c.f14290b);
                                    }
                                    C2727k4.f14288c = null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            AbstractC2886w4.f14485g = new C2643e4(applicationContext, C2630d5.m7749b(new C1702c(applicationContext)));
                            AbstractC2886w4.f14486h.incrementAndGet();
                        }
                    }
                }
            }
        }
        this.f10058I = C7499b.f41437l;
        Long l10 = c1808e5.f9781i;
        this.f10079b0 = l10 != null ? l10.longValue() : System.currentTimeMillis();
        this.f10084g = new C1802e(this);
        C1986y3 c1986y3 = new C1986y3(this);
        c1986y3.m5493k();
        this.f10085h = c1986y3;
        C1860k3 c1860k3 = new C1860k3(this);
        c1860k3.m5493k();
        this.f10086i = c1860k3;
        C1900o7 c1900o7 = new C1900o7(this);
        c1900o7.m5493k();
        this.f10089l = c1900o7;
        this.f10057H = new C1815f3(new C5288t(this));
        this.f10061L = new C1930s1(this);
        C1782b6 c1782b6 = new C1782b6(this);
        c1782b6.m5852j();
        this.f10059J = c1782b6;
        C1934s5 c1934s5 = new C1934s5(this);
        c1934s5.m5852j();
        this.f10060K = c1934s5;
        C1971w6 c1971w6 = new C1971w6(this);
        c1971w6.m5852j();
        this.f10088k = c1971w6;
        C1970w5 c1970w5 = new C1970w5(this);
        c1970w5.m5493k();
        this.f10062M = c1970w5;
        C1879m4 c1879m4 = new C1879m4(this);
        c1879m4.m5493k();
        this.f10087j = c1879m4;
        zzcl zzclVar2 = c1808e5.f9779g;
        if (zzclVar2 != null && zzclVar2.f14530b != 0) {
            z10 = false;
        }
        if (context2.getApplicationContext() instanceof Application) {
            m5775j(c1934s5);
            if (((C1897o4) c1934s5.f10430a).f10076a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C1897o4) c1934s5.f10430a).f10076a.getApplicationContext();
                if (c1934s5.f10189c == null) {
                    c1934s5.f10189c = new C1925r5(c1934s5);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(c1934s5.f10189c);
                    application.registerActivityLifecycleCallbacks(c1934s5.f10189c);
                    C1860k3 c1860k4 = ((C1897o4) c1934s5.f10430a).f10086i;
                    m5776k(c1860k4);
                    c1860k4.f9938I.m5623a("Registered activity lifecycle callback");
                }
            }
        } else {
            m5776k(c1860k3);
            c1860k3.f9945i.m5623a("Application context is not an Application");
        }
        c1879m4.m5753p(new RunnableC1888n4(this, i10, c1808e5));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static final void m5774i(AbstractC1772a5 abstractC1772a5) {
        if (abstractC1772a5 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m5775j(AbstractC1914q3 abstractC1914q3) {
        if (abstractC1914q3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1914q3.f10143b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1914q3.getClass())));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m5776k(AbstractC1772a5 abstractC1772a5) {
        if (abstractC1772a5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1772a5.f9672b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1772a5.getClass())));
        }
    }

    /* JADX INFO: renamed from: s */
    public static C1897o4 m5777s(Context context, zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f14533e == null || zzclVar.f14534f == null)) {
            zzclVar = new zzcl(zzclVar.f14529a, zzclVar.f14530b, zzclVar.f14531c, zzclVar.f14532d, null, null, zzclVar.f14535g, null);
        }
        C6272i.m12915i(context);
        C6272i.m12915i(context.getApplicationContext());
        if (f10056c0 == null) {
            synchronized (C1897o4.class) {
                if (f10056c0 == null) {
                    f10056c0 = new C1897o4(new C1808e5(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f14535g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C6272i.m12915i(f10056c0);
            f10056c0.f10071V = Boolean.valueOf(zzclVar.f14535g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C6272i.m12915i(f10056c0);
        return f10056c0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5778a() {
        this.f10077a0.incrementAndGet();
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: b */
    public final InterfaceC7528a mo5514b() {
        return this.f10058I;
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: c */
    public final C8573r0 mo5515c() {
        return this.f10083f;
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: d */
    public final Context mo5516d() {
        return this.f10076a;
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: e */
    public final C1860k3 mo5517e() {
        C1860k3 c1860k3 = this.f10086i;
        m5776k(c1860k3);
        return c1860k3;
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: f */
    public final C1879m4 mo5518f() {
        C1879m4 c1879m4 = this.f10087j;
        m5776k(c1879m4);
        return c1879m4;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5779g() {
        return m5781l() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x003c, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m5780h() {
        C1900o7 c1900o7;
        boolean z10;
        Boolean boolValueOf;
        String strM5531n;
        C1788c3 c1788c3M5785p;
        boolean z11;
        boolean z12;
        ServiceInfo serviceInfo;
        if (!this.f10068S) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C1879m4 c1879m4 = this.f10087j;
        m5776k(c1879m4);
        c1879m4.mo5748g();
        Boolean bool = this.f10069T;
        C7499b c7499b = this.f10058I;
        if (bool == null || this.f10070U == 0) {
            c7499b.getClass();
            this.f10070U = SystemClock.elapsedRealtime();
            c1900o7 = this.f10089l;
            m5774i(c1900o7);
            if (c1900o7.m5821Q("android.permission.INTERNET") || !c1900o7.m5821Q("android.permission.ACCESS_NETWORK_STATE")) {
                z10 = false;
            } else {
                Context context = this.f10076a;
                if (!C8032b.m15902a(context).m15901c() && !this.f10084g.m5586u()) {
                    if (C1900o7.m5794X(context)) {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            z12 = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (z12) {
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            }
            boolValueOf = Boolean.valueOf(z10);
            this.f10069T = boolValueOf;
            if (boolValueOf.booleanValue()) {
                strM5531n = m5785p().m5531n();
                c1788c3M5785p = m5785p();
                c1788c3M5785p.m5851h();
                if (!c1900o7.m5813I(strM5531n, c1788c3M5785p.f9700H)) {
                    C1788c3 c1788c3M5785p2 = m5785p();
                    c1788c3M5785p2.m5851h();
                    z11 = TextUtils.isEmpty(c1788c3M5785p2.f9700H) ? false : true;
                }
                this.f10069T = Boolean.valueOf(z11);
            }
        } else if (!bool.booleanValue()) {
            c7499b.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f10070U) > 1000) {
                c7499b.getClass();
                this.f10070U = SystemClock.elapsedRealtime();
                c1900o7 = this.f10089l;
                m5774i(c1900o7);
                if (c1900o7.m5821Q("android.permission.INTERNET")) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolValueOf = Boolean.valueOf(z10);
                this.f10069T = boolValueOf;
                if (boolValueOf.booleanValue()) {
                    strM5531n = m5785p().m5531n();
                    c1788c3M5785p = m5785p();
                    c1788c3M5785p.m5851h();
                    if (!c1900o7.m5813I(strM5531n, c1788c3M5785p.f9700H)) {
                        C1788c3 c1788c3M5785p3 = m5785p();
                        c1788c3M5785p3.m5851h();
                        if (TextUtils.isEmpty(c1788c3M5785p3.f9700H)) {
                        }
                    }
                    this.f10069T = Boolean.valueOf(z11);
                }
            }
        }
        return this.f10069T.booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final int m5781l() {
        C1879m4 c1879m4 = this.f10087j;
        m5776k(c1879m4);
        c1879m4.mo5748g();
        if (this.f10084g.m5584s()) {
            return 1;
        }
        Boolean bool = this.f10073X;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C1879m4 c1879m5 = this.f10087j;
        m5776k(c1879m5);
        c1879m5.mo5748g();
        if (!this.f10074Y) {
            return 8;
        }
        C1986y3 c1986y3 = this.f10085h;
        m5774i(c1986y3);
        Boolean boolM5920o = c1986y3.m5920o();
        if (boolM5920o != null) {
            return boolM5920o.booleanValue() ? 0 : 3;
        }
        C1802e c1802e = this.f10084g;
        C8573r0 c8573r0 = ((C1897o4) c1802e.f10430a).f10083f;
        Boolean boolM5581p = c1802e.m5581p("firebase_analytics_collection_enabled");
        if (boolM5581p != null) {
            return boolM5581p.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f10072W;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f10071V == null || this.f10071V.booleanValue()) ? 0 : 7;
    }

    @Pure
    /* JADX INFO: renamed from: m */
    public final C1930s1 m5782m() {
        C1930s1 c1930s1 = this.f10061L;
        if (c1930s1 != null) {
            return c1930s1;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* JADX INFO: renamed from: n */
    public final C1802e m5783n() {
        return this.f10084g;
    }

    @Pure
    /* JADX INFO: renamed from: o */
    public final C1883n m5784o() {
        m5776k(this.f10066Q);
        return this.f10066Q;
    }

    @Pure
    /* JADX INFO: renamed from: p */
    public final C1788c3 m5785p() {
        m5775j(this.f10067R);
        return this.f10067R;
    }

    @Pure
    /* JADX INFO: renamed from: q */
    public final C1806e3 m5786q() {
        m5775j(this.f10064O);
        return this.f10064O;
    }

    @Pure
    /* JADX INFO: renamed from: r */
    public final C1815f3 m5787r() {
        return this.f10057H;
    }

    @Pure
    /* JADX INFO: renamed from: t */
    public final C1881m6 m5788t() {
        m5775j(this.f10065P);
        return this.f10065P;
    }
}
