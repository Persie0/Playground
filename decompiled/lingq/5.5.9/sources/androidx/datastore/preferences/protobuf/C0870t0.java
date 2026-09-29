package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870t0<E> extends AbstractC0830c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C0870t0<Object> f5932d;

    /* JADX INFO: renamed from: b */
    public E[] f5933b;

    /* JADX INFO: renamed from: c */
    public int f5934c;

    static {
        C0870t0<Object> c0870t0 = new C0870t0<>(0, new Object[0]);
        f5932d = c0870t0;
        c0870t0.f5822a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0870t0(int i10, Object[] objArr) {
        this.f5933b = objArr;
        this.f5934c = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 < this.f5934c) {
            throw new IllegalArgumentException();
        }
        return new C0870t0(this.f5934c, Arrays.copyOf(this.f5933b, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        m3192a();
        if (i10 < 0 || i10 > (i11 = this.f5934c)) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5934c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        E[] eArr = this.f5933b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f5933b, i10, eArr2, i10 + 1, this.f5934c - i10);
            this.f5933b = eArr2;
        }
        this.f5933b[i10] = e10;
        this.f5934c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        m3192a();
        int i10 = this.f5934c;
        E[] eArr = this.f5933b;
        if (i10 == eArr.length) {
            this.f5933b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f5933b;
        int i11 = this.f5934c;
        this.f5934c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m3439f(int i10) {
        if (i10 < 0 || i10 >= this.f5934c) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5934c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        m3439f(i10);
        return this.f5933b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        m3192a();
        m3439f(i10);
        E[] eArr = this.f5933b;
        E e10 = eArr[i10];
        int i11 = this.f5934c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f5934c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        m3192a();
        m3439f(i10);
        E[] eArr = this.f5933b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5934c;
    }
}
