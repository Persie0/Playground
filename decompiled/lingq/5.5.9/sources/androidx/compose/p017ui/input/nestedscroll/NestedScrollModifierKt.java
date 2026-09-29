package androidx.compose.p017ui.input.nestedscroll;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.coroutines.EmptyCoroutineContext;
import no.InterfaceC7882z;
import p037c1.InterfaceC1657a;
import p081e0.C5319k;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollModifierKt {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m2016a(InterfaceC0500b interfaceC0500b, final InterfaceC1657a interfaceC1657a, final NestedScrollDispatcher nestedScrollDispatcher) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC1657a, "connection");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, 410346167);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(773894976);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (objMo1624d == c10586a) {
                    C5319k c5319k = new C5319k(C5333r.m11463e(EmptyCoroutineContext.f38093a, interfaceC0476a2));
                    interfaceC0476a2.mo1655t(c5319k);
                    objMo1624d = c5319k;
                }
                interfaceC0476a2.mo1661w();
                InterfaceC7882z interfaceC7882z = ((C5319k) objMo1624d).f33592a;
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1622c(100475956);
                NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
                if (nestedScrollDispatcher2 == null) {
                    interfaceC0476a2.mo1622c(-492369756);
                    Object objMo1624d2 = interfaceC0476a2.mo1624d();
                    if (objMo1624d2 == c10586a) {
                        objMo1624d2 = new NestedScrollDispatcher();
                        interfaceC0476a2.mo1655t(objMo1624d2);
                    }
                    interfaceC0476a2.mo1661w();
                    nestedScrollDispatcher2 = (NestedScrollDispatcher) objMo1624d2;
                }
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1622c(1618982084);
                InterfaceC1657a interfaceC1657a2 = interfaceC1657a;
                boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC1657a2) | interfaceC0476a2.mo1665y(nestedScrollDispatcher2) | interfaceC0476a2.mo1665y(interfaceC7882z);
                Object objMo1624d3 = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d3 == c10586a) {
                    nestedScrollDispatcher2.f3579b = interfaceC7882z;
                    objMo1624d3 = new NestedScrollModifierLocal(interfaceC1657a2, nestedScrollDispatcher2);
                    interfaceC0476a2.mo1655t(objMo1624d3);
                }
                interfaceC0476a2.mo1661w();
                NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) objMo1624d3;
                interfaceC0476a2.mo1661w();
                return nestedScrollModifierLocal;
            }
        });
    }
}
