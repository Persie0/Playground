package androidx.compose.runtime;

import android.support.v4.media.C0141b;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p081e0.C5318j0;
import p081e0.C5332q0;
import p081e0.C5341v;
import p081e0.C5346x0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5302d;
import p081e0.InterfaceC5336s0;
import p081e0.InterfaceC5338t0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ComposerKt {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> f3003a = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerKt$removeCurrentGroupInstance$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
            C0480e c0480e2 = c0480e;
            InterfaceC5336s0 interfaceC5336s1 = interfaceC5336s0;
            C5207g.m11111f(interfaceC5299c, "<anonymous parameter 0>");
            C5207g.m11111f(c0480e2, "slots");
            C5207g.m11111f(interfaceC5336s1, "rememberManager");
            ComposerKt.m1689e(c0480e2, interfaceC5336s1);
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> f3004b = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerKt$skipToGroupEndInstance$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
            C0480e c0480e2 = c0480e;
            C5207g.m11111f(interfaceC5299c, "<anonymous parameter 0>");
            C5207g.m11111f(c0480e2, "slots");
            C5207g.m11111f(interfaceC5336s0, "<anonymous parameter 2>");
            c0480e2.m1780G();
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> f3005c = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerKt$endGroupInstance$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
            C0480e c0480e2 = c0480e;
            C5207g.m11111f(interfaceC5299c, "<anonymous parameter 0>");
            C5207g.m11111f(c0480e2, "slots");
            C5207g.m11111f(interfaceC5336s0, "<anonymous parameter 2>");
            c0480e2.m1796i();
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> f3006d = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerKt$startRootGroup$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
            C0480e c0480e2 = c0480e;
            C5207g.m11111f(interfaceC5299c, "<anonymous parameter 0>");
            C5207g.m11111f(c0480e2, "slots");
            C5207g.m11111f(interfaceC5336s0, "<anonymous parameter 2>");
            c0480e2.m1798k(0);
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> f3007e = new InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e>() { // from class: androidx.compose.runtime.ComposerKt$resetSlotsInstance$1
        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final C9072e mo1343M(InterfaceC5299c<?> interfaceC5299c, C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
            C0480e c0480e2 = c0480e;
            C0141b.m619o(interfaceC5299c, "<anonymous parameter 0>", c0480e2, "slots", interfaceC5336s0, "<anonymous parameter 2>");
            if (!(c0480e2.f3178m == 0)) {
                ComposerKt.m1687c("Cannot reset when inserting".toString());
                throw null;
            }
            c0480e2.m1775B();
            c0480e2.f3183r = 0;
            c0480e2.f3172g = (c0480e2.f3167b.length / 5) - c0480e2.f3171f;
            c0480e2.f3173h = 0;
            c0480e2.f3174i = 0;
            c0480e2.f3179n = 0;
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: f */
    public static final C5318j0 f3008f = new C5318j0("provider");

    /* JADX INFO: renamed from: g */
    public static final C5318j0 f3009g = new C5318j0("provider");

    /* JADX INFO: renamed from: h */
    public static final C5318j0 f3010h = new C5318j0("compositionLocalMap");

    /* JADX INFO: renamed from: i */
    public static final C5318j0 f3011i = new C5318j0("providerValues");

    /* JADX INFO: renamed from: j */
    public static final C5318j0 f3012j = new C5318j0("providers");

    /* JADX INFO: renamed from: k */
    public static final C5318j0 f3013k = new C5318j0("reference");

    /* JADX INFO: renamed from: a */
    public static final void m1685a(int i10, int i11, ArrayList arrayList) {
        int iM1688d = m1688d(i10, arrayList);
        if (iM1688d < 0) {
            iM1688d = -(iM1688d + 1);
        }
        while (iM1688d < arrayList.size() && ((C5341v) arrayList.get(iM1688d)).f33622b < i11) {
            arrayList.remove(iM1688d);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1686b(C0479d c0479d, ArrayList arrayList, int i10) {
        if (c0479d.m1764h(i10)) {
            arrayList.add(c0479d.m1765i(i10));
            return;
        }
        int iM1763g = i10 + 1;
        int iM1763g2 = c0479d.m1763g(i10) + i10;
        while (iM1763g < iM1763g2) {
            m1686b(c0479d, arrayList, iM1763g);
            iM1763g += c0479d.m1763g(iM1763g);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1687c(String str) {
        C5207g.m11111f(str, "message");
        throw new ComposeRuntimeError(C0141b.m611g("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: renamed from: d */
    public static final int m1688d(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iM11113h = C5207g.m11113h(((C5341v) list.get(i12)).f33622b, i10);
            if (iM11113h < 0) {
                i11 = i12 + 1;
            } else {
                if (iM11113h <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1689e(C0480e c0480e, InterfaceC5336s0 interfaceC5336s0) {
        C5332q0 c5332q0;
        C0477b c0477b;
        C5207g.m11111f(c0480e, "<this>");
        C5207g.m11111f(interfaceC5336s0, "rememberManager");
        int iM1794g = c0480e.m1794g(c0480e.f3167b, c0480e.m1801n(c0480e.f3183r));
        int[] iArr = c0480e.f3167b;
        int i10 = c0480e.f3183r;
        C5346x0 c5346x0 = new C5346x0(iM1794g, c0480e.m1794g(iArr, c0480e.m1801n(c0480e.m1802o(i10) + i10)), c0480e);
        while (c5346x0.hasNext()) {
            Object next = c5346x0.next();
            if (next instanceof InterfaceC5302d) {
                interfaceC5336s0.mo1747a((InterfaceC5302d) next);
            }
            if (next instanceof InterfaceC5338t0) {
                interfaceC5336s0.mo1750d((InterfaceC5338t0) next);
            }
            if ((next instanceof C5332q0) && (c0477b = (c5332q0 = (C5332q0) next).f33603b) != null) {
                c0477b.f3124I = true;
                c5332q0.f33603b = null;
                c5332q0.f33607f = null;
                c5332q0.f33608g = null;
            }
        }
        c0480e.m1776C();
    }

    /* JADX INFO: renamed from: f */
    public static final void m1690f(boolean z10) {
        if (z10) {
            return;
        }
        m1687c("Check failed".toString());
        throw null;
    }
}
