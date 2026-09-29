package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class e09 extends d09 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f34810a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f34810a.iterator();
        it.getClass();
        li7 li7Var = this.f34811b;
        li7Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (li7Var.apply(next)) {
                return next;
            }
        }
        uk9.m22784s();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new e09(((SortedSet) this.f34810a).headSet(obj), this.f34811b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f34810a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f34811b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new e09(((SortedSet) this.f34810a).subSet(obj, obj2), this.f34811b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new e09(((SortedSet) this.f34810a).tailSet(obj), this.f34811b);
    }
}
