package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvl extends mvq implements Collection {
    protected mvl() {
    }

    @Override // p000.mvq
    /* JADX INFO: renamed from: a */
    protected /* bridge */ /* synthetic */ Object mo3816a() {
        throw null;
    }

    public boolean add(Object obj) {
        return mo3817b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return mo3817b().addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    protected abstract Collection mo3817b();

    public void clear() {
        mo3817b().clear();
    }

    public boolean contains(Object obj) {
        return mo3817b().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return mo3817b().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return mo3817b().isEmpty();
    }

    public Iterator iterator() {
        return mo3817b().iterator();
    }

    public boolean remove(Object obj) {
        return mo3817b().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return mo3817b().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return mo3817b().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return mo3817b().size();
    }

    /* JADX INFO: renamed from: t */
    protected final boolean m17029t(Collection collection) {
        Iterator it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public Object[] toArray() {
        return mo3817b().toArray();
    }

    /* JADX INFO: renamed from: u */
    protected final Object[] m17030u() {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object[] objArr) {
        return mo3817b().toArray(objArr);
    }
}
