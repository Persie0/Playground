package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0865r extends AbstractC0830c<Float> implements RandomAccess, InterfaceC0866r0 {

    /* JADX INFO: renamed from: b */
    public float[] f5924b;

    /* JADX INFO: renamed from: c */
    public int f5925c;

    static {
        new C0865r(0, new float[0]).f5822a = false;
    }

    public C0865r() {
        this(0, new float[10]);
    }

    public C0865r(int i10, float[] fArr) {
        this.f5924b = fArr;
        this.f5925c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 < this.f5925c) {
            throw new IllegalArgumentException();
        }
        return new C0865r(this.f5925c, Arrays.copyOf(this.f5924b, i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        m3192a();
        if (i10 < 0 || i10 > (i11 = this.f5925c)) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5925c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        float[] fArr = this.f5924b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f5924b, i10, fArr2, i10 + 1, this.f5925c - i10);
            this.f5924b = fArr2;
        }
        this.f5924b[i10] = fFloatValue;
        this.f5925c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3434f(((Float) obj).floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m3192a();
        Charset charset = C0871u.f5935a;
        collection.getClass();
        if (!(collection instanceof C0865r)) {
            return super.addAll(collection);
        }
        C0865r c0865r = (C0865r) collection;
        int i10 = c0865r.f5925c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5925c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f5924b;
        if (i12 > fArr.length) {
            this.f5924b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c0865r.f5924b, 0, this.f5924b, this.f5925c, c0865r.f5925c);
        this.f5925c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0865r)) {
            return super.equals(obj);
        }
        C0865r c0865r = (C0865r) obj;
        if (this.f5925c != c0865r.f5925c) {
            return false;
        }
        float[] fArr = c0865r.f5924b;
        for (int i10 = 0; i10 < this.f5925c; i10++) {
            if (Float.floatToIntBits(this.f5924b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3434f(float f3) {
        m3192a();
        int i10 = this.f5925c;
        float[] fArr = this.f5924b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f5924b = fArr2;
        }
        float[] fArr3 = this.f5924b;
        int i11 = this.f5925c;
        this.f5925c = i11 + 1;
        fArr3[i11] = f3;
    }

    /* JADX INFO: renamed from: g */
    public final void m3435g(int i10) {
        if (i10 < 0 || i10 >= this.f5925c) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5925c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m3435g(i10);
        return Float.valueOf(this.f5924b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f5925c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f5924b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3192a();
        m3435g(i10);
        float[] fArr = this.f5924b;
        float f3 = fArr[i10];
        int i11 = this.f5925c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f5925c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3192a();
        for (int i10 = 0; i10 < this.f5925c; i10++) {
            if (obj.equals(Float.valueOf(this.f5924b[i10]))) {
                float[] fArr = this.f5924b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f5925c - i10) - 1);
                this.f5925c--;
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
        float[] fArr = this.f5924b;
        System.arraycopy(fArr, i11, fArr, i10, this.f5925c - i11);
        this.f5925c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m3192a();
        m3435g(i10);
        float[] fArr = this.f5924b;
        float f3 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5925c;
    }
}
