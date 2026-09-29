package p000;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rd9 implements Comparable {

    /* JADX INFO: renamed from: a */
    public boolean f59126a;

    /* JADX INFO: renamed from: e */
    public float f59130e;

    /* JADX INFO: renamed from: i */
    public SolverVariable$Type f59134i;

    /* JADX INFO: renamed from: b */
    public int f59127b = -1;

    /* JADX INFO: renamed from: c */
    public int f59128c = -1;

    /* JADX INFO: renamed from: d */
    public int f59129d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f59131f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f59132g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f59133h = new float[9];

    /* JADX INFO: renamed from: j */
    public C3349mv[] f59135j = new C3349mv[16];

    /* JADX INFO: renamed from: k */
    public int f59136k = 0;

    /* JADX INFO: renamed from: l */
    public int f59137l = 0;

    public rd9(SolverVariable$Type solverVariable$Type) {
        this.f59134i = solverVariable$Type;
    }

    /* JADX INFO: renamed from: a */
    public final void m20589a(C3349mv c3349mv) {
        int i = 0;
        while (true) {
            int i2 = this.f59136k;
            C3349mv[] c3349mvArr = this.f59135j;
            if (i >= i2) {
                if (i2 >= c3349mvArr.length) {
                    this.f59135j = (C3349mv[]) Arrays.copyOf(c3349mvArr, c3349mvArr.length * 2);
                }
                C3349mv[] c3349mvArr2 = this.f59135j;
                int i3 = this.f59136k;
                c3349mvArr2[i3] = c3349mv;
                this.f59136k = i3 + 1;
                return;
            }
            if (c3349mvArr[i] == c3349mv) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20590b(C3349mv c3349mv) {
        int i = this.f59136k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f59135j[i2] == c3349mv) {
                while (i2 < i - 1) {
                    C3349mv[] c3349mvArr = this.f59135j;
                    int i3 = i2 + 1;
                    c3349mvArr[i2] = c3349mvArr[i3];
                    i2 = i3;
                }
                this.f59136k--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20591c() {
        this.f59134i = SolverVariable$Type.UNKNOWN;
        this.f59129d = 0;
        this.f59127b = -1;
        this.f59128c = -1;
        this.f59130e = 0.0f;
        this.f59131f = false;
        int i = this.f59136k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f59135j[i2] = null;
        }
        this.f59136k = 0;
        this.f59137l = 0;
        this.f59126a = false;
        Arrays.fill(this.f59133h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f59127b - ((rd9) obj).f59127b;
    }

    /* JADX INFO: renamed from: d */
    public final void m20592d(gd5 gd5Var, float f) {
        this.f59130e = f;
        this.f59131f = true;
        int i = this.f59136k;
        this.f59128c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f59135j[i2].m17054h(gd5Var, this, false);
        }
        this.f59136k = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m20593e(gd5 gd5Var, C3349mv c3349mv) {
        int i = this.f59136k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f59135j[i2].mo16327i(gd5Var, c3349mv, false);
        }
        this.f59136k = 0;
    }

    public final String toString() {
        return "" + this.f59127b;
    }
}
