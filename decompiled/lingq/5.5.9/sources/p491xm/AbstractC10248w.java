package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5843w;
import java.lang.reflect.Type;
import java.util.Iterator;
import mn.C7645b;
import mn.C7646c;

/* JADX INFO: renamed from: xm.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10248w implements InterfaceC5843w {
    /* JADX INFO: renamed from: Y */
    public abstract Type mo19213Y();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC10248w) && C5207g.m11106a(mo19213Y(), ((AbstractC10248w) obj).mo19213Y());
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: h */
    public InterfaceC5820a mo12239h(C7646c c7646c) {
        Object obj;
        Object next;
        C7645b c7645bMo12233j;
        C5207g.m11111f(c7646c, "fqName");
        Iterator<T> it = mo12240w().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                c7645bMo12233j = ((InterfaceC5820a) next).mo12233j();
            }
            return (InterfaceC5820a) obj;
        } while (!C5207g.m11106a(c7645bMo12233j != null ? c7645bMo12233j.m15204b() : null, c7646c));
        obj = next;
        return (InterfaceC5820a) obj;
    }

    public final int hashCode() {
        return mo19213Y().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo19213Y();
    }
}
