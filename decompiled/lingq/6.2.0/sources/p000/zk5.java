package p000;

import androidx.compose.p002ui.node.AbstractC0362l;

/* JADX INFO: loaded from: classes.dex */
public final class zk5 implements aq4 {

    /* JADX INFO: renamed from: a */
    public final yk5 f71680a;

    public zk5(yk5 yk5Var) {
        this.f71680a = yk5Var;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: D */
    public final aq4 mo1662D() {
        yk5 yk5VarMo1542d1;
        if (!mo1691n()) {
            i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC0362l abstractC0362l = ((AbstractC0362l) this.f71680a.f69928J.f4432J.f4335a0.f46677e).f4434L;
        if (abstractC0362l == null || (yk5VarMo1542d1 = abstractC0362l.mo1542d1()) == null) {
            return null;
        }
        return yk5VarMo1542d1.f69931M;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: K */
    public final long mo1667K(aq4 aq4Var, long j) {
        return mo1669P(aq4Var, j);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: L */
    public final long mo1668L(long j) {
        return gq6.m12825f(this.f71680a.f69928J.mo1668L(j), m25682a());
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: P */
    public final long mo1669P(aq4 aq4Var, long j) {
        boolean z = aq4Var instanceof zk5;
        yk5 yk5Var = this.f71680a;
        if (!z) {
            yk5 yk5VarM11660v = fa4.m11660v(yk5Var);
            AbstractC0362l abstractC0362l = yk5VarM11660v.f69928J;
            long jMo1669P = mo1669P(yk5VarM11660v.f69931M, j);
            long j2 = yk5VarM11660v.f69929K;
            long jM12824e = gq6.m12824e(jMo1669P, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!abstractC0362l.mo1543f1().f34836I) {
                i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC0362l.m1693o1();
            AbstractC0362l abstractC0362l2 = abstractC0362l.f4434L;
            if (abstractC0362l2 != null) {
                abstractC0362l = abstractC0362l2;
            }
            return gq6.m12825f(jM12824e, abstractC0362l.mo1669P(aq4Var, 0L));
        }
        yk5 yk5Var2 = ((zk5) aq4Var).f71680a;
        AbstractC0362l abstractC0362l3 = yk5Var2.f69928J;
        abstractC0362l3.m1693o1();
        yk5 yk5VarMo1542d1 = yk5Var.f69928J.m1678b1(abstractC0362l3).mo1542d1();
        if (yk5VarMo1542d1 != null) {
            long jM11594c = f84.m11594c(f84.m11595d(yk5Var2.m25168X0(yk5VarMo1542d1, false), pvc.m19495C(j)), yk5Var.m25168X0(yk5VarMo1542d1, false));
            return (((long) Float.floatToRawIntBits((int) (jM11594c >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM11594c & 4294967295L))) & 4294967295L);
        }
        yk5 yk5VarM11660v2 = fa4.m11660v(yk5Var2);
        long jM11595d = f84.m11595d(f84.m11595d(yk5Var2.m25168X0(yk5VarM11660v2, false), yk5VarM11660v2.f69929K), pvc.m19495C(j));
        yk5 yk5VarM11660v3 = fa4.m11660v(yk5Var);
        long jM11594c2 = f84.m11594c(jM11595d, f84.m11595d(yk5Var.m25168X0(yk5VarM11660v3, false), yk5VarM11660v3.f69929K));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM11594c2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM11594c2 & 4294967295L))) & 4294967295L;
        AbstractC0362l abstractC0362l4 = yk5VarM11660v3.f69928J.f4434L;
        abstractC0362l4.getClass();
        AbstractC0362l abstractC0362l5 = yk5VarM11660v2.f69928J.f4434L;
        abstractC0362l5.getClass();
        return abstractC0362l4.mo1669P(abstractC0362l5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: Q */
    public final e28 mo1670Q(aq4 aq4Var, boolean z) {
        return this.f71680a.f69928J.mo1670Q(aq4Var, z);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: R */
    public final long mo1671R(long j) {
        return this.f71680a.f69928J.mo1671R(gq6.m12825f(j, m25682a()));
    }

    /* JADX INFO: renamed from: a */
    public final long m25682a() {
        yk5 yk5Var = this.f71680a;
        yk5 yk5VarM11660v = fa4.m11660v(yk5Var);
        return gq6.m12824e(mo1669P(yk5VarM11660v.f69931M, 0L), yk5Var.f69928J.mo1669P(yk5VarM11660v.f69928J, 0L));
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: d */
    public final long mo1680d(long j) {
        return this.f71680a.f69928J.mo1680d(gq6.m12825f(j, m25682a()));
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: g */
    public final void mo1682g(float[] fArr) {
        this.f71680a.f69928J.mo1682g(fArr);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: i */
    public final void mo1685i(aq4 aq4Var, float[] fArr) {
        this.f71680a.f69928J.mo1685i(aq4Var, fArr);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: j */
    public final long mo1687j() {
        yk5 yk5Var = this.f71680a;
        return (((long) yk5Var.f49301a) << 32) | (((long) yk5Var.f49302b) & 4294967295L);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: n */
    public final boolean mo1691n() {
        return this.f71680a.f69928J.mo1543f1().f34836I;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: q */
    public final long mo1695q(long j) {
        return this.f71680a.f69928J.mo1695q(gq6.m12825f(j, m25682a()));
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: t */
    public final long mo1699t(long j) {
        return gq6.m12825f(this.f71680a.f69928J.mo1699t(j), m25682a());
    }
}
