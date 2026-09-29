package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2777o extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final ArrayList f14353c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f14354d;

    /* JADX INFO: renamed from: e */
    public final C2684h3 f14355e;

    public C2777o(C2777o c2777o) {
        super(c2777o.f14260a);
        ArrayList arrayList = new ArrayList(c2777o.f14353c.size());
        this.f14353c = arrayList;
        arrayList.addAll(c2777o.f14353c);
        ArrayList arrayList2 = new ArrayList(c2777o.f14354d.size());
        this.f14354d = arrayList2;
        arrayList2.addAll(c2777o.f14354d);
        this.f14355e = c2777o.f14355e;
    }

    public C2777o(String str, ArrayList arrayList, List list, C2684h3 c2684h3) {
        super(str);
        this.f14353c = new ArrayList();
        this.f14355e = c2684h3;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f14353c.add(((InterfaceC2790p) it.next()).mo7784f());
            }
        }
        this.f14354d = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2708j, com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return new C2777o(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        C2855u c2855u;
        C2684h3 c2684h3M7862a = this.f14355e.m7862a();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14353c;
            int size = arrayList.size();
            c2855u = InterfaceC2790p.f14375r;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                c2684h3M7862a.m7866e((String) arrayList.get(i10), c2684h3.m7863b((InterfaceC2790p) list.get(i10)));
            } else {
                c2684h3M7862a.m7866e((String) arrayList.get(i10), c2855u);
            }
            i10++;
        }
        for (InterfaceC2790p interfaceC2790p : this.f14354d) {
            InterfaceC2790p interfaceC2790pM7863b = c2684h3M7862a.m7863b(interfaceC2790p);
            if (interfaceC2790pM7863b instanceof C2803q) {
                interfaceC2790pM7863b = c2684h3M7862a.m7863b(interfaceC2790p);
            }
            if (interfaceC2790pM7863b instanceof C2680h) {
                return ((C2680h) interfaceC2790pM7863b).f14220a;
            }
        }
        return c2855u;
    }
}
