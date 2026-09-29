package p000;

import androidx.collection.C0039b;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class rm9 implements Collection, tg4 {

    /* JADX INFO: renamed from: a */
    public final i66 f59554a;

    public rm9() {
        int i = uz6.f64623a;
        this.f59554a = new i66(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f59554a.m13689b(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f59554a.m13690c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f59554a.m722a(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f59554a.m722a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f59554a.f1301g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        i66 i66Var = this.f59554a;
        i66Var.getClass();
        return new C0039b(new j66(i66Var));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f59554a.m13694g(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f59554a.m13694g(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f59554a.m13696i(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f59554a.f1301g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ss5.m21701a0(this, objArr);
    }
}
