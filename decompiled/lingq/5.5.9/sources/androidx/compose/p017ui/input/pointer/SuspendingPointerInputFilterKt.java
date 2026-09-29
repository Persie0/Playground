package androidx.compose.p017ui.input.pointer;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import p041c5.C1702c;
import p060d1.C5024k;
import p060d1.InterfaceC5035v;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.C5349z;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p464wl.InterfaceC9968c;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {

    /* JADX INFO: renamed from: a */
    public static final C5024k f3630a = new C5024k(EmptyList.f38032a);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m2032a(InterfaceC0500b interfaceC0500b, final Object obj, final InterfaceC2056p<? super InterfaceC5035v, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, -906157935);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4137e);
                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC10015c);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new SuspendingPointerInputFilter(interfaceC0647n1, interfaceC10015c);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objMo1624d;
                C5333r.m11461c(suspendingPointerInputFilter, obj, new SuspendingPointerInputFilterKt$pointerInput$2$2$1(suspendingPointerInputFilter, interfaceC2056p, null), interfaceC0476a2);
                interfaceC0476a2.mo1661w();
                return suspendingPointerInputFilter;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b m2033b(InterfaceC0500b interfaceC0500b, final Object obj, final Object obj2, final InterfaceC2056p<? super InterfaceC5035v, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC2056p, "block");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, 1175567217);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4137e);
                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC10015c);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (zMo1665y || objMo1624d == c10586a) {
                    objMo1624d = new SuspendingPointerInputFilter(interfaceC0647n1, interfaceC10015c);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objMo1624d;
                SuspendingPointerInputFilterKt$pointerInput$4$2$1 suspendingPointerInputFilterKt$pointerInput$4$2$1 = new SuspendingPointerInputFilterKt$pointerInput$4$2$1(suspendingPointerInputFilter, interfaceC2056p, null);
                C5329p c5329p = C5333r.f33609a;
                interfaceC0476a2.mo1622c(-54093371);
                CoroutineContext coroutineContextMo1651r = interfaceC0476a2.mo1651r();
                interfaceC0476a2.mo1622c(1618982084);
                boolean zMo1665y2 = interfaceC0476a2.mo1665y(suspendingPointerInputFilter) | interfaceC0476a2.mo1665y(obj) | interfaceC0476a2.mo1665y(obj2);
                Object objMo1624d2 = interfaceC0476a2.mo1624d();
                if (zMo1665y2 || objMo1624d2 == c10586a) {
                    interfaceC0476a2.mo1655t(new C5349z(coroutineContextMo1651r, suspendingPointerInputFilterKt$pointerInput$4$2$1));
                }
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1661w();
                return suspendingPointerInputFilter;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0500b m2034c(final Object[] objArr, final InterfaceC2056p interfaceC2056p) {
        return ComposedModifierKt.m1927a(InterfaceC0500b.a.f3325a, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b, "$this$composed", interfaceC0476a2, 664422852);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4137e);
                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0476a2.mo1622c(1157296644);
                boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC10015c);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new SuspendingPointerInputFilter(interfaceC0647n1, interfaceC10015c);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) objMo1624d;
                C1702c c1702c = new C1702c(2);
                c1702c.m5436c(suspendingPointerInputFilter);
                c1702c.m5438e(objArr);
                C5333r.m11462d(c1702c.m5442i(new Object[c1702c.m5441h()]), new SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter, interfaceC2056p, null), interfaceC0476a2);
                interfaceC0476a2.mo1661w();
                return suspendingPointerInputFilter;
            }
        });
    }
}
