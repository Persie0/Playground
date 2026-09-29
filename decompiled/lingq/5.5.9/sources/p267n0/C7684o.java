package p267n0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: n0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7684o<T> implements ListIterator<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateList<T> f42177a;

    /* JADX INFO: renamed from: b */
    public int f42178b;

    /* JADX INFO: renamed from: c */
    public int f42179c;

    public C7684o(SnapshotStateList<T> snapshotStateList, int i10) {
        C5207g.m11111f(snapshotStateList, "list");
        this.f42177a = snapshotStateList;
        this.f42178b = i10 - 1;
        this.f42179c = snapshotStateList.m1904a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15281a() {
        if (this.f42177a.m1904a() != this.f42179c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t10) {
        m15281a();
        int i10 = this.f42178b + 1;
        SnapshotStateList<T> snapshotStateList = this.f42177a;
        snapshotStateList.add(i10, t10);
        this.f42178b++;
        this.f42179c = snapshotStateList.m1904a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f42178b < this.f42177a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f42178b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        m15281a();
        int i10 = this.f42178b + 1;
        SnapshotStateList<T> snapshotStateList = this.f42177a;
        C7681l.m15277a(i10, snapshotStateList.size());
        T t10 = snapshotStateList.get(i10);
        this.f42178b = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42178b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        m15281a();
        int i10 = this.f42178b;
        SnapshotStateList<T> snapshotStateList = this.f42177a;
        C7681l.m15277a(i10, snapshotStateList.size());
        T t10 = snapshotStateList.get(this.f42178b);
        this.f42178b--;
        return t10;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42178b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m15281a();
        int i10 = this.f42178b;
        SnapshotStateList<T> snapshotStateList = this.f42177a;
        snapshotStateList.remove(i10);
        this.f42178b--;
        this.f42179c = snapshotStateList.m1904a();
    }

    @Override // java.util.ListIterator
    public final void set(T t10) {
        m15281a();
        int i10 = this.f42178b;
        SnapshotStateList<T> snapshotStateList = this.f42177a;
        snapshotStateList.set(i10, t10);
        this.f42179c = snapshotStateList.m1904a();
    }
}
