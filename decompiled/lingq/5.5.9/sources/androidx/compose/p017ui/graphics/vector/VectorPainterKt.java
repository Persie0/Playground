package androidx.compose.p017ui.graphics.vector;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import dm.C5207g;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6753d;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8944f;
import p387t0.AbstractC9161o;
import p387t0.C9137c;
import p387t0.C9157m;
import p387t0.C9159n;
import p387t0.C9169u;
import p387t0.C9170v;
import p469x0.AbstractC10003d;
import p469x0.AbstractC10010k;
import p469x0.C10002c;
import p469x0.C10008i;
import p469x0.C10012m;
import p469x0.InterfaceC10007h;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class VectorPainterKt {
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m2012a(final C10008i c10008i, Map<String, ? extends InterfaceC10007h> map, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        ComposerImpl composerImpl;
        final Map<String, ? extends InterfaceC10007h> map2;
        ComposerImpl composerImpl2;
        final Map<String, ? extends InterfaceC10007h> map3;
        C5207g.m11111f(c10008i, "group");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(c10008i) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 16;
        }
        if (i13 == 2 && (i12 & 91) == 18 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
            map2 = map;
            composerImpl = composerImplMo1636j;
        } else {
            Map<String, ? extends InterfaceC10007h> mapM13459L0 = i13 != 0 ? C6753d.m13459L0() : map;
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            for (final AbstractC10010k abstractC10010k : c10008i.f50942j) {
                if (abstractC10010k instanceof C10012m) {
                    composerImplMo1636j.mo1622c(-326285735);
                    C10012m c10012m = (C10012m) abstractC10010k;
                    mapM13459L0.get(c10012m.f50948a);
                    AbstractC0513a.c cVar = AbstractC0513a.c.f3563a;
                    List<AbstractC10003d> list = c10012m.f50949b;
                    C5207g.m11111f(cVar, "property");
                    int i14 = c10012m.f50950c;
                    String str = c10012m.f50948a;
                    AbstractC0513a.a aVar = AbstractC0513a.a.f3561a;
                    AbstractC9161o abstractC9161o = c10012m.f50951d;
                    C5207g.m11111f(aVar, "property");
                    AbstractC0513a.b bVar = AbstractC0513a.b.f3562a;
                    Float fValueOf = Float.valueOf(c10012m.f50952e);
                    C5207g.m11111f(bVar, "property");
                    float fFloatValue = fValueOf.floatValue();
                    AbstractC0513a.i iVar = AbstractC0513a.i.f3569a;
                    AbstractC9161o abstractC9161o2 = c10012m.f50953f;
                    C5207g.m11111f(iVar, "property");
                    AbstractC0513a.j jVar = AbstractC0513a.j.f3570a;
                    Float fValueOf2 = Float.valueOf(c10012m.f50954g);
                    C5207g.m11111f(jVar, "property");
                    float fFloatValue2 = fValueOf2.floatValue();
                    AbstractC0513a.k kVar = AbstractC0513a.k.f3571a;
                    Float fValueOf3 = Float.valueOf(c10012m.f50955h);
                    C5207g.m11111f(kVar, "property");
                    float fFloatValue3 = fValueOf3.floatValue();
                    int i15 = c10012m.f50956i;
                    Map<String, ? extends InterfaceC10007h> map4 = mapM13459L0;
                    int i16 = c10012m.f50957j;
                    float f3 = c10012m.f50958k;
                    AbstractC0513a.p pVar = AbstractC0513a.p.f3576a;
                    Float fValueOf4 = Float.valueOf(c10012m.f50959l);
                    C5207g.m11111f(pVar, "property");
                    float fFloatValue4 = fValueOf4.floatValue();
                    AbstractC0513a.n nVar = AbstractC0513a.n.f3574a;
                    ComposerImpl composerImpl3 = composerImplMo1636j;
                    Float fValueOf5 = Float.valueOf(c10012m.f50946H);
                    C5207g.m11111f(nVar, "property");
                    float fFloatValue5 = fValueOf5.floatValue();
                    AbstractC0513a.o oVar = AbstractC0513a.o.f3575a;
                    Float fValueOf6 = Float.valueOf(c10012m.f50947I);
                    C5207g.m11111f(oVar, "property");
                    map3 = map4;
                    VectorComposeKt.m2006b(list, i14, str, abstractC9161o, fFloatValue, abstractC9161o2, fFloatValue2, fFloatValue3, i15, i16, f3, fFloatValue4, fFloatValue5, fValueOf6.floatValue(), composerImpl3, 8, 0, 0);
                    composerImpl2 = composerImpl3;
                    composerImpl2.m1609Q(false);
                } else {
                    composerImpl2 = composerImplMo1636j;
                    map3 = mapM13459L0;
                    if (abstractC10010k instanceof C10008i) {
                        composerImpl2.mo1622c(-326283877);
                        C10008i c10008i2 = (C10008i) abstractC10010k;
                        map3.get(c10008i2.f50933a);
                        String str2 = c10008i2.f50933a;
                        AbstractC0513a.f fVar = AbstractC0513a.f.f3566a;
                        Float fValueOf7 = Float.valueOf(c10008i2.f50934b);
                        C5207g.m11111f(fVar, "property");
                        float fFloatValue6 = fValueOf7.floatValue();
                        AbstractC0513a.g gVar = AbstractC0513a.g.f3567a;
                        Float fValueOf8 = Float.valueOf(c10008i2.f50937e);
                        C5207g.m11111f(gVar, "property");
                        float fFloatValue7 = fValueOf8.floatValue();
                        AbstractC0513a.h hVar = AbstractC0513a.h.f3568a;
                        Float fValueOf9 = Float.valueOf(c10008i2.f50938f);
                        C5207g.m11111f(hVar, "property");
                        float fFloatValue8 = fValueOf9.floatValue();
                        AbstractC0513a.l lVar = AbstractC0513a.l.f3572a;
                        Float fValueOf10 = Float.valueOf(c10008i2.f50939g);
                        C5207g.m11111f(lVar, "property");
                        float fFloatValue9 = fValueOf10.floatValue();
                        AbstractC0513a.m mVar = AbstractC0513a.m.f3573a;
                        Float fValueOf11 = Float.valueOf(c10008i2.f50940h);
                        C5207g.m11111f(mVar, "property");
                        float fFloatValue10 = fValueOf11.floatValue();
                        AbstractC0513a.d dVar = AbstractC0513a.d.f3564a;
                        Float fValueOf12 = Float.valueOf(c10008i2.f50935c);
                        C5207g.m11111f(dVar, "property");
                        float fFloatValue11 = fValueOf12.floatValue();
                        AbstractC0513a.e eVar = AbstractC0513a.e.f3565a;
                        Float fValueOf13 = Float.valueOf(c10008i2.f50936d);
                        C5207g.m11111f(eVar, "property");
                        float fFloatValue12 = fValueOf13.floatValue();
                        AbstractC0513a.c cVar2 = AbstractC0513a.c.f3563a;
                        List<AbstractC10003d> list2 = c10008i2.f50941i;
                        C5207g.m11111f(cVar2, "property");
                        VectorComposeKt.m2005a(str2, fFloatValue6, fFloatValue11, fFloatValue12, fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, list2, C7204a.m14522b(composerImpl2, 1450046638, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
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
                                    VectorPainterKt.m2012a((C10008i) abstractC10010k, map3, interfaceC0476a3, 64, 0);
                                }
                                return C9072e.f47360a;
                            }
                        }), composerImpl2, 939524096, 0);
                        composerImpl2.m1609Q(false);
                    } else {
                        composerImpl2.mo1622c(-326282407);
                        composerImpl2.m1609Q(false);
                    }
                }
                mapM13459L0 = map3;
                composerImplMo1636j = composerImpl2;
            }
            composerImpl = composerImplMo1636j;
            map2 = mapM13459L0;
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        }
        C5332q0 c5332q0M1612T = composerImpl.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                VectorPainterKt.m2012a(c10008i, map2, interfaceC0476a2, iM16737l1, i11);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: b */
    public static final VectorPainter m2013b(final C10002c c10002c, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(c10002c, "image");
        interfaceC0476a.mo1622c(1413834416);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        String str = c10002c.f50834a;
        ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a, 1873274766, new InterfaceC2058r<Float, Float, InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3
            {
                super(4);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final C9072e mo1851T(Float f3, Float f10, InterfaceC0476a interfaceC0476a2, Integer num) {
                f3.floatValue();
                f10.floatValue();
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                    interfaceC0476a3.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                    VectorPainterKt.m2012a(c10002c.f50839f, null, interfaceC0476a3, 0, 2);
                }
                return C9072e.f47360a;
            }
        });
        interfaceC0476a.mo1622c(1068590786);
        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a.mo1648p(CompositionLocalsKt.f4137e);
        float fMo1463i0 = interfaceC10015c.mo1463i0(c10002c.f50835b);
        float fMo1463i1 = interfaceC10015c.mo1463i0(c10002c.f50836c);
        float f3 = c10002c.f50837d;
        if (Float.isNaN(f3)) {
            f3 = fMo1463i0;
        }
        float f10 = c10002c.f50838e;
        if (Float.isNaN(f10)) {
            f10 = fMo1463i1;
        }
        long j10 = c10002c.f50840g;
        C9169u c9169u = new C9169u(j10);
        int i10 = c10002c.f50841h;
        C9157m c9157m = new C9157m(i10);
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a.mo1665y(c9169u) | interfaceC0476a.mo1665y(c9157m);
        Object objMo1624d = interfaceC0476a.mo1624d();
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        if (zMo1665y || objMo1624d == c10586a) {
            if (C9169u.m17497c(j10, C9169u.f47703f)) {
                objMo1624d = null;
            } else {
                objMo1624d = new C9170v(Build.VERSION.SDK_INT >= 29 ? C9159n.f47687a.m17478a(j10, i10) : new PorterDuffColorFilter(C8584v.m16780C(j10), C9137c.m17404b(i10)));
            }
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        C9170v c9170v = (C9170v) objMo1624d;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (objMo1624d2 == c10586a) {
            objMo1624d2 = new VectorPainter();
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        VectorPainter vectorPainter = (VectorPainter) objMo1624d2;
        vectorPainter.f3537f.setValue(new C8944f(C8584v.m16788m(fMo1463i0, fMo1463i1)));
        vectorPainter.f3538g.setValue(Boolean.valueOf(c10002c.f50842i));
        vectorPainter.f3539h.f3474f.setValue(c9170v);
        vectorPainter.m2011e(str, f3, f10, composableLambdaImplM14522b, interfaceC0476a, 35840);
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
        return vectorPainter;
    }
}
