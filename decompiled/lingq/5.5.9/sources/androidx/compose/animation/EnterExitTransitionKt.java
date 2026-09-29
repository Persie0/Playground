package androidx.compose.animation;

import androidx.activity.result.C0204c;
import androidx.compose.animation.core.C0372d;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.graphics.C0512a;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p350r.AbstractC8670d;
import p350r.AbstractC8672f;
import p350r.C8669c;
import p350r.C8671e;
import p350r.C8673g;
import p350r.C8674h;
import p350r.C8678l;
import p350r.C8681o;
import p374s.C8904e0;
import p374s.C8907g;
import p374s.C8908g0;
import p374s.C8930r0;
import p374s.C8936x;
import p374s.InterfaceC8906f0;
import p374s.InterfaceC8929r;
import p385sf.C9000b;
import p387t0.C9162o0;
import p387t0.InterfaceC9172x;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKt {

    /* JADX INFO: renamed from: a */
    public static final C8908g0 f1453a = VectorConvertersKt.m1380a(new InterfaceC2052l<C9162o0, C8907g>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8907g mo528n(C9162o0 c9162o0) {
            long j10 = c9162o0.f47691a;
            return new C8907g(Float.intBitsToFloat((int) (j10 >> 32)), C9162o0.m17480a(j10));
        }
    }, new InterfaceC2052l<C8907g, C9162o0>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9162o0 mo528n(C8907g c8907g) {
            C8907g c8907g2 = c8907g;
            C5207g.m11111f(c8907g2, "it");
            return new C9162o0(C5212l.m11167m(c8907g2.f46809a, c8907g2.f46810b));
        }
    });

    /* JADX INFO: renamed from: b */
    public static final ParcelableSnapshotMutableState f1454b = C8573r0.m16684L0(Float.valueOf(1.0f));

    /* JADX INFO: renamed from: c */
    public static final C8936x<Float> f1455c = C8573r0.m16724f1(400.0f, null, 5);

    /* JADX INFO: renamed from: d */
    public static final C8936x<C10020h> f1456d;

    /* JADX INFO: renamed from: e */
    public static final C8936x<C10022j> f1457e;

    /* JADX INFO: renamed from: androidx.compose.animation.EnterExitTransitionKt$a */
    public /* synthetic */ class C0359a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1460a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1460a = iArr;
        }
    }

    static {
        int i10 = C10020h.f50974c;
        Map<InterfaceC8906f0<?, ?>, Float> map = C8930r0.f46854a;
        f1456d = C8573r0.m16724f1(400.0f, new C10020h(C8573r0.m16752r(1, 1)), 1);
        f1457e = C8573r0.m16724f1(400.0f, new C10022j(C9000b.m17236a(1, 1)), 1);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1344a(final Transition<EnterExitState> transition, final AbstractC8670d abstractC8670d, final AbstractC8672f abstractC8672f, final String str, InterfaceC0476a interfaceC0476a, int i10) {
        int i11;
        InterfaceC5301c1 interfaceC5301c1M1391c;
        float f3;
        float f10;
        C5207g.m11111f(transition, "<this>");
        C5207g.m11111f(abstractC8670d, "enter");
        C5207g.m11111f(abstractC8672f, "exit");
        C5207g.m11111f(str, "label");
        interfaceC0476a.mo1622c(914000546);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        final InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(abstractC8670d.mo16925a().f46273b, interfaceC0476a);
        final InterfaceC5312g0 interfaceC5312g0M16704V1 = C8573r0.m16704V0(abstractC8672f.mo16927a().f46273b, interfaceC0476a);
        InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b> interfaceC2057q2 = new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInOut$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a2, Integer num) {
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b;
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                C0204c.m861u(num, interfaceC0500bMo1929K, "$this$composed", interfaceC0476a3, 158379472);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                interfaceC0476a3.mo1622c(1157296644);
                Transition<EnterExitState> transition2 = transition;
                boolean zMo1665y = interfaceC0476a3.mo1665y(transition2);
                Object objMo1624d = interfaceC0476a3.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (zMo1665y || objMo1624d == c10586a) {
                    objMo1624d = C8573r0.m16684L0(Boolean.FALSE);
                    interfaceC0476a3.mo1655t(objMo1624d);
                }
                interfaceC0476a3.mo1661w();
                InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
                EnterExitState enterExitStateM1362b = transition2.m1362b();
                EnterExitState enterExitStateM1364d = transition2.m1364d();
                InterfaceC5301c1<C8678l> interfaceC5301c1 = interfaceC5312g0M16704V1;
                InterfaceC5301c1<C8678l> interfaceC5301c2 = interfaceC5312g0M16704V0;
                if (enterExitStateM1362b == enterExitStateM1364d && !transition2.m1365e()) {
                    interfaceC5312g0.setValue(Boolean.FALSE);
                } else if (interfaceC5301c2.getValue() != null || interfaceC5301c1.getValue() != null) {
                    interfaceC5312g0.setValue(Boolean.TRUE);
                }
                if (((Boolean) interfaceC5312g0.getValue()).booleanValue()) {
                    int i12 = C10020h.f50974c;
                    C8908g0 c8908g0 = VectorConvertersKt.f1632g;
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d2 = interfaceC0476a3.mo1624d();
                    if (objMo1624d2 == c10586a) {
                        objMo1624d2 = str + " slide";
                        interfaceC0476a3.mo1655t(objMo1624d2);
                    }
                    interfaceC0476a3.mo1661w();
                    Transition.C0364a c0364aM1390b = C0372d.m1390b(transition2, c8908g0, (String) objMo1624d2, interfaceC0476a3);
                    interfaceC0476a3.mo1622c(1157296644);
                    boolean zMo1665y2 = interfaceC0476a3.mo1665y(transition2);
                    Object objMo1624d3 = interfaceC0476a3.mo1624d();
                    if (zMo1665y2 || objMo1624d3 == c10586a) {
                        objMo1624d3 = new SlideModifier(c0364aM1390b, interfaceC5301c2, interfaceC5301c1);
                        interfaceC0476a3.mo1655t(objMo1624d3);
                    }
                    interfaceC0476a3.mo1661w();
                    interfaceC0500bMo1929K = interfaceC0500bMo1929K.mo1929K((SlideModifier) objMo1624d3);
                }
                interfaceC0476a3.mo1661w();
                return interfaceC0500bMo1929K;
            }
        };
        InterfaceC2052l<C0661s0, C9072e> interfaceC2052l = InspectableValueKt.f4184a;
        InterfaceC0500b interfaceC0500bM1927a = ComposedModifierKt.m1927a(aVar, interfaceC2052l, interfaceC2057q2);
        final InterfaceC5312g0 interfaceC5312g0M16704V2 = C8573r0.m16704V0(abstractC8670d.mo16925a().f46274c, interfaceC0476a);
        final InterfaceC5312g0 interfaceC5312g0M16704V3 = C8573r0.m16704V0(abstractC8672f.mo16927a().f46274c, interfaceC0476a);
        InterfaceC0500b interfaceC0500bM1927a2 = ComposedModifierKt.m1927a(interfaceC0500bM1927a, interfaceC2052l, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a2, Integer num) {
                InterfaceC7885a interfaceC7885a;
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b;
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                C0204c.m861u(num, interfaceC0500bMo1929K, "$this$composed", interfaceC0476a3, -140634085);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                interfaceC0476a3.mo1622c(1157296644);
                Transition<EnterExitState> transition2 = transition;
                boolean zMo1665y = interfaceC0476a3.mo1665y(transition2);
                Object objMo1624d = interfaceC0476a3.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (zMo1665y || objMo1624d == c10586a) {
                    objMo1624d = C8573r0.m16684L0(Boolean.FALSE);
                    interfaceC0476a3.mo1655t(objMo1624d);
                }
                interfaceC0476a3.mo1661w();
                InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
                EnterExitState enterExitStateM1362b = transition2.m1362b();
                EnterExitState enterExitStateM1364d = transition2.m1364d();
                InterfaceC5301c1<C8669c> interfaceC5301c1 = interfaceC5312g0M16704V3;
                InterfaceC5301c1<C8669c> interfaceC5301c2 = interfaceC5312g0M16704V2;
                if (enterExitStateM1362b == enterExitStateM1364d && !transition2.m1365e()) {
                    interfaceC5312g0.setValue(Boolean.FALSE);
                } else if (interfaceC5301c2.getValue() != null || interfaceC5301c1.getValue() != null) {
                    interfaceC5312g0.setValue(Boolean.TRUE);
                }
                if (((Boolean) interfaceC5312g0.getValue()).booleanValue()) {
                    if (transition2.m1363c().m1373b(EnterExitState.PreEnter, EnterExitState.Visible)) {
                        C8669c value = interfaceC5301c2.getValue();
                        if (value == null || (interfaceC7885a = value.f46251a) == null) {
                            C8669c value2 = interfaceC5301c1.getValue();
                            if (value2 != null) {
                                interfaceC7885a = value2.f46251a;
                            } else {
                                interfaceC7885a = null;
                            }
                        }
                    } else {
                        C8669c value3 = interfaceC5301c1.getValue();
                        if (value3 == null || (interfaceC7885a = value3.f46251a) == null) {
                            C8669c value4 = interfaceC5301c2.getValue();
                            if (value4 != null) {
                                interfaceC7885a = value4.f46251a;
                            } else {
                                interfaceC7885a = null;
                            }
                        }
                    }
                    InterfaceC5312g0 interfaceC5312g0M16704V4 = C8573r0.m16704V0(interfaceC7885a, interfaceC0476a3);
                    C8908g0 c8908g0 = VectorConvertersKt.f1633h;
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d2 = interfaceC0476a3.mo1624d();
                    String str2 = str;
                    if (objMo1624d2 == c10586a) {
                        objMo1624d2 = str2 + " shrink/expand";
                        interfaceC0476a3.mo1655t(objMo1624d2);
                    }
                    interfaceC0476a3.mo1661w();
                    Transition.C0364a c0364aM1390b = C0372d.m1390b(transition2, c8908g0, (String) objMo1624d2, interfaceC0476a3);
                    boolean z10 = true;
                    interfaceC0476a3.mo1638k(-1553213624, Boolean.valueOf(transition2.m1362b() == transition2.m1364d()));
                    int i12 = C10020h.f50974c;
                    C8908g0 c8908g1 = VectorConvertersKt.f1632g;
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d3 = interfaceC0476a3.mo1624d();
                    if (objMo1624d3 == c10586a) {
                        objMo1624d3 = str2 + " InterruptionHandlingOffset";
                        interfaceC0476a3.mo1655t(objMo1624d3);
                    }
                    interfaceC0476a3.mo1661w();
                    Transition.C0364a c0364aM1390b2 = C0372d.m1390b(transition2, c8908g1, (String) objMo1624d3, interfaceC0476a3);
                    interfaceC0476a3.mo1659v();
                    InterfaceC5301c1<C8669c> interfaceC5301c3 = interfaceC5312g0M16704V2;
                    InterfaceC5301c1<C8669c> interfaceC5301c4 = interfaceC5312g0M16704V3;
                    interfaceC0476a3.mo1622c(1157296644);
                    boolean zMo1665y2 = interfaceC0476a3.mo1665y(transition2);
                    Object objMo1624d4 = interfaceC0476a3.mo1624d();
                    if (zMo1665y2 || objMo1624d4 == c10586a) {
                        objMo1624d4 = new ExpandShrinkModifier(c0364aM1390b, c0364aM1390b2, interfaceC5301c3, interfaceC5301c4, interfaceC5312g0M16704V4);
                        interfaceC0476a3.mo1655t(objMo1624d4);
                    }
                    interfaceC0476a3.mo1661w();
                    ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) objMo1624d4;
                    if (transition2.m1362b() == transition2.m1364d()) {
                        expandShrinkModifier.f1487f = null;
                    } else if (expandShrinkModifier.f1487f == null) {
                        InterfaceC7885a interfaceC7885a2 = (InterfaceC7885a) interfaceC5312g0M16704V4.getValue();
                        if (interfaceC7885a2 == null) {
                            interfaceC7885a2 = InterfaceC7885a.a.f42989a;
                        }
                        expandShrinkModifier.f1487f = interfaceC7885a2;
                    }
                    C8669c value5 = interfaceC5301c2.getValue();
                    if (!((value5 == null || value5.f46254d) ? false : true)) {
                        C8669c value6 = interfaceC5301c1.getValue();
                        if (!((value6 == null || value6.f46254d) ? false : true)) {
                            z10 = false;
                        }
                    }
                    InterfaceC0500b interfaceC0500bM16703V = InterfaceC0500b.a.f3325a;
                    if (!z10) {
                        interfaceC0500bM16703V = C8573r0.m16703V(interfaceC0500bM16703V);
                    }
                    interfaceC0500bMo1929K = interfaceC0500bMo1929K.mo1929K(interfaceC0500bM16703V).mo1929K(expandShrinkModifier);
                }
                interfaceC0476a3.mo1661w();
                return interfaceC0500bMo1929K;
            }
        });
        int i12 = i10 & 14;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(transition);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (zMo1665y || objMo1624d == obj) {
            objMo1624d = C8573r0.m16684L0(Boolean.FALSE);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y2 = interfaceC0476a.mo1665y(transition);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y2 || objMo1624d2 == obj) {
            objMo1624d2 = C8573r0.m16684L0(Boolean.FALSE);
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g1 = (InterfaceC5312g0) objMo1624d2;
        if (transition.m1362b() != transition.m1364d() || transition.m1365e()) {
            if (abstractC8670d.mo16925a().f46272a != null || abstractC8672f.mo16927a().f46272a != null) {
                interfaceC5312g0.setValue(Boolean.TRUE);
            }
            abstractC8670d.mo16925a().getClass();
            abstractC8672f.mo16927a().getClass();
        } else {
            Boolean bool = Boolean.FALSE;
            interfaceC5312g0.setValue(bool);
            interfaceC5312g1.setValue(bool);
        }
        interfaceC0476a.mo1622c(1657241561);
        if (((Boolean) interfaceC5312g0.getValue()).booleanValue()) {
            InterfaceC2057q<Transition.InterfaceC0366b<EnterExitState>, InterfaceC0476a, Integer, InterfaceC8929r<Float>> interfaceC2057q3 = new InterfaceC2057q<Transition.InterfaceC0366b<EnterExitState>, InterfaceC0476a, Integer, InterfaceC8929r<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final InterfaceC8929r<Float> mo1343M(Transition.InterfaceC0366b<EnterExitState> interfaceC0366b, InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC8929r<Float> interfaceC8929r;
                    Transition.InterfaceC0366b<EnterExitState> interfaceC0366b2 = interfaceC0366b;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(interfaceC0366b2, "$this$animateFloat");
                    interfaceC0476a3.mo1622c(-57153604);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (interfaceC0366b2.m1373b(enterExitState, enterExitState2)) {
                        C8674h c8674h = abstractC8670d.mo16925a().f46272a;
                        if (c8674h == null || (interfaceC8929r = c8674h.f46260b) == null) {
                            interfaceC8929r = EnterExitTransitionKt.f1455c;
                        }
                    } else if (interfaceC0366b2.m1373b(enterExitState2, EnterExitState.PostExit)) {
                        C8674h c8674h2 = abstractC8672f.mo16927a().f46272a;
                        if (c8674h2 == null || (interfaceC8929r = c8674h2.f46260b) == null) {
                            interfaceC8929r = EnterExitTransitionKt.f1455c;
                        }
                    } else {
                        interfaceC8929r = EnterExitTransitionKt.f1455c;
                    }
                    interfaceC0476a3.mo1661w();
                    return interfaceC8929r;
                }
            };
            interfaceC0476a.mo1622c(-492369756);
            Object objMo1624d3 = interfaceC0476a.mo1624d();
            if (objMo1624d3 == obj) {
                objMo1624d3 = str.concat(" alpha");
                interfaceC0476a.mo1655t(objMo1624d3);
            }
            interfaceC0476a.mo1661w();
            String str2 = (String) objMo1624d3;
            int i13 = i12 | 384;
            interfaceC0476a.mo1622c(-1338768149);
            C8908g0 c8908g0 = VectorConvertersKt.f1626a;
            int i14 = i13 & 14;
            int i15 = i13 << 3;
            int i16 = (i15 & 7168) | i14 | (i15 & 896) | (i15 & 57344);
            interfaceC0476a.mo1622c(-142660079);
            EnterExitState enterExitStateM1362b = transition.m1362b();
            interfaceC0476a.mo1622c(755689166);
            int[] iArr = C0359a.f1460a;
            int i17 = iArr[enterExitStateM1362b.ordinal()];
            if (i17 == 1) {
                f3 = 1.0f;
            } else if (i17 == 2) {
                C8674h c8674h = abstractC8670d.mo16925a().f46272a;
                if (c8674h != null) {
                    f3 = c8674h.f46259a;
                } else {
                    f3 = 1.0f;
                }
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C8674h c8674h2 = abstractC8672f.mo16927a().f46272a;
                if (c8674h2 != null) {
                    f3 = c8674h2.f46259a;
                } else {
                    f3 = 1.0f;
                }
            }
            interfaceC0476a.mo1661w();
            Float fValueOf = Float.valueOf(f3);
            EnterExitState enterExitStateM1364d = transition.m1364d();
            interfaceC0476a.mo1622c(755689166);
            int i18 = iArr[enterExitStateM1364d.ordinal()];
            if (i18 == 1) {
                f10 = 1.0f;
            } else if (i18 == 2) {
                C8674h c8674h3 = abstractC8670d.mo16925a().f46272a;
                if (c8674h3 != null) {
                    f10 = c8674h3.f46259a;
                } else {
                    f10 = 1.0f;
                }
            } else {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C8674h c8674h4 = abstractC8672f.mo16927a().f46272a;
                if (c8674h4 != null) {
                    f10 = c8674h4.f46259a;
                } else {
                    f10 = 1.0f;
                }
            }
            interfaceC0476a.mo1661w();
            i11 = -492369756;
            interfaceC5301c1M1391c = C0372d.m1391c(transition, fValueOf, Float.valueOf(f10), interfaceC2057q3.mo1343M(transition.m1363c(), interfaceC0476a, Integer.valueOf((i16 >> 3) & 112)), c8908g0, str2, interfaceC0476a);
            interfaceC0476a.mo1661w();
            interfaceC0476a.mo1661w();
        } else {
            i11 = -492369756;
            interfaceC5301c1M1391c = f1454b;
        }
        final InterfaceC5301c1 interfaceC5301c1 = interfaceC5301c1M1391c;
        interfaceC0476a.mo1661w();
        if (((Boolean) interfaceC5312g1.getValue()).booleanValue()) {
            interfaceC0476a.mo1622c(1657242461);
            InterfaceC2057q<Transition.InterfaceC0366b<EnterExitState>, InterfaceC0476a, Integer, InterfaceC8929r<Float>> interfaceC2057q4 = new InterfaceC2057q<Transition.InterfaceC0366b<EnterExitState>, InterfaceC0476a, Integer, InterfaceC8929r<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final InterfaceC8929r<Float> mo1343M(Transition.InterfaceC0366b<EnterExitState> interfaceC0366b, InterfaceC0476a interfaceC0476a2, Integer num) {
                    C8936x<Float> c8936x;
                    Transition.InterfaceC0366b<EnterExitState> interfaceC0366b2 = interfaceC0366b;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(interfaceC0366b2, "$this$animateFloat");
                    interfaceC0476a3.mo1622c(-53984035);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (interfaceC0366b2.m1373b(enterExitState, enterExitState2)) {
                        abstractC8670d.mo16925a().getClass();
                        c8936x = EnterExitTransitionKt.f1455c;
                    } else if (interfaceC0366b2.m1373b(enterExitState2, EnterExitState.PostExit)) {
                        abstractC8672f.mo16927a().getClass();
                        c8936x = EnterExitTransitionKt.f1455c;
                    } else {
                        c8936x = EnterExitTransitionKt.f1455c;
                    }
                    interfaceC0476a3.mo1661w();
                    return c8936x;
                }
            };
            interfaceC0476a.mo1622c(i11);
            Object objMo1624d4 = interfaceC0476a.mo1624d();
            if (objMo1624d4 == obj) {
                objMo1624d4 = str.concat(" scale");
                interfaceC0476a.mo1655t(objMo1624d4);
            }
            interfaceC0476a.mo1661w();
            String str3 = (String) objMo1624d4;
            int i19 = i12 | 384;
            interfaceC0476a.mo1622c(-1338768149);
            C8908g0 c8908g1 = VectorConvertersKt.f1626a;
            int i20 = i19 & 14;
            int i21 = i19 << 3;
            int i22 = (i21 & 57344) | i20 | (i21 & 896) | (i21 & 7168);
            interfaceC0476a.mo1622c(-142660079);
            EnterExitState enterExitStateM1362b2 = transition.m1362b();
            interfaceC0476a.mo1622c(-596129937);
            int[] iArr2 = C0359a.f1460a;
            int i23 = iArr2[enterExitStateM1362b2.ordinal()];
            if (i23 != 1) {
                if (i23 == 2) {
                    abstractC8670d.mo16925a().getClass();
                } else {
                    if (i23 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC8672f.mo16927a().getClass();
                }
            }
            interfaceC0476a.mo1661w();
            Float fValueOf2 = Float.valueOf(1.0f);
            EnterExitState enterExitStateM1364d2 = transition.m1364d();
            interfaceC0476a.mo1622c(-596129937);
            int i24 = iArr2[enterExitStateM1364d2.ordinal()];
            if (i24 != 1) {
                if (i24 == 2) {
                    abstractC8670d.mo16925a().getClass();
                } else {
                    if (i24 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC8672f.mo16927a().getClass();
                }
            }
            interfaceC0476a.mo1661w();
            final Transition.C0368d c0368dM1391c = C0372d.m1391c(transition, fValueOf2, Float.valueOf(1.0f), interfaceC2057q4.mo1343M(transition.m1363c(), interfaceC0476a, Integer.valueOf((i22 >> 3) & 112)), c8908g1, str3, interfaceC0476a);
            interfaceC0476a.mo1661w();
            interfaceC0476a.mo1661w();
            if (transition.m1362b() == EnterExitState.PreEnter) {
                abstractC8670d.mo16925a().getClass();
                abstractC8672f.mo16927a().getClass();
            } else {
                abstractC8672f.mo16927a().getClass();
                abstractC8670d.mo16925a().getClass();
            }
            C8908g0 c8908g2 = f1453a;
            int i25 = i12 | 3136;
            interfaceC0476a.mo1622c(-142660079);
            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.f1461b;
            EnterExitState enterExitStateM1362b3 = transition.m1362b();
            interfaceC0476a.mo1622c(-288165413);
            int i26 = iArr2[enterExitStateM1362b3.ordinal()];
            if (i26 != 1) {
                if (i26 == 2) {
                    abstractC8670d.mo16925a().getClass();
                    abstractC8672f.mo16927a().getClass();
                } else {
                    if (i26 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC8672f.mo16927a().getClass();
                    abstractC8670d.mo16925a().getClass();
                }
            }
            long j10 = C9162o0.f47689b;
            interfaceC0476a.mo1661w();
            C9162o0 c9162o0 = new C9162o0(j10);
            EnterExitState enterExitStateM1364d3 = transition.m1364d();
            interfaceC0476a.mo1622c(-288165413);
            int i27 = iArr2[enterExitStateM1364d3.ordinal()];
            if (i27 != 1) {
                if (i27 == 2) {
                    abstractC8670d.mo16925a().getClass();
                    abstractC8672f.mo16927a().getClass();
                } else {
                    if (i27 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC8672f.mo16927a().getClass();
                    abstractC8670d.mo16925a().getClass();
                }
            }
            interfaceC0476a.mo1661w();
            final Transition.C0368d c0368dM1391c2 = C0372d.m1391c(transition, c9162o0, new C9162o0(j10), enterExitTransitionKt$createModifier$$inlined$animateValue$1.mo1343M(transition.m1363c(), interfaceC0476a, Integer.valueOf((i25 >> 3) & 112)), c8908g2, "TransformOriginInterruptionHandling", interfaceC0476a);
            interfaceC0476a.mo1661w();
            interfaceC0476a.mo1622c(1618982084);
            boolean zMo1665y3 = interfaceC0476a.mo1665y(interfaceC5301c1) | interfaceC0476a.mo1665y(c0368dM1391c) | interfaceC0476a.mo1665y(c0368dM1391c2);
            Object objMo1624d5 = interfaceC0476a.mo1624d();
            if (zMo1665y3 || objMo1624d5 == obj) {
                objMo1624d5 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                        InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                        C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                        interfaceC9172x2.mo17463v(interfaceC5301c1.getValue().floatValue());
                        InterfaceC5301c1<Float> interfaceC5301c2 = c0368dM1391c;
                        interfaceC9172x2.mo17465x(interfaceC5301c2.getValue().floatValue());
                        interfaceC9172x2.mo17459p(interfaceC5301c2.getValue().floatValue());
                        interfaceC9172x2.mo17462u0(c0368dM1391c2.getValue().f47691a);
                        return C9072e.f47360a;
                    }
                };
                interfaceC0476a.mo1655t(objMo1624d5);
            }
            interfaceC0476a.mo1661w();
            interfaceC0500bM1927a2 = C0512a.m2000a(interfaceC0500bM1927a2, (InterfaceC2052l) objMo1624d5);
            interfaceC0476a.mo1661w();
        } else if (((Boolean) interfaceC5312g0.getValue()).booleanValue()) {
            interfaceC0476a.mo1622c(1657244550);
            interfaceC0476a.mo1622c(1157296644);
            boolean zMo1665y4 = interfaceC0476a.mo1665y(interfaceC5301c1);
            Object objMo1624d6 = interfaceC0476a.mo1624d();
            if (zMo1665y4 || objMo1624d6 == obj) {
                objMo1624d6 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                        InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                        C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                        interfaceC9172x2.mo17463v(interfaceC5301c1.getValue().floatValue());
                        return C9072e.f47360a;
                    }
                };
                interfaceC0476a.mo1655t(objMo1624d6);
            }
            interfaceC0476a.mo1661w();
            interfaceC0500bM1927a2 = C0512a.m2000a(interfaceC0500bM1927a2, (InterfaceC2052l) objMo1624d6);
            interfaceC0476a.mo1661w();
        } else {
            interfaceC0476a.mo1622c(1657244642);
            interfaceC0476a.mo1661w();
        }
        interfaceC0476a.mo1661w();
        return interfaceC0500bM1927a2;
    }

    /* JADX INFO: renamed from: b */
    public static C8671e m1345b() {
        Map<InterfaceC8906f0<?, ?>, Float> map = C8930r0.f46854a;
        C8936x c8936xM16724f1 = C8573r0.m16724f1(400.0f, new C10022j(C9000b.m17236a(1, 1)), 1);
        C7886b c7886b = InterfaceC7885a.a.f42992d;
        EnterExitTransitionKt$expandIn$1 enterExitTransitionKt$expandIn$1 = new InterfaceC2052l<C10022j, C10022j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C10022j mo528n(C10022j c10022j) {
                long j10 = c10022j.f50980a;
                return new C10022j(C9000b.m17236a(0, 0));
            }
        };
        C5207g.m11111f(enterExitTransitionKt$expandIn$1, "initialSize");
        return new C8671e(new C8681o(null, null, new C8669c(c8936xM16724f1, c7886b, enterExitTransitionKt$expandIn$1, true), 11));
    }

    /* JADX INFO: renamed from: c */
    public static final C8671e m1346c(float f3, InterfaceC8929r interfaceC8929r) {
        C5207g.m11111f(interfaceC8929r, "animationSpec");
        return new C8671e(new C8681o(new C8674h(f3, interfaceC8929r), null, null, 14));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C8671e m1347d(float f3, int i10) {
        C8936x c8936xM16724f1 = (i10 & 1) != 0 ? C8573r0.m16724f1(400.0f, null, 5) : null;
        if ((i10 & 2) != 0) {
            f3 = 0.0f;
        }
        return m1346c(f3, c8936xM16724f1);
    }

    /* JADX INFO: renamed from: e */
    public static C8673g m1348e(C8904e0 c8904e0, int i10) {
        InterfaceC8929r interfaceC8929rM16724f1 = c8904e0;
        if ((i10 & 1) != 0) {
            interfaceC8929rM16724f1 = C8573r0.m16724f1(400.0f, null, 5);
        }
        C5207g.m11111f(interfaceC8929rM16724f1, "animationSpec");
        return new C8673g(new C8681o(new C8674h(0.0f, interfaceC8929rM16724f1), null, null, 14));
    }

    /* JADX INFO: renamed from: f */
    public static C8673g m1349f() {
        Map<InterfaceC8906f0<?, ?>, Float> map = C8930r0.f46854a;
        C8936x c8936xM16724f1 = C8573r0.m16724f1(400.0f, new C10022j(C9000b.m17236a(1, 1)), 1);
        C7886b c7886b = InterfaceC7885a.a.f42992d;
        EnterExitTransitionKt$shrinkOut$1 enterExitTransitionKt$shrinkOut$1 = new InterfaceC2052l<C10022j, C10022j>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C10022j mo528n(C10022j c10022j) {
                long j10 = c10022j.f50980a;
                return new C10022j(C9000b.m17236a(0, 0));
            }
        };
        C5207g.m11111f(enterExitTransitionKt$shrinkOut$1, "targetSize");
        return new C8673g(new C8681o(null, null, new C8669c(c8936xM16724f1, c7886b, enterExitTransitionKt$shrinkOut$1, true), 11));
    }

    /* JADX INFO: renamed from: g */
    public static final C8671e m1350g(C8904e0 c8904e0, final InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "initialOffsetY");
        return new C8671e(new C8681o(null, new C8678l(c8904e0, new InterfaceC2052l<C10022j, C10020h>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C10020h mo528n(C10022j c10022j) {
                return new C10020h(C8573r0.m16752r(0, interfaceC2052l.mo528n(Integer.valueOf(C10022j.m18628b(c10022j.f50980a))).intValue()));
            }
        }), null, 13));
    }

    /* JADX INFO: renamed from: h */
    public static final C8673g m1351h(C8904e0 c8904e0, final InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "targetOffsetY");
        return new C8673g(new C8681o(null, new C8678l(c8904e0, new InterfaceC2052l<C10022j, C10020h>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C10020h mo528n(C10022j c10022j) {
                return new C10020h(C8573r0.m16752r(0, interfaceC2052l.mo528n(Integer.valueOf(C10022j.m18628b(c10022j.f50980a))).intValue()));
            }
        }), null, 13));
    }
}
