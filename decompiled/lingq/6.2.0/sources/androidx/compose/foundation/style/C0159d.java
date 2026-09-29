package androidx.compose.foundation.style;

import android.os.Trace;
import androidx.compose.foundation.style.C0159d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0279g;
import java.util.Arrays;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3550rv;
import p000.AbstractC3650uj;
import p000.C3156jq;
import p000.C3386nv;
import p000.C3485q5;
import p000.C3500qj;
import p000.a07;
import p000.aa1;
import p000.am9;
import p000.an0;
import p000.aw9;
import p000.ax9;
import p000.b07;
import p000.bb0;
import p000.bc3;
import p000.bk1;
import p000.c07;
import p000.cg7;
import p000.ct5;
import p000.d32;
import p000.dk1;
import p000.e28;
import p000.em9;
import p000.fa1;
import p000.fa2;
import p000.fa4;
import p000.fb2;
import p000.fm9;
import p000.gj9;
import p000.gm5;
import p000.gq6;
import p000.it5;
import p000.jt5;
import p000.k39;
import p000.l87;
import p000.lda;
import p000.ll2;
import p000.mi8;
import p000.mv3;
import p000.o39;
import p000.of0;
import p000.omd;
import p000.pba;
import p000.pd9;
import p000.pg9;
import p000.pk9;
import p000.qn3;
import p000.qp6;
import p000.sf1;
import p000.ss5;
import p000.t78;
import p000.te1;
import p000.tf1;
import p000.thb;
import p000.ui3;
import p000.um2;
import p000.v56;
import p000.v66;
import p000.vi0;
import p000.vi3;
import p000.vl9;
import p000.w41;
import p000.w54;
import p000.wfb;
import p000.x89;
import p000.y47;
import p000.zx9;

