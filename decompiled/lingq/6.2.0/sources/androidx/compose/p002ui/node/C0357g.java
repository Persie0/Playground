package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.platform.C0403o;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.spatial.C0429a;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import androidx.compose.runtime.AbstractC0278f;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3393o1;
import p000.C3006fm;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3408og;
import p000.C3835zj;
import p000.al5;
import p000.b16;
import p000.b17;
import p000.bk1;
import p000.bl2;
import p000.bna;
import p000.c17;
import p000.cu3;
import p000.d16;
import p000.e16;
import p000.f16;
import p000.f66;
import p000.fa2;
import p000.fa4;
import p000.fb2;
import p000.fs6;
import p000.ft5;
import p000.gt5;
import p000.ht5;
import p000.hta;
import p000.i54;
import p000.ir9;
import p000.k40;
import p000.kq4;
import p000.kv8;
import p000.l77;
import p000.lq4;
import p000.m58;
import p000.nf1;
import p000.ng7;
import p000.nq4;
import p000.nv8;
import p000.oe1;
import p000.of1;
import p000.oq4;
import p000.ov8;
import p000.pq4;
import p000.q98;
import p000.ql6;
import p000.qq4;
import p000.se1;
import p000.t66;
import p000.te1;
import p000.tv8;
import p000.u56;
import p000.uf1;
import p000.ui3;
import p000.v63;
import p000.vf1;
import p000.vh9;
import p000.vi3;
import p000.wq1;
import p000.x66;
import p000.xc9;
import p000.xfa;
import p000.xwc;
import p000.ygd;
import p000.ym0;

