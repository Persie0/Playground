package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p000.bna;

/* JADX INFO: loaded from: classes2.dex */
class Ints$IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final int[] f13497a;

    /* JADX INFO: renamed from: b */
    public final int f13498b;

    /* JADX INFO: renamed from: c */
    public final int f13499c;

    public Ints$IntArrayAsList(int i, int i2, int[] iArr) {
        this.f13497a = iArr;
        this.f13498b = i;
        this.f13499c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f13498b;
        while (i < this.f13499c) {
            if (this.f13497a[i] == iIntValue) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ints$IntArrayAsList)) {
            return super.equals(obj);
        }
        Ints$IntArrayAsList ints$IntArrayAsList = (Ints$IntArrayAsList) obj;
        int size = size();
        if (ints$IntArrayAsList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f13497a[this.f13498b + i] != ints$IntArrayAsList.f13497a[ints$IntArrayAsList.f13498b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        bna.m3973s(i, size());
        return Integer.valueOf(this.f13497a[this.f13498b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f13498b; i2 < this.f13499c; i2++) {
            i = (i * 31) + this.f13497a[i2];
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f13498b;
            int i2 = i;
            while (i2 < this.f13499c) {
                if (this.f13497a[i2] != iIntValue) {
                    i2++;
                } else if (i2 >= 0) {
                    return i2 - i;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f13499c;
            do {
                i2--;
                i = this.f13498b;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f13497a[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        bna.m3973s(i, size());
        int i2 = this.f13498b + i;
        int[] iArr = this.f13497a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13499c - this.f13498b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        bna.m3983x(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f13498b;
        return new Ints$IntArrayAsList(i + i3, i3 + i2, this.f13497a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f13497a;
        int i = this.f13498b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f13499c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
