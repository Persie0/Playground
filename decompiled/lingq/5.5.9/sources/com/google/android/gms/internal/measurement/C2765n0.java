package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2765n0 {

    /* JADX INFO: renamed from: a */
    public final C2725k2 f14321a;

    /* JADX INFO: renamed from: b */
    public C2684h3 f14322b;

    /* JADX INFO: renamed from: c */
    public final C2610c f14323c;

    /* JADX INFO: renamed from: d */
    public final C2763mc f14324d;

    public C2765n0() {
        C2725k2 c2725k2 = new C2725k2();
        this.f14321a = c2725k2;
        this.f14322b = c2725k2.f14285b.m7862a();
        this.f14323c = new C2610c();
        this.f14324d = new C2763mc();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2632d7(this.f14041a.f14324d);
            }
        };
        C2700i5 c2700i5 = c2725k2.f14287d;
        c2700i5.f14251a.put("internal.registerCallback", callable);
        c2700i5.f14251a.put("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2848t5(this.f14519a.f14323c);
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final void m8072a(C2898x3 c2898x3) throws zzd {
        AbstractC2708j abstractC2708j;
        C2725k2 c2725k2 = this.f14321a;
        try {
            this.f14322b = c2725k2.f14285b.m7862a();
            if (c2725k2.m7900a(this.f14322b, (C2924z3[]) c2898x3.m8410v().toArray(new C2924z3[0])) instanceof C2680h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2885w3 c2885w3 : c2898x3.m8409t().m8305w()) {
                InterfaceC2836s6 interfaceC2836s6M8329v = c2885w3.m8329v();
                String strM8328u = c2885w3.m8328u();
                Iterator it = interfaceC2836s6M8329v.iterator();
                while (it.hasNext()) {
                    InterfaceC2790p interfaceC2790pM7900a = c2725k2.m7900a(this.f14322b, (C2924z3) it.next());
                    if (!(interfaceC2790pM7900a instanceof C2750m)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C2684h3 c2684h3 = this.f14322b;
                    if (c2684h3.m7868g(strM8328u)) {
                        InterfaceC2790p interfaceC2790pM7865d = c2684h3.m7865d(strM8328u);
                        if (!(interfaceC2790pM7865d instanceof AbstractC2708j)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM8328u)));
                        }
                        abstractC2708j = (AbstractC2708j) interfaceC2790pM7865d;
                    } else {
                        abstractC2708j = null;
                    }
                    if (abstractC2708j == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM8328u)));
                    }
                    abstractC2708j.mo7646b(this.f14322b, Collections.singletonList(interfaceC2790pM7900a));
                }
            }
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8073b(C2596b c2596b) throws zzd {
        C2610c c2610c = this.f14323c;
        try {
            c2610c.f14074a = c2596b;
            c2610c.f14075b = c2596b.clone();
            c2610c.f14076c.clear();
            this.f14321a.f14286c.m7867f("runtime.counter", new C2694i(Double.valueOf(0.0d)));
            this.f14324d.m8071a(this.f14322b.m7862a(), c2610c);
            return (c2610c.f14075b.equals(c2610c.f14074a) ^ true) || (c2610c.f14076c.isEmpty() ^ true);
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }
}
