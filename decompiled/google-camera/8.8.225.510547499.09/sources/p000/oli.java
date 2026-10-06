package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oli extends ola {

    /* JADX INFO: renamed from: a */
    private final olh f46255a;

    public oli(olh olhVar) {
        this.f46255a = olhVar;
    }

    @Override // p000.okr
    /* JADX INFO: renamed from: a */
    public final int mo18596a() {
        return this.f46255a.f46247e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // p000.ola
    /* JADX INFO: renamed from: b */
    public final boolean mo18607b(Map.Entry entry) {
        return this.f46255a.m18631i(entry);
    }

    @Override // p000.ola
    /* JADX INFO: renamed from: c */
    public final boolean mo18608c(Map.Entry entry) {
        entry.getClass();
        olh olhVar = this.f46255a;
        olhVar.m18628f();
        int iM18624b = olhVar.m18624b(entry.getKey());
        if (iM18624b < 0) {
            return false;
        }
        Object[] objArr = olhVar.f46244b;
        objArr.getClass();
        if (!ooc.m18737c(objArr[iM18624b], entry.getValue())) {
            return false;
        }
        olhVar.m18629g(iM18624b);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46255a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f46255a.m18630h(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f46255a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f46255a.m18627e();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f46255a.m18628f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f46255a.m18628f();
        return super.retainAll(collection);
    }
}
