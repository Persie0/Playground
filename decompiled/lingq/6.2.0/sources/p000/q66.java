package p000;

import androidx.collection.C0039b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q66 implements yg4, Set, tg4 {

    /* JADX INFO: renamed from: a */
    public final o66 f57324a;

    /* JADX INFO: renamed from: b */
    public final o66 f57325b;

    public q66(o66 o66Var) {
        this.f57324a = o66Var;
        this.f57325b = o66Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f57325b.m17811d(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        o66 o66Var = this.f57325b;
        int i = o66Var.f1305d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o66Var.m17818k(it.next());
        }
        return i != o66Var.f1305d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f57325b.m17812e();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f57324a.m723a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f57324a.m723a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q66.class != obj.getClass()) {
            return false;
        }
        return this.f57324a.equals(((q66) obj).f57324a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f57324a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f57324a.m724b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0039b(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f57325b.m17819l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        o66 o66Var = this.f57325b;
        int i = o66Var.f1305d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o66Var.m17816i(it.next());
        }
        return i != o66Var.f1305d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        o66 o66Var = this.f57325b;
        Object[] objArr = o66Var.f1303b;
        int i = o66Var.f1305d;
        long[] jArr = o66Var.f1302a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!u91.m22633z0(collection, objArr[i5])) {
                                o66Var.m17820m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != o66Var.f1305d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f57324a.f1305d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ss5.m21701a0(this, objArr);
    }

    public final String toString() {
        return this.f57324a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }
}
