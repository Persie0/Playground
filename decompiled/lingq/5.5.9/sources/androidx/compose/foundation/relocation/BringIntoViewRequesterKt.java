package androidx.compose.foundation.relocation;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p105f0.C5458f;
import p338qd.C8573r0;
import p468x.C9993a;
import p468x.C9997e;
import p468x.C9998f;
import p468x.InterfaceC9996d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewRequesterKt {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1526a(InterfaceC0500b interfaceC0500b, final InterfaceC9996d interfaceC9996d) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC9996d, "bringIntoViewRequester");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, -992853993);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                C9993a c9993aM16702U0 = C8573r0.m16702U0(interfaceC0476a2);
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y = interfaceC0476a2.mo1665y(c9993aM16702U0);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new C9998f(c9993aM16702U0);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                final C9998f c9998f = (C9998f) objMo1624d;
                final InterfaceC9996d interfaceC9996d2 = interfaceC9996d;
                if (interfaceC9996d2 instanceof BringIntoViewRequesterImpl) {
                    C5333r.m11459a(interfaceC9996d2, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final InterfaceC5327o mo528n(C5329p c5329p) {
                            C5207g.m11111f(c5329p, "$this$DisposableEffect");
                            InterfaceC9996d interfaceC9996d3 = interfaceC9996d2;
                            C5458f<C9998f> c5458f = ((BringIntoViewRequesterImpl) interfaceC9996d3).f2439a;
                            C9998f c9998f2 = c9998f;
                            c5458f.m11687b(c9998f2);
                            return new C9997e(interfaceC9996d3, c9998f2);
                        }
                    }, interfaceC0476a2);
                }
                interfaceC0476a2.mo1661w();
                return c9998f;
            }
        });
    }
}
