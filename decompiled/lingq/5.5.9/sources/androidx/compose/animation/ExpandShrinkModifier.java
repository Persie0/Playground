package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6753d;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p350r.AbstractC8677k;
import p350r.C8669c;
import p374s.C8907g;
import p374s.InterfaceC8929r;
import p385sf.C9000b;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandShrinkModifier extends AbstractC8677k {

    /* JADX INFO: renamed from: a */
    public final Transition<EnterExitState>.C0364a<C10022j, C8907g> f1482a;

    /* JADX INFO: renamed from: b */
    public final Transition<EnterExitState>.C0364a<C10020h, C8907g> f1483b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5301c1<C8669c> f1484c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5301c1<C8669c> f1485d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5301c1<InterfaceC7885a> f1486e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7885a f1487f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2052l<Transition.InterfaceC0366b<EnterExitState>, InterfaceC8929r<C10022j>> f1488g;

    /* JADX INFO: renamed from: androidx.compose.animation.ExpandShrinkModifier$a */
    public /* synthetic */ class C0360a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1489a;

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
            f1489a = iArr;
        }
    }

    public ExpandShrinkModifier(Transition.C0364a c0364a, Transition.C0364a c0364a2, InterfaceC5301c1 interfaceC5301c1, InterfaceC5301c1 interfaceC5301c2, InterfaceC5312g0 interfaceC5312g0) {
        C5207g.m11111f(c0364a, "sizeAnimation");
        C5207g.m11111f(c0364a2, "offsetAnimation");
        C5207g.m11111f(interfaceC5301c1, "expand");
        C5207g.m11111f(interfaceC5301c2, "shrink");
        this.f1482a = c0364a;
        this.f1483b = c0364a2;
        this.f1484c = interfaceC5301c1;
        this.f1485d = interfaceC5301c2;
        this.f1486e = interfaceC5312g0;
        this.f1488g = new InterfaceC2052l<Transition.InterfaceC0366b<EnterExitState>, InterfaceC8929r<C10022j>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8929r<C10022j> mo528n(Transition.InterfaceC0366b<EnterExitState> interfaceC0366b) {
                InterfaceC8929r<C10022j> interfaceC8929r;
                Transition.InterfaceC0366b<EnterExitState> interfaceC0366b2 = interfaceC0366b;
                C5207g.m11111f(interfaceC0366b2, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                boolean zM1373b = interfaceC0366b2.m1373b(enterExitState, enterExitState2);
                ExpandShrinkModifier expandShrinkModifier = this.f1498b;
                if (zM1373b) {
                    C8669c value = expandShrinkModifier.f1484c.getValue();
                    if (value != null) {
                        interfaceC8929r = value.f46253c;
                    } else {
                        interfaceC8929r = null;
                    }
                } else if (interfaceC0366b2.m1373b(enterExitState2, EnterExitState.PostExit)) {
                    C8669c value2 = expandShrinkModifier.f1485d.getValue();
                    if (value2 != null) {
                        interfaceC8929r = value2.f46253c;
                    } else {
                        interfaceC8929r = null;
                    }
                } else {
                    interfaceC8929r = EnterExitTransitionKt.f1457e;
                }
                return interfaceC8929r == null ? EnterExitTransitionKt.f1457e : interfaceC8929r;
            }
        };
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(j10);
        final long jM17236a = C9000b.m17236a(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b);
        long j11 = ((C10022j) this.f1482a.m1370a(this.f1488g, new InterfaceC2052l<EnterExitState, C10022j>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C10022j mo528n(EnterExitState enterExitState) {
                long j12;
                long j13;
                EnterExitState enterExitState2 = enterExitState;
                C5207g.m11111f(enterExitState2, "it");
                ExpandShrinkModifier expandShrinkModifier = this.f1493b;
                expandShrinkModifier.getClass();
                C8669c value = expandShrinkModifier.f1484c.getValue();
                long j14 = jM17236a;
                if (value != null) {
                    j12 = value.f46252b.mo528n(new C10022j(j14)).f50980a;
                } else {
                    j12 = j14;
                }
                C8669c value2 = expandShrinkModifier.f1485d.getValue();
                if (value2 != null) {
                    j13 = value2.f46252b.mo528n(new C10022j(j14)).f50980a;
                } else {
                    j13 = j14;
                }
                int i10 = ExpandShrinkModifier.C0360a.f1489a[enterExitState2.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        j14 = j12;
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j14 = j13;
                    }
                }
                return new C10022j(j14);
            }
        }).getValue()).f50980a;
        final long j12 = ((C10020h) this.f1483b.m1370a(new InterfaceC2052l<Transition.InterfaceC0366b<EnterExitState>, InterfaceC8929r<C10020h>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8929r<C10020h> mo528n(Transition.InterfaceC0366b<EnterExitState> interfaceC0366b) {
                C5207g.m11111f(interfaceC0366b, "$this$animate");
                return EnterExitTransitionKt.f1456d;
            }
        }, new InterfaceC2052l<EnterExitState, C10020h>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C10020h mo528n(EnterExitState enterExitState) {
                int i10;
                long jM16752r;
                EnterExitState enterExitState2 = enterExitState;
                C5207g.m11111f(enterExitState2, "it");
                long j13 = jM17236a;
                ExpandShrinkModifier expandShrinkModifier = this.f1496b;
                expandShrinkModifier.getClass();
                if (expandShrinkModifier.f1487f == null) {
                    jM16752r = C10020h.f50973b;
                } else {
                    InterfaceC5301c1<InterfaceC7885a> interfaceC5301c1 = expandShrinkModifier.f1486e;
                    if (interfaceC5301c1.getValue() == null || C5207g.m11106a(expandShrinkModifier.f1487f, interfaceC5301c1.getValue()) || (i10 = ExpandShrinkModifier.C0360a.f1489a[enterExitState2.ordinal()]) == 1 || i10 == 2) {
                        jM16752r = C10020h.f50973b;
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C8669c value = expandShrinkModifier.f1485d.getValue();
                        if (value != null) {
                            long j14 = value.f46252b.mo528n(new C10022j(j13)).f50980a;
                            InterfaceC7885a value2 = interfaceC5301c1.getValue();
                            C5207g.m11108c(value2);
                            InterfaceC7885a interfaceC7885a = value2;
                            LayoutDirection layoutDirection = LayoutDirection.Ltr;
                            long jMo15655a = interfaceC7885a.mo15655a(j13, j14, layoutDirection);
                            InterfaceC7885a interfaceC7885a2 = expandShrinkModifier.f1487f;
                            C5207g.m11108c(interfaceC7885a2);
                            long jMo15655a2 = interfaceC7885a2.mo15655a(j13, j14, layoutDirection);
                            jM16752r = C8573r0.m16752r(((int) (jMo15655a >> 32)) - ((int) (jMo15655a2 >> 32)), C10020h.m18625a(jMo15655a) - C10020h.m18625a(jMo15655a2));
                        } else {
                            jM16752r = C10020h.f50973b;
                        }
                    }
                }
                return new C10020h(jM16752r);
            }
        }).getValue()).f50975a;
        InterfaceC7885a interfaceC7885a = this.f1487f;
        final long jMo15655a = interfaceC7885a != null ? interfaceC7885a.mo15655a(jM17236a, j11, LayoutDirection.Ltr) : C10020h.f50973b;
        return interfaceC0524e.m2043P((int) (j11 >> 32), C10022j.m18628b(j11), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                int i10 = C10020h.f50974c;
                long j13 = jMo15655a;
                long j14 = j12;
                AbstractC0526g.a.m2057c(aVar2, abstractC0526gMo2048w, ((int) (j14 >> 32)) + ((int) (j13 >> 32)), C10020h.m18625a(j14) + C10020h.m18625a(j13));
                return C9072e.f47360a;
            }
        });
    }
}
