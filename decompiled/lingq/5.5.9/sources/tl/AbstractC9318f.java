package tl;

import dm.C5207g;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractCollection;

/* JADX INFO: renamed from: tl.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9318f<E> extends AbstractCollection<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C5207g.m11111f(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
