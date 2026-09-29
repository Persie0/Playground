package androidx.constraintlayout.core;

import android.support.v4.media.session.C0166e;
import java.util.Arrays;
import p023b2.C1292a;

/* JADX INFO: renamed from: androidx.constraintlayout.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0724a implements C0725b.a {

    /* JADX INFO: renamed from: b */
    public final C0725b f4789b;

    /* JADX INFO: renamed from: c */
    public final C1292a f4790c;

    /* JADX INFO: renamed from: a */
    public int f4788a = 0;

    /* JADX INFO: renamed from: d */
    public int f4791d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f4792e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f4793f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f4794g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f4795h = -1;

    /* JADX INFO: renamed from: i */
    public int f4796i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f4797j = false;

    public C0724a(C0725b c0725b, C1292a c1292a) {
        this.f4789b = c0725b;
        this.f4790c = c1292a;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: a */
    public final int mo2644a() {
        return this.f4788a;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: b */
    public final boolean mo2645b(SolverVariable solverVariable) {
        int i10 = this.f4795h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f4788a; i11++) {
            if (this.f4792e[i10] == solverVariable.f4777b) {
                return true;
            }
            i10 = this.f4793f[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: c */
    public final float mo2646c(C0725b c0725b, boolean z10) {
        float fMo2653j = mo2653j(c0725b.f4798a);
        mo2652i(c0725b.f4798a, z10);
        C0725b.a aVar = c0725b.f4801d;
        int iMo2644a = aVar.mo2644a();
        for (int i10 = 0; i10 < iMo2644a; i10++) {
            SolverVariable solverVariableMo2648e = aVar.mo2648e(i10);
            mo2649f(solverVariableMo2648e, aVar.mo2653j(solverVariableMo2648e) * fMo2653j, z10);
        }
        return fMo2653j;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    public final void clear() {
        int i10 = this.f4795h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4788a; i11++) {
            SolverVariable solverVariable = ((SolverVariable[]) this.f4790c.f8006d)[this.f4792e[i10]];
            if (solverVariable != null) {
                solverVariable.m2640f(this.f4789b);
            }
            i10 = this.f4793f[i10];
        }
        this.f4795h = -1;
        this.f4796i = -1;
        this.f4797j = false;
        this.f4788a = 0;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: d */
    public final void mo2647d(SolverVariable solverVariable, float f3) {
        if (f3 == 0.0f) {
            mo2652i(solverVariable, true);
            return;
        }
        int i10 = this.f4795h;
        C0725b c0725b = this.f4789b;
        if (i10 == -1) {
            this.f4795h = 0;
            this.f4794g[0] = f3;
            this.f4792e[0] = solverVariable.f4777b;
            this.f4793f[0] = -1;
            solverVariable.f4787l++;
            solverVariable.m2639a(c0725b);
            this.f4788a++;
            if (!this.f4797j) {
                int i11 = this.f4796i + 1;
                this.f4796i = i11;
                int[] iArr = this.f4792e;
                if (i11 >= iArr.length) {
                    this.f4797j = true;
                    this.f4796i = iArr.length - 1;
                }
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f4788a; i13++) {
            int i14 = this.f4792e[i10];
            int i15 = solverVariable.f4777b;
            if (i14 == i15) {
                this.f4794g[i10] = f3;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f4793f[i10];
        }
        int length = this.f4796i;
        int i16 = length + 1;
        if (this.f4797j) {
            int[] iArr2 = this.f4792e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f4792e;
        if (length >= iArr3.length && this.f4788a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f4792e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f4792e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f4791d * 2;
            this.f4791d = i18;
            this.f4797j = false;
            this.f4796i = length - 1;
            this.f4794g = Arrays.copyOf(this.f4794g, i18);
            this.f4792e = Arrays.copyOf(this.f4792e, this.f4791d);
            this.f4793f = Arrays.copyOf(this.f4793f, this.f4791d);
        }
        this.f4792e[length] = solverVariable.f4777b;
        this.f4794g[length] = f3;
        if (i12 != -1) {
            int[] iArr6 = this.f4793f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f4793f[length] = this.f4795h;
            this.f4795h = length;
        }
        solverVariable.f4787l++;
        solverVariable.m2639a(c0725b);
        int i19 = this.f4788a + 1;
        this.f4788a = i19;
        if (!this.f4797j) {
            this.f4796i++;
        }
        int[] iArr7 = this.f4792e;
        if (i19 >= iArr7.length) {
            this.f4797j = true;
        }
        if (this.f4796i >= iArr7.length) {
            this.f4797j = true;
            this.f4796i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: e */
    public final SolverVariable mo2648e(int i10) {
        int i11 = this.f4795h;
        for (int i12 = 0; i11 != -1 && i12 < this.f4788a; i12++) {
            if (i12 == i10) {
                return ((SolverVariable[]) this.f4790c.f8006d)[this.f4792e[i11]];
            }
            i11 = this.f4793f[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: f */
    public final void mo2649f(SolverVariable solverVariable, float f3, boolean z10) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i10 = this.f4795h;
            C0725b c0725b = this.f4789b;
            if (i10 == -1) {
                this.f4795h = 0;
                this.f4794g[0] = f3;
                this.f4792e[0] = solverVariable.f4777b;
                this.f4793f[0] = -1;
                solverVariable.f4787l++;
                solverVariable.m2639a(c0725b);
                this.f4788a++;
                if (this.f4797j) {
                    return;
                }
                int i11 = this.f4796i + 1;
                this.f4796i = i11;
                int[] iArr = this.f4792e;
                if (i11 >= iArr.length) {
                    this.f4797j = true;
                    this.f4796i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f4788a; i13++) {
                int i14 = this.f4792e[i10];
                int i15 = solverVariable.f4777b;
                if (i14 == i15) {
                    float[] fArr = this.f4794g;
                    float f10 = fArr[i10] + f3;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i10] = f10;
                    if (f10 == 0.0f) {
                        if (i10 == this.f4795h) {
                            this.f4795h = this.f4793f[i10];
                        } else {
                            int[] iArr2 = this.f4793f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.m2640f(c0725b);
                        }
                        if (this.f4797j) {
                            this.f4796i = i10;
                        }
                        solverVariable.f4787l--;
                        this.f4788a--;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f4793f[i10];
            }
            int length = this.f4796i;
            int i16 = length + 1;
            if (this.f4797j) {
                int[] iArr3 = this.f4792e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f4792e;
            if (length < iArr4.length || this.f4788a >= iArr4.length) {
                break;
            }
            int i17 = 0;
            while (true) {
                int[] iArr5 = this.f4792e;
                if (i17 >= iArr5.length) {
                    break;
                    break;
                } else {
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f4792e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f4791d * 2;
                this.f4791d = i18;
                this.f4797j = false;
                this.f4796i = length - 1;
                this.f4794g = Arrays.copyOf(this.f4794g, i18);
                this.f4792e = Arrays.copyOf(this.f4792e, this.f4791d);
                this.f4793f = Arrays.copyOf(this.f4793f, this.f4791d);
            }
            this.f4792e[length] = solverVariable.f4777b;
            this.f4794g[length] = f3;
            if (i12 != -1) {
                int[] iArr7 = this.f4793f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f4793f[length] = this.f4795h;
                this.f4795h = length;
            }
            solverVariable.f4787l++;
            solverVariable.m2639a(c0725b);
            this.f4788a++;
            if (!this.f4797j) {
                this.f4796i++;
            }
            int i19 = this.f4796i;
            int[] iArr8 = this.f4792e;
            if (i19 >= iArr8.length) {
                this.f4797j = true;
                this.f4796i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: g */
    public final void mo2650g() {
        int i10 = this.f4795h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4788a; i11++) {
            float[] fArr = this.f4794g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f4793f[i10];
        }
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: h */
    public final float mo2651h(int i10) {
        int i11 = this.f4795h;
        for (int i12 = 0; i11 != -1 && i12 < this.f4788a; i12++) {
            if (i12 == i10) {
                return this.f4794g[i11];
            }
            i11 = this.f4793f[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: i */
    public final float mo2652i(SolverVariable solverVariable, boolean z10) {
        int i10 = this.f4795h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f4788a) {
            if (this.f4792e[i10] == solverVariable.f4777b) {
                if (i10 == this.f4795h) {
                    this.f4795h = this.f4793f[i10];
                } else {
                    int[] iArr = this.f4793f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.m2640f(this.f4789b);
                }
                solverVariable.f4787l--;
                this.f4788a--;
                this.f4792e[i10] = -1;
                if (this.f4797j) {
                    this.f4796i = i10;
                }
                return this.f4794g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f4793f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: j */
    public final float mo2653j(SolverVariable solverVariable) {
        int i10 = this.f4795h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4788a; i11++) {
            if (this.f4792e[i10] == solverVariable.f4777b) {
                return this.f4794g[i10];
            }
            i10 = this.f4793f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.C0725b.a
    /* JADX INFO: renamed from: k */
    public final void mo2654k(float f3) {
        int i10 = this.f4795h;
        for (int i11 = 0; i10 != -1 && i11 < this.f4788a; i11++) {
            float[] fArr = this.f4794g;
            fArr[i10] = fArr[i10] / f3;
            i10 = this.f4793f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f4795h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f4788a; i11++) {
            StringBuilder sbM771r = C0166e.m771r(C0166e.m765k(string, " -> "));
            sbM771r.append(this.f4794g[i10]);
            sbM771r.append(" : ");
            StringBuilder sbM771r2 = C0166e.m771r(sbM771r.toString());
            sbM771r2.append(((SolverVariable[]) this.f4790c.f8006d)[this.f4792e[i10]]);
            string = sbM771r2.toString();
            i10 = this.f4793f[i10];
        }
        return string;
    }
}
