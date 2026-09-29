package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0836e extends AbstractC0830c<Boolean> implements RandomAccess, InterfaceC0866r0 {

    /* JADX INFO: renamed from: b */
    public boolean[] f5838b;

    /* JADX INFO: renamed from: c */
    public int f5839c;

    static {
        new C0836e(new boolean[0], 0).f5822a = false;
    }

    public C0836e() {
        this(new boolean[10], 0);
    }

    public C0836e(boolean[] zArr, int i10) {
        this.f5838b = zArr;
        this.f5839c = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 >= this.f5839c) {
            return new C0836e(Arrays.copyOf(this.f5838b, i10), this.f5839c);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m3192a();
        if (i10 < 0 || i10 > (i11 = this.f5839c)) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5839c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        boolean[] zArr = this.f5838b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f5838b, i10, zArr2, i10 + 1, this.f5839c - i10);
            this.f5838b = zArr2;
        }
        this.f5838b[i10] = zBooleanValue;
        this.f5839c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3209f(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m3192a();
        Charset charset = C0871u.f5935a;
        collection.getClass();
        if (!(collection instanceof C0836e)) {
            return super.addAll(collection);
        }
        C0836e c0836e = (C0836e) collection;
        int i10 = c0836e.f5839c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5839c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f5838b;
        if (i12 > zArr.length) {
            this.f5838b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c0836e.f5838b, 0, this.f5838b, this.f5839c, c0836e.f5839c);
        this.f5839c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0836e)) {
            return super.equals(obj);
        }
        C0836e c0836e = (C0836e) obj;
        if (this.f5839c != c0836e.f5839c) {
            return false;
        }
        boolean[] zArr = c0836e.f5838b;
        for (int i10 = 0; i10 < this.f5839c; i10++) {
            if (this.f5838b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3209f(boolean z10) {
        m3192a();
        int i10 = this.f5839c;
        boolean[] zArr = this.f5838b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f5838b = zArr2;
        }
        boolean[] zArr3 = this.f5838b;
        int i11 = this.f5839c;
        this.f5839c = i11 + 1;
        zArr3[i11] = z10;
    }

    /* JADX INFO: renamed from: g */
    public final void m3210g(int i10) {
        if (i10 < 0 || i10 >= this.f5839c) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5839c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m3210g(i10);
        return Boolean.valueOf(this.f5838b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5839c; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f5838b[i11];
            Charset charset = C0871u.f5935a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3192a();
        m3210g(i10);
        boolean[] zArr = this.f5838b;
        boolean z10 = zArr[i10];
        int i11 = this.f5839c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f5839c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3192a();
        for (int i10 = 0; i10 < this.f5839c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f5838b[i10]))) {
                boolean[] zArr = this.f5838b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f5839c - i10) - 1);
                this.f5839c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3192a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f5838b;
        System.arraycopy(zArr, i11, zArr, i10, this.f5839c - i11);
        this.f5839c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m3192a();
        m3210g(i10);
        boolean[] zArr = this.f5838b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5839c;
    }
}
