package androidx.compose.p017ui.graphics.vector;

import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0477b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import dm.C5207g;
import p081e0.C5315i;
import p081e0.C5329p;
import p081e0.C5332q0;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5308f;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p338qd.C8573r0;
import p375s0.C8944f;
import p387t0.C9170v;
import p424v0.C9617a;
import p424v0.InterfaceC9621e;
import p444w0.AbstractC9790b;
import p469x0.C10001b;
import p469x0.C10006g;
import p469x0.C10011l;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class VectorPainter extends AbstractC9790b {

    /* JADX INFO: renamed from: f */
    public final ParcelableSnapshotMutableState f3537f = C8573r0.m16684L0(new C8944f(C8944f.f46906b));

    /* JADX INFO: renamed from: g */
    public final ParcelableSnapshotMutableState f3538g = C8573r0.m16684L0(Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public final VectorComponent f3539h;

    /* JADX INFO: renamed from: i */
    public InterfaceC5308f f3540i;

    /* JADX INFO: renamed from: j */
    public final ParcelableSnapshotMutableState f3541j;

    /* JADX INFO: renamed from: k */
    public float f3542k;

    /* JADX INFO: renamed from: l */
    public C9170v f3543l;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.f3473e = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                this.f3553b.f3541j.setValue(Boolean.TRUE);
                return C9072e.f47360a;
            }
        };
        this.f3539h = vectorComponent;
        this.f3541j = C8573r0.m16684L0(Boolean.TRUE);
        this.f3542k = 1.0f;
    }

    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: a */
    public final boolean mo2007a(float f3) {
        this.f3542k = f3;
        return true;
    }

    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: b */
    public final boolean mo2008b(C9170v c9170v) {
        this.f3543l = c9170v;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: c */
    public final long mo2009c() {
        return ((C8944f) this.f3537f.getValue()).f46909a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p444w0.AbstractC9790b
    /* JADX INFO: renamed from: d */
    public final void mo2010d(InterfaceC9621e interfaceC9621e) {
        C5207g.m11111f(interfaceC9621e, "<this>");
        C9170v c9170v = this.f3543l;
        VectorComponent vectorComponent = this.f3539h;
        if (c9170v == null) {
            c9170v = (C9170v) vectorComponent.f3474f.getValue();
        }
        if (((Boolean) this.f3538g.getValue()).booleanValue() && interfaceC9621e.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo12680y0 = interfaceC9621e.mo12680y0();
            C9617a.b bVarMo12676l0 = interfaceC9621e.mo12676l0();
            long jMo18081d = bVarMo12676l0.mo18081d();
            bVarMo12676l0.mo18080b().mo17420d();
            bVarMo12676l0.f49292a.m18085d(jMo12680y0);
            vectorComponent.m2004e(interfaceC9621e, this.f3542k, c9170v);
            bVarMo12676l0.mo18080b().mo17428o();
            bVarMo12676l0.mo18079a(jMo18081d);
        } else {
            vectorComponent.m2004e(interfaceC9621e, this.f3542k, c9170v);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f3541j;
        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
            parcelableSnapshotMutableState.setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: e */
    public final void m2011e(final String str, final float f3, final float f10, final InterfaceC2058r<? super Float, ? super Float, ? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2058r, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(str, "name");
        C5207g.m11111f(interfaceC2058r, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1264894527);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        VectorComponent vectorComponent = this.f3539h;
        vectorComponent.getClass();
        C10001b c10001b = vectorComponent.f3470b;
        c10001b.getClass();
        c10001b.f50825i = str;
        c10001b.m18593c();
        if (!(vectorComponent.f3475g == f3)) {
            vectorComponent.f3475g = f3;
            vectorComponent.f3471c = true;
            vectorComponent.f3473e.mo807E();
        }
        if (!(vectorComponent.f3476h == f10)) {
            vectorComponent.f3476h = f10;
            vectorComponent.f3471c = true;
            vectorComponent.f3473e.mo807E();
        }
        composerImplMo1636j.mo1622c(-1165786124);
        ComposerImpl.C0466b c0466bM1590C = composerImplMo1636j.m1590C();
        composerImplMo1636j.mo1661w();
        final InterfaceC5308f c0477b = this.f3540i;
        if (c0477b == null || c0477b.mo1732l()) {
            C10006g c10006g = new C10006g(c10001b);
            Object obj = C5315i.f33586a;
            C5207g.m11111f(c0466bM1590C, "parent");
            c0477b = new C0477b(c0466bM1590C, c10006g);
        }
        this.f3540i = c0477b;
        c0477b.mo1726f(C7204a.m14523c(-1916507005, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                    interfaceC0476a3.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                    VectorPainter vectorPainter = this;
                    interfaceC2058r.mo1851T(Float.valueOf(vectorPainter.f3539h.f3475g), Float.valueOf(vectorPainter.f3539h.f3476h), interfaceC0476a3, 0);
                }
                return C9072e.f47360a;
            }
        }, true));
        C5333r.m11459a(c0477b, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5327o mo528n(C5329p c5329p) {
                C5207g.m11111f(c5329p, "$this$DisposableEffect");
                return new C10011l(c0477b);
            }
        }, composerImplMo1636j);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                this.f3545b.m2011e(str, f3, f10, interfaceC2058r, interfaceC0476a2, C8573r0.m16737l1(i10 | 1));
                return C9072e.f47360a;
            }
        };
    }
}
