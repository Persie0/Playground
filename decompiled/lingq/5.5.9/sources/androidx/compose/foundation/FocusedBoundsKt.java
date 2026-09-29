package androidx.compose.foundation;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5647k;
import p142h1.C5877h;
import p338qd.C8573r0;
import p386t.C9123o;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FocusedBoundsKt {

    /* JADX INFO: renamed from: a */
    public static final C5877h<InterfaceC2052l<InterfaceC5647k, C9072e>> f1840a = C8573r0.m16680J0(new InterfaceC2041a<InterfaceC2052l<? super InterfaceC5647k, ? extends C9072e>>() { // from class: androidx.compose.foundation.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final /* bridge */ /* synthetic */ InterfaceC2052l<? super InterfaceC5647k, ? extends C9072e> mo807E() {
            return null;
        }
    });

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1412a(InterfaceC0500b interfaceC0500b, final InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, 1176407768);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                interfaceC0476a2.mo1622c(1157296644);
                InterfaceC2052l<InterfaceC5647k, C9072e> interfaceC2052l2 = interfaceC2052l;
                boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC2052l2);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new C9123o(interfaceC2052l2);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                C9123o c9123o = (C9123o) objMo1624d;
                interfaceC0476a2.mo1661w();
                return c9123o;
            }
        });
    }
}
