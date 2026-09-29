package androidx.compose.foundation.relocation;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p468x.C9993a;
import p468x.InterfaceC9999g;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewResponderKt {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1527a(InterfaceC0500b interfaceC0500b, final InterfaceC9999g interfaceC9999g) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC9999g, "responder");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderKt$bringIntoViewResponder$2
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, -852052847);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                C9993a c9993aM16702U0 = C8573r0.m16702U0(interfaceC0476a2);
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y = interfaceC0476a2.mo1665y(c9993aM16702U0);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new BringIntoViewResponderModifier(c9993aM16702U0);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) objMo1624d;
                bringIntoViewResponderModifier.getClass();
                InterfaceC9999g interfaceC9999g2 = interfaceC9999g;
                C5207g.m11111f(interfaceC9999g2, "<set-?>");
                bringIntoViewResponderModifier.f2453d = interfaceC9999g2;
                interfaceC0476a2.mo1661w();
                return bringIntoViewResponderModifier;
            }
        });
    }
}
