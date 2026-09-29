package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5206f;
import dm.C5207g;
import java.util.Arrays;
import p081e0.C5310f1;
import p081e0.C5314h0;
import p081e0.C5325n;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.C5334r0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p252m0.C7450a;
import p252m0.C7452c;
import p252m0.InterfaceC7451b;
import p252m0.InterfaceC7453d;
import p267n0.InterfaceC7680k;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.runtime.saveable.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0487a {
    /* JADX INFO: renamed from: a */
    public static final Object m1860a(Object[] objArr, C7452c c7452c, InterfaceC2041a interfaceC2041a, InterfaceC0476a interfaceC0476a, int i10) {
        Object objMo1863c;
        C5207g.m11111f(interfaceC2041a, "init");
        interfaceC0476a.mo1622c(441892779);
        if ((i10 & 2) != 0) {
            c7452c = SaverKt.f3232a;
            C5207g.m11109d(c7452c, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        }
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(1059366469);
        int iMo1657u = interfaceC0476a.mo1657u();
        C5206f.m11029x0(36);
        final String string = Integer.toString(iMo1657u, 36);
        C5207g.m11110e(string, "toString(this, checkRadix(radix))");
        interfaceC0476a.mo1661w();
        C5207g.m11109d(c7452c, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final InterfaceC0488b interfaceC0488b = (InterfaceC0488b) interfaceC0476a.mo1648p(SaveableStateRegistryKt.f3230a);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC0476a.mo1622c(-568225417);
        boolean zMo1665y = false;
        for (Object obj : objArrCopyOf) {
            zMo1665y |= interfaceC0476a.mo1665y(obj);
        }
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj2 = InterfaceC0476a.a.f3122a;
        if (zMo1665y || objMo1624d == obj2) {
            objMo1624d = (interfaceC0488b == null || (objMo1863c = interfaceC0488b.mo1863c(string)) == null) ? null : c7452c.f41273b.mo528n(objMo1863c);
            if (objMo1624d == null) {
                objMo1624d = interfaceC2041a.mo807E();
            }
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        if (interfaceC0488b != null) {
            final InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(c7452c, interfaceC0476a);
            final InterfaceC5312g0 interfaceC5312g0M16704V1 = C8573r0.m16704V0(objMo1624d, interfaceC0476a);
            InterfaceC2052l<C5329p, InterfaceC5327o> interfaceC2052l = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    String str;
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    final InterfaceC5301c1<InterfaceC7451b<Object, Object>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                    final InterfaceC5301c1<Object> interfaceC5301c2 = interfaceC5312g0M16704V1;
                    final InterfaceC0488b interfaceC0488b2 = interfaceC0488b;
                    InterfaceC2041a<? extends Object> interfaceC2041a2 = new InterfaceC2041a<Object>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1

                        /* JADX INFO: renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$a */
                        public static final class C0486a implements InterfaceC7453d {

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ InterfaceC0488b f3229a;

                            public C0486a(InterfaceC0488b interfaceC0488b) {
                                this.f3229a = interfaceC0488b;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Object mo807E() {
                            return interfaceC5301c1.getValue().mo14823a(new C0486a(interfaceC0488b2), interfaceC5301c2.getValue());
                        }
                    };
                    Object objMo807E = interfaceC2041a2.mo807E();
                    if (objMo807E == null || interfaceC0488b2.mo1861a(objMo807E)) {
                        return new C7450a(interfaceC0488b2.mo1864d(string, interfaceC2041a2));
                    }
                    if (objMo807E instanceof InterfaceC7680k) {
                        InterfaceC7680k interfaceC7680k = (InterfaceC7680k) objMo807E;
                        if (interfaceC7680k.mo11475a() == C5314h0.f33585a || interfaceC7680k.mo11475a() == C5310f1.f33583a || interfaceC7680k.mo11475a() == C5334r0.f33610a) {
                            str = "MutableState containing " + interfaceC7680k.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        } else {
                            str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        }
                    } else {
                        str = objMo807E + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                    }
                    throw new IllegalArgumentException(str);
                }
            };
            C5329p c5329p = C5333r.f33609a;
            interfaceC0476a.mo1622c(1429097729);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            interfaceC0476a.mo1622c(511388516);
            boolean zMo1665y2 = interfaceC0476a.mo1665y(interfaceC0488b) | interfaceC0476a.mo1665y(string);
            Object objMo1624d2 = interfaceC0476a.mo1624d();
            if (zMo1665y2 || objMo1624d2 == obj2) {
                interfaceC0476a.mo1655t(new C5325n(interfaceC2052l));
            }
            interfaceC0476a.mo1661w();
            interfaceC0476a.mo1661w();
        }
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
        interfaceC0476a.mo1661w();
        return objMo1624d;
    }
}
