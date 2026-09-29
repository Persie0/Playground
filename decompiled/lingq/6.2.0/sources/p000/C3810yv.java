package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: yv */
/* JADX INFO: loaded from: classes.dex */
public final class C3810yv extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public float f70525J;

    /* JADX INFO: renamed from: K */
    public boolean f70526K;

    /* JADX INFO: renamed from: Z0 */
    public final long m25353Z0(long j, boolean z) {
        int iRound;
        int iM3800h = bk1.m3800h(j);
        if (iM3800h == Integer.MAX_VALUE || (iRound = Math.round(iM3800h * this.f70525J)) <= 0) {
            return 0L;
        }
        if (!z || te1.m22012z(j, iRound, iM3800h)) {
            return (((long) iRound) << 32) | (((long) iM3800h) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a1 */
    public final long m25354a1(long j, boolean z) {
        int iRound;
        int iM3801i = bk1.m3801i(j);
        if (iM3801i == Integer.MAX_VALUE || (iRound = Math.round(iM3801i / this.f70525J)) <= 0) {
            return 0L;
        }
        if (!z || te1.m22012z(j, iM3801i, iRound)) {
            return (((long) iM3801i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f70525J) : ct5Var.mo1512l(i);
    }

    /* JADX INFO: renamed from: b1 */
    public final long m25355b1(long j, boolean z) {
        int iM3802j = bk1.m3802j(j);
        int iRound = Math.round(iM3802j * this.f70525J);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || te1.m22012z(j, iRound, iM3802j)) {
            return (((long) iRound) << 32) | (((long) iM3802j) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c1 */
    public final long m25356c1(long j, boolean z) {
        int iM3803k = bk1.m3803k(j);
        int iRound = Math.round(iM3803k / this.f70525J);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || te1.m22012z(j, iM3803k, iRound)) {
            return (((long) iM3803k) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f70525J) : ct5Var.mo1510U(i);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        long jM25353Z0;
        if (this.f70526K) {
            jM25353Z0 = m25353Z0(j, true);
            if (n84.m17279a(jM25353Z0, 0L)) {
                jM25353Z0 = m25354a1(j, true);
                if (n84.m17279a(jM25353Z0, 0L)) {
                    jM25353Z0 = m25355b1(j, true);
                    if (n84.m17279a(jM25353Z0, 0L)) {
                        jM25353Z0 = m25356c1(j, true);
                        if (n84.m17279a(jM25353Z0, 0L)) {
                            jM25353Z0 = m25353Z0(j, false);
                            if (n84.m17279a(jM25353Z0, 0L)) {
                                jM25353Z0 = m25354a1(j, false);
                                if (n84.m17279a(jM25353Z0, 0L)) {
                                    jM25353Z0 = m25355b1(j, false);
                                    if (n84.m17279a(jM25353Z0, 0L)) {
                                        jM25353Z0 = m25356c1(j, false);
                                        if (n84.m17279a(jM25353Z0, 0L)) {
                                            jM25353Z0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jM25353Z0 = m25354a1(j, true);
            if (n84.m17279a(jM25353Z0, 0L)) {
                jM25353Z0 = m25353Z0(j, true);
                if (n84.m17279a(jM25353Z0, 0L)) {
                    jM25353Z0 = m25356c1(j, true);
                    if (n84.m17279a(jM25353Z0, 0L)) {
                        jM25353Z0 = m25355b1(j, true);
                        if (n84.m17279a(jM25353Z0, 0L)) {
                            jM25353Z0 = m25354a1(j, false);
                            if (n84.m17279a(jM25353Z0, 0L)) {
                                jM25353Z0 = m25353Z0(j, false);
                                if (n84.m17279a(jM25353Z0, 0L)) {
                                    jM25353Z0 = m25356c1(j, false);
                                    if (n84.m17279a(jM25353Z0, 0L)) {
                                        jM25353Z0 = m25355b1(j, false);
                                        if (n84.m17279a(jM25353Z0, 0L)) {
                                            jM25353Z0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!n84.m17279a(jM25353Z0, 0L)) {
            int i = (int) (jM25353Z0 >> 32);
            int i2 = (int) (4294967295L & jM25353Z0);
            if (!((i >= 0) & (i2 >= 0))) {
                k54.m14852a("width and height must be >= 0");
            }
            j = dk1.m10430h(i, i, i2, i2);
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(j);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 0));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f70525J) : ct5Var.mo1513p(i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f70525J) : ct5Var.mo1511c(i);
    }
}
