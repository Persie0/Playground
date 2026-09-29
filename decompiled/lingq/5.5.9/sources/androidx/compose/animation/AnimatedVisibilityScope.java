package androidx.compose.animation;

import androidx.activity.result.C0204c;
import androidx.compose.animation.core.Transition;
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
import p350r.AbstractC8670d;
import p350r.AbstractC8672f;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatedVisibilityScope {
    /* JADX INFO: renamed from: b */
    default InterfaceC0500b m1341b(InterfaceC0500b interfaceC0500b, final AbstractC8670d abstractC8670d, final AbstractC8672f abstractC8672f, final String str) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(abstractC8670d, "enter");
        C5207g.m11111f(abstractC8672f, "exit");
        C5207g.m11111f(str, "label");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0500b interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b3, "$this$composed", interfaceC0476a2, 1840112047);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b3.mo1929K(EnterExitTransitionKt.m1344a(this.f1449b.mo1342c(), abstractC8670d, abstractC8672f, str, interfaceC0476a2, 0));
                interfaceC0476a2.mo1661w();
                return interfaceC0500bMo1929K;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    Transition<EnterExitState> mo1342c();
}