/* JADX INFO: renamed from: androidx.compose.foundation.style.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0159d extends fa2 implements InterfaceC0354d, ll2, pba, tf1, qp6, sf1 {

    /* JADX INFO: renamed from: L */
    public am9 f2751L;

    /* JADX INFO: renamed from: M */
    public vl9 f2752M;

    /* JADX INFO: renamed from: N */
    public final t78 f2753N;

    /* JADX INFO: renamed from: O */
    public em9 f2754O;

    /* JADX INFO: renamed from: P */
    public em9 f2755P;

    /* JADX INFO: renamed from: Q */
    public C0312a f2756Q;

    /* JADX INFO: renamed from: R */
    public y47 f2757R;

    /* JADX INFO: renamed from: S */
    public final w41 f2758S;

    /* JADX INFO: renamed from: T */
    public v66 f2759T;

    /* JADX INFO: renamed from: U */
    public v56 f2760U;

    /* JADX INFO: renamed from: V */
    public cg7 f2761V;

    /* JADX INFO: renamed from: W */
    public long f2762W;

    /* JADX INFO: renamed from: X */
    public LayoutDirection f2763X;

    /* JADX INFO: renamed from: Y */
    public o39 f2764Y;

    /* JADX INFO: renamed from: Z */
    public pk9 f2765Z;

    /* JADX INFO: renamed from: a0 */
    public k39[] f2766a0;

    /* JADX INFO: renamed from: b0 */
    public w54[] f2767b0;

    /* JADX INFO: renamed from: c0 */
    public k39[] f2768c0;

    /* JADX INFO: renamed from: d0 */
    public um2[] f2769d0;

    /* JADX INFO: renamed from: e0 */
    public pg9 f2770e0;

    public C0159d(v66 v66Var, vl9 vl9Var) {
        this.f2752M = vl9Var;
        t78 t78Var = new t78();
        t78Var.f61943a = 1.0f;
        this.f2753N = t78Var;
        this.f2754O = new em9();
        this.f2758S = new w41();
        this.f2759T = v66Var == null ? new v66(null) : v66Var;
        this.f2762W = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: e1 */
    public static em9 m1057e1(C0159d c0159d, int i) {
        em9 em9Var = c0159d.f2754O;
        t78 t78Var = c0159d.f2753N;
        if ((t78Var.m21885f() & i) == 0) {
            return em9Var;
        }
        em9 em9Var2 = new em9();
        t78Var.m21887i(i, em9Var2);
        return em9Var2;
    }

    @Override // p000.sf1
    /* JADX INFO: renamed from: A */
    public final Object mo1058A(AbstractC0279g abstractC0279g) {
        return thb.m22050i(this, abstractC0279g);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        C0312a c0312a = this.f2756Q;
        if (c0312a != null) {
            te1.m21977J(this).mo14485a(c0312a);
            this.f2756Q = null;
        }
        this.f2757R = null;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1059c1(C0358h c0358h, int i, o39 o39Var, k39 k39Var) {
        k39[] k39VarArr = this.f2768c0;
        k39 k39Var2 = k39VarArr != null ? (k39) AbstractC3550rv.m20842j0(k39VarArr, i) : null;
        um2[] um2VarArr = this.f2769d0;
        um2 um2Var = um2VarArr != null ? (um2) AbstractC3550rv.m20842j0(um2VarArr, i) : null;
        if (!fa4.m11650l(k39Var2, k39Var) || um2Var == null) {
            C3156jq c3156jqMo14486b = te1.m21977J(this).mo14486b();
            c3156jqMo14486b.getClass();
            um2Var = new um2(o39Var, k39Var, c3156jqMo14486b);
        }
        k39[] k39VarArr2 = this.f2768c0;
        if (k39VarArr2 != null) {
            k39VarArr2[i] = k39Var;
        }
        um2[] um2VarArr2 = this.f2769d0;
        if (um2VarArr2 != null) {
            um2VarArr2[i] = um2Var;
        }
        um2Var.m24872e(c0358h, c0358h.f4358a.mo1422h(), 1.0f, null);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m1060d1(C0358h c0358h, int i, o39 o39Var, k39 k39Var) {
        k39[] k39VarArr = this.f2766a0;
        k39 k39Var2 = k39VarArr != null ? (k39) AbstractC3550rv.m20842j0(k39VarArr, i) : null;
        w54[] w54VarArr = this.f2767b0;
        w54 w54Var = w54VarArr != null ? (w54) AbstractC3550rv.m20842j0(w54VarArr, i) : null;
        if (!fa4.m11650l(k39Var2, k39Var) || w54Var == null) {
            C3156jq c3156jqMo14486b = te1.m21977J(this).mo14486b();
            c3156jqMo14486b.getClass();
            w54Var = new w54(o39Var, k39Var, c3156jqMo14486b);
        }
        k39[] k39VarArr2 = this.f2766a0;
        if (k39VarArr2 != null) {
            k39VarArr2[i] = k39Var;
        }
        w54[] w54VarArr2 = this.f2767b0;
        if (w54VarArr2 != null) {
            w54VarArr2[i] = w54Var;
        }
        w54Var.m24872e(c0358h, c0358h.f4358a.mo1422h(), 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, final long j) {
        em9 em9VarM1057e1 = m1057e1(this, 8);
        float f = em9VarM1057e1.m11249s((byte) 4) ? em9VarM1057e1.f37506g : 0.0f;
        float f2 = em9VarM1057e1.m11249s((byte) 13) ? em9VarM1057e1.f37515p : 0.0f;
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f3 = f;
        float f4 = em9VarM1057e1.m11249s((byte) 5) ? em9VarM1057e1.f37507h : 0.0f;
        float f5 = em9VarM1057e1.m11249s((byte) 15) ? em9VarM1057e1.f37517r : 0.0f;
        if (!Float.isNaN(f5)) {
            f4 += f5;
        }
        final float f6 = f4;
        float f7 = em9VarM1057e1.m11249s((byte) 6) ? em9VarM1057e1.f37508i : 0.0f;
        float f8 = em9VarM1057e1.m11249s((byte) 14) ? em9VarM1057e1.f37516q : 0.0f;
        if (!Float.isNaN(f8)) {
            f7 += f8;
        }
        final float f9 = f7;
        float f10 = em9VarM1057e1.m11249s((byte) 7) ? em9VarM1057e1.f37509j : 0.0f;
        float f11 = em9VarM1057e1.m11249s((byte) 16) ? em9VarM1057e1.f37518s : 0.0f;
        if (!Float.isNaN(f11)) {
            f10 += f11;
        }
        int iRound = Math.round(f3 + f6);
        int iRound2 = Math.round(f9 + f10);
        int iM3803k = bk1.m3803k(j) - iRound;
        if (iM3803k < 0) {
            iM3803k = 0;
        }
        int iM3801i = bk1.m3801i(j);
        if (iM3801i != Integer.MAX_VALUE && (iM3801i = iM3801i + iRound) < 0) {
            iM3801i = 0;
        }
        int iM3802j = bk1.m3802j(j) - iRound2;
        if (iM3802j < 0) {
            iM3802j = 0;
        }
        int iM3800h = bk1.m3800h(j);
        if (iM3800h != Integer.MAX_VALUE && (iM3800h = iM3800h + iRound2) < 0) {
            iM3800h = 0;
        }
        if (em9VarM1057e1.m11249s((byte) 17)) {
            iM3803k = Math.round(em9VarM1057e1.f37521v);
        }
        if (em9VarM1057e1.m11249s((byte) 19)) {
            iM3801i = Math.round(em9VarM1057e1.f37522w);
        }
        if (em9VarM1057e1.m11249s((byte) 18)) {
            iM3802j = Math.round(em9VarM1057e1.f37519t);
        }
        int iRound3 = iM3802j;
        if (em9VarM1057e1.m11249s((byte) 20)) {
            iM3800h = Math.round(em9VarM1057e1.f37520u);
        }
        if (!em9VarM1057e1.m11249s((byte) 9)) {
            if (em9VarM1057e1.m11249s((byte) 11) && bk1.m3797e(j)) {
                int iRound4 = Math.round(iM3801i * em9VarM1057e1.f37513n);
                if (iRound4 >= iM3803k) {
                    iM3803k = iRound4;
                }
                if (iM3803k > iM3801i) {
                    iM3803k = iM3801i;
                }
            } else if (em9VarM1057e1.m11249s((byte) 13) && em9VarM1057e1.m11249s((byte) 15)) {
                iM3803k = iM3801i;
            }
            if (em9VarM1057e1.m11249s((byte) 10)) {
                if (!em9VarM1057e1.m11249s((byte) 12) && bk1.m3796d(j)) {
                    int iRound5 = Math.round(iM3800h * em9VarM1057e1.f37514o);
                    if (iRound5 >= iRound3) {
                        iRound3 = iRound5;
                    }
                    if (iRound3 > iM3800h) {
                        iRound3 = iM3800h;
                    }
                } else if (em9VarM1057e1.m11249s((byte) 14) && em9VarM1057e1.m11249s((byte) 16)) {
                    iRound3 = iM3800h;
                }
                final l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iRound3, iM3800h));
                final float f12 = f10;
                return jt5Var.mo9895M0(l87VarMo1514r.f49301a + iRound, l87VarMo1514r.f49302b + iRound2, AbstractC3194a.m15360M(), new vi3() { // from class: cm9
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                        C0159d c0159d = this.f10280a;
                        em9 em9VarM1057e2 = C0159d.m1057e1(c0159d, 8);
                        boolean zM11249s = em9VarM1057e2.m11249s((byte) 13);
                        long j2 = j;
                        l87 l87Var = l87VarMo1514r;
                        int iRound6 = (zM11249s || !em9VarM1057e2.m11249s((byte) 15)) ? Math.round(f3) : (bk1.m3801i(j2) - l87Var.f49301a) - Math.round(f6);
                        int iRound7 = (!em9VarM1057e2.m11249s((byte) 16) || em9VarM1057e2.m11249s((byte) 14)) ? Math.round(f9) : (bk1.m3800h(j2) - l87Var.f49302b) - Math.round(f12);
                        if ((em9VarM1057e2.m11245o() & 4) != 0) {
                            cg7 cg7Var = c0159d.f2761V;
                            if (cg7Var == null) {
                                cg7Var = new cg7(c0159d, 22);
                                c0159d.f2761V = cg7Var;
                            }
                            AbstractC0343j.m1525p(abstractC0343j, l87Var, iRound6, iRound7, cg7Var, 4);
                        } else {
                            abstractC0343j.m1530f(l87Var, iRound6, iRound7, 0.0f);
                        }
                        return xfa.f68157a;
                    }
                });
            }
            iRound3 = Math.round(em9VarM1057e1.f37512m);
            iM3800h = iRound3;
            final l87 l87VarMo1514r2 = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iRound3, iM3800h));
            final float f13 = f10;
            return jt5Var.mo9895M0(l87VarMo1514r2.f49301a + iRound, l87VarMo1514r2.f49302b + iRound2, AbstractC3194a.m15360M(), new vi3() { // from class: cm9
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                    C0159d c0159d = this.f10280a;
                    em9 em9VarM1057e2 = C0159d.m1057e1(c0159d, 8);
                    boolean zM11249s = em9VarM1057e2.m11249s((byte) 13);
                    long j2 = j;
                    l87 l87Var = l87VarMo1514r2;
                    int iRound6 = (zM11249s || !em9VarM1057e2.m11249s((byte) 15)) ? Math.round(f3) : (bk1.m3801i(j2) - l87Var.f49301a) - Math.round(f6);
                    int iRound7 = (!em9VarM1057e2.m11249s((byte) 16) || em9VarM1057e2.m11249s((byte) 14)) ? Math.round(f9) : (bk1.m3800h(j2) - l87Var.f49302b) - Math.round(f13);
                    if ((em9VarM1057e2.m11245o() & 4) != 0) {
                        cg7 cg7Var = c0159d.f2761V;
                        if (cg7Var == null) {
                            cg7Var = new cg7(c0159d, 22);
                            c0159d.f2761V = cg7Var;
                        }
                        AbstractC0343j.m1525p(abstractC0343j, l87Var, iRound6, iRound7, cg7Var, 4);
                    } else {
                        abstractC0343j.m1530f(l87Var, iRound6, iRound7, 0.0f);
                    }
                    return xfa.f68157a;
                }
            });
        }
        iM3803k = Math.round(em9VarM1057e1.f37511l);
        iM3801i = iM3803k;
        if (em9VarM1057e1.m11249s((byte) 10)) {
            if (!em9VarM1057e1.m11249s((byte) 12)) {
            }
            if (em9VarM1057e1.m11249s((byte) 14)) {
                iRound3 = iM3800h;
            }
            final l87 l87VarMo1514r3 = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iRound3, iM3800h));
            final float f14 = f10;
            return jt5Var.mo9895M0(l87VarMo1514r3.f49301a + iRound, l87VarMo1514r3.f49302b + iRound2, AbstractC3194a.m15360M(), new vi3() { // from class: cm9
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                    C0159d c0159d = this.f10280a;
                    em9 em9VarM1057e2 = C0159d.m1057e1(c0159d, 8);
                    boolean zM11249s = em9VarM1057e2.m11249s((byte) 13);
                    long j2 = j;
                    l87 l87Var = l87VarMo1514r3;
                    int iRound6 = (zM11249s || !em9VarM1057e2.m11249s((byte) 15)) ? Math.round(f3) : (bk1.m3801i(j2) - l87Var.f49301a) - Math.round(f6);
                    int iRound7 = (!em9VarM1057e2.m11249s((byte) 16) || em9VarM1057e2.m11249s((byte) 14)) ? Math.round(f9) : (bk1.m3800h(j2) - l87Var.f49302b) - Math.round(f14);
                    if ((em9VarM1057e2.m11245o() & 4) != 0) {
                        cg7 cg7Var = c0159d.f2761V;
                        if (cg7Var == null) {
                            cg7Var = new cg7(c0159d, 22);
                            c0159d.f2761V = cg7Var;
                        }
                        AbstractC0343j.m1525p(abstractC0343j, l87Var, iRound6, iRound7, cg7Var, 4);
                    } else {
                        abstractC0343j.m1530f(l87Var, iRound6, iRound7, 0.0f);
                    }
                    return xfa.f68157a;
                }
            });
        }
        iRound3 = Math.round(em9VarM1057e1.f37512m);
        iM3800h = iRound3;
        final l87 l87VarMo1514r4 = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iRound3, iM3800h));
        final float f15 = f10;
        return jt5Var.mo9895M0(l87VarMo1514r4.f49301a + iRound, l87VarMo1514r4.f49302b + iRound2, AbstractC3194a.m15360M(), new vi3() { // from class: cm9
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                C0159d c0159d = this.f10280a;
                em9 em9VarM1057e2 = C0159d.m1057e1(c0159d, 8);
                boolean zM11249s = em9VarM1057e2.m11249s((byte) 13);
                long j2 = j;
                l87 l87Var = l87VarMo1514r4;
                int iRound6 = (zM11249s || !em9VarM1057e2.m11249s((byte) 15)) ? Math.round(f3) : (bk1.m3801i(j2) - l87Var.f49301a) - Math.round(f6);
                int iRound7 = (!em9VarM1057e2.m11249s((byte) 16) || em9VarM1057e2.m11249s((byte) 14)) ? Math.round(f9) : (bk1.m3800h(j2) - l87Var.f49302b) - Math.round(f15);
                if ((em9VarM1057e2.m11245o() & 4) != 0) {
                    cg7 cg7Var = c0159d.f2761V;
                    if (cg7Var == null) {
                        cg7Var = new cg7(c0159d, 22);
                        c0159d.f2761V = cg7Var;
                    }
                    AbstractC0343j.m1525p(abstractC0343j, l87Var, iRound6, iRound7, cg7Var, 4);
                } else {
                    abstractC0343j.m1530f(l87Var, iRound6, iRound7, 0.0f);
                }
                return xfa.f68157a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:134:0x028b  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:188:0x0348  */
    /* JADX WARN: Code duplicated, block: B:249:0x0466  */
    /* JADX WARN: Code duplicated, block: B:323:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:335:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX INFO: renamed from: f1 */
    public final void m1061f1(boolean z) {
        em9 em9Var;
        int iM11245o;
        long j;
        if (this.f34836I) {
            final em9 em9Var2 = z ? null : this.f2754O;
            if (z) {
                em9Var = this.f2754O;
            } else {
                if (this.f2755P == null) {
                    this.f2755P = new em9();
                }
                em9Var = this.f2755P;
                em9Var.getClass();
            }
            final em9 em9Var3 = em9Var;
            final fb2 fb2Var = te1.m21979L(this).f4327T;
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            AbstractC0356f.m1552b(this, new ui3() { // from class: dm9
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    fb2 fb2Var2 = fb2Var;
                    C0159d c0159d = this.f35872a;
                    t78 t78Var = c0159d.f2753N;
                    vl9 vl9Var = c0159d.f2752M;
                    t78Var.getClass();
                    Trace.beginSection("Compose:Styles:build");
                    try {
                        t78Var.f61944b = c0159d;
                        t78Var.f61943a = fb2Var2.mo594a();
                        em9 em9Var4 = t78Var.f61946d;
                        if (em9Var4 == null) {
                            em9Var4 = new em9();
                            t78Var.f61946d = em9Var4;
                        }
                        em9 em9Var5 = fm9.f39312n;
                        em9Var5.m11236f(em9Var4);
                        em9 em9Var6 = t78Var.f61947e;
                        if (em9Var6 != null) {
                            em9Var5.m11236f(em9Var6);
                        }
                        t78Var.f61945c = em9Var4;
                        vl9Var.mo11427a(t78Var);
                        t78Var.m21884e();
                        Trace.endSection();
                        em9 em9Var7 = em9Var3;
                        t78Var.m21887i(0, em9Var7);
                        c0159d.f2754O = em9Var7;
                        c0159d.f2755P = em9Var2;
                        ref$IntRef.f47716a = t78Var.m21885f();
                        return xfa.f68157a;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            });
            int i = ref$IntRef.f47716a;
            if (em9Var2 != null) {
                long j2 = em9Var2.f37497a;
                long j3 = em9Var3.f37497a;
                long j4 = j2 & j3;
                long j5 = j2 ^ j3;
                int i2 = em9Var2.f37499b;
                int i3 = em9Var3.f37499b;
                int i4 = i2 & i3;
                iM11245o = fm9.m11940d(i2 ^ i3) | fm9.m11942f(j5);
                if ((iM11245o & 63) != 63) {
                    long j6 = em9Var2.f37497a & j4;
                    long j7 = fm9.f39300b;
                    long j8 = fm9.f39301c;
                    long j9 = fm9.f39302d;
                    long j10 = fm9.f39303e;
                    long j11 = fm9.f39304f;
                    long j12 = fm9.f39305g;
                    long j13 = j6 & (j7 | j8 | j9 | j10 | j11 | j12);
                    int i5 = em9Var2.f37499b & i4;
                    int i6 = fm9.f39306h | fm9.f39307i;
                    int i7 = fm9.f39308j;
                    int i8 = fm9.f39309k;
                    int i9 = fm9.f39310l;
                    int i10 = fm9.f39311m;
                    int i11 = i5 & (i6 | i7 | i8 | i9 | i10);
                    if (j13 != 0 || i11 != 0) {
                        if ((j13 & j7) != 0) {
                            float f = em9Var2.f37501c;
                            j = 256;
                            float f2 = em9Var3.f37501c;
                            if ((j13 & 1) == 0 || Float.floatToRawIntBits(f) == Float.floatToRawIntBits(f2)) {
                                float f3 = em9Var2.f37503d;
                                float f4 = em9Var3.f37503d;
                                if ((j13 & 2) == 0 || Float.floatToRawIntBits(f3) == Float.floatToRawIntBits(f4)) {
                                    float f5 = em9Var2.f37504e;
                                    float f6 = em9Var3.f37504e;
                                    if ((j13 & 4) == 0 || Float.floatToRawIntBits(f5) == Float.floatToRawIntBits(f6)) {
                                        float f7 = em9Var2.f37505f;
                                        float f8 = em9Var3.f37505f;
                                        if ((j13 & 8) == 0 || Float.floatToRawIntBits(f7) == Float.floatToRawIntBits(f8)) {
                                            float f9 = em9Var2.f37510k;
                                            float f10 = em9Var3.f37510k;
                                            if ((j13 & 256) != 0 && Float.floatToRawIntBits(f9) != Float.floatToRawIntBits(f10)) {
                                                iM11245o |= 1;
                                            }
                                        } else {
                                            iM11245o |= 1;
                                        }
                                    } else {
                                        iM11245o |= 1;
                                    }
                                } else {
                                    iM11245o |= 1;
                                }
                            } else {
                                iM11245o |= 1;
                            }
                        } else {
                            j = 256;
                        }
                        if ((j13 & j8) != 0) {
                            float f11 = em9Var2.f37511l;
                            float f12 = em9Var3.f37511l;
                            if ((512 & j13) == 0 || Float.floatToRawIntBits(f11) == Float.floatToRawIntBits(f12)) {
                                float f13 = em9Var2.f37512m;
                                float f14 = em9Var3.f37512m;
                                if ((1024 & j13) == 0 || Float.floatToRawIntBits(f13) == Float.floatToRawIntBits(f14)) {
                                    float f15 = em9Var2.f37513n;
                                    float f16 = em9Var3.f37513n;
                                    if ((2048 & j13) == 0 || Float.floatToRawIntBits(f15) == Float.floatToRawIntBits(f16)) {
                                        float f17 = em9Var2.f37514o;
                                        float f18 = em9Var3.f37514o;
                                        if ((4096 & j13) == 0 || Float.floatToRawIntBits(f17) == Float.floatToRawIntBits(f18)) {
                                            float f19 = em9Var2.f37506g;
                                            float f20 = em9Var3.f37506g;
                                            if ((16 & j13) == 0 || Float.floatToRawIntBits(f19) == Float.floatToRawIntBits(f20)) {
                                                float f21 = em9Var2.f37507h;
                                                float f22 = em9Var3.f37507h;
                                                if ((32 & j13) == 0 || Float.floatToRawIntBits(f21) == Float.floatToRawIntBits(f22)) {
                                                    float f23 = em9Var2.f37508i;
                                                    float f24 = em9Var3.f37508i;
                                                    if ((64 & j13) == 0 || Float.floatToRawIntBits(f23) == Float.floatToRawIntBits(f24)) {
                                                        float f25 = em9Var2.f37509j;
                                                        float f26 = em9Var3.f37509j;
                                                        if ((128 & j13) == 0 || Float.floatToRawIntBits(f25) == Float.floatToRawIntBits(f26)) {
                                                            float f27 = em9Var2.f37515p;
                                                            float f28 = em9Var3.f37515p;
                                                            if ((8192 & j13) == 0 || Float.floatToRawIntBits(f27) == Float.floatToRawIntBits(f28)) {
                                                                float f29 = em9Var2.f37516q;
                                                                float f30 = em9Var3.f37516q;
                                                                if ((16384 & j13) == 0 || Float.floatToRawIntBits(f29) == Float.floatToRawIntBits(f30)) {
                                                                    float f31 = em9Var2.f37517r;
                                                                    float f32 = em9Var3.f37517r;
                                                                    if ((32768 & j13) == 0 || Float.floatToRawIntBits(f31) == Float.floatToRawIntBits(f32)) {
                                                                        float f33 = em9Var2.f37518s;
                                                                        float f34 = em9Var3.f37518s;
                                                                        if ((65536 & j13) == 0 || Float.floatToRawIntBits(f33) == Float.floatToRawIntBits(f34)) {
                                                                            float f35 = em9Var2.f37519t;
                                                                            float f36 = em9Var3.f37519t;
                                                                            if ((262144 & j13) == 0 || Float.floatToRawIntBits(f35) == Float.floatToRawIntBits(f36)) {
                                                                                float f37 = em9Var2.f37521v;
                                                                                float f38 = em9Var3.f37521v;
                                                                                if ((131072 & j13) == 0 || Float.floatToRawIntBits(f37) == Float.floatToRawIntBits(f38)) {
                                                                                    float f39 = em9Var2.f37520u;
                                                                                    float f40 = em9Var3.f37520u;
                                                                                    if ((1048576 & j13) == 0 || Float.floatToRawIntBits(f39) == Float.floatToRawIntBits(f40)) {
                                                                                        float f41 = em9Var2.f37522w;
                                                                                        float f42 = em9Var3.f37522w;
                                                                                        if ((524288 & j13) != 0 && Float.floatToRawIntBits(f41) != Float.floatToRawIntBits(f42)) {
                                                                                            iM11245o |= 8;
                                                                                        }
                                                                                    } else {
                                                                                        iM11245o |= 8;
                                                                                    }
                                                                                } else {
                                                                                    iM11245o |= 8;
                                                                                }
                                                                            } else {
                                                                                iM11245o |= 8;
                                                                            }
                                                                        } else {
                                                                            iM11245o |= 8;
                                                                        }
                                                                    } else {
                                                                        iM11245o |= 8;
                                                                    }
                                                                } else {
                                                                    iM11245o |= 8;
                                                                }
                                                            } else {
                                                                iM11245o |= 8;
                                                            }
                                                        } else {
                                                            iM11245o |= 8;
                                                        }
                                                    } else {
                                                        iM11245o |= 8;
                                                    }
                                                } else {
                                                    iM11245o |= 8;
                                                }
                                            } else {
                                                iM11245o |= 8;
                                            }
                                        } else {
                                            iM11245o |= 8;
                                        }
                                    } else {
                                        iM11245o |= 8;
                                    }
                                } else {
                                    iM11245o |= 8;
                                }
                            } else {
                                iM11245o |= 8;
                            }
                        }
                        if ((j13 & j9) != 0) {
                            float f43 = em9Var2.f37510k;
                            float f44 = em9Var3.f37510k;
                            if ((j13 & j) == 0 || Float.floatToRawIntBits(f43) == Float.floatToRawIntBits(f44)) {
                                long j14 = em9Var2.f37523x;
                                long j15 = em9Var3.f37523x;
                                if ((j13 & 34359738368L) == 0 || aa1.m199c(j14, j15)) {
                                    long j16 = em9Var2.f37525z;
                                    long j17 = em9Var3.f37525z;
                                    if ((j13 & 17179869184L) == 0 || aa1.m199c(j16, j17)) {
                                        long j18 = em9Var2.f37472B;
                                        long j19 = em9Var3.f37472B;
                                        if ((j13 & 68719476736L) != 0 && !aa1.m199c(j18, j19)) {
                                            iM11245o |= 2;
                                        }
                                    } else {
                                        iM11245o |= 2;
                                    }
                                } else {
                                    iM11245o |= 2;
                                }
                            } else {
                                iM11245o |= 2;
                            }
                        }
                        if ((i11 & i7) != 0) {
                            vi0 vi0Var = em9Var2.f37524y;
                            vi0 vi0Var2 = em9Var3.f37524y;
                            if ((i11 & 1) == 0 || fa4.m11650l(vi0Var, vi0Var2)) {
                                vi0 vi0Var3 = em9Var2.f37471A;
                                vi0 vi0Var4 = em9Var3.f37471A;
                                if ((i11 & 2) == 0 || fa4.m11650l(vi0Var3, vi0Var4)) {
                                    vi0 vi0Var5 = em9Var2.f37473C;
                                    vi0 vi0Var6 = em9Var3.f37473C;
                                    if ((i11 & 4) == 0 || fa4.m11650l(vi0Var5, vi0Var6)) {
                                        Object obj = em9Var2.f37477G;
                                        Object obj2 = em9Var3.f37477G;
                                        if ((i11 & 64) == 0 || fa4.m11650l(obj, obj2)) {
                                            Object obj3 = em9Var2.f37476F;
                                            Object obj4 = em9Var3.f37476F;
                                            if ((i11 & 32) == 0 || fa4.m11650l(obj3, obj4)) {
                                                o39 o39Var = em9Var2.f37475E;
                                                o39 o39Var2 = em9Var3.f37475E;
                                                if ((i11 & 8) != 0 && !fa4.m11650l(o39Var, o39Var2)) {
                                                    iM11245o |= 2;
                                                }
                                            } else {
                                                iM11245o |= 2;
                                            }
                                        } else {
                                            iM11245o |= 2;
                                        }
                                    } else {
                                        iM11245o |= 2;
                                    }
                                } else {
                                    iM11245o |= 2;
                                }
                            } else {
                                iM11245o |= 2;
                            }
                        }
                        if ((j13 & j10) != 0) {
                            float f45 = em9Var2.f37478H;
                            float f46 = em9Var3.f37478H;
                            if ((2097152 & j13) == 0 || Float.floatToRawIntBits(f45) == Float.floatToRawIntBits(f46)) {
                                float f47 = em9Var2.f37479I;
                                float f48 = em9Var3.f37479I;
                                if ((4194304 & j13) == 0 || Float.floatToRawIntBits(f47) == Float.floatToRawIntBits(f48)) {
                                    float f49 = em9Var2.f37480J;
                                    float f50 = em9Var3.f37480J;
                                    if ((8388608 & j13) == 0 || Float.floatToRawIntBits(f49) == Float.floatToRawIntBits(f50)) {
                                        float f51 = em9Var2.f37481K;
                                        float f52 = em9Var3.f37481K;
                                        if ((16777216 & j13) == 0 || Float.floatToRawIntBits(f51) == Float.floatToRawIntBits(f52)) {
                                            float f53 = em9Var2.f37482L;
                                            float f54 = em9Var3.f37482L;
                                            if ((33554432 & j13) == 0 || Float.floatToRawIntBits(f53) == Float.floatToRawIntBits(f54)) {
                                                float f55 = em9Var2.f37486P;
                                                float f56 = em9Var3.f37486P;
                                                if ((536870912 & j13) == 0 || Float.floatToRawIntBits(f55) == Float.floatToRawIntBits(f56)) {
                                                    float f57 = em9Var2.f37487Q;
                                                    float f58 = em9Var3.f37487Q;
                                                    if ((1073741824 & j13) == 0 || Float.floatToRawIntBits(f57) == Float.floatToRawIntBits(f58)) {
                                                        float f59 = em9Var2.f37483M;
                                                        float f60 = em9Var3.f37483M;
                                                        if ((67108864 & j13) == 0 || Float.floatToRawIntBits(f59) == Float.floatToRawIntBits(f60)) {
                                                            float f61 = em9Var2.f37484N;
                                                            float f62 = em9Var3.f37484N;
                                                            if ((134217728 & j13) == 0 || Float.floatToRawIntBits(f61) == Float.floatToRawIntBits(f62)) {
                                                                float f63 = em9Var2.f37485O;
                                                                float f64 = em9Var3.f37485O;
                                                                if ((268435456 & j13) == 0 || Float.floatToRawIntBits(f63) == Float.floatToRawIntBits(f64)) {
                                                                    float f65 = em9Var2.f37489S;
                                                                    float f66 = em9Var3.f37489S;
                                                                    if ((4294967296L & j13) == 0 || Float.floatToRawIntBits(f65) == Float.floatToRawIntBits(f66)) {
                                                                        boolean z2 = em9Var2.f37474D;
                                                                        boolean z3 = em9Var3.f37474D;
                                                                        if ((2147483648L & j13) != 0 && z2 != z3) {
                                                                            iM11245o |= 4;
                                                                        }
                                                                    } else {
                                                                        iM11245o |= 4;
                                                                    }
                                                                } else {
                                                                    iM11245o |= 4;
                                                                }
                                                            } else {
                                                                iM11245o |= 4;
                                                            }
                                                        } else {
                                                            iM11245o |= 4;
                                                        }
                                                    } else {
                                                        iM11245o |= 4;
                                                    }
                                                } else {
                                                    iM11245o |= 4;
                                                }
                                            } else {
                                                iM11245o |= 4;
                                            }
                                        } else {
                                            iM11245o |= 4;
                                        }
                                    } else {
                                        iM11245o |= 4;
                                    }
                                } else {
                                    iM11245o |= 4;
                                }
                            } else {
                                iM11245o |= 4;
                            }
                        }
                        if ((i11 & i8) != 0) {
                            fa1 fa1Var = em9Var2.f37490T;
                            fa1 fa1Var2 = em9Var3.f37490T;
                            if ((i11 & 16) != 0 && !fa4.m11650l(fa1Var, fa1Var2)) {
                                iM11245o |= 4;
                            }
                        }
                        if ((em9Var2.f37497a & j10) != 0 || (em9Var2.f37499b & i8) != 0 || (em9Var3.f37497a & j10) != 0 || (em9Var3.f37499b & i8) != 0) {
                            o39 o39Var3 = em9Var2.f37475E;
                            o39 o39Var4 = em9Var3.f37475E;
                            if ((i11 & 8) != 0 && !fa4.m11650l(o39Var3, o39Var4)) {
                                iM11245o |= 4;
                            }
                        }
                        long j20 = em9Var2.f37491U;
                        long j21 = em9Var3.f37491U;
                        if ((137438953472L & j13) != 0 && !aa1.m199c(j20, j21)) {
                            iM11245o |= 32;
                        }
                        vi0 vi0Var7 = em9Var2.f37492V;
                        vi0 vi0Var8 = em9Var3.f37492V;
                        if ((i11 & 128) != 0 && !fa4.m11650l(vi0Var7, vi0Var8)) {
                            iM11245o |= 32;
                        }
                        if (((j12 | j11) & j13) != 0) {
                            long j22 = em9Var2.f37495Y;
                            long j23 = em9Var3.f37495Y;
                            if ((70368744177664L & j13) == 0 || zx9.m25846a(j22, j23)) {
                                long j24 = em9Var2.f37496Z;
                                long j25 = em9Var3.f37496Z;
                                if ((140737488355328L & j13) == 0 || zx9.m25846a(j24, j25)) {
                                    long j26 = em9Var2.f37498a0;
                                    long j27 = em9Var3.f37498a0;
                                    if ((281474976710656L & j13) == 0 || zx9.m25846a(j26, j27)) {
                                        float f67 = em9Var2.f37500b0;
                                        float f68 = em9Var3.f37500b0;
                                        if ((8796093022208L & j13) == 0 || Float.compare(f67, f68) == 0) {
                                            int iM11241k = em9Var2.m11241k();
                                            int iM11241k2 = em9Var3.m11241k();
                                            if ((1099511627776L & j13) == 0 || iM11241k == iM11241k2) {
                                                bc3 bc3VarM11243m = em9Var2.m11243m();
                                                bc3 bc3VarM11243m2 = em9Var3.m11243m();
                                                if ((549755813888L & j13) == 0 || fa4.m11650l(bc3VarM11243m, bc3VarM11243m2)) {
                                                    int iM11246p = em9Var2.m11246p();
                                                    int iM11246p2 = em9Var3.m11246p();
                                                    if ((2199023255552L & j13) == 0 || iM11246p == iM11246p2) {
                                                        int iM11248r = em9Var2.m11248r();
                                                        int iM11248r2 = em9Var3.m11248r();
                                                        if ((4398046511104L & j13) == 0 || iM11248r == iM11248r2) {
                                                            int iM11244n = em9Var2.m11244n();
                                                            int iM11244n2 = em9Var3.m11244n();
                                                            if ((17592186044416L & j13) == 0 || iM11244n == iM11244n2) {
                                                                int iM11242l = em9Var2.m11242l();
                                                                int iM11242l2 = em9Var3.m11242l();
                                                                if ((j13 & 35184372088832L) != 0 && iM11242l != iM11242l2) {
                                                                    iM11245o |= 48;
                                                                }
                                                            } else {
                                                                iM11245o |= 48;
                                                            }
                                                        } else {
                                                            iM11245o |= 48;
                                                        }
                                                    } else {
                                                        iM11245o |= 48;
                                                    }
                                                } else {
                                                    iM11245o |= 48;
                                                }
                                            } else {
                                                iM11245o |= 48;
                                            }
                                        } else {
                                            iM11245o |= 48;
                                        }
                                    } else {
                                        iM11245o |= 48;
                                    }
                                } else {
                                    iM11245o |= 48;
                                }
                            } else {
                                iM11245o |= 48;
                            }
                        }
                        if (((i10 | i9) & i11) != 0) {
                            ax9 ax9Var = em9Var2.f37493W;
                            ax9 ax9Var2 = em9Var3.f37493W;
                            if ((i11 & 512) == 0 || fa4.m11650l(ax9Var, ax9Var2)) {
                                aw9 aw9Var = em9Var2.f37494X;
                                aw9 aw9Var2 = em9Var3.f37494X;
                                if ((i11 & 1024) != 0 && !fa4.m11650l(aw9Var, aw9Var2)) {
                                    iM11245o |= 48;
                                }
                            } else {
                                iM11245o |= 48;
                            }
                        }
                    }
                }
            } else {
                iM11245o = em9Var3.m11245o();
            }
            int i12 = i | iM11245o;
            if (!fa4.m11650l(this.f2759T.f64935a, this.f2760U)) {
                pg9 pg9Var = this.f2770e0;
                if (pg9Var != null) {
                    pg9Var.mo4537a(null);
                }
                v56 v56Var = this.f2759T.f64935a;
                this.f2760U = v56Var;
                if (v56Var != null) {
                    this.f2770e0 = wfb.m23926u(m9971N0(), null, null, new StyleOuterNode$updateInteractionSources$1(this, v56Var, null), 3);
                }
            }
            if (z) {
                return;
            }
            if ((i12 & 1) != 0) {
                am9 am9Var = this.f2751L;
                if (am9Var == null) {
                    C3386nv.m17633t("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                d32.m10020R(am9Var);
            }
            if ((i12 & 8) != 0) {
                d32.m10020R(this);
            }
            if ((i12 & 2) != 0) {
                am9 am9Var2 = this.f2751L;
                if (am9Var2 == null) {
                    C3386nv.m17633t("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                d32.m10019Q(am9Var2);
            }
            if ((i12 & 4) != 0) {
                cg7 cg7Var = this.f2761V;
                if (cg7Var == null) {
                    cg7Var = new cg7(this, 22);
                    this.f2761V = cg7Var;
                }
                d32.m10052m0(this, cg7Var);
            }
            if ((i12 & 16) != 0 && this.f34837a.f34836I) {
                te1.m21979L(this).m1565H();
            }
            if ((i12 & 32) == 0 || !this.f34837a.f34836I) {
                return;
            }
            te1.m21979L(this).m1562E(true);
        }
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        vi0 vi0Var;
        vi0 vi0Var2;
        vi0 vi0Var3;
        Object obj;
        vi0 vi0Var4;
        em9 em9Var;
        float f;
        long j;
        um2[] um2VarArr;
        pk9 pk9VarMo12726b;
        float f2;
        int i;
        Object obj2;
        w54[] w54VarArr;
        w41 w41Var;
        vi3 c3485q5;
        vi3 of0Var;
        mv3 mv3Var = ss5.f61356d;
        em9 em9VarM1057e1 = m1057e1(this, 2);
        long j2 = aa1.f412k;
        long j3 = em9VarM1057e1.m11249s((byte) 34) ? em9VarM1057e1.f37525z : j2;
        if (em9VarM1057e1.m11250t(51)) {
            vi0Var = em9VarM1057e1.f37471A;
            vi0Var.getClass();
        } else {
            vi0Var = null;
        }
        if (em9VarM1057e1.m11249s((byte) 36)) {
            j2 = em9VarM1057e1.f37472B;
        }
        if (em9VarM1057e1.m11250t(52)) {
            vi0Var2 = em9VarM1057e1.f37473C;
            vi0Var2.getClass();
        } else {
            vi0Var2 = null;
        }
        long j4 = aa1.f403b;
        if (em9VarM1057e1.m11249s((byte) 35)) {
            j4 = em9VarM1057e1.f37523x;
        }
        if (em9VarM1057e1.m11250t(50)) {
            vi0Var3 = em9VarM1057e1.f37524y;
            vi0Var3.getClass();
        } else {
            vi0Var3 = null;
        }
        float f3 = em9VarM1057e1.m11249s((byte) 8) ? em9VarM1057e1.f37510k : 0.0f;
        float f4 = f3 / 2.0f;
        o39 o39Var = em9VarM1057e1.f37475E;
        boolean z = f4 > 0.0f;
        boolean z2 = (j3 == 16 && vi0Var == null) ? false : true;
        boolean z3 = (j2 == 16 && vi0Var2 == null) ? false : true;
        if (em9VarM1057e1.m11250t(55) && (obj = em9VarM1057e1.f37476F) != null) {
            o39 o39Var2 = em9VarM1057e1.m11250t(53) ? em9VarM1057e1.f37475E : mv3Var;
            vi0Var4 = vi0Var3;
            k39[] k39VarArr = this.f2768c0;
            em9Var = em9VarM1057e1;
            um2[] um2VarArr2 = this.f2769d0;
            f = f3;
            boolean z4 = obj instanceof Object[];
            int length = z4 ? ((Object[]) obj).length : 1;
            j = j4;
            if (k39VarArr == null || !fa4.m11650l(this.f2764Y, o39Var2)) {
                k39[] k39VarArr2 = new k39[length];
                for (int i2 = 0; i2 < length; i2++) {
                    k39VarArr2[i2] = null;
                }
                this.f2768c0 = k39VarArr2;
                um2[] um2VarArr3 = new um2[length];
                for (int i3 = 0; i3 < length; i3++) {
                    um2VarArr3[i3] = null;
                }
                this.f2769d0 = um2VarArr3;
            } else if (k39VarArr.length != length) {
                this.f2768c0 = (k39[]) Arrays.copyOf(k39VarArr, length);
                if (um2VarArr2 != null) {
                    um2VarArr = (um2[]) Arrays.copyOf(um2VarArr2, length);
                } else {
                    um2VarArr = new um2[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        um2VarArr[i4] = null;
                    }
                }
                this.f2769d0 = um2VarArr;
            }
            if (z4) {
                Object[] objArr = (Object[]) obj;
                int length2 = objArr.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    Object obj3 = objArr[i5];
                    if (obj3 instanceof k39) {
                        m1059c1(c0358h, i5, o39Var2, (k39) obj3);
                    }
                }
            } else if (obj instanceof k39) {
                m1059c1(c0358h, 0, o39Var2, (k39) obj);
            }
        } else {
            em9Var = em9VarM1057e1;
            j = j4;
            vi0Var4 = vi0Var3;
            f = f3;
        }
        an0 an0Var = c0358h.f4358a;
        long jMo1422h = an0Var.mo1422h();
        if (x89.m24404a(this.f2762W, jMo1422h) && this.f2763X == c0358h.getLayoutDirection() && fa4.m11650l(this.f2764Y, o39Var)) {
            pk9VarMo12726b = this.f2765Z;
            pk9VarMo12726b.getClass();
        } else {
            pk9VarMo12726b = o39Var.mo12726b(jMo1422h, c0358h.getLayoutDirection(), c0358h);
        }
        this.f2765Z = pk9VarMo12726b;
        this.f2762W = jMo1422h;
        this.f2763X = c0358h.getLayoutDirection();
        if (!z2) {
            f2 = 0.0f;
        } else if (vi0Var != null) {
            f2 = 0.0f;
            lda.m16135u(c0358h, pk9VarMo12726b, vi0Var, 0.0f, 60);
        } else {
            f2 = 0.0f;
            lda.m16136v(c0358h, pk9VarMo12726b, j3);
        }
        c0358h.m1614b();
        if (z3) {
            if (vi0Var2 != null) {
                lda.m16135u(c0358h, pk9VarMo12726b, vi0Var2, f2, 60);
            } else {
                lda.m16136v(c0358h, pk9VarMo12726b, j2);
            }
        }
        if (z) {
            vi0 pd9Var = vi0Var4 == null ? new pd9(j) : vi0Var4;
            gj9 gj9Var = new gj9(1, f);
            y47 y47Var = this.f2757R;
            if (y47Var == null) {
                y47Var = new y47(this, 15);
                this.f2757R = y47Var;
            }
            final y47 y47Var2 = y47Var;
            final w41 w41Var2 = this.f2758S;
            w41Var2.f66366b = gj9Var;
            if (pd9Var.equals((vi0) w41Var2.f66367c) && fa4.m11650l(pk9VarMo12726b, (pk9) w41Var2.f66368d) && ((vi3) w41Var2.f66369e) != null) {
                w41Var = w41Var2;
                i = 1;
            } else {
                w41Var2.f66367c = pd9Var;
                w41Var2.f66368d = pk9VarMo12726b;
                if (pk9VarMo12726b instanceof a07) {
                    final a07 a07Var = (a07) pk9VarMo12726b;
                    C3500qj c3500qj = a07Var.f34A;
                    final e28 e28VarM19987d = c3500qj.m19987d();
                    float f5 = e28VarM19987d.f36621b;
                    float f6 = e28VarM19987d.f36623d;
                    float f7 = e28VarM19987d.f36620a;
                    float f8 = e28VarM19987d.f36622c;
                    final float fMin = Math.min(Math.abs(f8 - f7), Math.abs(f6 - f5));
                    C3500qj c3500qjM22757a = (C3500qj) w41Var2.f66365a;
                    if (c3500qjM22757a == null) {
                        c3500qjM22757a = AbstractC3650uj.m22757a();
                        w41Var2.f66365a = c3500qjM22757a;
                    }
                    c3500qjM22757a.m19991h();
                    C3500qj.m19985b(c3500qjM22757a, e28VarM19987d);
                    c3500qjM22757a.m19990g(c3500qjM22757a, c3500qj, 0);
                    final long jCeil = (((long) ((int) Math.ceil(f8 - f7))) << 32) | (((long) ((int) Math.ceil(f6 - f5))) & 4294967295L);
                    final C3500qj c3500qj2 = c3500qjM22757a;
                    final vi0 vi0Var5 = pd9Var;
                    c3485q5 = new vi3() { // from class: pf0
                        @Override // p000.vi3
                        public final Object invoke(Object obj4) {
                            long j5 = jCeil;
                            final C3500qj c3500qj3 = c3500qj2;
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj4;
                            gj9 gj9Var2 = (gj9) w41Var2.f66366b;
                            gj9Var2.getClass();
                            float fFloatValue = Float.valueOf(gj9Var2.f40881b).floatValue();
                            final float f9 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                            float f10 = 2.0f * f9;
                            float f11 = fMin;
                            final a07 a07Var2 = a07Var;
                            final vi0 vi0Var6 = vi0Var5;
                            if (f10 > f11) {
                                InterfaceC0310a.m1413G0(interfaceC0310a, a07Var2.f34A, vi0Var6, 0.0f, null, null, 60);
                            } else {
                                C0312a c0312a = (C0312a) y47Var2.mo0a();
                                c0312a.m1431h(1);
                                final e28 e28Var = e28VarM19987d;
                                float f12 = e28Var.f36620a;
                                float f13 = e28Var.f36621b;
                                ((qn3) interfaceC0310a.mo603o0().f50064b).m20067V(f12, f13);
                                try {
                                    interfaceC0310a.mo1421Y(j5, new vi3() { // from class: qf0
                                        @Override // p000.vi3
                                        public final Object invoke(Object obj5) throws Throwable {
                                            InterfaceC0310a interfaceC0310a2;
                                            a07 a07Var3 = a07Var2;
                                            vi0 vi0Var7 = vi0Var6;
                                            float f14 = f9;
                                            C3500qj c3500qj4 = c3500qj3;
                                            InterfaceC0310a interfaceC0310a3 = (InterfaceC0310a) obj5;
                                            e28 e28Var2 = e28Var;
                                            float f15 = -e28Var2.f36620a;
                                            float f16 = -e28Var2.f36621b;
                                            ((qn3) interfaceC0310a3.mo603o0().f50064b).m20067V(f15, f16);
                                            try {
                                                C3500qj c3500qj5 = a07Var3.f34A;
                                                el9 el9Var = new el9(f14 * 2.0f, 0.0f, 0, 0, 30);
                                                interfaceC0310a2 = interfaceC0310a3;
                                                try {
                                                    InterfaceC0310a.m1413G0(interfaceC0310a2, c3500qj5, vi0Var7, 0.0f, el9Var, null, 52);
                                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32));
                                                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L));
                                                    long jMo1423z0 = interfaceC0310a2.mo1423z0();
                                                    C3309ls c3309lsMo603o0 = interfaceC0310a2.mo603o0();
                                                    long jM16483A = c3309lsMo603o0.m16483A();
                                                    c3309lsMo603o0.m16515r().mo17016h();
                                                    try {
                                                        ((qn3) c3309lsMo603o0.f50064b).m20053G(fIntBitsToFloat, fIntBitsToFloat2, jMo1423z0);
                                                        InterfaceC0310a.m1413G0(interfaceC0310a2, c3500qj4, vi0Var7, 0.0f, null, null, 28);
                                                        c3309lsMo603o0.m16515r().mo17024p();
                                                        c3309lsMo603o0.m16501U(jM16483A);
                                                        ((qn3) interfaceC0310a2.mo603o0().f50064b).m20067V(-f15, -f16);
                                                        return xfa.f68157a;
                                                    } catch (Throwable th) {
                                                        c3309lsMo603o0.m16515r().mo17024p();
                                                        c3309lsMo603o0.m16501U(jM16483A);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    ((qn3) interfaceC0310a2.mo603o0().f50064b).m20067V(-f15, -f16);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                interfaceC0310a2 = interfaceC0310a3;
                                            }
                                        }
                                    }, c0312a);
                                    lda.m16134t(interfaceC0310a, c0312a);
                                } finally {
                                    ((qn3) interfaceC0310a.mo603o0().f50064b).m20067V(-f12, -f13);
                                }
                            }
                            return xfa.f68157a;
                        }
                    };
                    w41Var = w41Var2;
                    i = 1;
                } else {
                    w41Var = w41Var2;
                    if (pk9VarMo12726b instanceof c07) {
                        mi8 mi8Var = ((c07) pk9VarMo12726b).f9272A;
                        if (omd.m18128R(mi8Var)) {
                            i = 1;
                            of0Var = new bb0(w41Var, mi8Var, pd9Var, i);
                        } else {
                            i = 1;
                            C3500qj c3500qjM22757a2 = (C3500qj) w41Var.f66365a;
                            if (c3500qjM22757a2 == null) {
                                c3500qjM22757a2 = AbstractC3650uj.m22757a();
                                w41Var.f66365a = c3500qjM22757a2;
                            }
                            C3500qj c3500qj3 = c3500qjM22757a2;
                            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                            ref$FloatRef.f47715a = Float.NaN;
                            of0Var = new of0(w41Var, mi8Var, ref$FloatRef, new Ref$ObjectRef(), c3500qj3, pd9Var, 0);
                        }
                        c3485q5 = of0Var;
                    } else {
                        i = 1;
                        if (!(pk9VarMo12726b instanceof b07)) {
                            gm5.m12750e();
                            return;
                        }
                        c3485q5 = new C3485q5(w41Var, ((b07) pk9VarMo12726b).f7728A, pd9Var, 3);
                    }
                }
                w41Var.f66369e = c3485q5;
            }
            if (gq6.m12821b(0L, 0L)) {
                vi3 vi3Var = (vi3) w41Var.f66369e;
                vi3Var.getClass();
                vi3Var.invoke(c0358h);
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat(0);
                float fIntBitsToFloat2 = Float.intBitsToFloat(0);
                ((qn3) an0Var.f853b.f50064b).m20067V(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    vi3 vi3Var2 = (vi3) w41Var.f66369e;
                    vi3Var2.getClass();
                    vi3Var2.invoke(c0358h);
                    ((qn3) an0Var.f853b.f50064b).m20067V(-fIntBitsToFloat, -fIntBitsToFloat2);
                } catch (Throwable th) {
                    ((qn3) an0Var.f853b.f50064b).m20067V(-fIntBitsToFloat, -fIntBitsToFloat2);
                    throw th;
                }
            }
        } else {
            i = 1;
        }
        em9 em9Var2 = em9Var;
        if (em9Var2.m11250t(56) && (obj2 = em9Var2.f37477G) != null) {
            o39 o39Var3 = em9Var2.m11250t(53) ? em9Var2.f37475E : mv3Var;
            k39[] k39VarArr3 = this.f2766a0;
            w54[] w54VarArr2 = this.f2767b0;
            boolean z5 = obj2 instanceof Object[];
            int length3 = z5 ? ((Object[]) obj2).length : i;
            if (k39VarArr3 == null || !fa4.m11650l(this.f2764Y, o39Var3)) {
                k39[] k39VarArr4 = new k39[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    k39VarArr4[i6] = null;
                }
                this.f2766a0 = k39VarArr4;
                w54[] w54VarArr3 = new w54[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    w54VarArr3[i7] = null;
                }
                this.f2767b0 = w54VarArr3;
            } else if (k39VarArr3.length != length3) {
                this.f2766a0 = (k39[]) Arrays.copyOf(k39VarArr3, length3);
                if (w54VarArr2 != null) {
                    w54VarArr = (w54[]) Arrays.copyOf(w54VarArr2, length3);
                } else {
                    w54VarArr = new w54[length3];
                    for (int i8 = 0; i8 < length3; i8++) {
                        w54VarArr[i8] = null;
                    }
                }
                this.f2767b0 = w54VarArr;
            }
            if (z5) {
                Object[] objArr2 = (Object[]) obj2;
                int length4 = objArr2.length;
                for (int i9 = 0; i9 < length4; i9++) {
                    Object obj4 = objArr2[i9];
                    if (obj4 instanceof k39) {
                        m1060d1(c0358h, i9, o39Var3, (k39) obj4);
                    }
                }
            } else if (obj2 instanceof k39) {
                m1060d1(c0358h, 0, o39Var3, (k39) obj2);
            }
        }
        this.f2764Y = o39Var;
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return "StyleOuterNode";
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        m1061f1(false);
    }
}
