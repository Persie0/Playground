package androidx.compose.p017ui.node;

import ae.C0062b;
import android.graphics.Paint;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Map;
import kotlin.collections.C6753d;
import p127g1.AbstractC5636a;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5653q;
import p166i1.InterfaceC6140d0;
import p166i1.InterfaceC6155l;
import p385sf.C9000b;
import p387t0.C9147h;
import p387t0.C9149i;
import p387t0.C9169u;
import p387t0.InterfaceC9165q;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.node.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0545d extends NodeCoordinator {

    /* JADX INFO: renamed from: c0 */
    public static final C9147h f3896c0;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC0544c f3897a0;

    /* JADX INFO: renamed from: b0 */
    public InterfaceC6155l f3898b0;

    /* JADX INFO: renamed from: androidx.compose.ui.node.d$a */
    public final class a extends AbstractC0546e {

        /* JADX INFO: renamed from: H */
        public final InterfaceC6155l f3899H;

        /* JADX INFO: renamed from: I */
        public final C10588a f3900I;

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ C0545d f3901J;

        /* JADX INFO: renamed from: androidx.compose.ui.node.d$a$a, reason: collision with other inner class name */
        public final class C10588a implements InterfaceC5653q {

            /* JADX INFO: renamed from: a */
            public final Map<AbstractC5636a, Integer> f3902a = C6753d.m13459L0();

            public C10588a() {
            }

            @Override // p127g1.InterfaceC5653q
            /* JADX INFO: renamed from: a */
            public final int mo2038a() {
                NodeCoordinator nodeCoordinator = a.this.f3901J.f3845h;
                C5207g.m11108c(nodeCoordinator);
                AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
                C5207g.m11108c(abstractC0546e);
                return abstractC0546e.mo2162P0().mo2038a();
            }

            @Override // p127g1.InterfaceC5653q
            /* JADX INFO: renamed from: b */
            public final int mo2039b() {
                NodeCoordinator nodeCoordinator = a.this.f3901J.f3845h;
                C5207g.m11108c(nodeCoordinator);
                AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
                C5207g.m11108c(abstractC0546e);
                return abstractC0546e.mo2162P0().mo2039b();
            }

            @Override // p127g1.InterfaceC5653q
            /* JADX INFO: renamed from: e */
            public final Map<AbstractC5636a, Integer> mo2040e() {
                return this.f3902a;
            }

            @Override // p127g1.InterfaceC5653q
            /* JADX INFO: renamed from: f */
            public final void mo2041f() {
                AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
                NodeCoordinator nodeCoordinator = a.this.f3901J.f3845h;
                C5207g.m11108c(nodeCoordinator);
                AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
                C5207g.m11108c(abstractC0546e);
                AbstractC0526g.a.m2057c(c10587a, abstractC0546e, 0, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0545d c0545d, InterfaceC6155l interfaceC6155l) {
            super(c0545d);
            C5207g.m11111f(null, "scope");
            this.f3901J = c0545d;
            this.f3899H = interfaceC6155l;
            this.f3900I = new C10588a();
        }

        @Override // p166i1.AbstractC6164s
        /* JADX INFO: renamed from: J0 */
        public final int mo2208J0(AbstractC5636a abstractC5636a) {
            C5207g.m11111f(abstractC5636a, "alignmentLine");
            int iM392s = C0062b.m392s(this, abstractC5636a);
            this.f3910l.put(abstractC5636a, Integer.valueOf(iM392s));
            return iM392s;
        }

        @Override // p127g1.InterfaceC5651o
        /* JADX INFO: renamed from: w */
        public final AbstractC0526g mo2048w(long j10) {
            m2052I0(j10);
            NodeCoordinator nodeCoordinator = this.f3901J.f3845h;
            C5207g.m11108c(nodeCoordinator);
            AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
            C5207g.m11108c(abstractC0546e);
            abstractC0546e.mo2048w(j10);
            this.f3899H.mo2094u(C9000b.m17236a(abstractC0546e.mo2162P0().mo2039b(), abstractC0546e.mo2162P0().mo2038a()));
            AbstractC0546e.m2209U0(this, this.f3900I);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.d$b */
    public final class b extends AbstractC0546e {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ C0545d f3904H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0545d c0545d) {
            super(c0545d);
            C5207g.m11111f(null, "scope");
            this.f3904H = c0545d;
        }

        @Override // p166i1.AbstractC6164s
        /* JADX INFO: renamed from: J0 */
        public final int mo2208J0(AbstractC5636a abstractC5636a) {
            C5207g.m11111f(abstractC5636a, "alignmentLine");
            int iM392s = C0062b.m392s(this, abstractC5636a);
            this.f3910l.put(abstractC5636a, Integer.valueOf(iM392s));
            return iM392s;
        }

        @Override // androidx.compose.p017ui.node.AbstractC0546e, p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: R */
        public final int mo2044R(int i10) {
            C0545d c0545d = this.f3904H;
            InterfaceC0544c interfaceC0544c = c0545d.f3897a0;
            NodeCoordinator nodeCoordinator = c0545d.f3845h;
            C5207g.m11108c(nodeCoordinator);
            AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
            C5207g.m11108c(abstractC0546e);
            return interfaceC0544c.mo1942b(this, abstractC0546e, i10);
        }

        @Override // androidx.compose.p017ui.node.AbstractC0546e, p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: a */
        public final int mo2045a(int i10) {
            C0545d c0545d = this.f3904H;
            InterfaceC0544c interfaceC0544c = c0545d.f3897a0;
            NodeCoordinator nodeCoordinator = c0545d.f3845h;
            C5207g.m11108c(nodeCoordinator);
            AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
            C5207g.m11108c(abstractC0546e);
            return interfaceC0544c.mo1941a(this, abstractC0546e, i10);
        }

        @Override // androidx.compose.p017ui.node.AbstractC0546e, p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: s */
        public final int mo2046s(int i10) {
            C0545d c0545d = this.f3904H;
            InterfaceC0544c interfaceC0544c = c0545d.f3897a0;
            NodeCoordinator nodeCoordinator = c0545d.f3845h;
            C5207g.m11108c(nodeCoordinator);
            AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
            C5207g.m11108c(abstractC0546e);
            return interfaceC0544c.mo1945g(this, abstractC0546e, i10);
        }

        @Override // androidx.compose.p017ui.node.AbstractC0546e, p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: u */
        public final int mo2047u(int i10) {
            C0545d c0545d = this.f3904H;
            InterfaceC0544c interfaceC0544c = c0545d.f3897a0;
            NodeCoordinator nodeCoordinator = c0545d.f3845h;
            C5207g.m11108c(nodeCoordinator);
            AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
            C5207g.m11108c(abstractC0546e);
            return interfaceC0544c.mo1944f(this, abstractC0546e, i10);
        }

        @Override // p127g1.InterfaceC5651o
        /* JADX INFO: renamed from: w */
        public final AbstractC0526g mo2048w(long j10) {
            m2052I0(j10);
            C0545d c0545d = this.f3904H;
            InterfaceC0544c interfaceC0544c = c0545d.f3897a0;
            NodeCoordinator nodeCoordinator = c0545d.f3845h;
            C5207g.m11108c(nodeCoordinator);
            AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
            C5207g.m11108c(abstractC0546e);
            AbstractC0546e.m2209U0(this, interfaceC0544c.mo1943e(this, abstractC0546e, j10));
            return this;
        }
    }

    static {
        C9147h c9147hM17467a = C9149i.m17467a();
        c9147hM17467a.m17444f(C9169u.f47701d);
        Paint paint = c9147hM17467a.f47651a;
        C5207g.m11111f(paint, "<this>");
        paint.setStrokeWidth(1.0f);
        c9147hM17467a.m17449k(1);
        f3896c0 = c9147hM17467a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0545d(LayoutNode layoutNode, InterfaceC0544c interfaceC0544c) {
        super(layoutNode);
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f3897a0 = interfaceC0544c;
        this.f3898b0 = (((interfaceC0544c.mo1934v().f3327b & 512) != 0) && (interfaceC0544c instanceof InterfaceC6155l)) ? (InterfaceC6155l) interfaceC0544c : null;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: J0 */
    public final int mo2208J0(AbstractC5636a abstractC5636a) {
        C5207g.m11111f(abstractC5636a, "alignmentLine");
        AbstractC0546e abstractC0546e = this.f3835L;
        if (abstractC0546e == null) {
            return C0062b.m392s(this, abstractC5636a);
        }
        Integer num = (Integer) abstractC0546e.f3910l.get(abstractC5636a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: R */
    public final int mo2044R(int i10) {
        InterfaceC0544c interfaceC0544c = this.f3897a0;
        NodeCoordinator nodeCoordinator = this.f3845h;
        C5207g.m11108c(nodeCoordinator);
        return interfaceC0544c.mo1942b(this, nodeCoordinator, i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: a */
    public final int mo2045a(int i10) {
        InterfaceC0544c interfaceC0544c = this.f3897a0;
        NodeCoordinator nodeCoordinator = this.f3845h;
        C5207g.m11108c(nodeCoordinator);
        return interfaceC0544c.mo1941a(this, nodeCoordinator, i10);
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator
    /* JADX INFO: renamed from: e1 */
    public final InterfaceC0500b.c mo2178e1() {
        return this.f3897a0.mo1934v();
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator
    /* JADX INFO: renamed from: o1 */
    public final void mo2188o1() {
        super.mo2188o1();
        InterfaceC0544c interfaceC0544c = this.f3897a0;
        if (!((interfaceC0544c.mo1934v().f3327b & 512) != 0) || !(interfaceC0544c instanceof InterfaceC6155l)) {
            this.f3898b0 = null;
            if (this.f3835L != null) {
                this.f3835L = new b(this);
                return;
            }
            return;
        }
        InterfaceC6155l interfaceC6155l = (InterfaceC6155l) interfaceC0544c;
        this.f3898b0 = interfaceC6155l;
        if (this.f3835L != null) {
            this.f3835L = new a(this, interfaceC6155l);
        }
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator
    /* JADX INFO: renamed from: r1 */
    public final void mo2192r1(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        NodeCoordinator nodeCoordinator = this.f3845h;
        C5207g.m11108c(nodeCoordinator);
        nodeCoordinator.m2170Y0(interfaceC9165q);
        if (C0062b.m296O1(this.f3844g).getShowLayoutBounds()) {
            m2171Z0(interfaceC9165q, f3896c0);
        }
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: s */
    public final int mo2046s(int i10) {
        InterfaceC0544c interfaceC0544c = this.f3897a0;
        NodeCoordinator nodeCoordinator = this.f3845h;
        C5207g.m11108c(nodeCoordinator);
        return interfaceC0544c.mo1945g(this, nodeCoordinator, i10);
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator, androidx.compose.p017ui.layout.AbstractC0526g
    /* JADX INFO: renamed from: t0 */
    public final void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        super.mo2056t0(j10, f3, interfaceC2052l);
        if (this.f35993e) {
            return;
        }
        m2191q1();
        AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
        int i10 = (int) (this.f3688c >> 32);
        LayoutDirection layoutDirection = this.f3844g.f3747J;
        InterfaceC5647k interfaceC5647k = AbstractC0526g.a.f3693d;
        c10587a.getClass();
        int i11 = AbstractC0526g.a.f3692c;
        LayoutDirection layoutDirection2 = AbstractC0526g.a.f3691b;
        AbstractC0526g.a.f3692c = i10;
        AbstractC0526g.a.f3691b = layoutDirection;
        boolean zM2065i = AbstractC0526g.a.C10587a.m2065i(c10587a, this);
        mo2162P0().mo2041f();
        this.f35994f = zM2065i;
        AbstractC0526g.a.f3692c = i11;
        AbstractC0526g.a.f3691b = layoutDirection2;
        AbstractC0526g.a.f3693d = interfaceC5647k;
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: u */
    public final int mo2047u(int i10) {
        InterfaceC0544c interfaceC0544c = this.f3897a0;
        NodeCoordinator nodeCoordinator = this.f3845h;
        C5207g.m11108c(nodeCoordinator);
        return interfaceC0544c.mo1944f(this, nodeCoordinator, i10);
    }

    @Override // p127g1.InterfaceC5651o
    /* JADX INFO: renamed from: w */
    public final AbstractC0526g mo2048w(long j10) {
        m2052I0(j10);
        InterfaceC0544c interfaceC0544c = this.f3897a0;
        NodeCoordinator nodeCoordinator = this.f3845h;
        C5207g.m11108c(nodeCoordinator);
        m2195t1(interfaceC0544c.mo1943e(this, nodeCoordinator, j10));
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.mo2317g(this.f3688c);
        }
        m2189p1();
        return this;
    }
}
