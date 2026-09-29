package nf;

import java.util.Arrays;

/* JADX INFO: renamed from: nf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7770a implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int[] f42692a;

    /* JADX INFO: renamed from: b */
    public int f42693b;

    public C7770a() {
        this.f42693b = 0;
        this.f42692a = new int[1];
    }

    public C7770a(int[] iArr, int i10) {
        this.f42692a = iArr;
        this.f42693b = i10;
    }

    /* JADX INFO: renamed from: b */
    public final void m15472b(boolean z10) {
        m15474d(this.f42693b + 1);
        if (z10) {
            int[] iArr = this.f42692a;
            int i10 = this.f42693b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f42693b++;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m15473c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m15474d(this.f42693b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            m15472b(z10);
            i11--;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C7770a((int[]) this.f42692a.clone(), this.f42693b);
    }

    /* JADX INFO: renamed from: d */
    public final void m15474d(int i10) {
        int[] iArr = this.f42692a;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f42692a = iArr2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15475e(int i10) {
        return ((1 << (i10 & 31)) & this.f42692a[i10 / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7770a)) {
            return false;
        }
        C7770a c7770a = (C7770a) obj;
        return this.f42693b == c7770a.f42693b && Arrays.equals(this.f42692a, c7770a.f42692a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42692a) + (this.f42693b * 31);
    }

    public final String toString() {
        int i10 = this.f42693b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f42693b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m15475e(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
