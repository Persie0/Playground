package androidx.compose.material3;

import ae.C0062b;
import androidx.compose.foundation.C0389a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.draw.C0503c;
import androidx.compose.p017ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p021b0.C1284i;
import p036c0.C1648d;
import p060d1.InterfaceC5035v;
import p081e0.C5304d1;
import p081e0.C5328o0;
import p081e0.C5331q;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p210k1.C6569g;
import p210k1.InterfaceC6577o;
import p230l0.C7204a;
import p260m8.C7499b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p386t.C9112d;
import p387t0.C9144f0;
import p387t0.C9169u;
import p387t0.InterfaceC9154k0;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p470x1.C10017e;
import p470x1.InterfaceC10015c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceKt {

    /* JADX INFO: renamed from: a */
    public static final C5331q f2786a = CompositionLocalKt.m1692b(new InterfaceC2041a<C10017e>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C10017e mo807E() {
            return new C10017e(0);
        }
    });

    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.material3.SurfaceKt$Surface$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m1570a(InterfaceC0500b interfaceC0500b, InterfaceC9154k0 interfaceC9154k0, long j10, long j11, float f3, float f10, C9112d c9112d, final ComposableLambdaImpl composableLambdaImpl, InterfaceC0476a interfaceC0476a, final int i10, int i11) {
        final long jM5363v;
        interfaceC0476a.mo1622c(-513881741);
        final InterfaceC0500b interfaceC0500b2 = (i11 & 1) != 0 ? InterfaceC0500b.a.f3325a : interfaceC0500b;
        final InterfaceC9154k0 interfaceC9154k1 = (i11 & 2) != 0 ? C9144f0.f47650a : interfaceC9154k0;
        if ((i11 & 4) != 0) {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            jM5363v = ((C1648d) interfaceC0476a.mo1648p(ColorSchemeKt.f2735a)).m5363v();
        } else {
            jM5363v = j10;
        }
        long jM1559a = (i11 & 8) != 0 ? ColorSchemeKt.m1559a(jM5363v, interfaceC0476a) : j11;
        float f11 = (i11 & 16) != 0 ? 0 : f3;
        final float f12 = (i11 & 32) != 0 ? 0 : f10;
        final C9112d c9112d2 = (i11 & 64) != 0 ? null : c9112d;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        C5331q c5331q = f2786a;
        final float f13 = f11 + ((C10017e) interfaceC0476a.mo1648p(c5331q)).f50966a;
        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(jM1559a)), c5331q.m11458b(new C10017e(f13))}, C7204a.m14522b(interfaceC0476a, -70914509, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            /* JADX INFO: renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2 */
            @Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
            @InterfaceC10224c(m19205c = "androidx.compose.material3.SurfaceKt$Surface$1$2", m19206f = "Surface.kt", m19207l = {}, m19208m = "invokeSuspend")
            final class C04612 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {
                public C04612(InterfaceC9968c<? super C04612> interfaceC9968c) {
                    super(2, interfaceC9968c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C04612(interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return new C04612(interfaceC9968c).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                    interfaceC0476a3.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    InterfaceC0500b interfaceC0500bM2032a = SuspendingPointerInputFilterKt.m2032a(C5212l.m11163j0(SurfaceKt.m1572c(interfaceC0500b2, interfaceC9154k1, SurfaceKt.m1573d(jM5363v, f13, interfaceC0476a3), c9112d2, f12), false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                            C5207g.m11111f(interfaceC6577o, "$this$semantics");
                            return C9072e.f47360a;
                        }
                    }), C9072e.f47360a, new C04612(null));
                    interfaceC0476a3.mo1622c(733328855);
                    InterfaceC5652p interfaceC5652pM1499d = BoxKt.m1499d(InterfaceC7885a.a.f42989a, true, interfaceC0476a3);
                    interfaceC0476a3.mo1622c(-1323940314);
                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM2032a);
                    if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    interfaceC0476a3.mo1640l();
                    if (interfaceC0476a3.mo1632h()) {
                        interfaceC0476a3.mo1634i(interfaceC2041a);
                    } else {
                        interfaceC0476a3.mo1653s();
                    }
                    interfaceC0476a3.mo1644n();
                    C8573r0.m16714a1(interfaceC0476a3, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(interfaceC0476a3, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    interfaceC0476a3.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                    interfaceC0476a3.mo1622c(2058660585);
                    interfaceC0476a3.mo1622c(-2137368960);
                    interfaceC0476a3.mo1622c(1703151929);
                    composableLambdaImpl.mo1337m0(interfaceC0476a3, Integer.valueOf((i10 >> 21) & 14));
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1663x();
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1661w();
                }
                return C9072e.f47360a;
            }
        }), interfaceC0476a, 56);
        interfaceC0476a.mo1661w();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.material3.SurfaceKt$Surface$3, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: b */
    public static final void m1571b(final InterfaceC2041a interfaceC2041a, final InterfaceC0500b interfaceC0500b, final boolean z10, final InterfaceC9154k0 interfaceC9154k0, final long j10, long j11, float f3, final float f10, final C9112d c9112d, final InterfaceC9612j interfaceC9612j, final ComposableLambdaImpl composableLambdaImpl, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(interfaceC2041a, "onClick");
        interfaceC0476a.mo1622c(-789752804);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C5331q c5331q = f2786a;
        final float f11 = ((C10017e) interfaceC0476a.mo1648p(c5331q)).f50966a + f3;
        CompositionLocalKt.m1691a(new C5328o0[]{ContentColorKt.f2738a.m11458b(new C9169u(j11)), c5331q.m11458b(new C10017e(f11))}, C7204a.m14522b(interfaceC0476a, 1279702876, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>(interfaceC9154k0, j10, f11, i10, c9112d, f10, interfaceC9612j, z10, interfaceC2041a, composableLambdaImpl) { // from class: androidx.compose.material3.SurfaceKt$Surface$3

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC9154k0 f2798c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f2799d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ float f2800e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C9112d f2801f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ float f2802g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ InterfaceC9612j f2803h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ boolean f2804i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ InterfaceC2041a<C9072e> f2805j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ InterfaceC2056p<InterfaceC0476a, Integer, C9072e> f2806k;

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ int f2807l = 6;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f2801f = c9112d;
                this.f2802g = f10;
                this.f2803h = interfaceC9612j;
                this.f2804i = z10;
                this.f2805j = interfaceC2041a;
                this.f2806k = composableLambdaImpl;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                    interfaceC0476a3.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                    C5304d1 c5304d1 = TouchTargetKt.f2854a;
                    InterfaceC0500b interfaceC0500b2 = this.f2797b;
                    C5207g.m11111f(interfaceC0500b2, "<this>");
                    InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(SurfaceKt.m1572c(ComposedModifierKt.m1927a(interfaceC0500b2, InspectableValueKt.f4184a, TouchTargetKt$minimumTouchTargetSize$2.f2856b), this.f2798c, SurfaceKt.m1573d(this.f2799d, this.f2800e, interfaceC0476a3), this.f2801f, this.f2802g), this.f2803h, C1284i.m4789a(0.0f, interfaceC0476a3, 0, 7), this.f2804i, new C6569g(0), this.f2805j, 8);
                    interfaceC0476a3.mo1622c(733328855);
                    InterfaceC5652p interfaceC5652pM1499d = BoxKt.m1499d(InterfaceC7885a.a.f42989a, true, interfaceC0476a3);
                    interfaceC0476a3.mo1622c(-1323940314);
                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    InterfaceC2041a<ComposeUiNode> interfaceC2041a2 = ComposeUiNode.Companion.f3728b;
                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1409c);
                    if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    interfaceC0476a3.mo1640l();
                    if (interfaceC0476a3.mo1632h()) {
                        interfaceC0476a3.mo1634i(interfaceC2041a2);
                    } else {
                        interfaceC0476a3.mo1653s();
                    }
                    interfaceC0476a3.mo1644n();
                    C8573r0.m16714a1(interfaceC0476a3, interfaceC5652pM1499d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(interfaceC0476a3, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    interfaceC0476a3.mo1626e();
                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                    interfaceC0476a3.mo1622c(2058660585);
                    interfaceC0476a3.mo1622c(-2137368960);
                    interfaceC0476a3.mo1622c(-126864234);
                    this.f2806k.mo1337m0(interfaceC0476a3, Integer.valueOf(this.f2807l & 14));
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1663x();
                    interfaceC0476a3.mo1661w();
                    interfaceC0476a3.mo1661w();
                }
                return C9072e.f47360a;
            }
        }), interfaceC0476a, 56);
        interfaceC0476a.mo1661w();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0500b m1572c(InterfaceC0500b interfaceC0500b, InterfaceC9154k0 interfaceC9154k0, long j10, C9112d c9112d, float f3) {
        return C8573r0.m16701U(C0062b.m309T(C0503c.m1952a(interfaceC0500b, f3, interfaceC9154k0).mo1929K(c9112d != null ? C0389a.m1426a(c9112d, interfaceC9154k0) : InterfaceC0500b.a.f3325a), j10, interfaceC9154k0), interfaceC9154k0);
    }

    /* JADX INFO: renamed from: d */
    public static final long m1573d(long j10, float f3, InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-2079918090);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C5304d1 c5304d1 = ColorSchemeKt.f2735a;
        if (C9169u.m17497c(j10, ((C1648d) interfaceC0476a.mo1648p(c5304d1)).m5363v())) {
            j10 = ColorSchemeKt.m1562d((C1648d) interfaceC0476a.mo1648p(c5304d1), f3);
        }
        interfaceC0476a.mo1661w();
        return j10;
    }
}
