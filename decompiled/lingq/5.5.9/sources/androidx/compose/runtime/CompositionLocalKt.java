package androidx.compose.runtime;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.Arrays;
import p081e0.C5304d1;
import p081e0.C5310f1;
import p081e0.C5328o0;
import p081e0.C5331q;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalKt {
    /* JADX INFO: renamed from: a */
    public static final void m1691a(final C5328o0<?>[] c5328o0Arr, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(c5328o0Arr, "values");
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-1390796515);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        composerImplMo1636j.m1660v0(c5328o0Arr);
        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i10 >> 3) & 14));
        composerImplMo1636j.m1611S();
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                C5328o0<?>[] c5328o0Arr2 = c5328o0Arr;
                C5328o0[] c5328o0Arr3 = (C5328o0[]) Arrays.copyOf(c5328o0Arr2, c5328o0Arr2.length);
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                CompositionLocalKt.m1691a(c5328o0Arr3, interfaceC2056p, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static C5331q m1692b(InterfaceC2041a interfaceC2041a) {
        C5310f1 c5310f1 = C5310f1.f33583a;
        C5207g.m11111f(interfaceC2041a, "defaultFactory");
        return new C5331q(c5310f1, interfaceC2041a);
    }

    /* JADX INFO: renamed from: c */
    public static final C5304d1 m1693c(InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "defaultFactory");
        return new C5304d1(interfaceC2041a);
    }
}
