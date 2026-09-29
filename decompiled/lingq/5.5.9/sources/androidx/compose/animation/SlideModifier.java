package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.layout.PlaceableKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6753d;
import p081e0.InterfaceC5301c1;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p350r.AbstractC8677k;
import p350r.C8678l;
import p374s.C8907g;
import p374s.InterfaceC8929r;
import p385sf.C9000b;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SlideModifier extends AbstractC8677k {

    /* JADX INFO: renamed from: a */
    public final Transition<EnterExitState>.C0364a<C10020h, C8907g> f1499a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5301c1<C8678l> f1500b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5301c1<C8678l> f1501c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2052l<Transition.InterfaceC0366b<EnterExitState>, InterfaceC8929r<C10020h>> f1502d;

    /* JADX INFO: renamed from: androidx.compose.animation.SlideModifier$a */
    public /* synthetic */ class C0361a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1503a;

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
            f1503a = iArr;
        }
    }

    public SlideModifier(Transition<EnterExitState>.C0364a<C10020h, C8907g> c0364a, InterfaceC5301c1<C8678l> interfaceC5301c1, InterfaceC5301c1<C8678l> interfaceC5301c2) {
        C5207g.m11111f(c0364a, "lazyAnimation");
        C5207g.m11111f(interfaceC5301c1, "slideIn");
        C5207g.m11111f(interfaceC5301c2, "slideOut");
        this.f1499a = c0364a;
        this.f1500b = interfaceC5301c1;
        this.f1501c = interfaceC5301c2;
        this.f1502d = new InterfaceC2052l<Transition.InterfaceC0366b<EnterExitState>, InterfaceC8929r<C10020h>>() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8929r<C10020h> mo528n(Transition.InterfaceC0366b<EnterExitState> interfaceC0366b) {
                InterfaceC8929r<C10020h> interfaceC8929r;
                InterfaceC8929r<C10020h> interfaceC8929r2;
                Transition.InterfaceC0366b<EnterExitState> interfaceC0366b2 = interfaceC0366b;
                C5207g.m11111f(interfaceC0366b2, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                boolean zM1373b = interfaceC0366b2.m1373b(enterExitState, enterExitState2);
                SlideModifier slideModifier = this.f1509b;
                if (zM1373b) {
                    C8678l value = slideModifier.f1500b.getValue();
                    if (value != null && (interfaceC8929r2 = value.f46269b) != null) {
                        return interfaceC8929r2;
                    }
                    return EnterExitTransitionKt.f1456d;
                }
                if (!interfaceC0366b2.m1373b(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.f1456d;
                }
                C8678l value2 = slideModifier.f1501c.getValue();
                if (value2 != null && (interfaceC8929r = value2.f46269b) != null) {
                    return interfaceC8929r;
                }
                return EnterExitTransitionKt.f1456d;
            }
        };
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(j10);
        final long jM17236a = C9000b.m17236a(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b);
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.animation.SlideModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                C5207g.m11111f(aVar, "$this$layout");
                final SlideModifier slideModifier = this.f1504b;
                Transition<EnterExitState>.C0364a<C10020h, C8907g> c0364a = slideModifier.f1499a;
                InterfaceC2052l<Transition.InterfaceC0366b<EnterExitState>, InterfaceC8929r<C10020h>> interfaceC2052l = slideModifier.f1502d;
                final long j11 = jM17236a;
                long j12 = ((C10020h) c0364a.m1370a(interfaceC2052l, new InterfaceC2052l<EnterExitState, C10020h>() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C10020h mo528n(EnterExitState enterExitState) {
                        InterfaceC2052l<C10022j, C10020h> interfaceC2052l2;
                        InterfaceC2052l<C10022j, C10020h> interfaceC2052l3;
                        EnterExitState enterExitState2 = enterExitState;
                        C5207g.m11111f(enterExitState2, "it");
                        SlideModifier slideModifier2 = slideModifier;
                        slideModifier2.getClass();
                        C8678l value = slideModifier2.f1500b.getValue();
                        long j13 = j11;
                        long j14 = (value == null || (interfaceC2052l3 = value.f46268a) == null) ? C10020h.f50973b : interfaceC2052l3.mo528n(new C10022j(j13)).f50975a;
                        C8678l value2 = slideModifier2.f1501c.getValue();
                        long j15 = (value2 == null || (interfaceC2052l2 = value2.f46268a) == null) ? C10020h.f50973b : interfaceC2052l2.mo528n(new C10022j(j13)).f50975a;
                        int i10 = SlideModifier.C0361a.f1503a[enterExitState2.ordinal()];
                        if (i10 == 1) {
                            j14 = C10020h.f50973b;
                        } else if (i10 != 2) {
                            if (i10 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j14 = j15;
                        }
                        return new C10020h(j14);
                    }
                }).getValue()).f50975a;
                AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
                AbstractC0526g.a.m2062h(abstractC0526gMo2048w, j12, 0.0f, PlaceableKt.f3670a);
                return C9072e.f47360a;
            }
        });
    }
}
