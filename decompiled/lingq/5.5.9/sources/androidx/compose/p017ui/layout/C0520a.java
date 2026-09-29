package androidx.compose.p017ui.layout;

import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.layout.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0520a {
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.LayoutKt$materializerOf$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final ComposableLambdaImpl m2036a(final InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0500b, "modifier");
        return C7204a.m14523c(-1586257396, new InterfaceC2057q<C5340u0<ComposeUiNode>, InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final C9072e mo1343M(C5340u0<ComposeUiNode> c5340u0, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = c5340u0.f33620a;
                num.intValue();
                C5207g.m11111f(interfaceC0476a2, "$this$null");
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                InterfaceC0500b interfaceC0500bM1928b = ComposedModifierKt.m1928b(interfaceC0476a, interfaceC0500b);
                interfaceC0476a2.mo1622c(509942095);
                ComposeUiNode.f3726n.getClass();
                C8573r0.m16714a1(interfaceC0476a2, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                interfaceC0476a2.mo1661w();
                return C9072e.f47360a;
            }
        }, true);
    }
}
