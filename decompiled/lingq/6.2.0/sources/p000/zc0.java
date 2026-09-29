package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zc0 implements Cloneable {

    /* JADX INFO: renamed from: b */
    public int f71347b = 0;

    /* JADX INFO: renamed from: a */
    public int[] f71346a = new int[1];

    /* JADX INFO: renamed from: a */
    public final void m25544a(boolean z) {
        m25546c(this.f71347b + 1);
        if (z) {
            int[] iArr = this.f71346a;
            int i = this.f71347b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f71347b++;
    }

    /* JADX INFO: renamed from: b */
    public final void m25545b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            C3386nv.m17626m("Num bits must be between 0 and 32");
            return;
        }
        m25546c(this.f71347b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m25544a(z);
            i2--;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25546c(int i) {
        int[] iArr = this.f71346a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f71346a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f71346a.clone();
        int i = this.f71347b;
        zc0 zc0Var = new zc0();
        zc0Var.f71346a = iArr;
        zc0Var.f71347b = i;
        return zc0Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25547d(int i) {
        return (this.f71346a[i / 32] & (1 << (i & 31))) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m25548e() {
        return (this.f71347b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        return this.f71347b == zc0Var.f71347b && Arrays.equals(this.f71346a, zc0Var.f71346a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f71346a) + (this.f71347b * 31);
    }

    public final String toString() {
        int i = this.f71347b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f71347b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m25547d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
