package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j0d extends i9c {

    /* JADX INFO: renamed from: c */
    public volatile bzc f44861c;

    /* JADX INFO: renamed from: d */
    public volatile bzc f44862d;

    /* JADX INFO: renamed from: e */
    public bzc f44863e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f44864f;

    /* JADX INFO: renamed from: g */
    public zzdd f44865g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f44866h;

    /* JADX INFO: renamed from: i */
    public volatile bzc f44867i;

    /* JADX INFO: renamed from: j */
    public bzc f44868j;

    /* JADX INFO: renamed from: k */
    public boolean f44869k;

    /* JADX INFO: renamed from: l */
    public final Object f44870l;

    public j0d(kjc kjcVar) {
        super(kjcVar);
        this.f44870l = new Object();
        this.f44864f = new ConcurrentHashMap();
    }

    @Override // p000.i9c
    /* JADX INFO: renamed from: G */
    public final boolean mo5850G() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final bzc m14237H(boolean z) {
        m13744E();
        mo12359D();
        bzc bzcVar = this.f44863e;
        return (z && bzcVar == null) ? this.f44868j : bzcVar;
    }

    /* JADX INFO: renamed from: I */
    public final String m14238I(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        kjc kjcVar = (kjc) this.f60774a;
        int length2 = str2.length();
        kjcVar.f47436d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        kjcVar.f47436d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX INFO: renamed from: J */
    public final void m14239J(bzc bzcVar, bzc bzcVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = bzcVar.f9212e;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        boolean z4 = false;
        if (bzcVar2 != null) {
            if (bzcVar2.f9210c == bzcVar.f9210c && Objects.equals(bzcVar2.f9209b, bzcVar.f9209b) && Objects.equals(bzcVar2.f9208a, bzcVar.f9208a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f44863e != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            rad.m20514y0(bzcVar, bundle3, true);
            if (bzcVar2 != null) {
                String str = bzcVar2.f9208a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = bzcVar2.f9209b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", bzcVar2.f9210c);
            }
            if (z4) {
                s6d s6dVar = kjcVar.f47440h;
                kjc.m15279k(s6dVar);
                zoa zoaVar = s6dVar.f60442f;
                long j3 = j - zoaVar.f71909b;
                zoaVar.f71909b = j;
                if (j3 > 0) {
                    rad radVar = kjcVar.f47441i;
                    kjc.m15278j(radVar);
                    radVar.m20550o0(bundle3, j3);
                }
            }
            cmb cmbVar = kjcVar.f47436d;
            gr7 gr7Var = kjcVar.f47443k;
            if (!cmbVar.m4873S()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            gr7Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = bzcVar.f9213f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = kjcVar.f47436d.m4869O(null, z8c.f71167e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = bzcVar.f9214g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            C1043b c1043b = kjcVar.f47414H;
            kjc.m15279k(c1043b);
            c1043b.m5855L(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            m14242M(this.f44863e, true, j);
        }
        this.f44863e = bzcVar;
        if (z3) {
            this.f44868j = bzcVar;
        }
        v4d v4dVarM15287o = kjcVar.m15287o();
        v4dVarM15287o.mo12359D();
        v4dVarM15287o.m13744E();
        v4dVarM15287o.m23117R(new u62(v4dVarM15287o, bzcVar));
    }

    /* JADX INFO: renamed from: K */
    public final void m14240K(zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!((kjc) this.f60774a).f47436d.m4873S() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f44864f.put(Integer.valueOf(zzddVar.f11879a), new bzc(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* JADX INFO: renamed from: L */
    public final void m14241L(String str, bzc bzcVar, boolean z) {
        bzc bzcVar2;
        bzc bzcVar3 = this.f44861c == null ? this.f44862d : this.f44861c;
        if (bzcVar.f9209b == null) {
            bzcVar2 = new bzc(bzcVar.f9208a, str != null ? m14238I(str) : null, bzcVar.f9210c, bzcVar.f9212e, bzcVar.f9213f, bzcVar.f9214g);
        } else {
            bzcVar2 = bzcVar;
        }
        this.f44862d = this.f44861c;
        this.f44861c = bzcVar2;
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.f47443k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new jzc(this, bzcVar2, bzcVar3, jElapsedRealtime, z));
    }

    /* JADX INFO: renamed from: M */
    public final void m14242M(bzc bzcVar, boolean z, long j) {
        kjc kjcVar = (kjc) this.f60774a;
        jwb jwbVar = kjcVar.f47415I;
        kjc.m15277i(jwbVar);
        kjcVar.f47443k.getClass();
        jwbVar.m14731G(SystemClock.elapsedRealtime());
        boolean z2 = bzcVar != null && bzcVar.f9211d;
        s6d s6dVar = kjcVar.f47440h;
        kjc.m15279k(s6dVar);
        if (!s6dVar.f60442f.m25732e(j, z2, z) || bzcVar == null) {
            return;
        }
        bzcVar.f9211d = false;
    }

    /* JADX INFO: renamed from: N */
    public final bzc m14243N(zzdd zzddVar) {
        lda.m16130p(zzddVar);
        Integer numValueOf = Integer.valueOf(zzddVar.f11879a);
        ConcurrentHashMap concurrentHashMap = this.f44864f;
        bzc bzcVar = (bzc) concurrentHashMap.get(numValueOf);
        if (bzcVar == null) {
            String strM14238I = m14238I(zzddVar.f11880b);
            rad radVar = ((kjc) this.f60774a).f47441i;
            kjc.m15278j(radVar);
            bzc bzcVar2 = new bzc(radVar.m20515A0(), null, strM14238I);
            concurrentHashMap.put(numValueOf, bzcVar2);
            bzcVar = bzcVar2;
        }
        return this.f44867i != null ? this.f44867i : bzcVar;
    }
}
