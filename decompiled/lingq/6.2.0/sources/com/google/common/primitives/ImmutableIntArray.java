package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import p000.bna;

/* JADX INFO: loaded from: classes2.dex */
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final ImmutableIntArray f13494c = new ImmutableIntArray(new int[0]);

    /* JADX INFO: renamed from: a */
    public final int[] f13495a;

    /* JADX INFO: renamed from: b */
    public final int f13496b;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.f13495a = iArr;
        this.f13496b = length;
    }

    public final boolean equals(Object obj) {
        ImmutableIntArray immutableIntArray;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableIntArray) && (i2 = this.f13496b) == (i = (immutableIntArray = (ImmutableIntArray) obj).f13496b)) {
            for (int i3 = 0; i3 < i2; i3++) {
                bna.m3973s(i3, i2);
                int i4 = this.f13495a[i3];
                bna.m3973s(i3, i);
                if (i4 == immutableIntArray.f13495a[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13496b; i2++) {
            i = (i * 31) + this.f13495a[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.f13496b == 0 ? f13494c : this;
    }

    public final String toString() {
        int i = this.f13496b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f13495a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.f13495a;
        int length = iArr.length;
        int i = this.f13496b;
        return i < length ? new ImmutableIntArray(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
