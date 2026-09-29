package androidx.compose.foundation.relocation;

import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p127g1.InterfaceC5647k;
import p142h1.C5877h;
import p142h1.InterfaceC5875f;
import p260m8.C7499b;
import p375s0.C8942d;
import p464wl.InterfaceC9968c;
import p468x.AbstractC9994b;
import p468x.C9993a;
import p468x.InterfaceC9995c;
import p468x.InterfaceC9999g;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewResponderModifier extends AbstractC9994b implements InterfaceC5875f<InterfaceC9995c>, InterfaceC9995c {

    /* JADX INFO: renamed from: d */
    public InterfaceC9999g f2453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(C9993a c9993a) {
        super(c9993a);
        C5207g.m11111f(c9993a, "defaultParent");
    }

    /* JADX INFO: renamed from: h */
    public static final C8942d m1528h(BringIntoViewResponderModifier bringIntoViewResponderModifier, InterfaceC5647k interfaceC5647k, InterfaceC2041a interfaceC2041a) {
        C8942d c8942d;
        InterfaceC5647k interfaceC5647kM18582d = bringIntoViewResponderModifier.m18582d();
        if (interfaceC5647kM18582d == null) {
            return null;
        }
        if (!interfaceC5647k.mo2190q()) {
            interfaceC5647k = null;
        }
        if (interfaceC5647k == null || (c8942d = (C8942d) interfaceC2041a.mo807E()) == null) {
            return null;
        }
        C8942d c8942dMo2194t = interfaceC5647kM18582d.mo2194t(interfaceC5647k, false);
        return c8942d.m17173d(C7499b.m14932c(c8942dMo2194t.f46894a, c8942dMo2194t.f46895b));
    }

    @Override // p468x.InterfaceC9995c
    /* JADX INFO: renamed from: c */
    public final Object mo1529c(final InterfaceC5647k interfaceC5647k, final InterfaceC2041a<C8942d> interfaceC2041a, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        Object objM14963s = C7499b.m14963s(new BringIntoViewResponderModifier$bringChildIntoView$2(this, interfaceC5647k, interfaceC2041a, new InterfaceC2041a<C8942d>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C8942d mo807E() {
                InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                InterfaceC2041a<C8942d> interfaceC2041a2 = interfaceC2041a;
                BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f2469b;
                C8942d c8942dM1528h = BringIntoViewResponderModifier.m1528h(bringIntoViewResponderModifier, interfaceC5647k2, interfaceC2041a2);
                if (c8942dM1528h == null) {
                    return null;
                }
                InterfaceC9999g interfaceC9999g = bringIntoViewResponderModifier.f2453d;
                if (interfaceC9999g != null) {
                    return interfaceC9999g.mo1435c(c8942dM1528h);
                }
                C5207g.m11117l("responder");
                throw null;
            }
        }, null), interfaceC9968c);
        return objM14963s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14963s : C9072e.f47360a;
    }

    @Override // p142h1.InterfaceC5875f
    public final C5877h<InterfaceC9995c> getKey() {
        return BringIntoViewKt.f2437a;
    }

    @Override // p142h1.InterfaceC5875f
    public final InterfaceC9995c getValue() {
        return this;
    }
}
