package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface myy extends Collection {
    @Override // java.util.Collection, p000.myy
    boolean add(Object obj);

    /* JADX INFO: renamed from: co */
    int mo16911co(Object obj);

    @Override // java.util.Collection, p000.myy
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    /* JADX INFO: renamed from: d */
    int mo16918d(Object obj, int i);

    @Override // p000.myy
    boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    Set mo16920f();

    /* JADX INFO: renamed from: g */
    Set mo16921g();

    /* JADX INFO: renamed from: h */
    void mo16922h(Object obj, int i);

    @Override // p000.myy
    int hashCode();

    /* JADX INFO: renamed from: i */
    boolean mo16923i(Object obj, int i);

    @Override // java.util.Collection, java.lang.Iterable, p000.myy
    Iterator iterator();

    @Override // java.util.Collection, p000.myy
    boolean remove(Object obj);

    @Override // java.util.Collection, p000.myy
    int size();
}
