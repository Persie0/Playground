package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C0483a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p100em.InterfaceC5431c;
import p126g0.InterfaceC5633c;
import p267n0.AbstractC7691v;
import p267n0.C7681l;
import p267n0.C7684o;
import p267n0.C7692w;
import p267n0.InterfaceC7690u;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateList<T> implements List<T>, InterfaceC7690u, InterfaceC5431c {

    /* JADX INFO: renamed from: a */
    public C0491a f3277a = new C0491a(C0483a.f3197b);

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$a */
    public static final class C0491a<T> extends AbstractC7691v {

        /* JADX INFO: renamed from: c */
        public InterfaceC5633c<? extends T> f3278c;

        /* JADX INFO: renamed from: d */
        public int f3279d;

        public C0491a(InterfaceC5633c<? extends T> interfaceC5633c) {
            C5207g.m11111f(interfaceC5633c, "list");
            this.f3278c = interfaceC5633c;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: a */
        public final void mo1700a(AbstractC7691v abstractC7691v) {
            C5207g.m11111f(abstractC7691v, "value");
            synchronized (C7681l.f42169a) {
                try {
                    this.f3278c = ((C0491a) abstractC7691v).f3278c;
                    this.f3279d = ((C0491a) abstractC7691v).f3279d;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: b */
        public final AbstractC7691v mo1701b() {
            return new C0491a(this.f3278c);
        }

        /* JADX INFO: renamed from: c */
        public final void m1907c(InterfaceC5633c<? extends T> interfaceC5633c) {
            C5207g.m11111f(interfaceC5633c, "<set-?>");
            this.f3278c = interfaceC5633c;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1904a() {
        C0491a c0491a = this.f3277a;
        C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C0491a) SnapshotKt.m1889h(c0491a)).f3279d;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0069 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void add(int i10, T t10) {
        int i11;
        InterfaceC5633c<? extends T> interfaceC5633c;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                C0491a c0491a = this.f3277a;
                C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                i11 = c0491a2.f3279d;
                interfaceC5633c = c0491a2.f3278c;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633cAdd = interfaceC5633c.add(i10, t10);
            if (C5207g.m11106a(interfaceC5633cAdd, interfaceC5633c)) {
                return;
            }
            synchronized (obj) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i11) {
                            c0491a4.m1907c(interfaceC5633cAdd);
                            z10 = true;
                            c0491a4.f3279d++;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0068 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean add(T t10) {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        boolean z10;
        AbstractC0497b abstractC0497bM1891j;
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                try {
                    C0491a c0491a = this.f3277a;
                    C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                    i10 = c0491a2.f3279d;
                    interfaceC5633c = c0491a2.f3278c;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633cAdd = interfaceC5633c.add(t10);
            z10 = false;
            if (C5207g.m11106a(interfaceC5633cAdd, interfaceC5633c)) {
                return false;
            }
            synchronized (obj) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i10) {
                            c0491a4.m1907c(interfaceC5633cAdd);
                            c0491a4.f3279d++;
                            z10 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i10, final Collection<? extends T> collection) {
        C5207g.m11111f(collection, "elements");
        return m1906g(new InterfaceC2052l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Object obj) {
                List list = (List) obj;
                C5207g.m11111f(list, "it");
                return Boolean.valueOf(list.addAll(i10, collection));
            }
        });
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0074 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean addAll(Collection<? extends T> collection) {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        boolean z10;
        AbstractC0497b abstractC0497bM1891j;
        C5207g.m11111f(collection, "elements");
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                C0491a c0491a = this.f3277a;
                C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                i10 = c0491a2.f3279d;
                interfaceC5633c = c0491a2.f3278c;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633cAddAll = interfaceC5633c.addAll((Collection<? extends Object>) collection);
            z10 = false;
            if (C5207g.m11106a(interfaceC5633cAddAll, interfaceC5633c)) {
                return false;
            }
            synchronized (obj) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i10) {
                            c0491a4.m1907c(interfaceC5633cAddAll);
                            c0491a4.f3279d++;
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0497b abstractC0497bM1891j;
        synchronized (C7681l.f42169a) {
            try {
                C0491a c0491a = this.f3277a;
                C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a2 = (C0491a) SnapshotKt.m1903v(c0491a, this, abstractC0497bM1891j);
                        c0491a2.m1907c(C0483a.f3197b);
                        c0491a2.f3279d++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return m1905f().f3278c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        return m1905f().f3278c.containsAll(collection);
    }

    /* JADX INFO: renamed from: f */
    public final C0491a<T> m1905f() {
        C0491a c0491a = this.f3277a;
        C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C0491a) SnapshotKt.m1900s(c0491a, this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m1906g(InterfaceC2052l<? super List<T>, Boolean> interfaceC2052l) {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        Boolean boolMo528n;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                try {
                    C0491a c0491a = this.f3277a;
                    C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                    i10 = c0491a2.f3279d;
                    interfaceC5633c = c0491a2.f3278c;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C5207g.m11108c(interfaceC5633c);
            PersistentVectorBuilder persistentVectorBuilderMo1848j = interfaceC5633c.mo1848j();
            boolMo528n = interfaceC2052l.mo528n(persistentVectorBuilderMo1848j);
            InterfaceC5633c<? extends T> interfaceC5633cM1836q = persistentVectorBuilderMo1848j.m1836q();
            if (C5207g.m11106a(interfaceC5633cM1836q, interfaceC5633c)) {
                break;
            }
            synchronized (obj) {
                try {
                    C0491a c0491a3 = this.f3277a;
                    C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    synchronized (SnapshotKt.f3262c) {
                        try {
                            abstractC0497bM1891j = SnapshotKt.m1891j();
                            C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
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
                    SnapshotKt.m1895n(abstractC0497bM1891j, this);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } while (!z10);
        return boolMo528n.booleanValue();
    }

    @Override // java.util.List
    public final T get(int i10) {
        return m1905f().f3278c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return m1905f().f3278c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return m1905f().f3278c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: l */
    public final AbstractC7691v mo1698l() {
        return this.f3277a;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return m1905f().f3278c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C7684o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new C7684o(this, i10);
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: q */
    public final void mo1699q(AbstractC7691v abstractC7691v) {
        abstractC7691v.f42189b = this.f3277a;
        this.f3277a = (C0491a) abstractC7691v;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final T remove(int i10) {
        int i11;
        InterfaceC5633c<? extends T> interfaceC5633c;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        T t10 = get(i10);
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                C0491a c0491a = this.f3277a;
                C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                i11 = c0491a2.f3279d;
                interfaceC5633c = c0491a2.f3278c;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633cMo1845M = interfaceC5633c.mo1845M(i10);
            if (C5207g.m11106a(interfaceC5633cMo1845M, interfaceC5633c)) {
                break;
            }
            synchronized (obj) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i11) {
                            c0491a4.m1907c(interfaceC5633cMo1845M);
                            z10 = true;
                            c0491a4.f3279d++;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
        return t10;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        boolean z10;
        AbstractC0497b abstractC0497bM1891j;
        do {
            Object obj2 = C7681l.f42169a;
            synchronized (obj2) {
                try {
                    C0491a c0491a = this.f3277a;
                    C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                    i10 = c0491a2.f3279d;
                    interfaceC5633c = c0491a2.f3278c;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633cRemove = interfaceC5633c.remove(obj);
            z10 = false;
            if (C5207g.m11106a(interfaceC5633cRemove, interfaceC5633c)) {
                return false;
            }
            synchronized (obj2) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i10) {
                            c0491a4.m1907c(interfaceC5633cRemove);
                            c0491a4.f3279d++;
                            z10 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
        return true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0072 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        InterfaceC5633c<? extends T> interfaceC5633c;
        boolean z10;
        AbstractC0497b abstractC0497bM1891j;
        C5207g.m11111f(collection, "elements");
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                C0491a c0491a = this.f3277a;
                C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                i10 = c0491a2.f3279d;
                interfaceC5633c = c0491a2.f3278c;
                C9072e c9072e = C9072e.f47360a;
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633cRemoveAll = interfaceC5633c.removeAll((Collection<? extends Object>) collection);
            z10 = false;
            if (C5207g.m11106a(interfaceC5633cRemoveAll, interfaceC5633c)) {
                return false;
            }
            synchronized (obj) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        abstractC0497bM1891j = SnapshotKt.m1891j();
                        C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                        if (c0491a4.f3279d == i10) {
                            c0491a4.m1907c(interfaceC5633cRemoveAll);
                            c0491a4.f3279d++;
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        return m1906g(new InterfaceC2052l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Object obj) {
                List list = (List) obj;
                C5207g.m11111f(list, "it");
                return Boolean.valueOf(list.retainAll(collection));
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final T set(int i10, T t10) {
        int i11;
        InterfaceC5633c<? extends T> interfaceC5633c;
        AbstractC0497b abstractC0497bM1891j;
        boolean z10;
        T t11 = get(i10);
        do {
            Object obj = C7681l.f42169a;
            synchronized (obj) {
                try {
                    C0491a c0491a = this.f3277a;
                    C5207g.m11109d(c0491a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C0491a c0491a2 = (C0491a) SnapshotKt.m1889h(c0491a);
                    i11 = c0491a2.f3279d;
                    interfaceC5633c = c0491a2.f3278c;
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C5207g.m11108c(interfaceC5633c);
            InterfaceC5633c<? extends T> interfaceC5633c2 = interfaceC5633c.set(i10, t10);
            if (C5207g.m11106a(interfaceC5633c2, interfaceC5633c)) {
                break;
            }
            synchronized (obj) {
                C0491a c0491a3 = this.f3277a;
                C5207g.m11109d(c0491a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f3262c) {
                    abstractC0497bM1891j = SnapshotKt.m1891j();
                    C0491a c0491a4 = (C0491a) SnapshotKt.m1903v(c0491a3, this, abstractC0497bM1891j);
                    if (c0491a4.f3279d == i11) {
                        c0491a4.m1907c(interfaceC5633c2);
                        z10 = true;
                        c0491a4.f3279d++;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.m1895n(abstractC0497bM1891j, this);
            }
        } while (!z10);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return m1905f().f3278c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        if ((i10 >= 0 && i10 <= i11) && i11 <= size()) {
            return new C7692w(this, i10, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
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
