package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ey5 {

    /* JADX INFO: renamed from: a */
    public final dy5[] f38074a;

    /* JADX INFO: renamed from: b */
    public final long f38075b;

    public ey5(List list) {
        this((dy5[]) list.toArray(new dy5[0]));
    }

    /* JADX INFO: renamed from: a */
    public final ey5 m11386a(dy5... dy5VarArr) {
        if (dy5VarArr.length == 0) {
            return this;
        }
        String str = uma.f64080a;
        dy5[] dy5VarArr2 = this.f38074a;
        Object[] objArrCopyOf = Arrays.copyOf(dy5VarArr2, dy5VarArr2.length + dy5VarArr.length);
        System.arraycopy(dy5VarArr, 0, objArrCopyOf, dy5VarArr2.length, dy5VarArr.length);
        return new ey5(this.f38075b, (dy5[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public final ey5 m11387b(ey5 ey5Var) {
        return ey5Var == null ? this : m11386a(ey5Var.f38074a);
    }

    /* JADX INFO: renamed from: c */
    public final ey5 m11388c(long j) {
        return this.f38075b == j ? this : new ey5(j, this.f38074a);
    }

    /* JADX INFO: renamed from: d */
    public final dy5 m11389d(int i) {
        return this.f38074a[i];
    }

    /* JADX INFO: renamed from: e */
    public final int m11390e() {
        return this.f38074a.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ey5.class == obj.getClass()) {
            ey5 ey5Var = (ey5) obj;
            if (Arrays.equals(this.f38074a, ey5Var.f38074a) && this.f38075b == ey5Var.f38075b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return hnb.m13380b(this.f38075b) + (Arrays.hashCode(this.f38074a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f38074a));
        long j = this.f38075b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public ey5(long j, dy5... dy5VarArr) {
        this.f38075b = j;
        this.f38074a = dy5VarArr;
    }

    public ey5(dy5... dy5VarArr) {
        this(-9223372036854775807L, dy5VarArr);
    }

    public ey5(long j, ArrayList arrayList) {
        this(j, (dy5[]) arrayList.toArray(new dy5[0]));
    }
}
