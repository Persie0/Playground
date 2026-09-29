package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: a */
    public boolean f4776a;

    /* JADX INFO: renamed from: e */
    public float f4780e;

    /* JADX INFO: renamed from: i */
    public Type f4784i;

    /* JADX INFO: renamed from: b */
    public int f4777b = -1;

    /* JADX INFO: renamed from: c */
    public int f4778c = -1;

    /* JADX INFO: renamed from: d */
    public int f4779d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f4781f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f4782g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f4783h = new float[9];

    /* JADX INFO: renamed from: j */
    public C0725b[] f4785j = new C0725b[16];

    /* JADX INFO: renamed from: k */
    public int f4786k = 0;

    /* JADX INFO: renamed from: l */
    public int f4787l = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f4784i = type;
    }

    /* JADX INFO: renamed from: a */
    public final void m2639a(C0725b c0725b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f4786k;
            if (i10 >= i11) {
                C0725b[] c0725bArr = this.f4785j;
                if (i11 >= c0725bArr.length) {
                    this.f4785j = (C0725b[]) Arrays.copyOf(c0725bArr, c0725bArr.length * 2);
                }
                C0725b[] c0725bArr2 = this.f4785j;
                int i12 = this.f4786k;
                c0725bArr2[i12] = c0725b;
                this.f4786k = i12 + 1;
                return;
            }
            if (this.f4785j[i10] == c0725b) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f4777b - solverVariable.f4777b;
    }

    /* JADX INFO: renamed from: f */
    public final void m2640f(C0725b c0725b) {
        int i10 = this.f4786k;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f4785j[i11] == c0725b) {
                while (i11 < i10 - 1) {
                    C0725b[] c0725bArr = this.f4785j;
                    int i12 = i11 + 1;
                    c0725bArr[i11] = c0725bArr[i12];
                    i11 = i12;
                }
                this.f4786k--;
                return;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2641g() {
        this.f4784i = Type.UNKNOWN;
        this.f4779d = 0;
        this.f4777b = -1;
        this.f4778c = -1;
        this.f4780e = 0.0f;
        this.f4781f = false;
        int i10 = this.f4786k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4785j[i11] = null;
        }
        this.f4786k = 0;
        this.f4787l = 0;
        this.f4776a = false;
        Arrays.fill(this.f4783h, 0.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m2642i(C0726c c0726c, float f3) {
        this.f4780e = f3;
        this.f4781f = true;
        int i10 = this.f4786k;
        this.f4778c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4785j[i11].m2662h(c0726c, this, false);
        }
        this.f4786k = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m2643l(C0726c c0726c, C0725b c0725b) {
        int i10 = this.f4786k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4785j[i11].mo2663i(c0726c, c0725b, false);
        }
        this.f4786k = 0;
    }

    public final String toString() {
        return "" + this.f4777b;
    }
}
