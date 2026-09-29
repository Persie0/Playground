package androidx.constraintlayout.core;

import android.support.v4.media.session.C0166e;
import com.kochava.tracker.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import p003a2.C0009a;
import p023b2.C1292a;

/* JADX INFO: renamed from: androidx.constraintlayout.core.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0727d extends C0725b {

    /* JADX INFO: renamed from: f */
    public SolverVariable[] f4820f;

    /* JADX INFO: renamed from: g */
    public SolverVariable[] f4821g;

    /* JADX INFO: renamed from: h */
    public int f4822h;

    /* JADX INFO: renamed from: i */
    public final b f4823i;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.d$a */
    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f4777b - solverVariable2.f4777b;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.d$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public SolverVariable f4824a;

        public b() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.f4824a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder sbM771r = C0166e.m771r(string);
                    sbM771r.append(this.f4824a.f4783h[i10]);
                    sbM771r.append(" ");
                    string = sbM771r.toString();
                }
            }
            StringBuilder sbM26o = C0009a.m26o(string, "] ");
            sbM26o.append(this.f4824a);
            return sbM26o.toString();
        }
    }

    public C0727d(C1292a c1292a) {
        super(c1292a);
        this.f4820f = new SolverVariable[BuildConfig.SDK_TRUNCATE_LENGTH];
        this.f4821g = new SolverVariable[BuildConfig.SDK_TRUNCATE_LENGTH];
        this.f4822h = 0;
        this.f4823i = new b();
    }

    @Override // androidx.constraintlayout.core.C0725b, androidx.constraintlayout.core.C0726c.a
    /* JADX INFO: renamed from: a */
    public final SolverVariable mo2655a(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f4822h; i11++) {
            SolverVariable[] solverVariableArr = this.f4820f;
            SolverVariable solverVariable = solverVariableArr[i11];
            if (!zArr[solverVariable.f4777b]) {
                b bVar = this.f4823i;
                bVar.f4824a = solverVariable;
                boolean z10 = true;
                int i12 = 8;
                if (i10 == -1) {
                    while (true) {
                        if (i12 >= 0) {
                            float f3 = bVar.f4824a.f4783h[i12];
                            if (f3 <= 0.0f) {
                                if (f3 < 0.0f) {
                                    break;
                                }
                                i12--;
                            }
                        }
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        i10 = i11;
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f10 = solverVariable2.f4783h[i12];
                            float f11 = bVar.f4824a.f4783h[i12];
                            if (f11 != f10) {
                                if (f11 >= f10) {
                                    break;
                                }
                                break;
                            }
                            i12--;
                        }
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        i10 = i11;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f4820f[i10];
    }

    @Override // androidx.constraintlayout.core.C0725b
    /* JADX INFO: renamed from: e */
    public final boolean mo2659e() {
        return this.f4822h == 0;
    }

    @Override // androidx.constraintlayout.core.C0725b
    /* JADX INFO: renamed from: i */
    public final void mo2663i(C0726c c0726c, C0725b c0725b, boolean z10) {
        boolean z11;
        SolverVariable solverVariable = c0725b.f4798a;
        if (solverVariable == null) {
            return;
        }
        C0725b.a aVar = c0725b.f4801d;
        int iMo2644a = aVar.mo2644a();
        for (int i10 = 0; i10 < iMo2644a; i10++) {
            SolverVariable solverVariableMo2648e = aVar.mo2648e(i10);
            float fMo2651h = aVar.mo2651h(i10);
            b bVar = this.f4823i;
            bVar.f4824a = solverVariableMo2648e;
            boolean z12 = solverVariableMo2648e.f4776a;
            float[] fArr = solverVariable.f4783h;
            if (z12) {
                boolean z13 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = bVar.f4824a.f4783h;
                    float f3 = (fArr[i11] * fMo2651h) + fArr2[i11];
                    fArr2[i11] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        bVar.f4824a.f4783h[i11] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    C0727d.this.m2685k(bVar.f4824a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != 0.0f) {
                        float f11 = f10 * fMo2651h;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        bVar.f4824a.f4783h[i12] = f11;
                    } else {
                        bVar.f4824a.f4783h[i12] = 0.0f;
                    }
                }
                z11 = true;
            }
            if (z11) {
                m2684j(solverVariableMo2648e);
            }
            this.f4799b = (c0725b.f4799b * fMo2651h) + this.f4799b;
        }
        m2685k(solverVariable);
    }

    /* JADX INFO: renamed from: j */
    public final void m2684j(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f4822h + 1;
        SolverVariable[] solverVariableArr = this.f4820f;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f4820f = solverVariableArr2;
            this.f4821g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f4820f;
        int i12 = this.f4822h;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f4822h = i13;
        if (i13 > 1 && solverVariableArr3[i13 - 1].f4777b > solverVariable.f4777b) {
            int i14 = 0;
            while (true) {
                i10 = this.f4822h;
                if (i14 >= i10) {
                    break;
                }
                this.f4821g[i14] = this.f4820f[i14];
                i14++;
            }
            Arrays.sort(this.f4821g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f4822h; i15++) {
                this.f4820f[i15] = this.f4821g[i15];
            }
        }
        solverVariable.f4776a = true;
        solverVariable.m2639a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m2685k(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f4822h) {
            if (this.f4820f[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f4822h;
                    if (i10 >= i11 - 1) {
                        this.f4822h = i11 - 1;
                        solverVariable.f4776a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f4820f;
                        int i12 = i10 + 1;
                        solverVariableArr[i10] = solverVariableArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.C0725b
    public final String toString() {
        String str = " goal -> (" + this.f4799b + ") : ";
        for (int i10 = 0; i10 < this.f4822h; i10++) {
            SolverVariable solverVariable = this.f4820f[i10];
            b bVar = this.f4823i;
            bVar.f4824a = solverVariable;
            str = str + bVar + " ";
        }
        return str;
    }
}
