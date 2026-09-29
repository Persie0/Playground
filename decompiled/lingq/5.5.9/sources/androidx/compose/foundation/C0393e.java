package androidx.compose.foundation;

import android.content.Context;
import androidx.activity.result.C0204c;
import androidx.compose.foundation.gestures.C0415d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.saveable.C0487a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5212l;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p081e0.C5319k;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p210k1.C6563a;
import p210k1.C6570h;
import p210k1.C6571i;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p252m0.C7452c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p386t.C9115g;
import p386t.C9130v;
import p386t.C9131w;
import p386t.InterfaceC9132x;
import p401u.InterfaceC9351d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.foundation.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0393e {
    /* JADX INFO: renamed from: a */
    public static final ScrollState m1431a(InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-1464256199);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        final int i10 = 0;
        Object[] objArr = new Object[0];
        C7452c c7452c = ScrollState.f1924i;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(0);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = new InterfaceC2041a<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final ScrollState mo807E() {
                    return new ScrollState(i10);
                }
            };
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        ScrollState scrollState = (ScrollState) C0487a.m1860a(objArr, c7452c, (InterfaceC2041a) objMo1624d, interfaceC0476a, 4);
        interfaceC0476a.mo1661w();
        return scrollState;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0500b m1432b(InterfaceC0500b interfaceC0500b, final ScrollState scrollState) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(scrollState, "state");
        final InterfaceC9351d interfaceC9351d = null;
        final boolean z10 = false;
        final boolean z11 = true;
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f1904b = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC9132x interfaceC9132x;
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, 1478351300);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(1809802212);
                InterfaceC0500b interfaceC0500b3 = AndroidOverscrollKt.f1699a;
                interfaceC0476a2.mo1622c(-81138291);
                Context context = (Context) interfaceC0476a2.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                C9131w c9131w = (C9131w) interfaceC0476a2.mo1648p(OverscrollConfigurationKt.f1901a);
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (c9131w != null) {
                    interfaceC0476a2.mo1622c(511388516);
                    boolean zMo1665y = interfaceC0476a2.mo1665y(context) | interfaceC0476a2.mo1665y(c9131w);
                    Object objMo1624d = interfaceC0476a2.mo1624d();
                    if (zMo1665y || objMo1624d == c10586a) {
                        objMo1624d = new AndroidEdgeEffectOverscrollEffect(context, c9131w);
                        interfaceC0476a2.mo1655t(objMo1624d);
                    }
                    interfaceC0476a2.mo1661w();
                    interfaceC9132x = (InterfaceC9132x) objMo1624d;
                } else {
                    interfaceC9132x = C9130v.f47638a;
                }
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1622c(773894976);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d2 = interfaceC0476a2.mo1624d();
                if (objMo1624d2 == c10586a) {
                    C5319k c5319k = new C5319k(C5333r.m11463e(EmptyCoroutineContext.f38093a, interfaceC0476a2));
                    interfaceC0476a2.mo1655t(c5319k);
                    objMo1624d2 = c5319k;
                }
                interfaceC0476a2.mo1661w();
                final InterfaceC7882z interfaceC7882z = ((C5319k) objMo1624d2).f33592a;
                interfaceC0476a2.mo1661w();
                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                final boolean z12 = z10;
                final boolean z13 = this.f1904b;
                final boolean z14 = z11;
                final ScrollState scrollState2 = scrollState;
                InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(aVar, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                        final ScrollState scrollState3 = scrollState2;
                        C6570h c6570h = new C6570h(new InterfaceC2041a<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Float mo807E() {
                                return Float.valueOf(scrollState3.m1421g());
                            }
                        }, new InterfaceC2041a<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            {
                                super(0);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Float mo807E() {
                                return Float.valueOf(((Number) scrollState3.f1928d.getValue()).intValue());
                            }
                        }, z12);
                        final boolean z15 = z13;
                        if (z15) {
                            InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                            SemanticsProperties.f4422o.m2543a(interfaceC6577o2, C6576n.f37397a[7], c6570h);
                        } else {
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = C6576n.f37397a;
                            SemanticsProperties.f4421n.m2543a(interfaceC6577o2, C6576n.f37397a[6], c6570h);
                        }
                        if (z14) {
                            final InterfaceC7882z interfaceC7882z2 = interfaceC7882z;
                            interfaceC6577o2.mo13162a(C6571i.f37375d, new C6563a(null, new InterfaceC2056p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1

                                /* JADX INFO: renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name */
                                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                                @InterfaceC10224c(m19205c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", m19206f = "Scroll.kt", m19207l = {285, 287}, m19208m = "invokeSuspend")
                                final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                                    /* JADX INFO: renamed from: e */
                                    public int f1917e;

                                    /* JADX INFO: renamed from: f */
                                    public final /* synthetic */ boolean f1918f;

                                    /* JADX INFO: renamed from: g */
                                    public final /* synthetic */ ScrollState f1919g;

                                    /* JADX INFO: renamed from: h */
                                    public final /* synthetic */ float f1920h;

                                    /* JADX INFO: renamed from: i */
                                    public final /* synthetic */ float f1921i;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(boolean z10, ScrollState scrollState, float f3, float f10, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                                        super(2, interfaceC9968c);
                                        this.f1918f = z10;
                                        this.f1919g = scrollState;
                                        this.f1920h = f3;
                                        this.f1921i = f10;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    /* JADX INFO: renamed from: a */
                                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                        return new AnonymousClass1(this.f1918f, this.f1919g, this.f1920h, this.f1921i, interfaceC9968c);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                        return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                                    }

                                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    /* JADX INFO: renamed from: x */
                                    public final Object mo1338x(Object obj) throws Throwable {
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        int i10 = this.f1917e;
                                        if (i10 != 0) {
                                            if (i10 != 1 && i10 != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            C7499b.m14977z0(obj);
                                        } else {
                                            C7499b.m14977z0(obj);
                                            boolean z10 = this.f1918f;
                                            ScrollState scrollState = this.f1919g;
                                            if (z10) {
                                                C5207g.m11109d(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                this.f1917e = 1;
                                                if (C0415d.m1492a(scrollState, this.f1920h, C8573r0.m16724f1(0.0f, null, 7), this) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            } else {
                                                C5207g.m11109d(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                this.f1917e = 2;
                                                if (C0415d.m1492a(scrollState, this.f1921i, C8573r0.m16724f1(0.0f, null, 7), this) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            }
                                        }
                                        return C9072e.f47360a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final Boolean mo1337m0(Float f3, Float f10) {
                                    float fFloatValue = f3.floatValue();
                                    C7828f.m15570d(interfaceC7882z2, null, null, new AnonymousClass1(z15, scrollState3, f10.floatValue(), fFloatValue, null), 3);
                                    return Boolean.TRUE;
                                }
                            }));
                        }
                        return C9072e.f47360a;
                    }
                });
                boolean z15 = this.f1904b;
                Orientation orientation = z15 ? Orientation.Vertical : Orientation.Horizontal;
                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4143k);
                C5207g.m11111f(layoutDirection, "layoutDirection");
                C5207g.m11111f(orientation, "orientation");
                boolean z16 = z10;
                boolean z17 = !z16;
                boolean z18 = (!(layoutDirection == LayoutDirection.Rtl) || orientation == Orientation.Vertical) ? z17 : !z17;
                ScrollState scrollState3 = scrollState;
                InterfaceC0500b interfaceC0500bM1470b = ScrollableKt.m1470b(scrollState3, orientation, interfaceC9132x, z11, z18, interfaceC9351d, scrollState3.f1927c);
                ScrollingLayoutModifier scrollingLayoutModifier = new ScrollingLayoutModifier(scrollState3, z16, z15);
                float f3 = C9115g.f47615a;
                C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(orientation == Orientation.Vertical ? C9115g.f47617c : C9115g.f47616b);
                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                C5207g.m11111f(interfaceC9132x, "overscrollEffect");
                InterfaceC0500b interfaceC0500bMo1929K2 = interfaceC0500bMo1929K.mo1929K(interfaceC9132x.mo1394a()).mo1929K(interfaceC0500bM1470b).mo1929K(scrollingLayoutModifier);
                interfaceC0476a2.mo1661w();
                return interfaceC0500bMo1929K2;
            }
        });
    }
}
