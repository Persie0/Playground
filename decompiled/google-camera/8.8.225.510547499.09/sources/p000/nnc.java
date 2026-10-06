package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nnc extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final int[] f43930a;

    /* JADX INFO: renamed from: b */
    final int f43931b;

    /* JADX INFO: renamed from: c */
    final int f43932c;

    public nnc(int[] iArr, int i, int i2) {
        this.f43930a = iArr;
        this.f43931b = i;
        this.f43932c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && kxk.m14979Y(this.f43930a, ((Integer) obj).intValue(), this.f43931b, this.f43932c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nnc)) {
            return super.equals(obj);
        }
        nnc nncVar = (nnc) obj;
        int size = size();
        if (nncVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f43930a[this.f43931b + i] != nncVar.f43930a[nncVar.f43931b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        lku.m15620O(i, size());
        return Integer.valueOf(this.f43930a[this.f43931b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f43931b; i2 < this.f43932c; i2++) {
            i = (i * 31) + this.f43930a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iM14979Y;
        if (!(obj instanceof Integer) || (iM14979Y = kxk.m14979Y(this.f43930a, ((Integer) obj).intValue(), this.f43931b, this.f43932c)) < 0) {
            return -1;
        }
        return iM14979Y - this.f43931b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f43930a;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f43931b;
            int i2 = this.f43932c - 1;
            while (i2 >= i) {
                if (iArr[i2] != iIntValue) {
                    i2--;
                } else if (i2 >= 0) {
                    return i2 - this.f43931b;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.f43931b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        lku.m15620O(i, size());
        int[] iArr = this.f43930a;
        int i2 = this.f43931b + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43932c - this.f43931b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        lku.m15612G(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.f43930a;
        int i3 = this.f43931b;
        return new nnc(iArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append(this.f43930a[this.f43931b]);
        int i = this.f43931b;
        while (true) {
            i++;
            if (i >= this.f43932c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f43930a[i]);
        }
    }
}
