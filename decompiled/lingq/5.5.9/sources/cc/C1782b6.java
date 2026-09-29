package cc;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import p176ib.C6272i;
import p260m8.C7499b;

/* JADX INFO: renamed from: cc.b6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1782b6 extends AbstractC1914q3 {

    /* JADX INFO: renamed from: c */
    public volatile C1988y5 f9685c;

    /* JADX INFO: renamed from: d */
    public volatile C1988y5 f9686d;

    /* JADX INFO: renamed from: e */
    public C1988y5 f9687e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f9688f;

    /* JADX INFO: renamed from: g */
    public Activity f9689g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f9690h;

    /* JADX INFO: renamed from: i */
    public volatile C1988y5 f9691i;

    /* JADX INFO: renamed from: j */
    public C1988y5 f9692j;

    /* JADX INFO: renamed from: k */
    public boolean f9693k;

    /* JADX INFO: renamed from: l */
    public final Object f9694l;

    public C1782b6(C1897o4 c1897o4) {
        super(c1897o4);
        this.f9694l = new Object();
        this.f9688f = new ConcurrentHashMap();
    }

    @Override // cc.AbstractC1914q3
    /* JADX INFO: renamed from: k */
    public final boolean mo5519k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX INFO: renamed from: l */
    public final void m5520l(C1988y5 c1988y5, C1988y5 c1988y6, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        mo5748g();
        boolean z12 = false;
        if (c1988y6 != null) {
            if (c1988y6.f10416c == c1988y5.f10416c && C7499b.m14913K0(c1988y6.f10415b, c1988y5.f10415b) && C7499b.m14913K0(c1988y6.f10414a, c1988y5.f10414a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f9687e != null) {
            z12 = true;
        }
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            C1900o7.m5803u(c1988y5, bundle2, true);
            if (c1988y6 != null) {
                String str = c1988y6.f10414a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c1988y6.f10415b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c1988y6.f10416c);
            }
            if (z12) {
                C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
                C1971w6 c1971w6 = c1897o4.f10088k;
                C1897o4.m5775j(c1971w6);
                C1953u6 c1953u6 = c1971w6.f10279e;
                long j12 = j10 - c1953u6.f10243b;
                c1953u6.f10243b = j10;
                if (j12 > 0) {
                    C1900o7 c1900o7 = c1897o4.f10089l;
                    C1897o4.m5774i(c1900o7);
                    c1900o7.m5842s(bundle2, j12);
                }
            }
            C1897o4 c1897o5 = (C1897o4) interfaceC1781b5;
            if (!c1897o5.f10084g.m5583r()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != c1988y5.f10418e ? "auto" : "app";
            c1897o5.f10058I.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1988y5.f10418e) {
                long j13 = c1988y5.f10419f;
                if (j13 == 0) {
                    j11 = jCurrentTimeMillis;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jCurrentTimeMillis;
            }
            C1934s5 c1934s5 = c1897o5.f10060K;
            C1897o4.m5775j(c1934s5);
            c1934s5.m5872p(j11, bundle2, str3, "_vs");
        }
        if (z12) {
            m5521m(this.f9687e, true, j10);
        }
        this.f9687e = c1988y5;
        if (c1988y5.f10418e) {
            this.f9692j = c1988y5;
        }
        C1881m6 c1881m6M5788t = ((C1897o4) interfaceC1781b5).m5788t();
        c1881m6M5788t.mo5748g();
        c1881m6M5788t.m5851h();
        c1881m6M5788t.m5766t(new RunnableC1888n4(c1881m6M5788t, 4, c1988y5));
    }

    /* JADX INFO: renamed from: m */
    public final void m5521m(C1988y5 c1988y5, boolean z10, long j10) {
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1930s1 c1930s1M5782m = c1897o4.m5782m();
        c1897o4.f10058I.getClass();
        c1930s1M5782m.m5859k(SystemClock.elapsedRealtime());
        boolean z11 = c1988y5 != null && c1988y5.f10417d;
        C1971w6 c1971w6 = c1897o4.f10088k;
        C1897o4.m5775j(c1971w6);
        if (c1971w6.f10279e.m5895a(j10, z11, z10) && c1988y5 != null) {
            c1988y5.f10417d = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1988y5 m5522n(boolean z10) {
        m5851h();
        mo5748g();
        if (!z10) {
            return this.f9687e;
        }
        C1988y5 c1988y5 = this.f9687e;
        return c1988y5 != null ? c1988y5 : this.f9692j;
    }

    /* JADX INFO: renamed from: o */
    public final String m5523o(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str.length();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        c1897o4.getClass();
        if (length2 <= 100) {
            return str;
        }
        c1897o4.getClass();
        return str.substring(0, 100);
    }

    /* JADX INFO: renamed from: p */
    public final void m5524p(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (((C1897o4) this.f10430a).f10084g.m5583r() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f9688f.put(activity, new C1988y5(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }

    /* JADX INFO: renamed from: q */
    public final C1988y5 m5525q(Activity activity) {
        C6272i.m12915i(activity);
        C1988y5 c1988y5 = (C1988y5) this.f9688f.get(activity);
        if (c1988y5 == null) {
            String strM5523o = m5523o(activity.getClass());
            C1900o7 c1900o7 = ((C1897o4) this.f10430a).f10089l;
            C1897o4.m5774i(c1900o7);
            C1988y5 c1988y6 = new C1988y5(c1900o7.m5834l0(), null, strM5523o);
            this.f9688f.put(activity, c1988y6);
            c1988y5 = c1988y6;
        }
        return this.f9691i != null ? this.f9691i : c1988y5;
    }

    /* JADX INFO: renamed from: r */
    public final void m5526r(Activity activity, C1988y5 c1988y5, boolean z10) {
        C1988y5 c1988y6;
        C1988y5 c1988y7 = this.f9685c == null ? this.f9686d : this.f9685c;
        if (c1988y5.f10415b == null) {
            c1988y6 = new C1988y5(c1988y5.f10414a, activity != null ? m5523o(activity.getClass()) : null, c1988y5.f10416c, c1988y5.f10418e, c1988y5.f10419f);
        } else {
            c1988y6 = c1988y5;
        }
        this.f9686d = this.f9685c;
        this.f9685c = c1988y6;
        ((C1897o4) this.f10430a).f10058I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1879m4 c1879m4 = ((C1897o4) this.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1996z5(this, c1988y6, c1988y7, jElapsedRealtime, z10));
    }
}
