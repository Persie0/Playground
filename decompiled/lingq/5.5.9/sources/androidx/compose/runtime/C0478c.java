package androidx.compose.runtime;

import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C6740a;
import p081e0.C5335s;
import p081e0.C5343w;
import p081e0.C5345x;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: androidx.compose.runtime.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0478c {

    /* JADX INFO: renamed from: a */
    public final List<C5345x> f3148a;

    /* JADX INFO: renamed from: b */
    public final int f3149b;

    /* JADX INFO: renamed from: c */
    public int f3150c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3151d;

    /* JADX INFO: renamed from: e */
    public final HashMap<Integer, C5335s> f3152e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9070c f3153f;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0478c(int i10, ArrayList arrayList) {
        this.f3148a = arrayList;
        this.f3149b = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.f3151d = new ArrayList();
        HashMap<Integer, C5335s> map = new HashMap<>();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C5345x c5345x = this.f3148a.get(i12);
            Integer numValueOf = Integer.valueOf(c5345x.f33639c);
            int i13 = c5345x.f33640d;
            map.put(numValueOf, new C5335s(i12, i11, i13));
            i11 += i13;
        }
        this.f3152e = map;
        this.f3153f = C6740a.m13372a(new InterfaceC2041a<HashMap<Object, LinkedHashSet<C5345x>>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final HashMap<Object, LinkedHashSet<C5345x>> mo807E() {
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                HashMap<Object, LinkedHashSet<C5345x>> map2 = new HashMap<>();
                C0478c c0478c = this.f3046b;
                int size2 = c0478c.f3148a.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    C5345x c5345x2 = c0478c.f3148a.get(i14);
                    Object obj = c5345x2.f33638b;
                    int i15 = c5345x2.f33637a;
                    Object c5343w = obj != null ? new C5343w(Integer.valueOf(i15), c5345x2.f33638b) : Integer.valueOf(i15);
                    LinkedHashSet<C5345x> linkedHashSet = map2.get(c5343w);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        map2.put(c5343w, linkedHashSet);
                    }
                    linkedHashSet.add(c5345x2);
                }
                return map2;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final int m1755a(C5345x c5345x) {
        C5207g.m11111f(c5345x, "keyInfo");
        C5335s c5335s = this.f3152e.get(Integer.valueOf(c5345x.f33639c));
        if (c5335s != null) {
            return c5335s.f33612b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1756b(int i10, int i11) {
        int i12;
        HashMap<Integer, C5335s> map = this.f3152e;
        C5335s c5335s = map.get(Integer.valueOf(i10));
        if (c5335s == null) {
            return false;
        }
        int i13 = c5335s.f33612b;
        int i14 = i11 - c5335s.f33613c;
        c5335s.f33613c = i11;
        if (i14 != 0) {
            Collection<C5335s> collectionValues = map.values();
            C5207g.m11110e(collectionValues, "groupInfos.values");
            for (C5335s c5335s2 : collectionValues) {
                if (c5335s2.f33612b >= i13 && !C5207g.m11106a(c5335s2, c5335s) && (i12 = c5335s2.f33612b + i14) >= 0) {
                    c5335s2.f33612b = i12;
                }
            }
        }
        return true;
    }
}
