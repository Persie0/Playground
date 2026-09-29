package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.mc */
/* JADX INFO: loaded from: classes.dex */
public final class C2763mc {

    /* JADX INFO: renamed from: a */
    public final TreeMap f14319a = new TreeMap();

    /* JADX INFO: renamed from: b */
    public final TreeMap f14320b = new TreeMap();

    /* JADX INFO: renamed from: a */
    public final void m8071a(C2684h3 c2684h3, C2610c c2610c) {
        C2757m6 c2757m6 = new C2757m6(c2610c);
        TreeMap treeMap = this.f14319a;
        Iterator it = treeMap.keySet().iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Integer num = (Integer) it.next();
                C2596b c2596bClone = c2610c.f14075b.clone();
                InterfaceC2790p interfaceC2790pMo7646b = ((C2777o) treeMap.get(num)).mo7646b(c2684h3, Collections.singletonList(c2757m6));
                int iM7686b = interfaceC2790pMo7646b instanceof C2694i ? C2601b4.m7686b(interfaceC2790pMo7646b.mo7783e().doubleValue()) : -1;
                if (iM7686b == 2 || iM7686b == -1) {
                    c2610c.f14075b = c2596bClone;
                }
            }
        }
        TreeMap treeMap2 = this.f14320b;
        Iterator it2 = treeMap2.keySet().iterator();
        while (true) {
            while (it2.hasNext()) {
                InterfaceC2790p interfaceC2790pMo7646b2 = ((C2777o) treeMap2.get((Integer) it2.next())).mo7646b(c2684h3, Collections.singletonList(c2757m6));
                if (interfaceC2790pMo7646b2 instanceof C2694i) {
                    C2601b4.m7686b(interfaceC2790pMo7646b2.mo7783e().doubleValue());
                }
            }
            return;
        }
    }
}
