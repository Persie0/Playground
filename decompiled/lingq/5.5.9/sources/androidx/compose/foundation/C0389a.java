package androidx.compose.foundation;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.support.v4.media.AbstractC0140a;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.draw.C0501a;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p166i1.C6150i0;
import p260m8.C7499b;
import p327q0.C8456b;
import p327q0.C8461g;
import p338qd.C8573r0;
import p338qd.C8584v;
import p349qo.C8656b;
import p375s0.C8939a;
import p375s0.C8941c;
import p375s0.C8943e;
import p375s0.C8944f;
import p386t.C9111c;
import p386t.C9112d;
import p387t0.AbstractC9134a0;
import p387t0.AbstractC9161o;
import p387t0.C9137c;
import p387t0.C9151j;
import p387t0.C9156l0;
import p387t0.C9159n;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9154k0;
import p424v0.C9617a;
import p424v0.C9623g;
import p424v0.C9624h;
import p424v0.InterfaceC9619c;
import p424v0.InterfaceC9621e;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.foundation.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0389a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1426a(C9112d c9112d, final InterfaceC9154k0 interfaceC9154k0) {
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        C5207g.m11111f(c9112d, "border");
        C5207g.m11111f(interfaceC9154k0, "shape");
        final AbstractC9161o abstractC9161o = c9112d.f47609b;
        C5207g.m11111f(abstractC9161o, "brush");
        InterfaceC2052l<C0661s0, C9072e> interfaceC2052l = InspectableValueKt.f4184a;
        final float f3 = c9112d.f47608a;
        return ComposedModifierKt.m1927a(aVar, interfaceC2052l, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.BorderKt$border$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0500b interfaceC0500b2 = interfaceC0500b;
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, -1498088849);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new C6150i0();
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                final C6150i0 c6150i0 = (C6150i0) objMo1624d;
                final float f10 = f3;
                final InterfaceC9154k0 interfaceC9154k1 = interfaceC9154k0;
                final AbstractC9161o abstractC9161o2 = abstractC9161o;
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b2.mo1929K(C0501a.m1949b(new InterfaceC2052l<C8456b, C8461g>() { // from class: androidx.compose.foundation.BorderKt$border$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r7v26, types: [T, t.c] */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C8461g mo528n(C8456b c8456b) {
                        C9111c c9111c;
                        C8456b c8456b2 = c8456b;
                        C5207g.m11111f(c8456b2, "$this$drawWithCache");
                        float density = c8456b2.getDensity();
                        float f11 = f10;
                        if (!(density * f11 >= 0.0f && C8944f.m17176c(c8456b2.m16540d()) > 0.0f)) {
                            return c8456b2.m16539a(new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$onDrawWithContent");
                                    interfaceC9619c2.mo12668E0();
                                    return C9072e.f47360a;
                                }
                            });
                        }
                        float f12 = 2;
                        final float fMin = Math.min(C10017e.m18618a(f11, 0.0f) ? 1.0f : (float) Math.ceil(c8456b2.getDensity() * f11), (float) Math.ceil(C8944f.m17176c(c8456b2.m16540d()) / f12));
                        final float f13 = fMin / f12;
                        final long jM14932c = C7499b.m14932c(f13, f13);
                        final long jM16788m = C8584v.m16788m(C8944f.m17177d(c8456b2.m16540d()) - fMin, C8944f.m17175b(c8456b2.m16540d()) - fMin);
                        boolean z10 = f12 * fMin > C8944f.m17176c(c8456b2.m16540d());
                        AbstractC9134a0 abstractC9134a0Mo17359a = interfaceC9154k1.mo17359a(c8456b2.m16540d(), c8456b2.f45627a.getLayoutDirection(), c8456b2);
                        if (abstractC9134a0Mo17359a instanceof AbstractC9134a0.a) {
                            final AbstractC9134a0.a aVar2 = (AbstractC9134a0.a) abstractC9134a0Mo17359a;
                            final AbstractC9161o abstractC9161o3 = abstractC9161o2;
                            if (z10) {
                                return c8456b2.m16539a(new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                        InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                        C5207g.m11111f(interfaceC9619c2, "$this$onDrawWithContent");
                                        interfaceC9619c2.mo12668E0();
                                        aVar2.getClass();
                                        InterfaceC9621e.m18089F0(interfaceC9619c2, null, abstractC9161o3, 0.0f, null, 60);
                                        return C9072e.f47360a;
                                    }
                                });
                            }
                            if (abstractC9161o3 instanceof C9156l0) {
                                long j10 = ((C9156l0) abstractC9161o3).f47684a;
                                C5207g.m11111f(Build.VERSION.SDK_INT >= 29 ? C9159n.f47687a.m17478a(j10, 5) : new PorterDuffColorFilter(C8584v.m16780C(j10), C9137c.m17404b(5)), "nativeColorFilter");
                            }
                            aVar2.getClass();
                            throw null;
                        }
                        if (!(abstractC9134a0Mo17359a instanceof AbstractC9134a0.c)) {
                            if (!(abstractC9134a0Mo17359a instanceof AbstractC9134a0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final AbstractC9161o abstractC9161o4 = abstractC9161o2;
                            if (z10) {
                                jM14932c = C8941c.f46888b;
                            }
                            if (z10) {
                                jM16788m = c8456b2.m16540d();
                            }
                            final AbstractC0140a c9624h = z10 ? C9623g.f49295a : new C9624h(fMin, 0.0f, 0, 0, 30);
                            final long j11 = jM14932c;
                            final long j12 = jM16788m;
                            return c8456b2.m16539a(new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$onDrawWithContent");
                                    interfaceC9619c2.mo12668E0();
                                    InterfaceC9621e.m18092b0(interfaceC9619c2, abstractC9161o4, j11, j12, 0.0f, c9624h, 104);
                                    return C9072e.f47360a;
                                }
                            });
                        }
                        final AbstractC9161o abstractC9161o5 = abstractC9161o2;
                        AbstractC9134a0.c cVar = (AbstractC9134a0.c) abstractC9134a0Mo17359a;
                        boolean zM16877D = C8656b.m16877D(cVar.f47642a);
                        C8943e c8943e = cVar.f47642a;
                        if (zM16877D) {
                            final long j13 = c8943e.f46902e;
                            final C9624h c9624h2 = new C9624h(fMin, 0.0f, 0, 0, 30);
                            final boolean z11 = z10;
                            return c8456b2.m16539a(new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                    InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                    C5207g.m11111f(interfaceC9619c2, "$this$onDrawWithContent");
                                    interfaceC9619c2.mo12668E0();
                                    if (z11) {
                                        InterfaceC9621e.m18088C0(interfaceC9619c2, abstractC9161o5, 0L, 0L, j13, null, 246);
                                    } else {
                                        long j14 = j13;
                                        float fM17157b = C8939a.m17157b(j14);
                                        float f14 = f13;
                                        if (fM17157b < f14) {
                                            float f15 = fMin;
                                            float fM17177d = C8944f.m17177d(interfaceC9619c2.mo12674d());
                                            float f16 = fMin;
                                            float f17 = fM17177d - f16;
                                            float fM17175b = C8944f.m17175b(interfaceC9619c2.mo12674d()) - f16;
                                            AbstractC9161o abstractC9161o6 = abstractC9161o5;
                                            long j15 = j13;
                                            C9617a.b bVarMo12676l0 = interfaceC9619c2.mo12676l0();
                                            long jMo18081d = bVarMo12676l0.mo18081d();
                                            bVarMo12676l0.mo18080b().mo17420d();
                                            bVarMo12676l0.f49292a.m18083b(f15, f15, f17, fM17175b, 0);
                                            InterfaceC9621e.m18088C0(interfaceC9619c2, abstractC9161o6, 0L, 0L, j15, null, 246);
                                            bVarMo12676l0.mo18080b().mo17428o();
                                            bVarMo12676l0.mo18079a(jMo18081d);
                                        } else {
                                            InterfaceC9621e.m18088C0(interfaceC9619c2, abstractC9161o5, jM14932c, jM16788m, C0389a.m1427b(f14, j14), c9624h2, 208);
                                        }
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                        }
                        C6150i0<C9111c> c6150i1 = c6150i0;
                        C9111c c9111c2 = c6150i1.f35965a;
                        if (c9111c2 == null) {
                            c9111c = c9111c2;
                            ?? c9111c3 = new C9111c(0);
                            c6150i1.f35965a = c9111c3;
                            c9111c = c9111c3;
                        }
                        c9111c = c9111c2;
                        final InterfaceC9138c0 interfaceC9138c0M16758t = c9111c.f47607d;
                        if (interfaceC9138c0M16758t == null) {
                            interfaceC9138c0M16758t = C8573r0.m16758t();
                            c9111c.f47607d = interfaceC9138c0M16758t;
                        }
                        interfaceC9138c0M16758t.mo17407c();
                        interfaceC9138c0M16758t.mo17414j(c8943e);
                        if (!z10) {
                            C9151j c9151jM16758t = C8573r0.m16758t();
                            c9151jM16758t.mo17414j(new C8943e(fMin, fMin, (c8943e.f46900c - c8943e.f46898a) - fMin, (c8943e.f46901d - c8943e.f46899b) - fMin, C0389a.m1427b(fMin, c8943e.f46902e), C0389a.m1427b(fMin, c8943e.f46903f), C0389a.m1427b(fMin, c8943e.f46904g), C0389a.m1427b(fMin, c8943e.f46905h)));
                            interfaceC9138c0M16758t.mo17411g(interfaceC9138c0M16758t, c9151jM16758t, 0);
                        }
                        return c8456b2.m16539a(new InterfaceC2052l<InterfaceC9619c, C9072e>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC9619c interfaceC9619c) {
                                InterfaceC9619c interfaceC9619c2 = interfaceC9619c;
                                C5207g.m11111f(interfaceC9619c2, "$this$onDrawWithContent");
                                interfaceC9619c2.mo12668E0();
                                InterfaceC9621e.m18089F0(interfaceC9619c2, interfaceC9138c0M16758t, abstractC9161o5, 0.0f, null, 60);
                                return C9072e.f47360a;
                            }
                        });
                    }
                }));
                interfaceC0476a2.mo1661w();
                return interfaceC0500bMo1929K;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final long m1427b(float f3, long j10) {
        return C8573r0.m16741n(Math.max(0.0f, C8939a.m17157b(j10) - f3), Math.max(0.0f, C8939a.m17158c(j10) - f3));
    }
}
