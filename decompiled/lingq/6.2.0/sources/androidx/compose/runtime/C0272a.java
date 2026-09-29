package androidx.compose.runtime;

import androidx.collection.AbstractC0042e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.j69;
import p000.jf1;
import p000.kf1;
import p000.kn1;
import p000.l77;
import p000.m58;
import p000.o66;
import p000.pf1;
import p000.pm8;
import p000.s46;
import p000.t66;
import p000.tj3;
import p000.tm0;
import p000.ui3;
import p000.x18;
import p000.xc9;
import p000.y36;
import p000.z36;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0272a extends kf1 {

    /* JADX INFO: renamed from: a */
    public final long f3716a;

    /* JADX INFO: renamed from: b */
    public final boolean f3717b;

    /* JADX INFO: renamed from: c */
    public final boolean f3718c;

    /* JADX INFO: renamed from: d */
    public HashSet f3719d;

    /* JADX INFO: renamed from: e */
    public final o66 f3720e;

    /* JADX INFO: renamed from: f */
    public final t66 f3721f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tj3 f3722g;

    public C0272a(tj3 tj3Var, long j, boolean z, boolean z2, m58 m58Var) {
        this.f3722g = tj3Var;
        this.f3716a = j;
        this.f3717b = z;
        this.f3718c = z2;
        o66 o66Var = pm8.f56484a;
        this.f3720e = new o66();
        this.f3721f = new ParcelableSnapshotMutableState(l77.f49251d, s46.f60290e);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: a */
    public final void mo1222a(pf1 pf1Var, zi3 zi3Var) {
        this.f3722g.f62388b.mo1222a(pf1Var, zi3Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: b */
    public final AbstractC0042e mo1223b(pf1 pf1Var, j69 j69Var, zi3 zi3Var) {
        return this.f3722g.f62388b.mo1223b(pf1Var, j69Var, zi3Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: c */
    public final void mo1224c() {
        this.f3722g.f62366A--;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: d */
    public final boolean mo1225d() {
        return this.f3722g.f62388b.mo1225d();
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: e */
    public final boolean mo1226e() {
        return this.f3717b;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: f */
    public final boolean mo1227f() {
        return this.f3718c;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: g */
    public final long mo1228g() {
        return this.f3716a;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: h */
    public final jf1 mo1229h() {
        return this.f3722g.f62394h;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: i */
    public final l77 mo1230i() {
        return (l77) ((xc9) this.f3721f).getValue();
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: j */
    public final kn1 mo1231j() {
        return this.f3722g.f62388b.mo1231j();
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: k */
    public final boolean mo1232k() {
        return this.f3722g.f62388b.mo1232k();
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: l */
    public final void mo1233l(pf1 pf1Var) {
        tj3 tj3Var = this.f3722g;
        tj3Var.f62388b.mo1233l(tj3Var.f62394h);
        tj3Var.f62388b.mo1233l(pf1Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: m */
    public final y36 mo1234m(z36 z36Var) {
        return this.f3722g.f62388b.mo1234m(z36Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: n */
    public final AbstractC0042e mo1235n(pf1 pf1Var, j69 j69Var, AbstractC0042e abstractC0042e) {
        return this.f3722g.f62388b.mo1235n(pf1Var, j69Var, abstractC0042e);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: o */
    public final void mo1236o(Set set) {
        HashSet hashSet = this.f3719d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3719d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: p */
    public final void mo1237p(tj3 tj3Var) {
        this.f3720e.m17811d(tj3Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: q */
    public final void mo1238q(x18 x18Var) {
        this.f3722g.f62388b.mo1238q(x18Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: r */
    public final void mo1239r(pf1 pf1Var) {
        this.f3722g.f62388b.mo1239r(pf1Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: s */
    public final tm0 mo1240s(ui3 ui3Var) {
        return this.f3722g.f62388b.mo1240s(ui3Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: t */
    public final void mo1241t() {
        this.f3722g.f62366A++;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: u */
    public final void mo1242u(tj3 tj3Var) {
        HashSet<Set> hashSet = this.f3719d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                tj3Var.getClass();
                set.remove(tj3Var.m22148z());
            }
        }
        if (tj3Var != null) {
            this.f3720e.m17819l(tj3Var);
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: v */
    public final void mo1243v(pf1 pf1Var) {
        this.f3722g.f62388b.mo1243v(pf1Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final void m1244w() {
        o66 o66Var = this.f3720e;
        if (o66Var.m725c()) {
            HashSet hashSet = this.f3719d;
            if (hashSet != null) {
                Object[] objArr = o66Var.f1303b;
                long[] jArr = o66Var.f1302a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    tj3 tj3Var = (tj3) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(tj3Var.m22148z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            o66Var.m17812e();
        }
    }
}