/* JADX INFO: renamed from: androidx.compose.ui.node.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0357g implements oe1, c17, se1 {

    /* JADX INFO: renamed from: m0 */
    public static final lq4 f4312m0 = new lq4("Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: n0 */
    public static final kq4 f4313n0 = new kq4();

    /* JADX INFO: renamed from: o0 */
    public static final C3835zj f4314o0 = new C3835zj(8);

    /* JADX INFO: renamed from: H */
    public C0357g f4315H;

    /* JADX INFO: renamed from: I */
    public Owner f4316I;

    /* JADX INFO: renamed from: J */
    public AbstractC0442b f4317J;

    /* JADX INFO: renamed from: K */
    public int f4318K;

    /* JADX INFO: renamed from: L */
    public boolean f4319L;

    /* JADX INFO: renamed from: M */
    public boolean f4320M;

    /* JADX INFO: renamed from: N */
    public kv8 f4321N;

    /* JADX INFO: renamed from: O */
    public boolean f4322O;

    /* JADX INFO: renamed from: P */
    public final x66 f4323P;

    /* JADX INFO: renamed from: Q */
    public boolean f4324Q;

    /* JADX INFO: renamed from: R */
    public ht5 f4325R;

    /* JADX INFO: renamed from: S */
    public bl2 f4326S;

    /* JADX INFO: renamed from: T */
    public fb2 f4327T;

    /* JADX INFO: renamed from: U */
    public LayoutDirection f4328U;

    /* JADX INFO: renamed from: V */
    public hta f4329V;

    /* JADX INFO: renamed from: W */
    public vf1 f4330W;

    /* JADX INFO: renamed from: X */
    public LayoutNode$UsageByParent f4331X;

    /* JADX INFO: renamed from: Y */
    public LayoutNode$UsageByParent f4332Y;

    /* JADX INFO: renamed from: Z */
    public boolean f4333Z;

    /* JADX INFO: renamed from: a */
    public final boolean f4334a;

    /* JADX INFO: renamed from: a0 */
    public final k40 f4335a0;

    /* JADX INFO: renamed from: b */
    public int f4336b;

    /* JADX INFO: renamed from: b0 */
    public final qq4 f4337b0;

    /* JADX INFO: renamed from: c */
    public boolean f4338c;

    /* JADX INFO: renamed from: c0 */
    public C0339f f4339c0;

    /* JADX INFO: renamed from: d */
    public long f4340d;

    /* JADX INFO: renamed from: d0 */
    public AbstractC0362l f4341d0;

    /* JADX INFO: renamed from: e */
    public boolean f4342e;

    /* JADX INFO: renamed from: e0 */
    public boolean f4343e0;

    /* JADX INFO: renamed from: f */
    public boolean f4344f;

    /* JADX INFO: renamed from: f0 */
    public e16 f4345f0;

    /* JADX INFO: renamed from: g */
    public int f4346g;

    /* JADX INFO: renamed from: g0 */
    public e16 f4347g0;

    /* JADX INFO: renamed from: h */
    public C0357g f4348h;

    /* JADX INFO: renamed from: h0 */
    public vi3 f4349h0;

    /* JADX INFO: renamed from: i */
    public int f4350i;

    /* JADX INFO: renamed from: i0 */
    public vi3 f4351i0;

    /* JADX INFO: renamed from: j */
    public final bl2 f4352j;

    /* JADX INFO: renamed from: j0 */
    public boolean f4353j0;

    /* JADX INFO: renamed from: k */
    public x66 f4354k;

    /* JADX INFO: renamed from: k0 */
    public int f4355k0;

    /* JADX INFO: renamed from: l */
    public boolean f4356l;

    /* JADX INFO: renamed from: l0 */
    public boolean f4357l0;

    public C0357g(int i, boolean z) {
        this.f4334a = z;
        this.f4336b = i;
        this.f4340d = 9223372034707292159L;
        this.f4342e = true;
        this.f4344f = true;
        this.f4346g = -4;
        this.f4352j = new bl2(new x66(new C0357g[16]), new LayoutNode$_foldedChildren$1(this));
        this.f4323P = new x66(new C0357g[16]);
        this.f4324Q = true;
        this.f4325R = f4312m0;
        this.f4327T = pq4.f56676a;
        this.f4328U = LayoutDirection.Ltr;
        this.f4329V = f4313n0;
        vf1.f65302r.getClass();
        this.f4330W = uf1.f63827b;
        LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
        this.f4331X = layoutNode$UsageByParent;
        this.f4332Y = layoutNode$UsageByParent;
        this.f4335a0 = new k40(this);
        this.f4337b0 = new qq4(this);
        this.f4343e0 = true;
        this.f4345f0 = b16.f7762a;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m1553U(C0357g c0357g) {
        C0361k c0361k = c0357g.f4337b0.f58070p;
        return c0357g.m1577T(c0361k.f4424j ? new bk1(c0361k.f49304d) : null);
    }

    /* JADX INFO: renamed from: Z */
    public static void m1554Z(C0357g c0357g, boolean z, int i) {
        C0357g c0357gM1610w;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (c0357g.f4348h == null) {
            i54.m13663b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = c0357g.f4316I;
        if (owner == null || c0357g.f4319L || c0357g.f4334a) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1729E(c0357g, true, z, z2);
        if (z3) {
            C0360j c0360j = c0357g.f4337b0.f58071q;
            c0360j.getClass();
            qq4 qq4Var = c0360j.f4386f;
            C0357g c0357gM1610w2 = qq4Var.f58055a.m1610w();
            LayoutNode$UsageByParent layoutNode$UsageByParent = qq4Var.f58055a.f4331X;
            if (c0357gM1610w2 == null || layoutNode$UsageByParent == LayoutNode$UsageByParent.NotUsed) {
                return;
            }
            while (c0357gM1610w2.f4331X == layoutNode$UsageByParent && (c0357gM1610w = c0357gM1610w2.m1610w()) != null) {
                c0357gM1610w2 = c0357gM1610w;
            }
            int i2 = al5.f804b[layoutNode$UsageByParent.ordinal()];
            if (i2 == 1) {
                if (c0357gM1610w2.f4348h != null) {
                    m1554Z(c0357gM1610w2, z, 6);
                    return;
                } else {
                    m1555b0(c0357gM1610w2, z, 6);
                    return;
                }
            }
            if (i2 != 2) {
                C3386nv.m17633t("Intrinsics isn't used by the parent");
            } else if (c0357gM1610w2.f4348h != null) {
                c0357gM1610w2.m1581Y(z);
            } else {
                c0357gM1610w2.m1582a0(z);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1555b0(C0357g c0357g, boolean z, int i) {
        Owner owner;
        C0357g c0357gM1610w;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (c0357g.f4319L || c0357g.f4334a || (owner = c0357g.f4316I) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1729E(c0357g, false, z, z2);
        if (z3) {
            qq4 qq4Var = c0357g.f4337b0.f58070p.f4417f;
            C0357g c0357gM1610w2 = qq4Var.f58055a.m1610w();
            LayoutNode$UsageByParent layoutNode$UsageByParent = qq4Var.f58055a.f4331X;
            if (c0357gM1610w2 == null || layoutNode$UsageByParent == LayoutNode$UsageByParent.NotUsed) {
                return;
            }
            while (c0357gM1610w2.f4331X == layoutNode$UsageByParent && (c0357gM1610w = c0357gM1610w2.m1610w()) != null) {
                c0357gM1610w2 = c0357gM1610w;
            }
            int i2 = gt5.f41299b[layoutNode$UsageByParent.ordinal()];
            if (i2 == 1) {
                m1555b0(c0357gM1610w2, z, 6);
            } else if (i2 == 2) {
                c0357gM1610w2.m1582a0(z);
            } else {
                C3386nv.m17633t("Intrinsics isn't used by the parent");
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m1556c0(C0357g c0357g) {
        qq4 qq4Var = c0357g.f4337b0;
        if (nq4.f53128a[qq4Var.f58058d.ordinal()] != 1) {
            v63.m23127A(qq4Var.f58058d, "Unexpected state ");
            return;
        }
        if (qq4Var.f58059e) {
            m1554Z(c0357g, true, 6);
            return;
        }
        if (qq4Var.f58060f) {
            c0357g.m1581Y(true);
        }
        if (c0357g.m1605r()) {
            m1555b0(c0357g, true, 6);
        } else if (c0357g.m1604q()) {
            c0357g.m1582a0(true);
        }
    }

    /* JADX INFO: renamed from: k */
    private final String m1557k(C0357g c0357g) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(c0357g);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(m1590g(0));
        sb.append(" Other tree: ");
        C0357g c0357g2 = c0357g.f4315H;
        sb.append(c0357g2 != null ? c0357g2.m1590g(0) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: A */
    public final x66 m1558A() {
        boolean z = this.f4324Q;
        x66 x66Var = this.f4323P;
        if (z) {
            x66Var.m24310h();
            x66Var.m24306d(x66Var.f67832c, m1559B());
            Arrays.sort(x66Var.f67830a, 0, x66Var.f67832c, f4314o0);
            this.f4324Q = false;
        }
        return x66Var;
    }

    /* JADX INFO: renamed from: B */
    public final x66 m1559B() {
        m1599l0();
        if (this.f4350i == 0) {
            return (x66) this.f4352j.f8655a;
        }
        x66 x66Var = this.f4354k;
        x66Var.getClass();
        return x66Var;
    }

    /* JADX INFO: renamed from: C */
    public final void m1560C(long j, cu3 cu3Var, int i, boolean z) {
        k40 k40Var = this.f4335a0;
        AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
        q98 q98Var = AbstractC0362l.f4427i0;
        ((AbstractC0362l) k40Var.f46677e).m1689k1(AbstractC0362l.f4430l0, abstractC0362l.m1679c1(j), cu3Var, i, z);
    }

    /* JADX INFO: renamed from: D */
    public final void m1561D(int i, C0357g c0357g) {
        if (c0357g.f4315H != null && c0357g.f4316I != null) {
            i54.m13663b(m1557k(c0357g));
        }
        c0357g.f4315H = this;
        bl2 bl2Var = this.f4352j;
        ((x66) bl2Var.f8655a).m24304b(i, c0357g);
        ((LayoutNode$_foldedChildren$1) ((ui3) bl2Var.f8656b)).mo0a();
        m1576S();
        if (c0357g.f4334a) {
            this.f4350i++;
        }
        m1568K();
        Owner owner = this.f4316I;
        if (owner != null) {
            c0357g.m1584d(owner);
        }
        if (c0357g.f4337b0.f58066l > 0) {
            qq4 qq4Var = this.f4337b0;
            qq4Var.m20107d(qq4Var.f58066l + 1);
        }
        if (c0357g.f4355k0 > 0) {
            m1591g0(this.f4355k0 + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: E */
    public final void m1562E(boolean z) {
        if (z) {
            C0357g c0357gM1610w = m1610w();
            if (c0357gM1610w != null) {
                c0357gM1610w.m1563F();
            } else {
                Owner owner = this.f4316I;
                if (owner != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).invalidate();
                }
            }
        }
        d16 d16Var = (d16) this.f4335a0.f46679g;
        if ((d16Var.f34840d & 2) != 0) {
            while (d16Var != null) {
                if ((d16Var.f34839c & 2) != 0) {
                    ?? M21992f = d16Var;
                    ?? x66Var = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof InterfaceC0354d) {
                            b17 b17Var = te1.m21976I((InterfaceC0354d) M21992f, 2).f4455g0;
                            if (b17Var != null) {
                                ((C0403o) b17Var).m1808c();
                            }
                        } else if ((M21992f.f34839c & 2) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var2 = ((fa2) M21992f).f38701K;
                            int i = 0;
                            M21992f = M21992f;
                            x66Var = x66Var;
                            while (d16Var2 != null) {
                                if ((d16Var2.f34839c & 2) != 0) {
                                    i++;
                                    if (i == 1) {
                                        x66Var = x66Var;
                                        M21992f = d16Var2;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var.m24305c(d16Var2);
                                    }
                                }
                                d16Var2 = d16Var2.f34842f;
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M21992f = te1.m21992f(x66Var);
                    }
                }
                if ((d16Var.f34840d & 2) == 0) {
                    break;
                } else {
                    d16Var = d16Var.f34842f;
                }
            }
        }
        x66 x66VarM1559B = m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i2 = x66VarM1559B.f67832c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((C0357g) objArr[i3]).m1562E(false);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1563F() {
        if (this.f4343e0) {
            k40 k40Var = this.f4335a0;
            AbstractC0362l abstractC0362l = (C0353c) k40Var.f46676d;
            AbstractC0362l abstractC0362l2 = ((AbstractC0362l) k40Var.f46677e).f4434L;
            this.f4341d0 = null;
            while (!fa4.m11650l(abstractC0362l, abstractC0362l2)) {
                if ((abstractC0362l != null ? abstractC0362l.f4455g0 : null) != null) {
                    this.f4341d0 = abstractC0362l;
                    break;
                }
                abstractC0362l = abstractC0362l != null ? abstractC0362l.f4434L : null;
            }
            this.f4343e0 = false;
        }
        AbstractC0362l abstractC0362l3 = this.f4341d0;
        if (abstractC0362l3 != null && abstractC0362l3.f4455g0 == null) {
            throw AbstractC3393o1.m17745t("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (abstractC0362l3 != null) {
            abstractC0362l3.m1690m1();
            return;
        }
        C0357g c0357gM1610w = m1610w();
        if (c0357gM1610w != null) {
            c0357gM1610w.m1563F();
            return;
        }
        Owner owner = this.f4316I;
        if (owner != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).invalidate();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1564G() {
        k40 k40Var = this.f4335a0;
        AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
        C0353c c0353c = (C0353c) k40Var.f46676d;
        while (abstractC0362l != c0353c) {
            abstractC0362l.getClass();
            C0355e c0355e = (C0355e) abstractC0362l;
            b17 b17Var = c0355e.f4455g0;
            if (b17Var != null) {
                ((C0403o) b17Var).m1808c();
            }
            abstractC0362l = c0355e.f4433K;
        }
        b17 b17Var2 = ((C0353c) k40Var.f46676d).f4455g0;
        if (b17Var2 != null) {
            ((C0403o) b17Var2).m1808c();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1565H() {
        m1555b0(this, false, 7);
        x66 x66VarM1559B = m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0357g) objArr[i2]).m1565H();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1566I() {
        if (this.f4334a) {
            C0357g c0357gM1610w = m1610w();
            if (c0357gM1610w != null) {
                c0357gM1610w.m1566I();
                return;
            }
            return;
        }
        if (this.f4348h != null) {
            m1554Z(this, false, 7);
        } else {
            m1555b0(this, false, 7);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1567J() {
        if (this.f4322O) {
            return;
        }
        if (((ql6) this.f4335a0.f46675c).f34842f != null || this.f4347g0 != null) {
            this.f4320M = true;
            return;
        }
        kv8 kv8Var = this.f4321N;
        this.f4322O = true;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f47718a = new kv8();
        C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this)).getSnapshotObserver();
        ui3 ui3Var = new ui3() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [d16] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [d16] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9 */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [x66] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v5 */
            /* JADX WARN: Type inference failed for: r3v6, types: [x66] */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r4v11 */
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                k40 k40Var = this.f4232b.f4335a0;
                if ((((d16) k40Var.f46679g).f34840d & 8) != 0) {
                    for (d16 d16Var = (ir9) k40Var.f46678f; d16Var != null; d16Var = d16Var.f34841e) {
                        if ((d16Var.f34839c & 8) != 0) {
                            ?? M21992f = d16Var;
                            ?? x66Var = 0;
                            while (M21992f != 0) {
                                if (M21992f instanceof ov8) {
                                    ov8 ov8Var = (ov8) M21992f;
                                    boolean zMo18107L = ov8Var.mo18107L();
                                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                    if (zMo18107L) {
                                        kv8 kv8Var2 = new kv8();
                                        ref$ObjectRef2.f47718a = kv8Var2;
                                        kv8Var2.f48474d = true;
                                    }
                                    if (ov8Var.mo789I0()) {
                                        ((kv8) ref$ObjectRef2.f47718a).f48473c = true;
                                    }
                                    ov8Var.mo787H0((tv8) ref$ObjectRef2.f47718a);
                                } else if ((M21992f.f34839c & 8) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var2 = ((fa2) M21992f).f38701K;
                                    int i = 0;
                                    while (d16Var2 != null) {
                                        if ((d16Var2.f34839c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                M21992f = M21992f;
                                                x66Var = x66Var;
                                                x66Var = x66Var;
                                                M21992f = d16Var2;
                                            } else {
                                                if (x66Var == 0) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var.m24305c(d16Var2);
                                            }
                                        } else {
                                            M21992f = M21992f;
                                            x66Var = x66Var;
                                        }
                                        d16Var2 = d16Var2.f34842f;
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    if (i == 1) {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    } else {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                }
                                M21992f = te1.m21992f(x66Var);
                            }
                        }
                    }
                }
                return xfa.f68157a;
            }
        };
        snapshotObserver.f4460a.m11067c(this, snapshotObserver.f4463d, ui3Var);
        this.f4322O = false;
        this.f4321N = (kv8) ref$ObjectRef.f47718a;
        this.f4320M = false;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this);
        viewTreeObserverOnGlobalLayoutListenerC0391c.getSemanticsOwner().m21751b(this, kv8Var);
        viewTreeObserverOnGlobalLayoutListenerC0391c.m1731G();
    }

    /* JADX INFO: renamed from: K */
    public final void m1568K() {
        C0357g c0357g;
        if (this.f4350i > 0) {
            this.f4356l = true;
        }
        if (!this.f4334a || (c0357g = this.f4315H) == null) {
            return;
        }
        c0357g.m1568K();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m1569L() {
        return this.f4316I != null;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m1570M() {
        return this.f4337b0.f58070p.f4400O;
    }

    /* JADX INFO: renamed from: N */
    public final Boolean m1571N() {
        C0360j c0360j = this.f4337b0.f58071q;
        if (c0360j != null) {
            return Boolean.valueOf(c0360j.f4374M != LookaheadPassDelegate$PlacedState.IsNotPlaced);
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m1572O() {
        C0357g c0357gM1610w;
        if (this.f4331X == LayoutNode$UsageByParent.NotUsed) {
            m1588f();
        }
        C0360j c0360j = this.f4337b0.f58071q;
        c0360j.getClass();
        boolean z = true;
        try {
            c0360j.f4387g = true;
            if (!c0360j.f4392l) {
                i54.m13663b("replace() called on item that was not placed");
            }
            c0360j.f4385X = false;
            if (c0360j.f4374M == LookaheadPassDelegate$PlacedState.IsNotPlaced) {
                z = false;
            }
            c0360j.m1637I0(c0360j.f4371J, c0360j.f4372K, c0360j.f4373L);
            if (z && !c0360j.f4385X && (c0357gM1610w = c0360j.f4386f.f58055a.m1610w()) != null) {
                c0357gM1610w.m1581Y(false);
            }
        } finally {
            c0360j.f4387g = false;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1573P(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            bl2 bl2Var = this.f4352j;
            x66 x66Var = (x66) bl2Var.f8655a;
            ui3 ui3Var = (ui3) bl2Var.f8656b;
            Object objM24314l = x66Var.m24314l(i5);
            ((LayoutNode$_foldedChildren$1) ui3Var).mo0a();
            ((x66) bl2Var.f8655a).m24304b(i6, (C0357g) objM24314l);
            ((LayoutNode$_foldedChildren$1) ui3Var).mo0a();
        }
        m1576S();
        m1568K();
        m1566I();
    }

    /* JADX INFO: renamed from: Q */
    public final void m1574Q(C0357g c0357g) {
        if (c0357g.f4337b0.f58066l > 0) {
            qq4 qq4Var = this.f4337b0;
            qq4Var.m20107d(qq4Var.f58066l - 1);
        }
        if (this.f4316I != null) {
            c0357g.m1592h();
        }
        c0357g.f4315H = null;
        if (c0357g.f4355k0 > 0) {
            m1591g0(this.f4355k0 - 1);
        }
        ((AbstractC0362l) c0357g.f4335a0.f46677e).f4434L = null;
        if (c0357g.f4334a) {
            this.f4350i--;
            x66 x66Var = (x66) c0357g.f4352j.f8655a;
            Object[] objArr = x66Var.f67830a;
            int i = x66Var.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                ((AbstractC0362l) ((C0357g) objArr[i2]).f4335a0.f46677e).f4434L = null;
            }
        }
        m1568K();
        m1576S();
    }

    /* JADX INFO: renamed from: R */
    public final void m1575R(AbstractC0362l abstractC0362l) {
        Owner owner = this.f4316I;
        C0429a rectManager = owner != null ? ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).getRectManager() : null;
        qq4 qq4Var = this.f4337b0;
        boolean z = qq4Var.f58058d != LayoutNode$LayoutState.Idle || m1605r() || m1604q();
        if (this.f4346g != -4 && rectManager != null) {
            if (abstractC0362l == ((AbstractC0362l) this.f4335a0.f46677e)) {
                this.f4344f = true;
                if (!z) {
                    rectManager.m1878h(this);
                }
            } else {
                this.f4342e = true;
                x66 x66VarM1559B = m1559B();
                Object[] objArr = x66VarM1559B.f67830a;
                int i = x66VarM1559B.f67832c;
                for (int i2 = 0; i2 < i; i2++) {
                    C0357g c0357g = (C0357g) objArr[i2];
                    c0357g.f4344f = true;
                    if (!z) {
                        rectManager.m1878h(c0357g);
                    }
                }
                if (this.f4346g != -4) {
                    rectManager.f5034f = true;
                    int iM1876e = rectManager.m1876e(this);
                    long[] jArr = (long[]) rectManager.f5031c.f41172c;
                    int i3 = iM1876e + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.m1880k();
            }
        }
        qq4Var.f58070p.m1655N0();
    }

    /* JADX INFO: renamed from: S */
    public final void m1576S() {
        if (!this.f4334a) {
            this.f4324Q = true;
            return;
        }
        C0357g c0357gM1610w = m1610w();
        if (c0357gM1610w != null) {
            c0357gM1610w.m1576S();
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m1577T(bk1 bk1Var) {
        if (bk1Var == null) {
            return false;
        }
        if (this.f4331X == LayoutNode$UsageByParent.NotUsed) {
            m1586e();
        }
        return this.f4337b0.f58070p.m1654J0(bk1Var.f8631a);
    }

    /* JADX INFO: renamed from: V */
    public final void m1578V() {
        bl2 bl2Var = this.f4352j;
        int i = ((x66) bl2Var.f8655a).f67832c;
        while (true) {
            i--;
            x66 x66Var = (x66) bl2Var.f8655a;
            if (-1 >= i) {
                x66Var.m24310h();
                ((LayoutNode$_foldedChildren$1) ((ui3) bl2Var.f8656b)).mo0a();
                return;
            }
            m1574Q((C0357g) x66Var.f67830a[i]);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m1579W(int i, int i2) {
        if (i2 < 0) {
            i54.m13662a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            bl2 bl2Var = this.f4352j;
            m1574Q((C0357g) ((x66) bl2Var.f8655a).f67830a[i3]);
            Object objM24314l = ((x66) bl2Var.f8655a).m24314l(i3);
            ((LayoutNode$_foldedChildren$1) ((ui3) bl2Var.f8656b)).mo0a();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m1580X() {
        C0357g c0357gM1610w;
        if (this.f4331X == LayoutNode$UsageByParent.NotUsed) {
            m1588f();
        }
        C0361k c0361k = this.f4337b0.f58070p;
        qq4 qq4Var = c0361k.f4417f;
        try {
            c0361k.f4419g = true;
            if (!c0361k.f4425k) {
                i54.m13663b("replace called on unplaced item");
            }
            boolean z = c0361k.f4400O;
            c0361k.m1652H0(c0361k.f4394I, c0361k.f4397L, c0361k.f4395J, c0361k.f4396K);
            if (z && !c0361k.f4413b0 && (c0357gM1610w = qq4Var.f58055a.m1610w()) != null) {
                c0357gM1610w.m1582a0(false);
            }
            c0361k.f4419g = false;
        } catch (Throwable th) {
            try {
                qq4Var.f58055a.m1587e0(th);
                throw null;
            } catch (Throwable th2) {
                c0361k.f4419g = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m1581Y(boolean z) {
        Owner owner;
        if (this.f4334a || (owner = this.f4316I) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1730F(this, true, z);
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final void mo1496a() {
        AbstractC0442b abstractC0442b = this.f4317J;
        if (abstractC0442b != null) {
            abstractC0442b.mo1496a();
        }
        C0339f c0339f = this.f4339c0;
        if (c0339f != null) {
            c0339f.mo1496a();
        }
        k40 k40Var = this.f4335a0;
        AbstractC0362l abstractC0362l = ((C0353c) k40Var.f46676d).f4433K;
        for (AbstractC0362l abstractC0362l2 = (AbstractC0362l) k40Var.f46677e; !fa4.m11650l(abstractC0362l2, abstractC0362l) && abstractC0362l2 != null; abstractC0362l2 = abstractC0362l2.f4433K) {
            abstractC0362l2.m1697r1();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1582a0(boolean z) {
        Owner owner;
        if (this.f4334a || (owner = this.f4316I) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1730F(this, false, z);
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: b */
    public final void mo1497b() {
        C3408og c3408og;
        AbstractC0442b abstractC0442b = this.f4317J;
        if (abstractC0442b != null) {
            abstractC0442b.mo1497b();
        }
        C0339f c0339f = this.f4339c0;
        if (c0339f != null) {
            c0339f.m1503j(true);
        }
        this.f4357l0 = true;
        d16 d16Var = (ir9) this.f4335a0.f46678f;
        for (d16 d16Var2 = d16Var; d16Var2 != null; d16Var2 = d16Var2.f34841e) {
            if (d16Var2.f34836I) {
                d16Var2.mo9974U0();
            }
        }
        for (d16 d16Var3 = d16Var; d16Var3 != null; d16Var3 = d16Var3.f34841e) {
            if (d16Var3.f34836I) {
                d16Var3.mo9976W0();
            }
        }
        while (d16Var != null) {
            if (d16Var.f34836I) {
                d16Var.mo9973Q0();
            }
            d16Var = d16Var.f34841e;
        }
        if (m1569L()) {
            this.f4321N = null;
            this.f4320M = false;
        }
        Owner owner = this.f4316I;
        if (owner == null || (c3408og = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).f4697g0) == null || !c3408og.f54297h.m22480g(this.f4336b)) {
            return;
        }
        c3408og.f54290a.m12089D(c3408og.f54292c, this.f4336b, false);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5411. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: c */
    public final void m1583c(p000.e16 r20) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.C0357g.m1583c(e16):void");
    }

    /* JADX INFO: renamed from: d */
    public final void m1584d(Owner owner) {
        C0357g c0357g;
        kv8 kv8VarM1613z;
        if (this.f4316I != null) {
            i54.m13663b("Cannot attach " + this + " as it already is attached.  Tree: " + m1590g(0));
        }
        C0357g c0357g2 = this.f4315H;
        if (c0357g2 != null && !fa4.m11650l(c0357g2.f4316I, owner)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            C0357g c0357gM1610w = m1610w();
            sb.append(c0357gM1610w != null ? c0357gM1610w.f4316I : null);
            sb.append("). This tree: ");
            sb.append(m1590g(0));
            sb.append(" Parent tree: ");
            C0357g c0357g3 = this.f4315H;
            sb.append(c0357g3 != null ? c0357g3.m1590g(0) : null);
            i54.m13663b(sb.toString());
        }
        C0357g c0357gM1610w2 = m1610w();
        qq4 qq4Var = this.f4337b0;
        if (c0357gM1610w2 == null) {
            qq4Var.f58070p.f4400O = true;
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).getRectManager().m1878h(this);
            C0360j c0360j = qq4Var.f58071q;
            if (c0360j != null) {
                c0360j.f4374M = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
            }
        }
        k40 k40Var = this.f4335a0;
        ((AbstractC0362l) k40Var.f46677e).f4434L = c0357gM1610w2 != null ? (C0353c) c0357gM1610w2.f4335a0.f46676d : null;
        this.f4316I = owner;
        this.f4318K = (c0357gM1610w2 != null ? c0357gM1610w2.f4318K : -1) + 1;
        e16 e16Var = this.f4347g0;
        if (e16Var != null) {
            m1583c(e16Var);
        }
        this.f4347g0 = null;
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).getLayoutNodes().m21850i(this.f4336b, this);
        C0357g c0357g4 = this.f4315H;
        if (c0357g4 == null || (c0357g = c0357g4.f4348h) == null) {
            c0357g = this.f4348h;
        }
        m1593h0(c0357g);
        if (this.f4348h == null && k40Var.m14799f(512)) {
            m1593h0(this);
        }
        if (!this.f4357l0) {
            for (d16 d16Var = (d16) k40Var.f46679g; d16Var != null; d16Var = d16Var.f34842f) {
                d16Var.mo9972P0();
            }
        }
        x66 x66Var = (x66) this.f4352j.f8655a;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0357g) objArr[i2]).m1584d(owner);
        }
        if (!this.f4357l0) {
            k40Var.m14800g();
        }
        m1566I();
        if (c0357gM1610w2 != null) {
            c0357gM1610w2.m1566I();
        }
        vi3 vi3Var = this.f4349h0;
        if (vi3Var != null) {
            vi3Var.invoke(owner);
        }
        qq4Var.m20113j();
        if (!this.f4357l0 && k40Var.m14799f(8)) {
            m1567J();
        }
        C3408og c3408og = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).f4697g0;
        if (c3408og == null || (kv8VarM1613z = m1613z()) == null || !kv8VarM1613z.f48471a.m17250b(AbstractC0424d.f5011r)) {
            return;
        }
        c3408og.f54297h.m22474a(this.f4336b);
        c3408og.f54290a.m12089D(c3408og.f54292c, this.f4336b, true);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1585d0() {
        x66 x66VarM1559B = m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g = (C0357g) objArr[i2];
            LayoutNode$UsageByParent layoutNode$UsageByParent = c0357g.f4332Y;
            c0357g.f4331X = layoutNode$UsageByParent;
            if (layoutNode$UsageByParent != LayoutNode$UsageByParent.NotUsed) {
                c0357g.m1585d0();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1586e() {
        this.f4332Y = this.f4331X;
        this.f4331X = LayoutNode$UsageByParent.NotUsed;
        x66 x66VarM1559B = m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g = (C0357g) objArr[i2];
            if (c0357g.f4331X != LayoutNode$UsageByParent.NotUsed) {
                c0357g.m1586e();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1587e0(Throwable th) throws Throwable {
        vf1 vf1Var = this.f4330W;
        vh9 vh9Var = of1.f54263a;
        l77 l77Var = (l77) vf1Var;
        l77Var.getClass();
        nf1 nf1Var = (nf1) xwc.m24743P(l77Var, vh9Var);
        if (nf1Var == null) {
            throw th;
        }
        bna.m3988z0(th, new C3006fm(5, nf1Var, this));
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m1588f() {
        this.f4332Y = this.f4331X;
        this.f4331X = LayoutNode$UsageByParent.NotUsed;
        x66 x66VarM1559B = m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g = (C0357g) objArr[i2];
            if (c0357g.f4331X == LayoutNode$UsageByParent.InLayoutBlock) {
                c0357g.m1588f();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1589f0(fb2 fb2Var) {
        if (fa4.m11650l(this.f4327T, fb2Var)) {
            return;
        }
        this.f4327T = fb2Var;
        m1566I();
        C0357g c0357gM1610w = m1610w();
        if (c0357gM1610w != null) {
            c0357gM1610w.m1563F();
        } else {
            Owner owner = this.f4316I;
            if (owner != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).invalidate();
            }
        }
        m1564G();
        for (d16 d16Var = (d16) this.f4335a0.f46679g; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo840g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m1590g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        x66 x66VarM1559B = m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i3 = x66VarM1559B.f67832c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((C0357g) objArr[i4]).m1590g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? wq1.m24112h(1, string, 0) : string;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1591g0(int i) {
        C0357g c0357gM1610w;
        C0357g c0357gM1610w2;
        int i2 = this.f4355k0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (c0357gM1610w2 = m1610w()) != null) {
                c0357gM1610w2.m1591g0(c0357gM1610w2.f4355k0 + 1);
            }
            if (i == 0 && this.f4355k0 > 0 && (c0357gM1610w = m1610w()) != null) {
                c0357gM1610w.m1591g0(c0357gM1610w.f4355k0 - 1);
            }
            this.f4355k0 = i;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1592h() {
        oq4 oq4Var;
        Owner owner = this.f4316I;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C0357g c0357gM1610w = m1610w();
            sb.append(c0357gM1610w != null ? c0357gM1610w.m1590g(0) : null);
            i54.m13664c(sb.toString());
            C3386nv.m17631r();
            return;
        }
        C0357g c0357gM1610w2 = m1610w();
        qq4 qq4Var = this.f4337b0;
        if (c0357gM1610w2 != null) {
            c0357gM1610w2.m1563F();
            c0357gM1610w2.m1566I();
            C0361k c0361k = qq4Var.f58070p;
            LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
            c0361k.f4426l = layoutNode$UsageByParent;
            C0360j c0360j = qq4Var.f58071q;
            if (c0360j != null) {
                c0360j.f4390j = layoutNode$UsageByParent;
            }
        }
        oq4 oq4Var2 = qq4Var.f58070p.f4405T;
        oq4Var2.f4290b = true;
        oq4Var2.f4291c = false;
        oq4Var2.f4293e = false;
        oq4Var2.f4292d = false;
        oq4Var2.f4294f = false;
        oq4Var2.f4295g = false;
        oq4Var2.f4296h = null;
        C0360j c0360j2 = qq4Var.f58071q;
        if (c0360j2 != null && (oq4Var = c0360j2.f4375N) != null) {
            oq4Var.f4290b = true;
            oq4Var.f4291c = false;
            oq4Var.f4293e = false;
            oq4Var.f4292d = false;
            oq4Var.f4294f = false;
            oq4Var.f4295g = false;
            oq4Var.f4296h = null;
        }
        k40 k40Var = this.f4335a0;
        d16 d16Var = (ir9) k40Var.f46678f;
        AbstractC0362l abstractC0362l = ((C0353c) k40Var.f46676d).f4433K;
        for (AbstractC0362l abstractC0362l2 = (AbstractC0362l) k40Var.f46677e; !fa4.m11650l(abstractC0362l2, abstractC0362l) && abstractC0362l2 != null; abstractC0362l2 = abstractC0362l2.f4433K) {
            abstractC0362l2.m1703x1();
            if (abstractC0362l2.f4432J.m1570M()) {
                abstractC0362l2.m1698s1();
            }
        }
        vi3 vi3Var = this.f4351i0;
        if (vi3Var != null) {
            vi3Var.invoke(owner);
        }
        for (d16 d16Var2 = d16Var; d16Var2 != null; d16Var2 = d16Var2.f34841e) {
            if (d16Var2.f34836I) {
                d16Var2.mo9976W0();
            }
        }
        this.f4319L = true;
        x66 x66Var = (x66) this.f4352j.f8655a;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0357g) objArr[i2]).m1592h();
        }
        this.f4319L = false;
        while (d16Var != null) {
            if (d16Var.f34836I) {
                d16Var.mo9973Q0();
            }
            d16Var = d16Var.f34841e;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) owner;
        viewTreeObserverOnGlobalLayoutListenerC0391c.getLayoutNodes().m21848g(this.f4336b);
        ft5 ft5Var = viewTreeObserverOnGlobalLayoutListenerC0391c.f4709n0;
        C3309ls c3309ls = ft5Var.f39618b;
        ((m58) c3309ls.f50064b).m16648n(this);
        ((m58) c3309ls.f50065c).m16648n(this);
        ((m58) c3309ls.f50066d).m16648n(this);
        ((x66) ft5Var.f39621e.f39590b).m24313k(this);
        viewTreeObserverOnGlobalLayoutListenerC0391c.f4699h0 = true;
        C3408og c3408og = viewTreeObserverOnGlobalLayoutListenerC0391c.f4697g0;
        if (c3408og != null && c3408og.f54297h.m22480g(this.f4336b)) {
            c3408og.f54290a.m12089D(c3408og.f54292c, this.f4336b, false);
        }
        viewTreeObserverOnGlobalLayoutListenerC0391c.getRectManager().m1879i(this);
        this.f4316I = null;
        m1593h0(null);
        this.f4318K = 0;
        C0361k c0361k2 = qq4Var.f58070p;
        c0361k2.f4423i = Integer.MAX_VALUE;
        c0361k2.f4421h = Integer.MAX_VALUE;
        c0361k2.f4400O = false;
        C0360j c0360j3 = qq4Var.f58071q;
        if (c0360j3 != null) {
            c0360j3.f4389i = Integer.MAX_VALUE;
            c0360j3.f4388h = Integer.MAX_VALUE;
            c0360j3.f4374M = LookaheadPassDelegate$PlacedState.IsNotPlaced;
        }
        if (k40Var.m14799f(8)) {
            kv8 kv8Var = this.f4321N;
            this.f4321N = null;
            this.f4320M = false;
            viewTreeObserverOnGlobalLayoutListenerC0391c.getSemanticsOwner().m21751b(this, kv8Var);
            viewTreeObserverOnGlobalLayoutListenerC0391c.m1731G();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1593h0(C0357g c0357g) {
        if (fa4.m11650l(c0357g, this.f4348h)) {
            return;
        }
        this.f4348h = c0357g;
        qq4 qq4Var = this.f4337b0;
        if (c0357g != null) {
            if (qq4Var.f58071q == null) {
                qq4Var.f58071q = new C0360j(qq4Var);
            }
            k40 k40Var = this.f4335a0;
            AbstractC0362l abstractC0362l = ((C0353c) k40Var.f46676d).f4433K;
            for (AbstractC0362l abstractC0362l2 = (AbstractC0362l) k40Var.f46677e; !fa4.m11650l(abstractC0362l2, abstractC0362l) && abstractC0362l2 != null; abstractC0362l2 = abstractC0362l2.f4433K) {
                abstractC0362l2.mo1541a1();
            }
        } else {
            qq4Var.f58071q = null;
            qq4Var.f58060f = false;
            qq4Var.f58059e = false;
        }
        m1566I();
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: i */
    public final void mo1502i() {
        C0429a rectManager;
        C3408og c3408og;
        C0429a rectManager2;
        if (!m1569L()) {
            i54.m13662a("onReuse is only expected on attached node");
        }
        AbstractC0442b abstractC0442b = this.f4317J;
        if (abstractC0442b != null) {
            abstractC0442b.mo1502i();
        }
        C0339f c0339f = this.f4339c0;
        if (c0339f != null) {
            c0339f.m1503j(false);
        }
        this.f4322O = false;
        boolean z = this.f4357l0;
        k40 k40Var = this.f4335a0;
        if (z) {
            this.f4357l0 = false;
        } else {
            d16 d16Var = (ir9) k40Var.f46678f;
            for (d16 d16Var2 = d16Var; d16Var2 != null; d16Var2 = d16Var2.f34841e) {
                if (d16Var2.f34836I) {
                    d16Var2.mo9974U0();
                }
            }
            for (d16 d16Var3 = d16Var; d16Var3 != null; d16Var3 = d16Var3.f34841e) {
                if (d16Var3.f34836I) {
                    d16Var3.mo9976W0();
                }
            }
            while (d16Var != null) {
                if (d16Var.f34836I) {
                    d16Var.mo9973Q0();
                }
                d16Var = d16Var.f34841e;
            }
        }
        int i = this.f4336b;
        Owner owner = this.f4316I;
        if (owner != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).getRectManager()) != null) {
            rectManager2.m1879i(this);
        }
        this.f4336b = nv8.f53301a.addAndGet(1);
        Owner owner2 = this.f4316I;
        if (owner2 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) owner2;
            viewTreeObserverOnGlobalLayoutListenerC0391c.getLayoutNodes().m21848g(i);
            viewTreeObserverOnGlobalLayoutListenerC0391c.getLayoutNodes().m21850i(this.f4336b, this);
        }
        for (d16 d16Var4 = (d16) k40Var.f46679g; d16Var4 != null; d16Var4 = d16Var4.f34842f) {
            d16Var4.mo9972P0();
        }
        k40Var.m14800g();
        if (k40Var.m14799f(8)) {
            m1567J();
        }
        m1556c0(this);
        Owner owner3 = this.f4316I;
        if (owner3 != null && (c3408og = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner3).f4697g0) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2 = c3408og.f54292c;
            fs6 fs6Var = c3408og.f54290a;
            u56 u56Var = c3408og.f54297h;
            if (u56Var.m22480g(i)) {
                fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c2, i, false);
            }
            kv8 kv8VarM1613z = m1613z();
            if (kv8VarM1613z != null && kv8VarM1613z.f48471a.m17250b(AbstractC0424d.f5011r)) {
                u56Var.m22474a(this.f4336b);
                fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c2, this.f4336b, true);
            }
        }
        Owner owner4 = this.f4316I;
        if (owner4 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner4).getRectManager()) == null) {
            return;
        }
        rectManager.m1878h(this);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1594i0(ht5 ht5Var) {
        if (fa4.m11650l(this.f4325R, ht5Var)) {
            return;
        }
        this.f4325R = ht5Var;
        bl2 bl2Var = this.f4326S;
        if (bl2Var != null) {
            ((xc9) ((t66) bl2Var.f8656b)).setValue(ht5Var);
        }
        m1566I();
    }

    /* JADX INFO: renamed from: j */
    public final void m1595j(ym0 ym0Var, C0312a c0312a) throws Throwable {
        try {
            ((AbstractC0362l) this.f4335a0.f46677e).m1676Y0(ym0Var, c0312a);
        } catch (Throwable th) {
            m1587e0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1596j0(e16 e16Var) {
        if (this.f4334a && this.f4345f0 != b16.f7762a) {
            i54.m13662a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f4357l0) {
            i54.m13662a("modifier is updated when deactivated");
        }
        if (!m1569L()) {
            this.f4347g0 = e16Var;
            return;
        }
        m1583c(e16Var);
        if (this.f4320M) {
            m1567J();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [d16] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX INFO: renamed from: k0 */
    public final void m1597k0(hta htaVar) {
        if (fa4.m11650l(this.f4329V, htaVar)) {
            return;
        }
        this.f4329V = htaVar;
        d16 d16Var = (d16) this.f4335a0.f46679g;
        if ((d16Var.f34840d & 16) != 0) {
            while (d16Var != null) {
                if ((d16Var.f34839c & 16) != 0) {
                    ?? M21992f = d16Var;
                    ?? x66Var = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof ng7) {
                            ((ng7) M21992f).mo1478E0();
                        } else if ((M21992f.f34839c & 16) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var2 = ((fa2) M21992f).f38701K;
                            int i = 0;
                            M21992f = M21992f;
                            x66Var = x66Var;
                            while (d16Var2 != null) {
                                if ((d16Var2.f34839c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        x66Var = x66Var;
                                        M21992f = d16Var2;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var.m24305c(d16Var2);
                                    }
                                }
                                d16Var2 = d16Var2.f34842f;
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M21992f = te1.m21992f(x66Var);
                    }
                }
                if ((d16Var.f34840d & 16) == 0) {
                    return;
                } else {
                    d16Var = d16Var.f34842f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1598l() {
        if (this.f4348h != null) {
            m1554Z(this, false, 5);
        } else {
            m1555b0(this, false, 5);
        }
        C0361k c0361k = this.f4337b0.f58070p;
        bk1 bk1Var = c0361k.f4424j ? new bk1(c0361k.f49304d) : null;
        Owner owner = this.f4316I;
        if (bk1Var != null) {
            if (owner != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1755y(this, bk1Var.f8631a);
            }
        } else if (owner != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1754x(true);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1599l0() {
        if (this.f4350i <= 0 || !this.f4356l) {
            return;
        }
        this.f4356l = false;
        x66 x66Var = this.f4354k;
        if (x66Var == null) {
            x66Var = new x66(new C0357g[16]);
            this.f4354k = x66Var;
        }
        x66Var.m24310h();
        x66 x66Var2 = (x66) this.f4352j.f8655a;
        Object[] objArr = x66Var2.f67830a;
        int i = x66Var2.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g = (C0357g) objArr[i2];
            if (c0357g.f4334a) {
                x66Var.m24306d(x66Var.f67832c, c0357g.m1559B());
            } else {
                x66Var.m24305c(c0357g);
            }
        }
        qq4 qq4Var = this.f4337b0;
        qq4Var.f58070p.f4407V = true;
        C0360j c0360j = qq4Var.f58071q;
        if (c0360j != null) {
            c0360j.f4377P = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final List m1600m() {
        C0360j c0360j = this.f4337b0.f58071q;
        c0360j.getClass();
        x66 x66Var = c0360j.f4376O;
        qq4 qq4Var = c0360j.f4386f;
        qq4Var.f58055a.m1602o();
        if (!c0360j.f4377P) {
            return x66Var.m24309g();
        }
        C0357g c0357g = qq4Var.f58055a;
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (x66Var.f67832c <= i2) {
                C0360j c0360j2 = c0357g2.f4337b0.f58071q;
                c0360j2.getClass();
                x66Var.m24305c(c0360j2);
            } else {
                C0360j c0360j3 = c0357g2.f4337b0.f58071q;
                c0360j3.getClass();
                Object[] objArr2 = x66Var.f67830a;
                Object obj = objArr2[i2];
                objArr2[i2] = c0360j3;
            }
        }
        x66Var.m24315m(((x66) ((f66) c0357g.m1602o()).f38520b).f67832c, x66Var.f67832c);
        c0360j.f4377P = false;
        return x66Var.m24309g();
    }

    /* JADX INFO: renamed from: n */
    public final List m1601n() {
        return this.f4337b0.f58070p.m1656p0();
    }

    /* JADX INFO: renamed from: o */
    public final List m1602o() {
        return m1559B().m24309g();
    }

    /* JADX INFO: renamed from: p */
    public final List m1603p() {
        return ((x66) this.f4352j.f8655a).m24309g();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1604q() {
        return this.f4337b0.f58070p.f4403R;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1605r() {
        return this.f4337b0.f58070p.f4402Q;
    }

    /* JADX INFO: renamed from: s */
    public final LayoutNode$UsageByParent m1606s() {
        return this.f4337b0.f58070p.f4426l;
    }

    /* JADX INFO: renamed from: t */
    public final LayoutNode$UsageByParent m1607t() {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        C0360j c0360j = this.f4337b0.f58071q;
        return (c0360j == null || (layoutNode$UsageByParent = c0360j.f4390j) == null) ? LayoutNode$UsageByParent.NotUsed : layoutNode$UsageByParent;
    }

    public final String toString() {
        return ygd.m25141a(this) + " children: " + ((x66) ((f66) m1602o()).f38520b).f67832c + " measurePolicy: " + this.f4325R + " deactivated: " + this.f4357l0 + " isVirtual: " + this.f4334a + " isPlaced: " + m1570M();
    }

    /* JADX INFO: renamed from: u */
    public final List m1608u() {
        k40 k40Var = this.f4335a0;
        x66 x66Var = (x66) k40Var.f46680h;
        if (x66Var == null) {
            return EmptyList.f47638a;
        }
        x66 x66Var2 = new x66(new f16[x66Var.f67832c]);
        d16 d16Var = (d16) k40Var.f46679g;
        int i = 0;
        while (d16Var != null) {
            ir9 ir9Var = (ir9) k40Var.f46678f;
            if (d16Var == ir9Var) {
                break;
            }
            AbstractC0362l abstractC0362l = d16Var.f34844h;
            b17 b17Var = null;
            if (abstractC0362l == null) {
                C3386nv.m17626m("getModifierInfo called on node with no coordinator");
                return null;
            }
            b17 b17Var2 = abstractC0362l.f4455g0;
            b17 b17Var3 = ((C0353c) k40Var.f46676d).f4455g0;
            d16 d16Var2 = d16Var.f34842f;
            if (d16Var2 == ir9Var && abstractC0362l != d16Var2.f34844h) {
                b17Var = b17Var3;
            }
            if (b17Var2 == null) {
                b17Var2 = b17Var;
            }
            x66Var2.m24305c(new f16((e16) x66Var.f67830a[i], abstractC0362l, b17Var2));
            d16Var = d16Var.f34842f;
            i++;
        }
        return x66Var2.m24309g();
    }

    /* JADX INFO: renamed from: v */
    public final bl2 m1609v() {
        bl2 bl2Var = this.f4326S;
        if (bl2Var != null) {
            return bl2Var;
        }
        ht5 ht5Var = this.f4325R;
        bl2 bl2Var2 = new bl2();
        bl2Var2.f8655a = this;
        bl2Var2.f8656b = AbstractC0278f.m1260j(ht5Var);
        this.f4326S = bl2Var2;
        return bl2Var2;
    }

    /* JADX INFO: renamed from: w */
    public final C0357g m1610w() {
        C0357g c0357g = this.f4315H;
        while (c0357g != null && c0357g.f4334a) {
            c0357g = c0357g.f4315H;
        }
        return c0357g;
    }

    @Override // p000.c17
    /* JADX INFO: renamed from: x */
    public final boolean mo1611x() {
        return m1569L();
    }

    /* JADX INFO: renamed from: y */
    public final int m1612y() {
        return this.f4337b0.f58070p.f4423i;
    }

    /* JADX INFO: renamed from: z */
    public final kv8 m1613z() {
        if (m1569L() && !this.f4357l0 && this.f4335a0.m14799f(8)) {
            return this.f4321N;
        }
        return null;
    }

    public C0357g(int i) {
        this(nv8.f53301a.addAndGet(1), (i & 1) == 0);
    }
}
