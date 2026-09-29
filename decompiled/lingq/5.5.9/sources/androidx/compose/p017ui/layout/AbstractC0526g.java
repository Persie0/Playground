package androidx.compose.p017ui.layout;

import ae.C0062b;
import androidx.compose.p017ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import p127g1.InterfaceC5647k;
import p166i1.AbstractC6164s;
import p338qd.C8573r0;
import p385sf.C9000b;
import p387t0.InterfaceC9172x;
import p470x1.C10013a;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.layout.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0526g {

    /* JADX INFO: renamed from: a */
    public int f3686a;

    /* JADX INFO: renamed from: b */
    public int f3687b;

    /* JADX INFO: renamed from: c */
    public long f3688c = C9000b.m17236a(0, 0);

    /* JADX INFO: renamed from: d */
    public long f3689d = PlaceableKt.f3671b;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public static final C10587a f3690a = new C10587a(0);

        /* JADX INFO: renamed from: b */
        public static LayoutDirection f3691b = LayoutDirection.Ltr;

        /* JADX INFO: renamed from: c */
        public static int f3692c;

        /* JADX INFO: renamed from: d */
        public static InterfaceC5647k f3693d;

        /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a$a, reason: collision with other inner class name */
        public static final class C10587a extends a {
            public C10587a(int i10) {
            }

            /* JADX INFO: renamed from: i */
            public static final boolean m2065i(C10587a c10587a, AbstractC6164s abstractC6164s) {
                c10587a.getClass();
                boolean z10 = false;
                if (abstractC6164s == null) {
                    a.f3693d = null;
                    return false;
                }
                boolean z11 = abstractC6164s.f35994f;
                AbstractC6164s abstractC6164sMo2163Q0 = abstractC6164s.mo2163Q0();
                if (abstractC6164sMo2163Q0 != null && abstractC6164sMo2163Q0.f35994f) {
                    z10 = true;
                }
                if (z10) {
                    abstractC6164s.f35994f = true;
                }
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = abstractC6164s.mo2161O0().f3759V;
                if (abstractC6164s.f35994f || abstractC6164s.f35993e) {
                    a.f3693d = null;
                } else {
                    a.f3693d = abstractC6164s.mo2158M0();
                }
                return z11;
            }

            @Override // androidx.compose.p017ui.layout.AbstractC0526g.a
            /* JADX INFO: renamed from: a */
            public final LayoutDirection mo2063a() {
                return a.f3691b;
            }

            @Override // androidx.compose.p017ui.layout.AbstractC0526g.a
            /* JADX INFO: renamed from: b */
            public final int mo2064b() {
                return a.f3692c;
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m2057c(a aVar, AbstractC0526g abstractC0526g, int i10, int i11) {
            aVar.getClass();
            C5207g.m11111f(abstractC0526g, "<this>");
            long jM16752r = C8573r0.m16752r(i10, i11);
            long jM2053V = abstractC0526g.m2053V();
            abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(jM16752r)), 0.0f, null);
        }

        /* JADX INFO: renamed from: d */
        public static void m2058d(AbstractC0526g abstractC0526g, long j10, float f3) {
            C5207g.m11111f(abstractC0526g, "$this$place");
            long jM2053V = abstractC0526g.m2053V();
            abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (j10 >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(j10)), f3, null);
        }

        /* JADX INFO: renamed from: e */
        public static void m2059e(a aVar, AbstractC0526g abstractC0526g, int i10, int i11) {
            aVar.getClass();
            C5207g.m11111f(abstractC0526g, "<this>");
            long jM16752r = C8573r0.m16752r(i10, i11);
            if (aVar.mo2063a() != LayoutDirection.Ltr && aVar.mo2064b() != 0) {
                long jM16752r2 = C8573r0.m16752r((aVar.mo2064b() - abstractC0526g.f3686a) - ((int) (jM16752r >> 32)), C10020h.m18625a(jM16752r));
                long jM2053V = abstractC0526g.m2053V();
                abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r2 >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(jM16752r2)), 0.0f, null);
                return;
            }
            long jM2053V2 = abstractC0526g.m2053V();
            abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r >> 32)) + ((int) (jM2053V2 >> 32)), C10020h.m18625a(jM2053V2) + C10020h.m18625a(jM16752r)), 0.0f, null);
        }

        /* JADX INFO: renamed from: f */
        public static void m2060f(a aVar, AbstractC0526g abstractC0526g, int i10, int i11) {
            InterfaceC2052l<InterfaceC9172x, C9072e> interfaceC2052l = PlaceableKt.f3670a;
            aVar.getClass();
            C5207g.m11111f(abstractC0526g, "<this>");
            C5207g.m11111f(interfaceC2052l, "layerBlock");
            long jM16752r = C8573r0.m16752r(i10, i11);
            if (aVar.mo2063a() != LayoutDirection.Ltr && aVar.mo2064b() != 0) {
                long jM16752r2 = C8573r0.m16752r((aVar.mo2064b() - abstractC0526g.f3686a) - ((int) (jM16752r >> 32)), C10020h.m18625a(jM16752r));
                long jM2053V = abstractC0526g.m2053V();
                abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r2 >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(jM16752r2)), 0.0f, interfaceC2052l);
                return;
            }
            long jM2053V2 = abstractC0526g.m2053V();
            abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r >> 32)) + ((int) (jM2053V2 >> 32)), C10020h.m18625a(jM2053V2) + C10020h.m18625a(jM16752r)), 0.0f, interfaceC2052l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public static void m2061g(a aVar, AbstractC0526g abstractC0526g, int i10, int i11, InterfaceC2052l interfaceC2052l, int i12) {
            if ((i12 & 8) != 0) {
                interfaceC2052l = PlaceableKt.f3670a;
            }
            aVar.getClass();
            C5207g.m11111f(abstractC0526g, "<this>");
            C5207g.m11111f(interfaceC2052l, "layerBlock");
            long jM16752r = C8573r0.m16752r(i10, i11);
            long jM2053V = abstractC0526g.m2053V();
            abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (jM16752r >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(jM16752r)), 0.0f, interfaceC2052l);
        }

        /* JADX INFO: renamed from: h */
        public static void m2062h(AbstractC0526g abstractC0526g, long j10, float f3, InterfaceC2052l interfaceC2052l) {
            C5207g.m11111f(abstractC0526g, "$this$placeWithLayer");
            C5207g.m11111f(interfaceC2052l, "layerBlock");
            long jM2053V = abstractC0526g.m2053V();
            abstractC0526g.mo2056t0(C8573r0.m16752r(((int) (j10 >> 32)) + ((int) (jM2053V >> 32)), C10020h.m18625a(jM2053V) + C10020h.m18625a(j10)), f3, interfaceC2052l);
        }

        /* JADX INFO: renamed from: a */
        public abstract LayoutDirection mo2063a();

        /* JADX INFO: renamed from: b */
        public abstract int mo2064b();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m2050G0() {
        this.f3686a = C0062b.m361k0((int) (this.f3688c >> 32), C10013a.m18605j(this.f3689d), C10013a.m18603h(this.f3689d));
        this.f3687b = C0062b.m361k0(C10022j.m18628b(this.f3688c), C10013a.m18604i(this.f3689d), C10013a.m18602g(this.f3689d));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m2051H0(long j10) {
        if (C10022j.m18627a(this.f3688c, j10)) {
            return;
        }
        this.f3688c = j10;
        m2050G0();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m2052I0(long j10) {
        if (C10013a.m18597b(this.f3689d, j10)) {
            return;
        }
        this.f3689d = j10;
        m2050G0();
    }

    /* JADX INFO: renamed from: V */
    public final long m2053V() {
        int i10 = this.f3686a;
        long j10 = this.f3688c;
        return C8573r0.m16752r((i10 - ((int) (j10 >> 32))) / 2, (this.f3687b - C10022j.m18628b(j10)) / 2);
    }

    /* JADX INFO: renamed from: X */
    public int mo2054X() {
        return C10022j.m18628b(this.f3688c);
    }

    /* JADX INFO: renamed from: e0 */
    public int mo2055e0() {
        return (int) (this.f3688c >> 32);
    }

    /* JADX INFO: renamed from: t0 */
    public abstract void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l);
}
