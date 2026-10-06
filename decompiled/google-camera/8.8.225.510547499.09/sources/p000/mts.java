package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mts extends AbstractCollection implements myy {

    /* JADX INFO: renamed from: a */
    public transient Set f41606a;

    /* JADX INFO: renamed from: b */
    private transient Set f41607b;

    @Override // java.util.AbstractCollection, java.util.Collection, p000.myy
    public final boolean add(Object obj) {
        mo16922h(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof myy)) {
            if (collection.isEmpty()) {
                return false;
            }
            return mkv.m16512T(this, collection.iterator());
        }
        myy myyVar = (myy) collection;
        if (myyVar instanceof mtn) {
            if (((mtn) myyVar).isEmpty()) {
                return false;
            }
            throw null;
        }
        if (myyVar.isEmpty()) {
            return false;
        }
        for (myx myxVar : myyVar.mo16921g()) {
            mo16922h(myxVar.mo17162b(), myxVar.mo17161a());
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo16909b();

    /* JADX INFO: renamed from: c */
    public abstract Iterator mo16910c();

    @Override // java.util.AbstractCollection, java.util.Collection, p000.myy
    public final boolean contains(Object obj) {
        return mo16911co(obj) > 0;
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: d */
    public int mo16918d(Object obj, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public Set mo16919e() {
        throw null;
    }

    @Override // java.util.Collection, p000.myy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myy) {
            myy myyVar = (myy) obj;
            if (size() != myyVar.size() || mo16921g().size() != myyVar.mo16921g().size()) {
                return false;
            }
            for (myx myxVar : myyVar.mo16921g()) {
                if (mo16911co(myxVar.mo17162b()) != myxVar.mo17161a()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: f */
    public Set mo16920f() {
        throw null;
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: g */
    public final Set mo16921g() {
        Set set = this.f41607b;
        if (set != null) {
            return set;
        }
        mtr mtrVar = new mtr(this);
        this.f41607b = mtrVar;
        return mtrVar;
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: h */
    public void mo16922h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection, p000.myy
    public final int hashCode() {
        return mo16921g().hashCode();
    }

    @Override // p000.myy
    /* JADX INFO: renamed from: i */
    public boolean mo16923i(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return mo16921g().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.myy
    public final boolean remove(Object obj) {
        return mo16918d(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof myy) {
            collection = ((myy) collection).mo16920f();
        }
        return mo16920f().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof myy) {
            collection = ((myy) collection).mo16920f();
        }
        return mo16920f().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return mo16921g().toString();
    }
}
