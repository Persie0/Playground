package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nna extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final float[] f43924a;

    /* JADX INFO: renamed from: b */
    public final int f43925b;

    /* JADX INFO: renamed from: c */
    public final int f43926c;

    public nna(float[] fArr, int i, int i2) {
        this.f43924a = fArr;
        this.f43925b = i;
        this.f43926c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && kxk.m14988af(this.f43924a, ((Float) obj).floatValue(), this.f43925b, this.f43926c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nna)) {
            return super.equals(obj);
        }
        nna nnaVar = (nna) obj;
        int size = size();
        if (nnaVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f43924a[this.f43925b + i] != nnaVar.f43924a[nnaVar.f43925b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        lku.m15620O(i, size());
        return Float.valueOf(this.f43924a[this.f43925b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.f43925b; i < this.f43926c; i++) {
            iHashCode = (iHashCode * 31) + Float.valueOf(this.f43924a[i]).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iM14988af;
        if (!(obj instanceof Float) || (iM14988af = kxk.m14988af(this.f43924a, ((Float) obj).floatValue(), this.f43925b, this.f43926c)) < 0) {
            return -1;
        }
        return iM14988af - this.f43925b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.f43924a;
            float fFloatValue = ((Float) obj).floatValue();
            int i = this.f43925b;
            int i2 = this.f43926c - 1;
            while (i2 >= i) {
                if (fArr[i2] != fFloatValue) {
                    i2--;
                } else if (i2 >= 0) {
                    return i2 - this.f43925b;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.f43925b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        lku.m15620O(i, size());
        float[] fArr = this.f43924a;
        int i2 = this.f43925b + i;
        float f2 = fArr[i2];
        f.getClass();
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43926c - this.f43925b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        lku.m15612G(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.f43924a;
        int i3 = this.f43925b;
        return new nna(fArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.f43924a[this.f43925b]);
        int i = this.f43925b;
        while (true) {
            i++;
            if (i >= this.f43926c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f43924a[i]);
        }
    }
}
