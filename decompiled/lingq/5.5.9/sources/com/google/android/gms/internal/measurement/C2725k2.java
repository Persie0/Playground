package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
import p081e0.C5298b1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2725k2 {

    /* JADX INFO: renamed from: a */
    public final C5298b1 f14284a;

    /* JADX INFO: renamed from: b */
    public final C2684h3 f14285b;

    /* JADX INFO: renamed from: c */
    public final C2684h3 f14286c;

    /* JADX INFO: renamed from: d */
    public final C2700i5 f14287d;

    public C2725k2() {
        C5298b1 c5298b1 = new C5298b1(8);
        this.f14284a = c5298b1;
        C2684h3 c2684h3 = new C2684h3(null, c5298b1);
        this.f14286c = c2684h3;
        this.f14285b = c2684h3.m7862a();
        C2700i5 c2700i5 = new C2700i5();
        this.f14287d = c2700i5;
        c2684h3.m7867f("require", new C2735kc(c2700i5));
        c2700i5.f14251a.put("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.s1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2826r9();
            }
        });
        c2684h3.m7867f("runtime.counter", new C2694i(Double.valueOf(0.0d)));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p m7900a(C2684h3 c2684h3, C2924z3... c2924z3Arr) {
        InterfaceC2790p interfaceC2790pM8306a = InterfaceC2790p.f14375r;
        for (C2924z3 c2924z3 : c2924z3Arr) {
            interfaceC2790pM8306a = C2873v4.m8306a(c2924z3);
            C2601b4.m7687c(this.f14286c);
            if ((interfaceC2790pM8306a instanceof C2803q) || (interfaceC2790pM8306a instanceof C2777o)) {
                interfaceC2790pM8306a = this.f14284a.m11440i(c2684h3, interfaceC2790pM8306a);
            }
        }
        return interfaceC2790pM8306a;
    }
}
