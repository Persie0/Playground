package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3608te;
import p000.C3386nv;
import p000.InterfaceC3682ve;
import p000.al5;
import p000.b34;
import p000.bk1;
import p000.ct5;
import p000.dk1;
import p000.f66;
import p000.f84;
import p000.h66;
import p000.i54;
import p000.l36;
import p000.l87;
import p000.oq4;
import p000.pq4;
import p000.qq4;
import p000.ui3;
import p000.v54;
import p000.v63;
import p000.vi3;
import p000.x66;
import p000.xfa;
import p000.yk5;

/* JADX INFO: renamed from: androidx.compose.ui.node.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0360j extends l87 implements ct5, InterfaceC3682ve, l36 {

    /* JADX INFO: renamed from: H */
    public boolean f4369H;

    /* JADX INFO: renamed from: I */
    public bk1 f4370I;

    /* JADX INFO: renamed from: K */
    public vi3 f4372K;

    /* JADX INFO: renamed from: L */
    public C0312a f4373L;

    /* JADX INFO: renamed from: Q */
    public boolean f4378Q;

    /* JADX INFO: renamed from: T */
    public Object f4381T;

    /* JADX INFO: renamed from: X */
    public boolean f4385X;

    /* JADX INFO: renamed from: f */
    public final qq4 f4386f;

    /* JADX INFO: renamed from: g */
    public boolean f4387g;

    /* JADX INFO: renamed from: k */
    public boolean f4391k;

    /* JADX INFO: renamed from: l */
    public boolean f4392l;

    /* JADX INFO: renamed from: h */
    public int f4388h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    public int f4389i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public LayoutNode$UsageByParent f4390j = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: J */
    public long f4371J = 0;

    /* JADX INFO: renamed from: M */
    public LookaheadPassDelegate$PlacedState f4374M = LookaheadPassDelegate$PlacedState.IsNotPlaced;

    /* JADX INFO: renamed from: N */
    public final oq4 f4375N = new oq4(this, 1);

    /* JADX INFO: renamed from: O */
    public final x66 f4376O = new x66(new C0360j[16]);

    /* JADX INFO: renamed from: P */
    public boolean f4377P = true;

    /* JADX INFO: renamed from: R */
    public final ui3 f4379R = new ui3() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1

        /* JADX INFO: renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$1 */
        final class C03461 extends Lambda implements vi3 {

            /* JADX INFO: renamed from: b */
            public static final C03461 f4243b = new C03461(1);

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((InterfaceC3682ve) obj).mo1641b().f4292d = false;
                return xfa.f68157a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$4 */
        final class C03474 extends Lambda implements vi3 {

            /* JADX INFO: renamed from: b */
            public static final C03474 f4244b = new C03474(1);

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                InterfaceC3682ve interfaceC3682ve = (InterfaceC3682ve) obj;
                interfaceC3682ve.mo1641b().f4293e = interfaceC3682ve.mo1641b().f4292d;
                return xfa.f68157a;
            }
        }

        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            C0360j c0360j = this.f4242b;
            qq4 qq4Var = c0360j.f4386f;
            qq4Var.f58062h = 0;
            x66 x66VarM1559B = qq4Var.f58055a.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                C0360j c0360j2 = ((C0357g) objArr[i2]).f4337b0.f58071q;
                c0360j2.getClass();
                c0360j2.f4388h = c0360j2.f4389i;
                c0360j2.f4389i = Integer.MAX_VALUE;
                if (c0360j2.f4390j == LayoutNode$UsageByParent.InLayoutBlock) {
                    c0360j2.f4390j = LayoutNode$UsageByParent.NotUsed;
                }
            }
            c0360j.mo1648s(C03461.f4243b);
            v54 v54Var = c0360j.mo1643e().f4308o0;
            if (v54Var == null) {
                C3386nv.m17633t("Expected lookahead delegate");
                return null;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C0357g c0357g = qq4Var.f58055a;
            C0357g c0357g2 = qq4Var.f58055a;
            List listM1602o = c0357g.m1602o();
            int size = listM1602o.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0357g c0357g3 = (C0357g) ((f66) listM1602o).get(i3);
                yk5 yk5VarMo1542d1 = ((AbstractC0362l) c0357g3.f4335a0.f46677e).mo1542d1();
                if (yk5VarMo1542d1 != null) {
                    if (yk5VarMo1542d1.f4367k) {
                        h66 h66Var = (h66) ref$ObjectRef.f47718a;
                        if (h66Var == null) {
                            h66Var = new h66();
                            ref$ObjectRef.f47718a = h66Var;
                        }
                        ref$ObjectRef.f47718a = h66Var;
                        h66Var.m13090g(c0357g3);
                    }
                    yk5VarMo1542d1.f4367k = v54Var.f4367k;
                }
            }
            v54Var.mo1624N0().mo10625c();
            List listM1602o2 = c0357g2.m1602o();
            int size2 = listM1602o2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    break;
                }
                C0357g c0357g4 = (C0357g) ((f66) listM1602o2).get(i4);
                h66 h66Var2 = (h66) ref$ObjectRef.f47718a;
                boolean z = h66Var2 != null && h66Var2.m718c(c0357g4) >= 0;
                yk5 yk5VarMo1542d2 = ((AbstractC0362l) c0357g4.f4335a0.f46677e).mo1542d1();
                if (yk5VarMo1542d2 != null) {
                    yk5VarMo1542d2.f4367k = z;
                }
                i4++;
            }
            x66 x66VarM1559B2 = c0357g2.m1559B();
            Object[] objArr2 = x66VarM1559B2.f67830a;
            int i5 = x66VarM1559B2.f67832c;
            for (int i6 = 0; i6 < i5; i6++) {
                C0360j c0360j3 = ((C0357g) objArr2[i6]).f4337b0.f58071q;
                c0360j3.getClass();
                int i7 = c0360j3.f4388h;
                int i8 = c0360j3.f4389i;
                if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                    c0360j3.m1647r0(true);
                }
            }
            c0360j.mo1648s(C03474.f4244b);
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: S */
    public boolean f4380S = true;

    /* JADX INFO: renamed from: U */
    public long f4382U = dk1.m10424b(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: V */
    public final ui3 f4383V = new ui3() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            C0360j c0360j = this.f4246b;
            yk5 yk5VarMo1542d1 = c0360j.f4386f.m20104a().mo1542d1();
            yk5VarMo1542d1.getClass();
            yk5VarMo1542d1.mo1514r(c0360j.f4382U);
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: W */
    public final ui3 f4384W = new ui3() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            yk5 yk5VarMo1542d1;
            C0360j c0360j = this.f4245b;
            qq4 qq4Var = c0360j.f4386f;
            AbstractC0343j placementScope = null;
            if (b34.m3256x(qq4Var.f58055a) || qq4Var.f58057c) {
                AbstractC0362l abstractC0362l = qq4Var.m20104a().f4434L;
                if (abstractC0362l != null) {
                    placementScope = abstractC0362l.f4368l;
                }
            } else {
                AbstractC0362l abstractC0362l2 = qq4Var.m20104a().f4434L;
                if (abstractC0362l2 != null && (yk5VarMo1542d1 = abstractC0362l2.mo1542d1()) != null) {
                    placementScope = yk5VarMo1542d1.f4368l;
                }
            }
            if (placementScope == null) {
                placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(qq4Var.f58055a)).getPlacementScope();
            }
            yk5 yk5VarMo1542d2 = qq4Var.m20104a().mo1542d1();
            yk5VarMo1542d2.getClass();
            AbstractC0343j.m1520i(placementScope, yk5VarMo1542d2, c0360j.f4371J);
            return xfa.f68157a;
        }
    };

    public C0360j(qq4 qq4Var) {
        this.f4386f = qq4Var;
        this.f4381T = qq4Var.f58070p.f4399N;
    }

    @Override // p000.l87, p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        return this.f4381T;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m1633B0() {
        qq4 qq4Var = this.f4386f;
        if (qq4Var.f58069o > 0) {
            x66 x66VarM1559B = qq4Var.f58055a.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                C0357g c0357g = (C0357g) objArr[i2];
                qq4 qq4Var2 = c0357g.f4337b0;
                if ((qq4Var2.f58067m || qq4Var2.f58068n) && !qq4Var2.f58060f) {
                    c0357g.m1581Y(false);
                }
                C0360j c0360j = qq4Var2.f58071q;
                if (c0360j != null) {
                    c0360j.m1633B0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m1634E0() {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        qq4 qq4Var = this.f4386f;
        C0357g.m1554Z(qq4Var.f58055a, false, 7);
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357gM1610w = c0357g.m1610w();
        if (c0357gM1610w == null || c0357g.f4331X != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = al5.f803a[c0357gM1610w.f4337b0.f58058d.ordinal()];
        if (i != 2) {
            layoutNode$UsageByParent = i != 3 ? c0357gM1610w.f4331X : LayoutNode$UsageByParent.InLayoutBlock;
        } else {
            layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
        }
        c0357g.f4331X = layoutNode$UsageByParent;
    }

    @Override // p000.l36
    /* JADX INFO: renamed from: H */
    public final void mo1619H(boolean z) {
        yk5 yk5VarMo1542d1;
        qq4 qq4Var = this.f4386f;
        yk5 yk5VarMo1542d2 = qq4Var.m20104a().mo1542d1();
        if (Boolean.valueOf(z).equals(yk5VarMo1542d2 != null ? Boolean.valueOf(yk5VarMo1542d2.f4365i) : null) || (yk5VarMo1542d1 = qq4Var.m20104a().mo1542d1()) == null) {
            return;
        }
        yk5VarMo1542d1.f4365i = z;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m1635H0() {
        LayoutNode$LayoutState layoutNode$LayoutState;
        this.f4385X = true;
        qq4 qq4Var = this.f4386f;
        C0357g c0357gM1610w = qq4Var.f58055a.m1610w();
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f4374M;
        if ((lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && !qq4Var.f58057c) || (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInApproach && qq4Var.f58057c)) {
            m1649u0();
            if (this.f4387g && c0357gM1610w != null) {
                c0357gM1610w.m1581Y(false);
            }
        }
        if (c0357gM1610w != null) {
            qq4 qq4Var2 = c0357gM1610w.f4337b0;
            if (!this.f4387g && ((layoutNode$LayoutState = qq4Var2.f58058d) == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut)) {
                if (this.f4389i != Integer.MAX_VALUE) {
                    i54.m13663b("Place was called on a node which was placed already");
                }
                int i = qq4Var2.f58062h;
                this.f4389i = i;
                qq4Var2.f58062h = i + 1;
            }
        } else {
            this.f4389i = 0;
        }
        mo1636I();
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: I */
    public final void mo1636I() {
        this.f4378Q = true;
        oq4 oq4Var = this.f4375N;
        oq4Var.m1540i();
        qq4 qq4Var = this.f4386f;
        boolean z = qq4Var.f58060f;
        C0357g c0357g = qq4Var.f58055a;
        if (z) {
            x66 x66VarM1559B = c0357g.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                C0357g c0357g2 = (C0357g) objArr[i2];
                qq4 qq4Var2 = c0357g2.f4337b0;
                if (qq4Var2.f58059e && c0357g2.m1607t() == LayoutNode$UsageByParent.InMeasureBlock) {
                    C0360j c0360j = qq4Var2.f58071q;
                    c0360j.getClass();
                    C0360j c0360j2 = qq4Var2.f58071q;
                    bk1 bk1Var = c0360j2 != null ? c0360j2.f4370I : null;
                    bk1Var.getClass();
                    if (c0360j.m1638J0(bk1Var.f8631a)) {
                        C0357g.m1554Z(c0357g, false, 7);
                    }
                }
            }
        }
        v54 v54Var = mo1643e().f4308o0;
        v54Var.getClass();
        if (qq4Var.f58061g || (!this.f4391k && !v54Var.f4367k && qq4Var.f58060f)) {
            qq4Var.f58060f = false;
            LayoutNode$LayoutState layoutNode$LayoutState = qq4Var.f58058d;
            qq4Var.f58058d = LayoutNode$LayoutState.LookaheadLayingOut;
            qq4Var.m20112i(false);
            C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getSnapshotObserver();
            snapshotObserver.f4460a.m11067c(c0357g, snapshotObserver.f4467h, this.f4379R);
            qq4Var.f58058d = layoutNode$LayoutState;
            if (qq4Var.f58067m && v54Var.f4367k) {
                requestLayout();
            }
            qq4Var.f58061g = false;
        }
        if (oq4Var.f4292d) {
            oq4Var.f4293e = true;
        }
        if (oq4Var.f4290b && oq4Var.m1537f()) {
            oq4Var.m1539h();
        }
        this.f4378Q = false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0085, B:31:0x006f), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: I0 */
    public final void m1637I0(long j, vi3 vi3Var, C0312a c0312a) throws Throwable {
        qq4 qq4Var = this.f4386f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        try {
            C0357g c0357gM1610w = c0357g.m1610w();
            LayoutNode$LayoutState layoutNode$LayoutState = c0357gM1610w != null ? c0357gM1610w.f4337b0.f58058d : null;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.LookaheadLayingOut;
            if (layoutNode$LayoutState == layoutNode$LayoutState2) {
                qq4Var.f58057c = false;
            }
            if (c0357g2.f4357l0) {
                i54.m13662a("place is called on a deactivated node");
            }
            qq4Var.f58058d = layoutNode$LayoutState2;
            boolean z = true;
            this.f4392l = true;
            this.f4385X = false;
            if (!f84.m11593b(j, this.f4371J)) {
                if (qq4Var.f58068n || qq4Var.f58067m) {
                    qq4Var.f58060f = true;
                }
                m1633B0();
            }
            Owner ownerM19457a = pq4.m19457a(c0357g2);
            this.f4371J = j;
            if (qq4Var.f58060f) {
                qq4Var.m20111h(false);
                this.f4375N.f4295g = false;
                C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).getSnapshotObserver();
                snapshotObserver.f4460a.m11067c(c0357g2, snapshotObserver.f4466g, this.f4384W);
            } else {
                if (this.f4374M == LookaheadPassDelegate$PlacedState.IsNotPlaced) {
                    z = false;
                }
                if (z) {
                    yk5 yk5VarMo1542d1 = qq4Var.m20104a().mo1542d1();
                    yk5VarMo1542d1.getClass();
                    yk5VarMo1542d1.m25167W0(f84.m11595d(j, yk5VarMo1542d1.f49305e));
                    m1635H0();
                } else {
                    qq4Var.m20111h(false);
                    this.f4375N.f4295g = false;
                    C0364n snapshotObserver2 = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).getSnapshotObserver();
                    snapshotObserver2.f4460a.m11067c(c0357g2, snapshotObserver2.f4466g, this.f4384W);
                }
            }
            this.f4372K = vi3Var;
            this.f4373L = c0312a;
            qq4Var.f58058d = LayoutNode$LayoutState.Idle;
        } catch (Throwable th) {
            c0357g.m1587e0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m1638J0(long j) throws Throwable {
        qq4 qq4Var = this.f4386f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        try {
            if (c0357g.f4357l0) {
                i54.m13662a("measure is called on a deactivated node");
            }
            C0357g c0357gM1610w = c0357g2.m1610w();
            c0357g2.f4333Z = c0357g2.f4333Z || (c0357gM1610w != null && c0357gM1610w.f4333Z);
            if (!c0357g2.f4337b0.f58059e) {
                bk1 bk1Var = this.f4370I;
                if (bk1Var == null ? false : bk1.m3795c(bk1Var.f8631a, j)) {
                    Owner owner = c0357g2.f4316I;
                    if (owner != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1747k(c0357g2, true);
                    }
                    c0357g2.m1585d0();
                    return false;
                }
            }
            this.f4370I = new bk1(j);
            m16026m0(j);
            this.f4375N.f4294f = false;
            mo1648s(LookaheadPassDelegate$remeasure$1$2.f4247b);
            long j2 = this.f4369H ? this.f49303c : -9223372034707292160L;
            this.f4369H = true;
            yk5 yk5VarMo1542d1 = qq4Var.m20104a().mo1542d1();
            if (yk5VarMo1542d1 == null) {
                i54.m13663b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            qq4Var.m20106c(j);
            m16025k0((((long) yk5VarMo1542d1.f49301a) << 32) | (((long) yk5VarMo1542d1.f49302b) & 4294967295L));
            return (((int) (j2 >> 32)) == yk5VarMo1542d1.f49301a && ((int) (j2 & 4294967295L)) == yk5VarMo1542d1.f49302b) ? false : true;
        } catch (Throwable th) {
            c0357g.m1587e0(th);
            throw null;
        }
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: S */
    public final void mo1639S() {
        C0357g.m1554Z(this.f4386f.f58055a, false, 7);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        m1634E0();
        yk5 yk5VarMo1542d1 = this.f4386f.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        return yk5VarMo1542d1.mo1510U(i);
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: V */
    public final int mo1630V(AbstractC3608te abstractC3608te) {
        qq4 qq4Var = this.f4386f;
        C0357g c0357gM1610w = qq4Var.f58055a.m1610w();
        LayoutNode$LayoutState layoutNode$LayoutState = c0357gM1610w != null ? c0357gM1610w.f4337b0.f58058d : null;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.LookaheadMeasuring;
        oq4 oq4Var = this.f4375N;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            oq4Var.f4291c = true;
        } else {
            C0357g c0357gM1610w2 = qq4Var.f58055a.m1610w();
            if ((c0357gM1610w2 != null ? c0357gM1610w2.f4337b0.f58058d : null) == LayoutNode$LayoutState.LookaheadLayingOut) {
                oq4Var.f4292d = true;
            }
        }
        this.f4391k = true;
        yk5 yk5VarMo1542d1 = qq4Var.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        int iMo1630V = yk5VarMo1542d1.mo1630V(abstractC3608te);
        this.f4391k = false;
        return iMo1630V;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: a0 */
    public final int mo1640a0() {
        yk5 yk5VarMo1542d1 = this.f4386f.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        return yk5VarMo1542d1.mo1640a0();
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: b */
    public final AbstractC0351a mo1641b() {
        return this.f4375N;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: b0 */
    public final int mo1642b0() {
        yk5 yk5VarMo1542d1 = this.f4386f.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        return yk5VarMo1542d1.mo1642b0();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        m1634E0();
        yk5 yk5VarMo1542d1 = this.f4386f.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        return yk5VarMo1542d1.mo1511c(i);
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: e */
    public final C0353c mo1643e() {
        return (C0353c) this.f4386f.f58055a.f4335a0.f46676d;
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: f */
    public final InterfaceC3682ve mo1644f() {
        qq4 qq4Var;
        C0357g c0357gM1610w = this.f4386f.f58055a.m1610w();
        if (c0357gM1610w == null || (qq4Var = c0357gM1610w.f4337b0) == null) {
            return null;
        }
        return qq4Var.f58071q;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: i0 */
    public final void mo1544i0(long j, float f, vi3 vi3Var) throws Throwable {
        m1637I0(j, vi3Var, null);
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: j0 */
    public final void mo1545j0(long j, float f, C0312a c0312a) throws Throwable {
        m1637I0(j, null, c0312a);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        m1634E0();
        yk5 yk5VarMo1542d1 = this.f4386f.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        return yk5VarMo1542d1.mo1512l(i);
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: m */
    public final int mo1645m() {
        return this.f4389i;
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        m1634E0();
        yk5 yk5VarMo1542d1 = this.f4386f.m20104a().mo1542d1();
        yk5VarMo1542d1.getClass();
        return yk5VarMo1542d1.mo1513p(i);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m1646p0() {
        qq4 qq4Var = this.f4386f;
        return b34.m3256x(qq4Var.f58055a) || qq4Var.f58057c;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        qq4 qq4Var = this.f4386f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        C0357g c0357gM1610w = c0357g.m1610w();
        if ((c0357gM1610w != null ? c0357gM1610w.f4337b0.f58058d : null) == LayoutNode$LayoutState.LookaheadMeasuring) {
            qq4Var.f58056b = false;
        } else {
            C0357g c0357gM1610w2 = c0357g2.m1610w();
            if ((c0357gM1610w2 != null ? c0357gM1610w2.f4337b0.f58058d : null) == LayoutNode$LayoutState.LookaheadLayingOut) {
                qq4Var.f58056b = false;
            }
        }
        C0357g c0357gM1610w3 = c0357g2.m1610w();
        if (c0357gM1610w3 != null) {
            qq4 qq4Var2 = c0357gM1610w3.f4337b0;
            if (this.f4390j != LayoutNode$UsageByParent.NotUsed && !c0357g2.f4333Z) {
                i54.m13663b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = al5.f803a[qq4Var2.f58058d.ordinal()];
            if (i == 1 || i == 2) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    v63.m23127A(qq4Var2.f58058d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InLayoutBlock;
            }
            this.f4390j = layoutNode$UsageByParent;
        } else {
            this.f4390j = LayoutNode$UsageByParent.NotUsed;
        }
        if (c0357g2.f4331X == LayoutNode$UsageByParent.NotUsed) {
            c0357g2.m1586e();
        }
        m1638J0(j);
        return this;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1647r0(boolean z) {
        if (z && m1646p0()) {
            return;
        }
        if (z || m1646p0()) {
            this.f4374M = LookaheadPassDelegate$PlacedState.IsNotPlaced;
            x66 x66VarM1559B = this.f4386f.f58055a.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                C0360j c0360j = ((C0357g) objArr[i2]).f4337b0.f58071q;
                c0360j.getClass();
                c0360j.m1647r0(true);
            }
        }
    }

    @Override // p000.InterfaceC3682ve
    public final void requestLayout() {
        this.f4386f.f58055a.m1581Y(false);
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: s */
    public final void mo1648s(vi3 vi3Var) {
        x66 x66VarM1559B = this.f4386f.f58055a.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0360j c0360j = ((C0357g) objArr[i2]).f4337b0.f58071q;
            c0360j.getClass();
            vi3Var.invoke(c0360j);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1649u0() {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.f4374M;
        qq4 qq4Var = this.f4386f;
        boolean z = qq4Var.f58057c;
        C0357g c0357g = qq4Var.f58055a;
        if (z) {
            this.f4374M = LookaheadPassDelegate$PlacedState.IsPlacedInApproach;
        } else {
            this.f4374M = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
        }
        if (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && qq4Var.f58059e) {
            C0357g.m1554Z(c0357g, true, 6);
        }
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            C0360j c0360j = c0357g2.f4337b0.f58071q;
            if (c0360j == null) {
                C3386nv.m17626m("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c0360j.f4389i != Integer.MAX_VALUE) {
                c0360j.m1649u0();
                C0357g.m1556c0(c0357g2);
            }
        }
    }
}
