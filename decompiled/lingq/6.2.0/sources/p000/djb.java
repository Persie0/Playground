package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class djb extends chb implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f35733d;

    /* JADX INFO: renamed from: e */
    public static final djb f35734e;

    /* JADX INFO: renamed from: b */
    public Object[] f35735b;

    /* JADX INFO: renamed from: c */
    public int f35736c;

    static {
        Object[] objArr = new Object[0];
        f35733d = objArr;
        f35734e = new djb(objArr, 0, false);
    }

    public djb(Object[] objArr, int i, boolean z) {
        super(z);
        this.f35735b = objArr;
        this.f35736c = i;
    }

    @Override // p000.mib
    /* JADX INFO: renamed from: Y */
    public final /* bridge */ /* synthetic */ mib mo10419Y(int i) {
        if (i >= this.f35736c) {
            return new djb(i == 0 ? f35733d : Arrays.copyOf(this.f35735b, i), this.f35736c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m4665d();
        if (i < 0 || i > (i2 = this.f35736c)) {
            v63.m23143u(ehb.m11156a(this.f35736c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f35735b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f35735b, 0, objArr2, 0, i);
            System.arraycopy(this.f35735b, i, objArr2, i3, this.f35736c - i);
            this.f35735b = objArr2;
        }
        this.f35735b[i] = obj;
        this.f35736c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.chb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f35736c;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof djb)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.f35735b[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        djb djbVar = (djb) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.f35735b[i3].equals(djbVar.f35735b[i3])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10420f(int i) {
        if (i < 0 || i >= this.f35736c) {
            v63.m23143u(ehb.m11156a(this.f35736c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10420f(i);
        return this.f35735b[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f35736c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f35735b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p000.chb, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m4665d();
        m10420f(i);
        Object[] objArr = this.f35735b;
        Object obj = objArr[i];
        int i2 = this.f35736c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f35736c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4665d();
        m10420f(i);
        Object[] objArr = this.f35735b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35736c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4665d();
        int i = this.f35736c;
        int length = this.f35735b.length;
        if (i == length) {
            this.f35735b = Arrays.copyOf(this.f35735b, g9a.m12427d(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f35735b;
        int i2 = this.f35736c;
        this.f35736c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
