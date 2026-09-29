package p118fe;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: fe.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5520l {

    /* JADX INFO: renamed from: fe.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C5511c<?> f34177a;

        /* JADX INFO: renamed from: b */
        public final HashSet f34178b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final HashSet f34179c = new HashSet();

        public a(C5511c<?> c5511c) {
            this.f34177a = c5511c;
        }
    }

    /* JADX INFO: renamed from: fe.l$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C5527s<?> f34180a;

        /* JADX INFO: renamed from: b */
        public final boolean f34181b;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public b() {
            throw null;
        }

        public b(C5527s c5527s, boolean z10) {
            this.f34180a = c5527s;
            this.f34181b = z10;
        }

        public final boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f34180a.equals(this.f34180a) && bVar.f34181b == this.f34181b) {
                    z10 = true;
                }
            }
            return z10;
        }

        public final int hashCode() {
            return ((this.f34180a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f34181b).hashCode();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m11760a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        Iterator<C5521m> it3 = aVar.f34177a.f34152c.iterator();
                        while (true) {
                            while (true) {
                                if (it3.hasNext()) {
                                    C5521m next = it3.next();
                                    if (next.f34184c == 0) {
                                        Set<a> set = (Set) map.get(new b(next.f34182a, next.f34183b == 2));
                                        if (set != null) {
                                            for (a aVar2 : set) {
                                                aVar.f34178b.add(aVar2);
                                                aVar2.f34179c.add(aVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    hashSet.addAll((Set) it4.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it5 = hashSet.iterator();
                while (true) {
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        a aVar3 = (a) it5.next();
                        if (aVar3.f34179c.isEmpty()) {
                            hashSet2.add(aVar3);
                        }
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i10++;
                    for (a aVar5 : aVar4.f34178b) {
                        aVar5.f34179c.remove(aVar4);
                        if (aVar5.f34179c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (a aVar6 : hashSet) {
                    if (!aVar6.f34179c.isEmpty() && !aVar6.f34178b.isEmpty()) {
                        arrayList2.add(aVar6.f34177a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            C5511c c5511c = (C5511c) it.next();
            a aVar7 = new a(c5511c);
            Iterator it6 = c5511c.f34151b.iterator();
            while (it6.hasNext()) {
                C5527s c5527s = (C5527s) it6.next();
                boolean z10 = !(c5511c.f34154e == 0);
                b bVar = new b(c5527s, z10);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set2 = (Set) map.get(bVar);
                if (!set2.isEmpty() && !z10) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c5527s));
                }
                set2.add(aVar7);
            }
        }
    }
}
