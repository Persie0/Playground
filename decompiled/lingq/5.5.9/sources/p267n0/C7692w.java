package p267n0;

import ae.C0062b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import dm.C5207g;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;
import p100em.InterfaceC5429a;
import p100em.InterfaceC5431c;
import p126g0.InterfaceC5633c;
import p338qd.C8573r0;
import sl.C9072e;
import tl.AbstractC9334v;

/* JADX INFO: renamed from: n0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7692w<T> implements List<T>, InterfaceC5431c {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateList<T> f42190a;

    /* JADX INFO: renamed from: b */
    public final int f42191b;

    /* JADX INFO: renamed from: c */
    public int f42192c;

    /* JADX INFO: renamed from: d */
    public int f42193d;

    /* JADX INFO: renamed from: n0.w$a */
    public static final class a implements ListIterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref$IntRef f42194a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7692w<T> f42195b;

        public a(Ref$IntRef ref$IntRef, C7692w<T> c7692w) {
            this.f42194a = ref$IntRef;
            this.f42195b = c7692w;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.ListIterator
        public final void add(Object obj) {
            Object obj2 = C7681l.f42169a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f42194a.f38125a < this.f42195b.f42193d - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f42194a.f38125a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            Ref$IntRef ref$IntRef = this.f42194a;
            int i10 = ref$IntRef.f38125a + 1;
            C7692w<T> c7692w = this.f42195b;
            C7681l.m15277a(i10, c7692w.f42193d);
            ref$IntRef.f38125a = i10;
            return c7692w.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f42194a.f38125a + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Ref$IntRef ref$IntRef = this.f42194a;
            int i10 = ref$IntRef.f38125a;
            C7692w<T> c7692w = this.f42195b;
            C7681l.m15277a(i10, c7692w.f42193d);
            ref$IntRef.f38125a = i10 - 1;
            return c7692w.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f42194a.f38125a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            Object obj = C7681l.f42169a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Object obj2 = C7681l.f42169a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }
    }

    public C7692w(SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        C5207g.m11111f(snapshotStateList, "parentList");
        this.f42190a = snapshotStateList;
        this.f42191b = i10;
        this.f42192c = snapshotStateList.m1904a();
        this.f42193d = i11 - i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m15283a() {
        if (this.f42190a.m1904a() != this.f42192c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public final void add(int i10, T t10) {
        m15283a();
        int i11 = this.f42191b + i10;
        SnapshotStateList<T> snapshotStateList = this.f42190a;
        snapshotStateList.add(i11, t10);
        this.f42193d++;
        this.f42192c = snapshotStateList.m1904a();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t10) {
        m15283a();
        int i10 = this.f42191b + this.f42193d;
        SnapshotStateList<T> snapshotStateList = this.f42190a;
        snapshotStateList.add(i10, t10);
        this.f42193d++;
        this.f42192c = snapshotStateList.m1904a();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        C5207g.m11111f(collection, "elements");
        m15283a();
        int i11 = i10 + this.f42191b;
        SnapshotStateList<T> snapshotStateList = this.f42190a;
        boolean zAddAll = snapshotStateList.addAll(i11, collection);
        if (zAddAll) {
            this.f42193d = collection.size() + this.f42193d;
            this.f42192c = snapshotStateList.m1904a();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        C5207g.m11111f(collection, "elements");
        return addAll(this.f42193d, collection);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0087 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clear() {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        if (this.f42193d > 0) {
            m15283a();
            SnapshotStateList<T> snapshotStateList = this.f42190a;
            int i11 = this.f42191b;
            int i12 = this.f42193d + i11;
            snapshotStateList.getClass();
            do {
                Object obj = C7681l.f42169a;
                synchronized (obj) {
                    try {
                        SnapshotStateList.C0491a c0491a = snapshotStateList.f3277a;
                        C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                        SnapshotStateList.C0491a c0491a2 = (SnapshotStateList.C0491a) SnapshotKt.m1889h(c0491a);
                        i10 = c0491a2.f3279d;
                        interfaceC5633c = c0491a2.f3278c;
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C5207g.m11108c(interfaceC5633c);
                PersistentVectorBuilder persistentVectorBuilderMo1848j = interfaceC5633c.mo1848j();
                persistentVectorBuilderMo1848j.subList(i11, i12).clear();
                InterfaceC5633c<? extends T> interfaceC5633cM1836q = persistentVectorBuilderMo1848j.m1836q();
                if (C5207g.m11106a(interfaceC5633cM1836q, interfaceC5633c)) {
                    break;
                }
                synchronized (obj) {
                    SnapshotStateList.C0491a c0491a3 = snapshotStateList.f3277a;
                    C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    synchronized (SnapshotKt.f3262c) {
                        try {
                            abstractC0497bM1891j = SnapshotKt.m1891j();
                            SnapshotStateList.C0491a c0491a4 = (SnapshotStateList.C0491a) SnapshotKt.m1903v(c0491a3, snapshotStateList, abstractC0497bM1891j);
                            if (c0491a4.f3279d == i10) {
                                c0491a4.m1907c(interfaceC5633cM1836q);
                                z10 = true;
                                c0491a4.f3279d++;
                            } else {
                                z10 = false;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    SnapshotKt.m1895n(abstractC0497bM1891j, snapshotStateList);
                }
            } while (!z10);
            this.f42193d = 0;
            this.f42192c = this.f42190a.m1904a();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i10) {
        m15283a();
        C7681l.m15277a(i10, this.f42193d);
        return this.f42190a.get(this.f42191b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m15283a();
        int i10 = this.f42193d;
        int i11 = this.f42191b;
        Iterator<Integer> it = C0062b.m411w2(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iMo13105a = ((AbstractC9334v) it).mo13105a();
            if (C5207g.m11106a(obj, this.f42190a.get(iMo13105a))) {
                return iMo13105a - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f42193d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m15283a();
        int i10 = this.f42193d;
        int i11 = this.f42191b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (C5207g.m11106a(obj, this.f42190a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        m15283a();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f38125a = i10 - 1;
        return new a(ref$IntRef, this);
    }

    @Override // java.util.List
    public final T remove(int i10) {
        m15283a();
        int i11 = this.f42191b + i10;
        SnapshotStateList<T> snapshotStateList = this.f42190a;
        T tRemove = snapshotStateList.remove(i11);
        this.f42193d--;
        this.f42192c = snapshotStateList.m1904a();
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (!remove(it.next()) && !z10) {
                }
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0093 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        C5207g.m11111f(collection, "elements");
        m15283a();
        SnapshotStateList<T> snapshotStateList = this.f42190a;
        int i11 = this.f42191b;
        int i12 = this.f42193d + i11;
        snapshotStateList.getClass();
        int size = snapshotStateList.size();
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                try {
                    SnapshotStateList.C0491a c0491a = snapshotStateList.f3277a;
                    C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    SnapshotStateList.C0491a c0491a2 = (SnapshotStateList.C0491a) SnapshotKt.m1889h(c0491a);
                    i10 = c0491a2.f3279d;
                    interfaceC5633c = c0491a2.f3278c;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C5207g.m11108c(interfaceC5633c);
            PersistentVectorBuilder persistentVectorBuilderMo1848j = interfaceC5633c.mo1848j();
            persistentVectorBuilderMo1848j.subList(i11, i12).retainAll(collection);
            InterfaceC5633c<? extends T> interfaceC5633cM1836q = persistentVectorBuilderMo1848j.m1836q();
            if (C5207g.m11106a(interfaceC5633cM1836q, interfaceC5633c)) {
                break;
            }
            synchronized (obj) {
                SnapshotStateList.C0491a c0491a3 = snapshotStateList.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        SnapshotStateList.C0491a c0491a4 = (SnapshotStateList.C0491a) SnapshotKt.m1903v(c0491a3, snapshotStateList, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i10) {
                            c0491a4.m1907c(interfaceC5633cM1836q);
                            c0491a4.f3279d++;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, snapshotStateList);
            }
        } while (!z10);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f42192c = this.f42190a.m1904a();
            this.f42193d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i10, T t10) {
        C7681l.m15277a(i10, this.f42193d);
        m15283a();
        int i11 = i10 + this.f42191b;
        SnapshotStateList<T> snapshotStateList = this.f42190a;
        T t11 = snapshotStateList.set(i11, t10);
        this.f42192c = snapshotStateList.m1904a();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f42193d;
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        if (!((i10 >= 0 && i10 <= i11) && i11 <= this.f42193d)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m15283a();
        int i12 = this.f42191b;
        return new C7692w(this.f42190a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C8573r0.m16728h1(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }
}
