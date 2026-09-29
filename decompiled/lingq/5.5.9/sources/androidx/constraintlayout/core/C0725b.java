package androidx.constraintlayout.core;

import android.support.v4.media.session.C0166e;
import java.util.ArrayList;
import p023b2.C1292a;

/* JADX INFO: renamed from: androidx.constraintlayout.core.b */
/* JADX INFO: loaded from: classes.dex */
public class C0725b implements C0726c.a {

    /* JADX INFO: renamed from: d */
    public a f4801d;

    /* JADX INFO: renamed from: a */
    public SolverVariable f4798a = null;

    /* JADX INFO: renamed from: b */
    public float f4799b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList<SolverVariable> f4800c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public boolean f4802e = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo2644a();

        /* JADX INFO: renamed from: b */
        boolean mo2645b(SolverVariable solverVariable);

        /* JADX INFO: renamed from: c */
        float mo2646c(C0725b c0725b, boolean z10);

        void clear();

        /* JADX INFO: renamed from: d */
        void mo2647d(SolverVariable solverVariable, float f3);

        /* JADX INFO: renamed from: e */
        SolverVariable mo2648e(int i10);

        /* JADX INFO: renamed from: f */
        void mo2649f(SolverVariable solverVariable, float f3, boolean z10);

        /* JADX INFO: renamed from: g */
        void mo2650g();

        /* JADX INFO: renamed from: h */
        float mo2651h(int i10);

        /* JADX INFO: renamed from: i */
        float mo2652i(SolverVariable solverVariable, boolean z10);

        /* JADX INFO: renamed from: j */
        float mo2653j(SolverVariable solverVariable);

        /* JADX INFO: renamed from: k */
        void mo2654k(float f3);
    }

    public C0725b() {
    }

    public C0725b(C1292a c1292a) {
        this.f4801d = new C0724a(this, c1292a);
    }

    @Override // androidx.constraintlayout.core.C0726c.a
    /* JADX INFO: renamed from: a */
    public SolverVariable mo2655a(boolean[] zArr) {
        return m2660f(zArr, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m2656b(C0726c c0726c, int i10) {
        this.f4801d.mo2647d(c0726c.m2674j(i10), 1.0f);
        this.f4801d.mo2647d(c0726c.m2674j(i10), -1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m2657c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f4799b = i10;
        }
        if (z10) {
            this.f4801d.mo2647d(solverVariable, 1.0f);
            this.f4801d.mo2647d(solverVariable2, -1.0f);
            this.f4801d.mo2647d(solverVariable3, -1.0f);
        } else {
            this.f4801d.mo2647d(solverVariable, -1.0f);
            this.f4801d.mo2647d(solverVariable2, 1.0f);
            this.f4801d.mo2647d(solverVariable3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2658d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f4799b = i10;
        }
        if (z10) {
            this.f4801d.mo2647d(solverVariable, 1.0f);
            this.f4801d.mo2647d(solverVariable2, -1.0f);
            this.f4801d.mo2647d(solverVariable3, 1.0f);
        } else {
            this.f4801d.mo2647d(solverVariable, -1.0f);
            this.f4801d.mo2647d(solverVariable2, 1.0f);
            this.f4801d.mo2647d(solverVariable3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2659e() {
        return this.f4798a == null && this.f4799b == 0.0f && this.f4801d.mo2644a() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final SolverVariable m2660f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iMo2644a = this.f4801d.mo2644a();
        SolverVariable solverVariable2 = null;
        float f3 = 0.0f;
        for (int i10 = 0; i10 < iMo2644a; i10++) {
            float fMo2651h = this.f4801d.mo2651h(i10);
            if (fMo2651h < 0.0f) {
                SolverVariable solverVariableMo2648e = this.f4801d.mo2648e(i10);
                if ((zArr == null || !zArr[solverVariableMo2648e.f4777b]) && solverVariableMo2648e != solverVariable && (((type = solverVariableMo2648e.f4784i) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fMo2651h < f3)) {
                    f3 = fMo2651h;
                    solverVariable2 = solverVariableMo2648e;
                }
            }
        }
        return solverVariable2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2661g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f4798a;
        if (solverVariable2 != null) {
            this.f4801d.mo2647d(solverVariable2, -1.0f);
            this.f4798a.f4778c = -1;
            this.f4798a = null;
        }
        float fMo2652i = this.f4801d.mo2652i(solverVariable, true) * (-1.0f);
        this.f4798a = solverVariable;
        if (fMo2652i == 1.0f) {
            return;
        }
        this.f4799b /= fMo2652i;
        this.f4801d.mo2654k(fMo2652i);
    }

    /* JADX INFO: renamed from: h */
    public final void m2662h(C0726c c0726c, SolverVariable solverVariable, boolean z10) {
        if (solverVariable != null) {
            if (!solverVariable.f4781f) {
                return;
            }
            float fMo2653j = this.f4801d.mo2653j(solverVariable);
            this.f4799b = (solverVariable.f4780e * fMo2653j) + this.f4799b;
            this.f4801d.mo2652i(solverVariable, z10);
            if (z10) {
                solverVariable.m2640f(this);
            }
            if (this.f4801d.mo2644a() == 0) {
                this.f4802e = true;
                c0726c.f4805a = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo2663i(C0726c c0726c, C0725b c0725b, boolean z10) {
        float fMo2646c = this.f4801d.mo2646c(c0725b, z10);
        this.f4799b = (c0725b.f4799b * fMo2646c) + this.f4799b;
        if (z10) {
            c0725b.f4798a.m2640f(this);
        }
        if (this.f4798a != null && this.f4801d.mo2644a() == 0) {
            this.f4802e = true;
            c0726c.f4805a = true;
        }
    }

    public String toString() {
        boolean z10;
        String strM765k = C0166e.m765k(this.f4798a == null ? "0" : "" + this.f4798a, " = ");
        if (this.f4799b != 0.0f) {
            StringBuilder sbM771r = C0166e.m771r(strM765k);
            sbM771r.append(this.f4799b);
            strM765k = sbM771r.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int iMo2644a = this.f4801d.mo2644a();
        for (int i10 = 0; i10 < iMo2644a; i10++) {
            SolverVariable solverVariableMo2648e = this.f4801d.mo2648e(i10);
            if (solverVariableMo2648e != null) {
                float fMo2651h = this.f4801d.mo2651h(i10);
                if (fMo2651h != 0.0f) {
                    String string = solverVariableMo2648e.toString();
                    if (z10) {
                        if (fMo2651h > 0.0f) {
                            strM765k = C0166e.m765k(strM765k, " + ");
                        } else {
                            strM765k = C0166e.m765k(strM765k, " - ");
                            fMo2651h *= -1.0f;
                        }
                    } else if (fMo2651h < 0.0f) {
                        strM765k = C0166e.m765k(strM765k, "- ");
                        fMo2651h *= -1.0f;
                    }
                    strM765k = fMo2651h == 1.0f ? C0166e.m765k(strM765k, string) : strM765k + fMo2651h + " " + string;
                    z10 = true;
                }
            }
        }
        if (!z10) {
            strM765k = C0166e.m765k(strM765k, "0.0");
        }
        return strM765k;
    }
}
