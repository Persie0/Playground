package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC3608te;
import p000.InterfaceC3682ve;
import p000.b34;
import p000.bk1;
import p000.ct5;
import p000.dk1;
import p000.f66;
import p000.f84;
import p000.fa4;
import p000.gt5;
import p000.i54;
import p000.k40;
import p000.l36;
import p000.l87;
import p000.n84;
import p000.oq4;
import p000.pq4;
import p000.qq4;
import p000.ui3;
import p000.v63;
import p000.vi3;
import p000.x66;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.node.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0361k extends l87 implements ct5, InterfaceC3682ve, l36 {

    /* JADX INFO: renamed from: H */
    public boolean f4393H;

    /* JADX INFO: renamed from: J */
    public vi3 f4395J;

    /* JADX INFO: renamed from: K */
    public C0312a f4396K;

    /* JADX INFO: renamed from: L */
    public float f4397L;

    /* JADX INFO: renamed from: N */
    public Object f4399N;

    /* JADX INFO: renamed from: O */
    public boolean f4400O;

    /* JADX INFO: renamed from: P */
    public boolean f4401P;

    /* JADX INFO: renamed from: Q */
    public boolean f4402Q;

    /* JADX INFO: renamed from: R */
    public boolean f4403R;

    /* JADX INFO: renamed from: S */
    public boolean f4404S;

    /* JADX INFO: renamed from: W */
    public boolean f4408W;

    /* JADX INFO: renamed from: a0 */
    public float f4412a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f4413b0;

    /* JADX INFO: renamed from: c0 */
    public vi3 f4414c0;

    /* JADX INFO: renamed from: d0 */
    public C0312a f4415d0;

    /* JADX INFO: renamed from: f */
    public final qq4 f4417f;

    /* JADX INFO: renamed from: f0 */
    public float f4418f0;

    /* JADX INFO: renamed from: g */
    public boolean f4419g;

    /* JADX INFO: renamed from: h0 */
    public boolean f4422h0;

    /* JADX INFO: renamed from: j */
    public boolean f4424j;

    /* JADX INFO: renamed from: k */
    public boolean f4425k;

    /* JADX INFO: renamed from: h */
    public int f4421h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    public int f4423i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public LayoutNode$UsageByParent f4426l = LayoutNode$UsageByParent.NotUsed;

    /* JADX INFO: renamed from: I */
    public long f4394I = 0;

    /* JADX INFO: renamed from: M */
    public boolean f4398M = true;

    /* JADX INFO: renamed from: T */
    public final oq4 f4405T = new oq4(this, 0);

    /* JADX INFO: renamed from: U */
    public final x66 f4406U = new x66(new C0361k[16]);

    /* JADX INFO: renamed from: V */
    public boolean f4407V = true;

    /* JADX INFO: renamed from: X */
    public long f4409X = dk1.m10424b(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: Y */
    public final ui3 f4410Y = new ui3() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            C0361k c0361k = this.f4251b;
            c0361k.f4417f.m20104a().mo1514r(c0361k.f4409X);
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: Z */
    public final ui3 f4411Z = new ui3() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1

        /* JADX INFO: renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$1 */
        final class C03481 extends Lambda implements vi3 {

            /* JADX INFO: renamed from: b */
            public static final C03481 f4249b = new C03481(1);

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((InterfaceC3682ve) obj).mo1641b().f4292d = false;
                return xfa.f68157a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$4 */
        final class C03494 extends Lambda implements vi3 {

            /* JADX INFO: renamed from: b */
            public static final C03494 f4250b = new C03494(1);

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
            C0361k c0361k = this.f4248b;
            qq4 qq4Var = c0361k.f4417f;
            qq4Var.f58063i = 0;
            x66 x66VarM1559B = qq4Var.f58055a.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                C0361k c0361k2 = ((C0357g) objArr[i2]).f4337b0.f58070p;
                c0361k2.f4421h = c0361k2.f4423i;
                c0361k2.f4423i = Integer.MAX_VALUE;
                c0361k2.f4401P = false;
                if (c0361k2.f4426l == LayoutNode$UsageByParent.InLayoutBlock) {
                    c0361k2.f4426l = LayoutNode$UsageByParent.NotUsed;
                }
            }
            c0361k.mo1648s(C03481.f4249b);
            if (c0361k.mo1643e().f4367k) {
                List listM1602o = qq4Var.f58055a.m1602o();
                int size = listM1602o.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((AbstractC0362l) ((C0357g) ((f66) listM1602o).get(i3)).f4335a0.f46677e).f4367k = true;
                }
            }
            c0361k.mo1643e().mo1624N0().mo10625c();
            if (c0361k.mo1643e().f4367k) {
                List listM1602o2 = qq4Var.f58055a.m1602o();
                int size2 = listM1602o2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((AbstractC0362l) ((C0357g) ((f66) listM1602o2).get(i4)).f4335a0.f46677e).f4367k = false;
                }
            }
            C0357g c0357g = qq4Var.f58055a;
            x66 x66VarM1559B2 = c0357g.m1559B();
            Object[] objArr2 = x66VarM1559B2.f67830a;
            int i5 = x66VarM1559B2.f67832c;
            for (int i6 = 0; i6 < i5; i6++) {
                C0357g c0357g2 = (C0357g) objArr2[i6];
                qq4 qq4Var2 = c0357g2.f4337b0;
                if (qq4Var2.f58070p.f4421h != c0357g2.m1612y()) {
                    c0357g.m1576S();
                    c0357g.m1563F();
                    if (c0357g2.m1612y() == Integer.MAX_VALUE) {
                        if (qq4Var2.f58057c || b34.m3256x(c0357g2)) {
                            C0360j c0360j = qq4Var2.f58071q;
                            c0360j.getClass();
                            c0360j.m1647r0(false);
                        }
                        qq4Var2.f58070p.m1658u0();
                    }
                }
            }
            c0361k.mo1648s(C03494.f4250b);
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: e0 */
    public long f4416e0 = 0;

    /* JADX INFO: renamed from: g0 */
    public final ui3 f4420g0 = new ui3() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            AbstractC0343j placementScope;
            C0361k c0361k = this.f4252b;
            qq4 qq4Var = c0361k.f4417f;
            AbstractC0362l abstractC0362l = qq4Var.m20104a().f4434L;
            if (abstractC0362l == null || (placementScope = abstractC0362l.f4368l) == null) {
                placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(qq4Var.f58055a)).getPlacementScope();
            }
            vi3 vi3Var = c0361k.f4414c0;
            C0312a c0312a = c0361k.f4415d0;
            if (c0312a != null) {
                AbstractC0362l abstractC0362lM20104a = qq4Var.m20104a();
                long j = c0361k.f4416e0;
                float f = c0361k.f4418f0;
                placementScope.getClass();
                AbstractC0343j.m1518b(placementScope, abstractC0362lM20104a);
                abstractC0362lM20104a.mo1545j0(f84.m11595d(j, abstractC0362lM20104a.f49305e), f, c0312a);
            } else if (vi3Var == null) {
                AbstractC0362l abstractC0362lM20104a2 = qq4Var.m20104a();
                long j2 = c0361k.f4416e0;
                float f2 = c0361k.f4418f0;
                placementScope.getClass();
                AbstractC0343j.m1518b(placementScope, abstractC0362lM20104a2);
                abstractC0362lM20104a2.mo1544i0(f84.m11595d(j2, abstractC0362lM20104a2.f49305e), f2, null);
            } else {
                AbstractC0362l abstractC0362lM20104a3 = qq4Var.m20104a();
                long j3 = c0361k.f4416e0;
                float f3 = c0361k.f4418f0;
                placementScope.getClass();
                AbstractC0343j.m1518b(placementScope, abstractC0362lM20104a3);
                abstractC0362lM20104a3.mo1544i0(f84.m11595d(j3, abstractC0362lM20104a3.f49305e), f3, vi3Var);
            }
            return xfa.f68157a;
        }
    };

    public C0361k(qq4 qq4Var) {
        this.f4417f = qq4Var;
    }

    @Override // p000.l87, p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        return this.f4399N;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m1650B0() {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        qq4 qq4Var = this.f4417f;
        C0357g.m1555b0(qq4Var.f58055a, false, 7);
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357gM1610w = c0357g.m1610w();
        if (c0357gM1610w == null || c0357g.f4331X != LayoutNode$UsageByParent.NotUsed) {
            return;
        }
        int i = gt5.f41298a[c0357gM1610w.f4337b0.f58058d.ordinal()];
        if (i != 1) {
            layoutNode$UsageByParent = i != 2 ? c0357gM1610w.f4331X : LayoutNode$UsageByParent.InLayoutBlock;
        } else {
            layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
        }
        c0357g.f4331X = layoutNode$UsageByParent;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m1651E0() {
        this.f4413b0 = true;
        qq4 qq4Var = this.f4417f;
        C0357g c0357gM1610w = qq4Var.f58055a.m1610w();
        float f = mo1643e().f4444V;
        C0357g c0357g = qq4Var.f58055a;
        k40 k40Var = c0357g.f4335a0;
        AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
        C0353c c0353c = (C0353c) k40Var.f46676d;
        while (abstractC0362l != c0353c) {
            abstractC0362l.getClass();
            C0355e c0355e = (C0355e) abstractC0362l;
            f += c0355e.f4444V;
            abstractC0362l = c0355e.f4433K;
        }
        if (f != this.f4412a0) {
            this.f4412a0 = f;
            if (c0357gM1610w != null) {
                c0357gM1610w.m1576S();
            }
            if (c0357gM1610w != null) {
                c0357gM1610w.m1563F();
            }
        }
        if (!mo1643e().f4367k) {
            boolean z = this.f4400O;
            if (!z || this.f4405T.m1536e()) {
                m1657r0();
            }
            if (z) {
                ((C0353c) c0357g.f4335a0.f46676d).m1696q1();
            } else {
                if (c0357gM1610w != null) {
                    c0357gM1610w.m1563F();
                }
                if (this.f4419g && c0357gM1610w != null) {
                    c0357gM1610w.m1582a0(false);
                }
            }
        }
        if (c0357gM1610w != null) {
            qq4 qq4Var2 = c0357gM1610w.f4337b0;
            if (!this.f4419g && qq4Var2.f58058d == LayoutNode$LayoutState.LayingOut) {
                if (this.f4423i != Integer.MAX_VALUE) {
                    i54.m13663b("Place was called on a node which was placed already");
                }
                int i = qq4Var2.f58063i;
                this.f4423i = i;
                qq4Var2.f58063i = i + 1;
            }
        } else {
            this.f4423i = 0;
        }
        mo1636I();
    }

    @Override // p000.l36
    /* JADX INFO: renamed from: H */
    public final void mo1619H(boolean z) {
        qq4 qq4Var = this.f4417f;
        if (z != qq4Var.m20104a().f4365i) {
            qq4Var.m20104a().f4365i = z;
            this.f4422h0 = true;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m1652H0(long j, float f, vi3 vi3Var, C0312a c0312a) {
        qq4 qq4Var = this.f4417f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        if (c0357g.f4357l0) {
            i54.m13662a("place is called on a deactivated node");
        }
        qq4Var.f58058d = LayoutNode$LayoutState.LayingOut;
        this.f4394I = j;
        this.f4397L = f;
        this.f4395J = vi3Var;
        this.f4396K = c0312a;
        this.f4413b0 = false;
        Owner ownerM19457a = pq4.m19457a(c0357g2);
        if (this.f4403R || !this.f4400O) {
            this.f4405T.f4295g = false;
            qq4Var.m20109f(false);
            this.f4414c0 = vi3Var;
            this.f4416e0 = j;
            this.f4418f0 = f;
            this.f4415d0 = c0312a;
            C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).getSnapshotObserver();
            snapshotObserver.f4460a.m11067c(c0357g2, snapshotObserver.f4465f, this.f4420g0);
        } else {
            AbstractC0362l abstractC0362lM20104a = qq4Var.m20104a();
            abstractC0362lM20104a.m1701v1(f84.m11595d(j, abstractC0362lM20104a.f49305e), f, vi3Var, c0312a);
            m1651E0();
        }
        qq4Var.f58058d = LayoutNode$LayoutState.Idle;
        if (qq4Var.m20104a().f4367k && (qq4Var.f58065k || qq4Var.f58064j)) {
            requestLayout();
        }
        this.f4425k = true;
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: I */
    public final void mo1636I() {
        this.f4408W = true;
        oq4 oq4Var = this.f4405T;
        oq4Var.m1540i();
        boolean z = this.f4403R;
        qq4 qq4Var = this.f4417f;
        if (z) {
            x66 x66VarM1559B = qq4Var.f58055a.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                C0357g c0357g = (C0357g) objArr[i2];
                if (c0357g.m1605r() && c0357g.m1606s() == LayoutNode$UsageByParent.InMeasureBlock && C0357g.m1553U(c0357g)) {
                    C0357g.m1555b0(qq4Var.f58055a, false, 7);
                }
            }
        }
        if (this.f4404S || (!this.f4393H && !mo1643e().f4367k && this.f4403R)) {
            this.f4403R = false;
            LayoutNode$LayoutState layoutNode$LayoutState = qq4Var.f58058d;
            qq4Var.f58058d = LayoutNode$LayoutState.LayingOut;
            qq4Var.m20110g(false);
            C0357g c0357g2 = qq4Var.f58055a;
            C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g2)).getSnapshotObserver();
            snapshotObserver.f4460a.m11067c(c0357g2, snapshotObserver.f4464e, this.f4411Z);
            qq4Var.f58058d = layoutNode$LayoutState;
            this.f4404S = false;
        }
        if (oq4Var.f4292d) {
            oq4Var.f4293e = true;
        }
        if (oq4Var.f4290b && oq4Var.m1537f()) {
            oq4Var.m1539h();
        }
        this.f4408W = false;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m1653I0(long j, float f, vi3 vi3Var, C0312a c0312a) throws Throwable {
        AbstractC0343j placementScope;
        qq4 qq4Var = this.f4417f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        try {
            this.f4401P = true;
            if (!f84.m11593b(j, this.f4394I) || vi3Var != this.f4395J || this.f4422h0) {
                if (qq4Var.f58065k || qq4Var.f58064j || this.f4422h0) {
                    this.f4403R = true;
                    this.f4422h0 = false;
                }
            }
            C0360j c0360j = qq4Var.f58071q;
            if (c0360j != null) {
                qq4 qq4Var2 = c0360j.f4386f;
                if (c0360j.f4374M == LookaheadPassDelegate$PlacedState.IsNotPlaced && !b34.m3256x(qq4Var2.f58055a)) {
                    qq4Var2.f58057c = true;
                }
            }
            C0360j c0360j2 = qq4Var.f58071q;
            if (c0360j2 != null && c0360j2.m1646p0()) {
                AbstractC0362l abstractC0362l = qq4Var.m20104a().f4434L;
                if (abstractC0362l == null || (placementScope = abstractC0362l.f4368l) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g2)).getPlacementScope();
                }
                C0360j c0360j3 = qq4Var.f58071q;
                c0360j3.getClass();
                C0357g c0357gM1610w = c0357g2.m1610w();
                if (c0357gM1610w != null) {
                    c0357gM1610w.f4337b0.f58062h = 0;
                }
                c0360j3.f4389i = Integer.MAX_VALUE;
                placementScope.m1530f(c0360j3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            C0360j c0360j4 = qq4Var.f58071q;
            if (c0360j4 != null && !c0360j4.f4392l) {
                i54.m13663b("Error: Placement happened before lookahead.");
            }
            m1652H0(j, f, vi3Var, c0312a);
        } catch (Throwable th) {
            c0357g.m1587e0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m1654J0(long j) throws Throwable {
        qq4 qq4Var = this.f4417f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        try {
            if (c0357g.f4357l0) {
                i54.m13662a("measure is called on a deactivated node");
            }
            Owner ownerM19457a = pq4.m19457a(c0357g2);
            C0357g c0357gM1610w = c0357g2.m1610w();
            boolean z = true;
            c0357g2.f4333Z = c0357g2.f4333Z || (c0357gM1610w != null && c0357gM1610w.f4333Z);
            if (!c0357g2.m1605r() && bk1.m3795c(this.f49304d, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).m1747k(c0357g2, false);
                c0357g2.m1585d0();
                return false;
            }
            this.f4405T.f4294f = false;
            mo1648s(MeasurePassDelegate$remeasure$1$2.f4253b);
            this.f4424j = true;
            long j2 = qq4Var.m20104a().f49303c;
            m16026m0(j);
            LayoutNode$LayoutState layoutNode$LayoutState = qq4Var.f58058d;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Idle;
            if (layoutNode$LayoutState != layoutNode$LayoutState2) {
                i54.m13663b("layout state is not idle before measure starts");
            }
            this.f4409X = j;
            LayoutNode$LayoutState layoutNode$LayoutState3 = LayoutNode$LayoutState.Measuring;
            qq4Var.f58058d = layoutNode$LayoutState3;
            this.f4402Q = false;
            C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g2)).getSnapshotObserver();
            snapshotObserver.f4460a.m11067c(c0357g2, snapshotObserver.f4462c, this.f4410Y);
            if (qq4Var.f58058d == layoutNode$LayoutState3) {
                this.f4403R = true;
                this.f4404S = true;
                qq4Var.f58058d = layoutNode$LayoutState2;
            }
            if (n84.m17279a(qq4Var.m20104a().f49303c, j2) && qq4Var.m20104a().f49301a == this.f49301a && qq4Var.m20104a().f49302b == this.f49302b) {
                z = false;
            }
            m16025k0((((long) qq4Var.m20104a().f49302b) & 4294967295L) | (((long) qq4Var.m20104a().f49301a) << 32));
            return z;
        } catch (Throwable th) {
            c0357g.m1587e0(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m1655N0() {
        qq4 qq4Var = this.f4417f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        if (!c0357g.m1570M() || qq4Var.f58066l <= 0) {
            return;
        }
        qq4 qq4Var2 = c0357g2.f4337b0;
        if ((qq4Var2.f58064j || qq4Var2.f58065k) && !qq4Var2.f58070p.f4403R) {
            c0357g2.m1582a0(false);
        }
        x66 x66VarM1559B = c0357g2.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0357g) objArr[i2]).f4337b0.f58070p.m1655N0();
        }
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: S */
    public final void mo1639S() {
        C0357g.m1555b0(this.f4417f.f58055a, false, 7);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        qq4 qq4Var = this.f4417f;
        if (!b34.m3256x(qq4Var.f58055a)) {
            m1650B0();
            return qq4Var.m20104a().mo1510U(i);
        }
        C0360j c0360j = qq4Var.f58071q;
        c0360j.getClass();
        return c0360j.mo1510U(i);
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: V */
    public final int mo1630V(AbstractC3608te abstractC3608te) {
        qq4 qq4Var = this.f4417f;
        C0357g c0357gM1610w = qq4Var.f58055a.m1610w();
        LayoutNode$LayoutState layoutNode$LayoutState = c0357gM1610w != null ? c0357gM1610w.f4337b0.f58058d : null;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        oq4 oq4Var = this.f4405T;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            oq4Var.f4291c = true;
        } else {
            C0357g c0357gM1610w2 = qq4Var.f58055a.m1610w();
            if ((c0357gM1610w2 != null ? c0357gM1610w2.f4337b0.f58058d : null) == LayoutNode$LayoutState.LayingOut) {
                oq4Var.f4292d = true;
            }
        }
        this.f4393H = true;
        int iMo1630V = qq4Var.m20104a().mo1630V(abstractC3608te);
        this.f4393H = false;
        return iMo1630V;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: a0 */
    public final int mo1640a0() {
        return this.f4417f.m20104a().mo1640a0();
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: b */
    public final AbstractC0351a mo1641b() {
        return this.f4405T;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: b0 */
    public final int mo1642b0() {
        return this.f4417f.m20104a().mo1642b0();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        qq4 qq4Var = this.f4417f;
        if (!b34.m3256x(qq4Var.f58055a)) {
            m1650B0();
            return qq4Var.m20104a().mo1511c(i);
        }
        C0360j c0360j = qq4Var.f58071q;
        c0360j.getClass();
        return c0360j.mo1511c(i);
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: e */
    public final C0353c mo1643e() {
        return (C0353c) this.f4417f.f58055a.f4335a0.f46676d;
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: f */
    public final InterfaceC3682ve mo1644f() {
        qq4 qq4Var;
        C0357g c0357gM1610w = this.f4417f.f58055a.m1610w();
        if (c0357gM1610w == null || (qq4Var = c0357gM1610w.f4337b0) == null) {
            return null;
        }
        return qq4Var.f58070p;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: i0 */
    public final void mo1544i0(long j, float f, vi3 vi3Var) throws Throwable {
        m1653I0(j, f, vi3Var, null);
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: j0 */
    public final void mo1545j0(long j, float f, C0312a c0312a) throws Throwable {
        m1653I0(j, f, null, c0312a);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        qq4 qq4Var = this.f4417f;
        if (!b34.m3256x(qq4Var.f58055a)) {
            m1650B0();
            return qq4Var.m20104a().mo1512l(i);
        }
        C0360j c0360j = qq4Var.f58071q;
        c0360j.getClass();
        return c0360j.mo1512l(i);
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: m */
    public final int mo1645m() {
        return this.f4423i;
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        qq4 qq4Var = this.f4417f;
        if (!b34.m3256x(qq4Var.f58055a)) {
            m1650B0();
            return qq4Var.m20104a().mo1513p(i);
        }
        C0360j c0360j = qq4Var.f58071q;
        c0360j.getClass();
        return c0360j.mo1513p(i);
    }

    /* JADX INFO: renamed from: p0 */
    public final List m1656p0() {
        qq4 qq4Var = this.f4417f;
        qq4Var.f58055a.m1599l0();
        boolean z = this.f4407V;
        x66 x66Var = this.f4406U;
        if (!z) {
            return x66Var.m24309g();
        }
        C0357g c0357g = qq4Var.f58055a;
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (x66Var.f67832c <= i2) {
                x66Var.m24305c(c0357g2.f4337b0.f58070p);
            } else {
                C0361k c0361k = c0357g2.f4337b0.f58070p;
                Object[] objArr2 = x66Var.f67830a;
                Object obj = objArr2[i2];
                objArr2[i2] = c0361k;
            }
        }
        x66Var.m24315m(((x66) ((f66) c0357g.m1602o()).f38520b).f67832c, x66Var.f67832c);
        this.f4407V = false;
        return x66Var.m24309g();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) throws Throwable {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        qq4 qq4Var = this.f4417f;
        C0357g c0357g = qq4Var.f58055a;
        C0357g c0357g2 = qq4Var.f58055a;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = c0357g.f4331X;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = LayoutNode$UsageByParent.NotUsed;
        if (layoutNode$UsageByParent2 == layoutNode$UsageByParent3) {
            c0357g.m1586e();
        }
        if (b34.m3256x(c0357g2)) {
            C0360j c0360j = qq4Var.f58071q;
            c0360j.getClass();
            c0360j.f4390j = layoutNode$UsageByParent3;
            c0360j.mo1514r(j);
        }
        C0357g c0357gM1610w = c0357g2.m1610w();
        if (c0357gM1610w != null) {
            qq4 qq4Var2 = c0357gM1610w.f4337b0;
            if (this.f4426l != layoutNode$UsageByParent3 && !c0357g2.f4333Z) {
                i54.m13663b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = gt5.f41298a[qq4Var2.f58058d.ordinal()];
            if (i == 1) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    v63.m23127A(qq4Var2.f58058d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.InLayoutBlock;
            }
            this.f4426l = layoutNode$UsageByParent;
        } else {
            this.f4426l = layoutNode$UsageByParent3;
        }
        m1654J0(j);
        return this;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1657r0() {
        boolean z = this.f4400O;
        this.f4400O = true;
        qq4 qq4Var = this.f4417f;
        C0357g c0357g = qq4Var.f58055a;
        k40 k40Var = c0357g.f4335a0;
        if (!z) {
            ((C0353c) k40Var.f46676d).m1696q1();
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getRectManager().m1878h(qq4Var.f58055a);
            if (c0357g.m1605r()) {
                C0357g.m1555b0(c0357g, true, 6);
            } else if (c0357g.f4337b0.f58059e) {
                C0357g.m1554Z(c0357g, true, 6);
            }
        }
        AbstractC0362l abstractC0362l = ((C0353c) k40Var.f46676d).f4433K;
        for (AbstractC0362l abstractC0362l2 = (AbstractC0362l) k40Var.f46677e; !fa4.m11650l(abstractC0362l2, abstractC0362l) && abstractC0362l2 != null; abstractC0362l2 = abstractC0362l2.f4433K) {
            if (abstractC0362l2.f4454f0) {
                abstractC0362l2.m1690m1();
            }
        }
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (c0357g2.m1612y() != Integer.MAX_VALUE) {
                c0357g2.f4337b0.f58070p.m1657r0();
                C0357g.m1556c0(c0357g2);
            }
        }
    }

    @Override // p000.InterfaceC3682ve
    public final void requestLayout() {
        this.f4417f.f58055a.m1582a0(false);
    }

    @Override // p000.InterfaceC3682ve
    /* JADX INFO: renamed from: s */
    public final void mo1648s(vi3 vi3Var) {
        x66 x66VarM1559B = this.f4417f.f58055a.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            vi3Var.invoke(((C0357g) objArr[i2]).f4337b0.f58070p);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1658u0() {
        if (this.f4400O) {
            this.f4400O = false;
            qq4 qq4Var = this.f4417f;
            C0357g c0357g = qq4Var.f58055a;
            C0357g c0357g2 = qq4Var.f58055a;
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getRectManager().m1879i(c0357g2);
            k40 k40Var = c0357g2.f4335a0;
            AbstractC0362l abstractC0362l = ((C0353c) k40Var.f46676d).f4433K;
            for (AbstractC0362l abstractC0362l2 = (AbstractC0362l) k40Var.f46677e; !fa4.m11650l(abstractC0362l2, abstractC0362l) && abstractC0362l2 != null; abstractC0362l2 = abstractC0362l2.f4433K) {
                abstractC0362l2.m1698s1();
                abstractC0362l2.m1703x1();
            }
            x66 x66VarM1559B = c0357g2.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i = x66VarM1559B.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0357g) objArr[i2]).f4337b0.f58070p.m1658u0();
            }
        }
    }
}
