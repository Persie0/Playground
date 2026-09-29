package androidx.compose.p017ui.draw;

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
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p327q0.C8456b;
import p327q0.C8459e;
import p424v0.InterfaceC9619c;
import p424v0.InterfaceC9621e;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.draw.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0501a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1948a(InterfaceC0500b interfaceC0500b, InterfaceC2052l<? super InterfaceC9621e, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        return interfaceC0500b.mo1929K(new DrawBehindElement(interfaceC2052l));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b m1949b(final InterfaceC2052l interfaceC2052l) {
        return ComposedModifierKt.m1927a(InterfaceC0500b.a.f3325a, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.ui.draw.DrawModifierKt$drawWithCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0500b interfaceC0500b2 = interfaceC0500b;
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, -1689569019);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new C8456b();
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b2.mo1929K(new C8459e((C8456b) objMo1624d, interfaceC2052l));
                interfaceC0476a2.mo1661w();
                return interfaceC0500bMo1929K;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0500b m1950c(InterfaceC0500b interfaceC0500b, InterfaceC2052l<? super InterfaceC9619c, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC2052l, "onDraw");
        return interfaceC0500b.mo1929K(new DrawWithContentElement(interfaceC2052l));
    }
}
