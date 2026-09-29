package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ic */
/* JADX INFO: loaded from: classes.dex */
public final class C2707ic extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final boolean f14257c;

    /* JADX INFO: renamed from: d */
    public final boolean f14258d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2721jc f14259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2707ic(C2721jc c2721jc, boolean z10, boolean z11) {
        super("log");
        this.f14259e = c2721jc;
        this.f14257c = z10;
        this.f14258d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[LOOP:0: B:24:0x0086->B:26:0x0090, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        int i10;
        int i11;
        String strMo7784f;
        ArrayList arrayList;
        C2601b4.m7693i(1, "log", list);
        int size = list.size();
        C2855u c2855u = InterfaceC2790p.f14375r;
        C2721jc c2721jc = this.f14259e;
        if (size == 1) {
            c2721jc.f14276c.m17492w(3, c2684h3.m7863b((InterfaceC2790p) list.get(0)).mo7784f(), Collections.emptyList(), this.f14257c, this.f14258d);
            return c2855u;
        }
        int iM7686b = C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) list.get(0)).mo7783e().doubleValue());
        if (iM7686b != 2) {
            i10 = 3;
            if (iM7686b == 3) {
                i11 = 1;
            } else if (iM7686b == 5) {
                i11 = 5;
            } else if (iM7686b == 6) {
                i11 = 2;
            }
            strMo7784f = c2684h3.m7863b((InterfaceC2790p) list.get(1)).mo7784f();
            if (list.size() == 2) {
                c2721jc.f14276c.m17492w(i11, strMo7784f, Collections.emptyList(), this.f14257c, this.f14258d);
                return c2855u;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(c2684h3.m7863b((InterfaceC2790p) list.get(i12)).mo7784f());
            }
            c2721jc.f14276c.m17492w(i11, strMo7784f, arrayList, this.f14257c, this.f14258d);
            return c2855u;
        }
        i10 = 4;
        i11 = i10;
        strMo7784f = c2684h3.m7863b((InterfaceC2790p) list.get(1)).mo7784f();
        if (list.size() == 2) {
            c2721jc.f14276c.m17492w(i11, strMo7784f, Collections.emptyList(), this.f14257c, this.f14258d);
            return c2855u;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(c2684h3.m7863b((InterfaceC2790p) list.get(i12)).mo7784f());
        }
        c2721jc.f14276c.m17492w(i11, strMo7784f, arrayList, this.f14257c, this.f14258d);
        return c2855u;
    }
}
