package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s56 {

    /* JADX INFO: renamed from: a */
    public int[] f60381a;

    /* JADX INFO: renamed from: b */
    public int f60382b;

    public s56(int i) {
        this.f60381a = i == 0 ? m84.f50750a : new int[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m21101a(int i) {
        m21102b(this.f60382b + 1);
        int[] iArr = this.f60381a;
        int i2 = this.f60382b;
        iArr[i2] = i;
        this.f60382b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m21102b(int i) {
        int[] iArr = this.f60381a;
        if (iArr.length < i) {
            this.f60381a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m21103c(int i) {
        if (i >= 0 && i < this.f60382b) {
            return this.f60381a[i];
        }
        v63.m23143u("Index must be between 0 and size");
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m21104d() {
        int i = this.f60382b;
        if (i != 0) {
            return this.f60381a[i - 1];
        }
        uk9.m22775i("IntList is empty.");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m21105e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f60382b)) {
            v63.m23143u("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f60381a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC3550rv.m20825S(i, i + 1, i2, iArr, iArr);
        }
        this.f60382b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s56) {
            s56 s56Var = (s56) obj;
            int i = s56Var.f60382b;
            int i2 = this.f60382b;
            if (i == i2) {
                int[] iArr = this.f60381a;
                int[] iArr2 = s56Var.f60381a;
                i84 i84VarM15922M = l70.m15922M(0, i2);
                int i3 = i84VarM15922M.f40379a;
                int i4 = i84VarM15922M.f40380b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21106f(int i, int i2) {
        if (i < 0 || i >= this.f60382b) {
            v63.m23143u("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f60381a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.f60381a;
        int i = this.f60382b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f60381a;
        int i = this.f60382b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ s56() {
        this(16);
    }
}
