package androidx.compose.p017ui.draw;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.InterfaceC0544c;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5212l;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5639c;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p166i1.InterfaceC6143f;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.C9147h;
import p387t0.C9149i;
import p387t0.C9170v;
import p387t0.InterfaceC9165q;
import p424v0.InterfaceC9619c;
import p444w0.AbstractC9790b;
import p470x1.C10013a;
import p470x1.C10014b;
import p470x1.C10020h;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class PainterModifierNode extends InterfaceC0500b.c implements InterfaceC0544c, InterfaceC6143f {

    /* JADX INFO: renamed from: H */
    public InterfaceC7885a f3339H;

    /* JADX INFO: renamed from: I */
    public InterfaceC5639c f3340I;

    /* JADX INFO: renamed from: J */
    public float f3341J;

    /* JADX INFO: renamed from: K */
    public C9170v f3342K;

    /* JADX INFO: renamed from: k */
    public AbstractC9790b f3343k;

    /* JADX INFO: renamed from: l */
    public boolean f3344l;

    public PainterModifierNode(AbstractC9790b abstractC9790b, boolean z10, InterfaceC7885a interfaceC7885a, InterfaceC5639c interfaceC5639c, float f3, C9170v c9170v) {
        C5207g.m11111f(abstractC9790b, "painter");
        C5207g.m11111f(interfaceC7885a, "alignment");
        C5207g.m11111f(interfaceC5639c, "contentScale");
        this.f3343k = abstractC9790b;
        this.f3344l = z10;
        this.f3339H = interfaceC7885a;
        this.f3340I = interfaceC5639c;
        this.f3341J = f3;
        this.f3342K = c9170v;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m1937J(long j10) {
        boolean z10 = false;
        if (!C8944f.m17174a(j10, C8944f.f46907c)) {
            float fM17175b = C8944f.m17175b(j10);
            if ((Float.isInfinite(fM17175b) || Float.isNaN(fM17175b)) ? false : true) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1938K(long j10) {
        if (C8944f.m17174a(j10, C8944f.f46907c)) {
            return false;
        }
        float fM17177d = C8944f.m17177d(j10);
        return !Float.isInfinite(fM17177d) && !Float.isNaN(fM17177d);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1939I() {
        boolean z10 = false;
        if (this.f3344l) {
            long jMo2009c = this.f3343k.mo2009c();
            int i10 = C8944f.f46908d;
            if (jMo2009c != C8944f.f46907c) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX INFO: renamed from: L */
    public final long m1940L(long j10) {
        boolean z10 = C10013a.m18599d(j10) && C10013a.m18598c(j10);
        boolean z11 = C10013a.m18601f(j10) && C10013a.m18600e(j10);
        if ((!m1939I() && z10) || z11) {
            return C10013a.m18596a(j10, C10013a.m18603h(j10), 0, C10013a.m18602g(j10), 0, 10);
        }
        long jMo2009c = this.f3343k.mo2009c();
        long jM16788m = C8584v.m16788m(C10014b.m18616f(m1938K(jMo2009c) ? C8573r0.m16710Y0(C8944f.m17177d(jMo2009c)) : C10013a.m18605j(j10), j10), C10014b.m18615e(m1937J(jMo2009c) ? C8573r0.m16710Y0(C8944f.m17175b(jMo2009c)) : C10013a.m18604i(j10), j10));
        if (m1939I()) {
            long jM16788m2 = C8584v.m16788m(!m1938K(this.f3343k.mo2009c()) ? C8944f.m17177d(jM16788m) : C8944f.m17177d(this.f3343k.mo2009c()), !m1937J(this.f3343k.mo2009c()) ? C8944f.m17175b(jM16788m) : C8944f.m17175b(this.f3343k.mo2009c()));
            if (C8944f.m17177d(jM16788m) == 0.0f) {
                jM16788m = C8944f.f46906b;
            } else {
                if (C8944f.m17175b(jM16788m) == 0.0f) {
                    jM16788m = C8944f.f46906b;
                } else {
                    jM16788m = C8573r0.m16726g1(jM16788m2, this.f3340I.mo12012a(jM16788m2, jM16788m));
                }
            }
        }
        return C10013a.m18596a(j10, C10014b.m18616f(C8573r0.m16710Y0(C8944f.m17177d(jM16788m)), j10), 0, C10014b.m18615e(C8573r0.m16710Y0(C8944f.m17175b(jM16788m)), j10), 0, 10);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: a */
    public final int mo1941a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        if (!m1939I()) {
            return interfaceC5644h.mo2045a(i10);
        }
        long jM1940L = m1940L(C10014b.m18612b(i10, 0, 13));
        return Math.max(C10013a.m18604i(jM1940L), interfaceC5644h.mo2045a(i10));
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: b */
    public final int mo1942b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        if (!m1939I()) {
            return interfaceC5644h.mo2044R(i10);
        }
        long jM1940L = m1940L(C10014b.m18612b(i10, 0, 13));
        return Math.max(C10013a.m18604i(jM1940L), interfaceC5644h.mo2044R(i10));
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1943e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(m1940L(j10));
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.draw.PainterModifierNode$measure$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                AbstractC0526g.a.m2059e(aVar2, abstractC0526gMo2048w, 0, 0);
                return C9072e.f47360a;
            }
        });
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: f */
    public final int mo1944f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        if (!m1939I()) {
            return interfaceC5644h.mo2047u(i10);
        }
        long jM1940L = m1940L(C10014b.m18612b(0, i10, 7));
        return Math.max(C10013a.m18605j(jM1940L), interfaceC5644h.mo2047u(i10));
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: g */
    public final int mo1945g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        if (!m1939I()) {
            return interfaceC5644h.mo2046s(i10);
        }
        long jM1940L = m1940L(C10014b.m18612b(0, i10, 7));
        return Math.max(C10013a.m18605j(jM1940L), interfaceC5644h.mo2046s(i10));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    @Override // p166i1.InterfaceC6143f
    /* JADX INFO: renamed from: s */
    public final void mo1946s(InterfaceC9619c interfaceC9619c) {
        long jM16726g1;
        C5207g.m11111f(interfaceC9619c, "<this>");
        long jMo2009c = this.f3343k.mo2009c();
        long jM16788m = C8584v.m16788m(m1938K(jMo2009c) ? C8944f.m17177d(jMo2009c) : C8944f.m17177d(interfaceC9619c.mo12674d()), m1937J(jMo2009c) ? C8944f.m17175b(jMo2009c) : C8944f.m17175b(interfaceC9619c.mo12674d()));
        if (C8944f.m17177d(interfaceC9619c.mo12674d()) == 0.0f) {
            jM16726g1 = C8944f.f46906b;
        } else {
            if (C8944f.m17175b(interfaceC9619c.mo12674d()) == 0.0f) {
                jM16726g1 = C8944f.f46906b;
            } else {
                jM16726g1 = C8573r0.m16726g1(jM16788m, this.f3340I.mo12012a(jM16788m, interfaceC9619c.mo12674d()));
            }
        }
        long jMo15655a = this.f3339H.mo15655a(C9000b.m17236a(C8573r0.m16710Y0(C8944f.m17177d(jM16726g1)), C8573r0.m16710Y0(C8944f.m17175b(jM16726g1))), C9000b.m17236a(C8573r0.m16710Y0(C8944f.m17177d(interfaceC9619c.mo12674d())), C8573r0.m16710Y0(C8944f.m17175b(interfaceC9619c.mo12674d()))), interfaceC9619c.getLayoutDirection());
        float f3 = (int) (jMo15655a >> 32);
        float fM18625a = C10020h.m18625a(jMo15655a);
        interfaceC9619c.mo12676l0().f49292a.m18087f(f3, fM18625a);
        AbstractC9790b abstractC9790b = this.f3343k;
        float f10 = this.f3341J;
        C9170v c9170v = this.f3342K;
        abstractC9790b.getClass();
        if (!(abstractC9790b.f49898d == f10)) {
            if (!abstractC9790b.mo2007a(f10)) {
                if (f10 == 1.0f) {
                    C9147h c9147h = abstractC9790b.f49895a;
                    if (c9147h != null) {
                        c9147h.m17442d(f10);
                    }
                    abstractC9790b.f49896b = false;
                } else {
                    C9147h c9147hM17467a = abstractC9790b.f49895a;
                    if (c9147hM17467a == null) {
                        c9147hM17467a = C9149i.m17467a();
                        abstractC9790b.f49895a = c9147hM17467a;
                    }
                    c9147hM17467a.m17442d(f10);
                    abstractC9790b.f49896b = true;
                }
            }
            abstractC9790b.f49898d = f10;
        }
        if (!C5207g.m11106a(abstractC9790b.f49897c, c9170v)) {
            if (!abstractC9790b.mo2008b(c9170v)) {
                if (c9170v == null) {
                    C9147h c9147h2 = abstractC9790b.f49895a;
                    if (c9147h2 != null) {
                        c9147h2.m17445g(null);
                    }
                    abstractC9790b.f49896b = false;
                } else {
                    C9147h c9147hM17467a2 = abstractC9790b.f49895a;
                    if (c9147hM17467a2 == null) {
                        c9147hM17467a2 = C9149i.m17467a();
                        abstractC9790b.f49895a = c9147hM17467a2;
                    }
                    c9147hM17467a2.m17445g(c9170v);
                    abstractC9790b.f49896b = true;
                }
            }
            abstractC9790b.f49897c = c9170v;
        }
        LayoutDirection layoutDirection = interfaceC9619c.getLayoutDirection();
        if (abstractC9790b.f49899e != layoutDirection) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            abstractC9790b.f49899e = layoutDirection;
        }
        float fM17177d = C8944f.m17177d(interfaceC9619c.mo12674d()) - C8944f.m17177d(jM16726g1);
        float fM17175b = C8944f.m17175b(interfaceC9619c.mo12674d()) - C8944f.m17175b(jM16726g1);
        interfaceC9619c.mo12676l0().f49292a.m18084c(0.0f, 0.0f, fM17177d, fM17175b);
        if (f10 > 0.0f && C8944f.m17177d(jM16726g1) > 0.0f && C8944f.m17175b(jM16726g1) > 0.0f) {
            if (abstractC9790b.f49896b) {
                C8942d c8942dM11165l = C5212l.m11165l(C8941c.f46888b, C8584v.m16788m(C8944f.m17177d(jM16726g1), C8944f.m17175b(jM16726g1)));
                InterfaceC9165q interfaceC9165qMo18080b = interfaceC9619c.mo12676l0().mo18080b();
                C9147h c9147hM17467a3 = abstractC9790b.f49895a;
                if (c9147hM17467a3 == null) {
                    c9147hM17467a3 = C9149i.m17467a();
                    abstractC9790b.f49895a = c9147hM17467a3;
                }
                try {
                    interfaceC9165qMo18080b.mo17429p(c8942dM11165l, c9147hM17467a3);
                    abstractC9790b.mo2010d(interfaceC9619c);
                    interfaceC9165qMo18080b.mo17428o();
                } catch (Throwable th2) {
                    interfaceC9165qMo18080b.mo17428o();
                    throw th2;
                }
            } else {
                abstractC9790b.mo2010d(interfaceC9619c);
            }
        }
        interfaceC9619c.mo12676l0().f49292a.m18084c(-0.0f, -0.0f, -fM17177d, -fM17175b);
        interfaceC9619c.mo12676l0().f49292a.m18087f(-f3, -fM18625a);
        interfaceC9619c.mo12668E0();
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f3343k + ", sizeToIntrinsics=" + this.f3344l + ", alignment=" + this.f3339H + ", alpha=" + this.f3341J + ", colorFilter=" + this.f3342K + ')';
    }
}
