package p230l0;

import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import dm.C5207g;
import kotlin.jvm.internal.Lambda;
import p081e0.C5296b;
import p081e0.C5332q0;
import p081e0.InterfaceC5330p0;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7204a {
    /* JADX INFO: renamed from: a */
    public static final int m14521a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final ComposableLambdaImpl m14522b(InterfaceC0476a interfaceC0476a, int i10, Lambda lambda) {
        ComposableLambdaImpl composableLambdaImpl;
        C5207g.m11111f(interfaceC0476a, "composer");
        interfaceC0476a.mo1622c(i10);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (objMo1624d == InterfaceC0476a.a.f3122a) {
            composableLambdaImpl = new ComposableLambdaImpl(i10, true);
            interfaceC0476a.mo1655t(composableLambdaImpl);
        } else {
            C5207g.m11109d(objMo1624d, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objMo1624d;
        }
        composableLambdaImpl.m1857f(lambda);
        interfaceC0476a.mo1661w();
        return composableLambdaImpl;
    }

    /* JADX INFO: renamed from: c */
    public static final ComposableLambdaImpl m14523c(int i10, Lambda lambda, boolean z10) {
        C5207g.m11111f(lambda, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i10, z10);
        composableLambdaImpl.m1857f(lambda);
        return composableLambdaImpl;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX INFO: renamed from: d */
    public static final boolean m14524d(InterfaceC5330p0 interfaceC5330p0, InterfaceC5330p0 interfaceC5330p1) {
        boolean z10;
        boolean z11 = true;
        if (interfaceC5330p0 != null) {
            if ((interfaceC5330p0 instanceof C5332q0) && (interfaceC5330p1 instanceof C5332q0)) {
                C5332q0 c5332q0 = (C5332q0) interfaceC5330p0;
                if (c5332q0.f33603b == null) {
                    z10 = false;
                } else {
                    C5296b c5296b = c5332q0.f33604c;
                    if (c5296b != null ? c5296b.m11434a() : false) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10 && !C5207g.m11106a(interfaceC5330p0, interfaceC5330p1) && !C5207g.m11106a(c5332q0.f33604c, ((C5332q0) interfaceC5330p1).f33604c)) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        return z11;
    }
}
