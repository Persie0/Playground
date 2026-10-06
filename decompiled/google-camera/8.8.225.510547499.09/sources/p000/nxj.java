package p000;

import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxj extends nwf implements RandomAccess, nxv, nze {

    /* JADX INFO: renamed from: b */
    public static final nxj f44968b;

    /* JADX INFO: renamed from: c */
    private float[] f44969c;

    /* JADX INFO: renamed from: d */
    private int f44970d;

    static {
        nxj nxjVar = new nxj(new float[0], 0);
        f44968b = nxjVar;
        nxjVar.mo17769b();
    }

    public nxj() {
        this(new float[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private final String m18030h(int i) {
        return IuyLAqNmW.SADPKyjwjmbrPLe + i + ", Size:" + this.f44970d;
    }

    /* JADX INFO: renamed from: i */
    private final void m18031i(int i) {
        if (i < 0 || i >= this.f44970d) {
            throw new IndexOutOfBoundsException(m18030h(i));
        }
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m17771cA();
        if (i < 0 || i > (i2 = this.f44970d)) {
            throw new IndexOutOfBoundsException(m18030h(i));
        }
        float[] fArr = this.f44969c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f44969c, i, fArr2, i + 1, this.f44970d - i);
            this.f44969c = fArr2;
        }
        this.f44969c[i] = fFloatValue;
        this.f44970d++;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m17771cA();
        nxz.m18156e(collection);
        if (!(collection instanceof nxj)) {
            return super.addAll(collection);
        }
        nxj nxjVar = (nxj) collection;
        int i = nxjVar.f44970d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44970d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f44969c;
        if (i3 > fArr.length) {
            this.f44969c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(nxjVar.f44969c, 0, this.f44969c, this.f44970d, nxjVar.f44970d);
        this.f44970d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.nxv
    /* JADX INFO: renamed from: d */
    public final float mo18032d(int i) {
        m18031i(i);
        return this.f44969c[i];
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxj)) {
            return super.equals(obj);
        }
        nxj nxjVar = (nxj) obj;
        if (this.f44970d != nxjVar.f44970d) {
            return false;
        }
        float[] fArr = nxjVar.f44969c;
        for (int i = 0; i < this.f44970d; i++) {
            if (Float.floatToIntBits(this.f44969c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final nxv mo17775e(int i) {
        if (i >= this.f44970d) {
            return new nxj(Arrays.copyOf(this.f44969c, i), this.f44970d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.nxv
    /* JADX INFO: renamed from: g */
    public final void mo18034g(float f) {
        m17771cA();
        int i = this.f44970d;
        float[] fArr = this.f44969c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f44969c = fArr2;
        }
        float[] fArr3 = this.f44969c;
        int i2 = this.f44970d;
        this.f44970d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(mo18032d(i));
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f44970d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f44969c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f44970d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44969c[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m17771cA();
        m18031i(i);
        float[] fArr = this.f44969c;
        float f = fArr[i];
        int i2 = this.f44970d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f44970d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m17771cA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f44969c;
        System.arraycopy(fArr, i2, fArr, i, this.f44970d - i2);
        this.f44970d -= i2 - i;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m17771cA();
        m18031i(i);
        float[] fArr = this.f44969c;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44970d;
    }

    private nxj(float[] fArr, int i) {
        this.f44969c = fArr;
        this.f44970d = i;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo18034g(((Float) obj).floatValue());
        return true;
    }
}
