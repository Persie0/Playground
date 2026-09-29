package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import p023b2.C1292a;
import p023b2.C1293b;

/* JADX INFO: renamed from: androidx.constraintlayout.core.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0726c {

    /* JADX INFO: renamed from: p */
    public static boolean f4803p = false;

    /* JADX INFO: renamed from: q */
    public static int f4804q = 1000;

    /* JADX INFO: renamed from: c */
    public final C0727d f4807c;

    /* JADX INFO: renamed from: f */
    public C0725b[] f4810f;

    /* JADX INFO: renamed from: l */
    public final C1292a f4816l;

    /* JADX INFO: renamed from: o */
    public C0725b f4819o;

    /* JADX INFO: renamed from: a */
    public boolean f4805a = false;

    /* JADX INFO: renamed from: b */
    public int f4806b = 0;

    /* JADX INFO: renamed from: d */
    public int f4808d = 32;

    /* JADX INFO: renamed from: e */
    public int f4809e = 32;

    /* JADX INFO: renamed from: g */
    public boolean f4811g = false;

    /* JADX INFO: renamed from: h */
    public boolean[] f4812h = new boolean[32];

    /* JADX INFO: renamed from: i */
    public int f4813i = 1;

    /* JADX INFO: renamed from: j */
    public int f4814j = 0;

    /* JADX INFO: renamed from: k */
    public int f4815k = 32;

    /* JADX INFO: renamed from: m */
    public SolverVariable[] f4817m = new SolverVariable[f4804q];

    /* JADX INFO: renamed from: n */
    public int f4818n = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        SolverVariable mo2655a(boolean[] zArr);
    }

    public C0726c() {
        this.f4810f = null;
        this.f4810f = new C0725b[32];
        m2682s();
        C1292a c1292a = new C1292a(0);
        this.f4816l = c1292a;
        this.f4807c = new C0727d(c1292a);
        this.f4819o = new C0725b(c1292a);
    }

    /* JADX INFO: renamed from: n */
    public static int m2664n(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f4834i;
        if (solverVariable != null) {
            return (int) (solverVariable.f4780e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final SolverVariable m2665a(SolverVariable.Type type) {
        C1293b c1293b = (C1293b) this.f4816l.f8005c;
        int i10 = c1293b.f8007a;
        Object obj = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = (Object[]) c1293b.f8008b;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            c1293b.f8007a = i11;
            obj = obj2;
        }
        SolverVariable solverVariable = (SolverVariable) obj;
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f4784i = type;
        } else {
            solverVariable.m2641g();
            solverVariable.f4784i = type;
        }
        int i12 = this.f4818n;
        int i13 = f4804q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f4804q = i14;
            this.f4817m = (SolverVariable[]) Arrays.copyOf(this.f4817m, i14);
        }
        SolverVariable[] solverVariableArr = this.f4817m;
        int i15 = this.f4818n;
        this.f4818n = i15 + 1;
        solverVariableArr[i15] = solverVariable;
        return solverVariable;
    }

    /* JADX INFO: renamed from: b */
    public final void m2666b(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f3, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        C0725b c0725bM2676l = m2676l();
        if (solverVariable2 == solverVariable3) {
            c0725bM2676l.f4801d.mo2647d(solverVariable, 1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable4, 1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable2, -2.0f);
        } else if (f3 == 0.5f) {
            c0725bM2676l.f4801d.mo2647d(solverVariable, 1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable2, -1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable3, -1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                c0725bM2676l.f4799b = (-i10) + i11;
            }
        } else if (f3 <= 0.0f) {
            c0725bM2676l.f4801d.mo2647d(solverVariable, -1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable2, 1.0f);
            c0725bM2676l.f4799b = i10;
        } else if (f3 >= 1.0f) {
            c0725bM2676l.f4801d.mo2647d(solverVariable4, -1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable3, 1.0f);
            c0725bM2676l.f4799b = -i11;
        } else {
            float f10 = 1.0f - f3;
            c0725bM2676l.f4801d.mo2647d(solverVariable, f10 * 1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable2, f10 * (-1.0f));
            c0725bM2676l.f4801d.mo2647d(solverVariable3, (-1.0f) * f3);
            c0725bM2676l.f4801d.mo2647d(solverVariable4, 1.0f * f3);
            if (i10 > 0 || i11 > 0) {
                c0725bM2676l.f4799b = (i11 * f3) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            c0725bM2676l.m2656b(this, i12);
        }
        m2667c(c0725bM2676l);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX INFO: renamed from: c */
    public final void m2667c(C0725b c0725b) {
        boolean z10;
        boolean z11;
        boolean z12;
        SolverVariable solverVariableM2660f;
        ArrayList<SolverVariable> arrayList;
        boolean z13 = true;
        if (this.f4814j + 1 >= this.f4815k || this.f4813i + 1 >= this.f4809e) {
            m2678o();
        }
        if (c0725b.f4802e) {
            z10 = false;
        } else {
            if (this.f4810f.length != 0) {
                boolean z14 = false;
                while (!z14) {
                    int iMo2644a = c0725b.f4801d.mo2644a();
                    int i10 = 0;
                    while (true) {
                        arrayList = c0725b.f4800c;
                        if (i10 >= iMo2644a) {
                            break;
                        }
                        SolverVariable solverVariableMo2648e = c0725b.f4801d.mo2648e(i10);
                        if (solverVariableMo2648e.f4778c != -1 || solverVariableMo2648e.f4781f) {
                            arrayList.add(solverVariableMo2648e);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            SolverVariable solverVariable = arrayList.get(i11);
                            if (solverVariable.f4781f) {
                                c0725b.m2662h(this, solverVariable, true);
                            } else {
                                c0725b.mo2663i(this, this.f4810f[solverVariable.f4778c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z14 = true;
                    }
                }
                if (c0725b.f4798a != null && c0725b.f4801d.mo2644a() == 0) {
                    c0725b.f4802e = true;
                    this.f4805a = true;
                }
            }
            if (c0725b.mo2659e()) {
                return;
            }
            float f3 = c0725b.f4799b;
            if (f3 < 0.0f) {
                c0725b.f4799b = f3 * (-1.0f);
                c0725b.f4801d.mo2650g();
            }
            int iMo2644a2 = c0725b.f4801d.mo2644a();
            float f10 = 0.0f;
            float f11 = 0.0f;
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            boolean z15 = false;
            boolean z16 = false;
            for (int i12 = 0; i12 < iMo2644a2; i12++) {
                float fMo2651h = c0725b.f4801d.mo2651h(i12);
                SolverVariable solverVariableMo2648e2 = c0725b.f4801d.mo2648e(i12);
                if (solverVariableMo2648e2.f4784i == SolverVariable.Type.UNRESTRICTED) {
                    if (solverVariable2 == null) {
                        if (solverVariableMo2648e2.f4787l <= 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        solverVariable2 = solverVariableMo2648e2;
                        f10 = fMo2651h;
                    } else {
                        if (f10 > fMo2651h) {
                            if (solverVariableMo2648e2.f4787l > 1) {
                                z15 = false;
                            }
                            solverVariable2 = solverVariableMo2648e2;
                            f10 = fMo2651h;
                        } else if (!z15) {
                            if (solverVariableMo2648e2.f4787l <= 1) {
                            }
                        }
                        z15 = true;
                        solverVariable2 = solverVariableMo2648e2;
                        f10 = fMo2651h;
                    }
                } else if (solverVariable2 == null && fMo2651h < 0.0f) {
                    if (solverVariable3 == null) {
                        if (solverVariableMo2648e2.f4787l <= 1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        solverVariable3 = solverVariableMo2648e2;
                        f11 = fMo2651h;
                    } else {
                        if (f11 > fMo2651h) {
                            if (solverVariableMo2648e2.f4787l > 1) {
                                z16 = false;
                            }
                            solverVariable3 = solverVariableMo2648e2;
                            f11 = fMo2651h;
                        } else if (!z16) {
                            if (solverVariableMo2648e2.f4787l <= 1) {
                            }
                        }
                        z16 = true;
                        solverVariable3 = solverVariableMo2648e2;
                        f11 = fMo2651h;
                    }
                }
            }
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z11 = true;
            } else {
                c0725b.m2661g(solverVariable2);
                z11 = false;
            }
            if (c0725b.f4801d.mo2644a() == 0) {
                c0725b.f4802e = true;
            }
            if (z11) {
                if (this.f4813i + 1 >= this.f4809e) {
                    m2678o();
                }
                SolverVariable solverVariableM2665a = m2665a(SolverVariable.Type.SLACK);
                int i13 = this.f4806b + 1;
                this.f4806b = i13;
                this.f4813i++;
                solverVariableM2665a.f4777b = i13;
                C1292a c1292a = this.f4816l;
                ((SolverVariable[]) c1292a.f8006d)[i13] = solverVariableM2665a;
                c0725b.f4798a = solverVariableM2665a;
                int i14 = this.f4814j;
                m2672h(c0725b);
                if (this.f4814j == i14 + 1) {
                    C0725b c0725b2 = this.f4819o;
                    c0725b2.getClass();
                    c0725b2.f4798a = null;
                    c0725b2.f4801d.clear();
                    for (int i15 = 0; i15 < c0725b.f4801d.mo2644a(); i15++) {
                        c0725b2.f4801d.mo2649f(c0725b.f4801d.mo2648e(i15), c0725b.f4801d.mo2651h(i15), true);
                    }
                    m2681r(this.f4819o);
                    if (solverVariableM2665a.f4778c == -1) {
                        if (c0725b.f4798a == solverVariableM2665a && (solverVariableM2660f = c0725b.m2660f(null, solverVariableM2665a)) != null) {
                            c0725b.m2661g(solverVariableM2660f);
                        }
                        if (!c0725b.f4802e) {
                            c0725b.f4798a.m2643l(this, c0725b);
                        }
                        ((C1293b) c1292a.f8004b).m4797a(c0725b);
                        this.f4814j--;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            SolverVariable solverVariable4 = c0725b.f4798a;
            if (solverVariable4 == null || (solverVariable4.f4784i != SolverVariable.Type.UNRESTRICTED && c0725b.f4799b < 0.0f)) {
                z13 = false;
            }
            if (!z13) {
                return;
            } else {
                z10 = z12;
            }
        }
        if (z10) {
            return;
        }
        m2672h(c0725b);
    }

    /* JADX INFO: renamed from: d */
    public final void m2668d(SolverVariable solverVariable, int i10) {
        int i11 = solverVariable.f4778c;
        if (i11 == -1) {
            solverVariable.m2642i(this, i10);
            for (int i12 = 0; i12 < this.f4806b + 1; i12++) {
                SolverVariable solverVariable2 = ((SolverVariable[]) this.f4816l.f8006d)[i12];
            }
            return;
        }
        if (i11 == -1) {
            C0725b c0725bM2676l = m2676l();
            c0725bM2676l.f4798a = solverVariable;
            float f3 = i10;
            solverVariable.f4780e = f3;
            c0725bM2676l.f4799b = f3;
            c0725bM2676l.f4802e = true;
            m2667c(c0725bM2676l);
            return;
        }
        C0725b c0725b = this.f4810f[i11];
        if (c0725b.f4802e) {
            c0725b.f4799b = i10;
            return;
        }
        if (c0725b.f4801d.mo2644a() == 0) {
            c0725b.f4802e = true;
            c0725b.f4799b = i10;
            return;
        }
        C0725b c0725bM2676l2 = m2676l();
        if (i10 < 0) {
            c0725bM2676l2.f4799b = i10 * (-1);
            c0725bM2676l2.f4801d.mo2647d(solverVariable, 1.0f);
        } else {
            c0725bM2676l2.f4799b = i10;
            c0725bM2676l2.f4801d.mo2647d(solverVariable, -1.0f);
        }
        m2667c(c0725bM2676l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2669e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (i11 == 8 && solverVariable2.f4781f && solverVariable.f4778c == -1) {
            solverVariable.m2642i(this, solverVariable2.f4780e + i10);
            return;
        }
        C0725b c0725bM2676l = m2676l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            c0725bM2676l.f4799b = i10;
        }
        if (z10) {
            c0725bM2676l.f4801d.mo2647d(solverVariable, 1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable2, -1.0f);
        } else {
            c0725bM2676l.f4801d.mo2647d(solverVariable, -1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariable2, 1.0f);
        }
        if (i11 != 8) {
            c0725bM2676l.m2656b(this, i11);
        }
        m2667c(c0725bM2676l);
    }

    /* JADX INFO: renamed from: f */
    public final void m2670f(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        C0725b c0725bM2676l = m2676l();
        SolverVariable solverVariableM2677m = m2677m();
        solverVariableM2677m.f4779d = 0;
        c0725bM2676l.m2657c(solverVariable, solverVariable2, solverVariableM2677m, i10);
        if (i11 != 8) {
            c0725bM2676l.f4801d.mo2647d(m2674j(i11), (int) (c0725bM2676l.f4801d.mo2653j(solverVariableM2677m) * (-1.0f)));
        }
        m2667c(c0725bM2676l);
    }

    /* JADX INFO: renamed from: g */
    public final void m2671g(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        C0725b c0725bM2676l = m2676l();
        SolverVariable solverVariableM2677m = m2677m();
        solverVariableM2677m.f4779d = 0;
        c0725bM2676l.m2658d(solverVariable, solverVariable2, solverVariableM2677m, i10);
        if (i11 != 8) {
            c0725bM2676l.f4801d.mo2647d(m2674j(i11), (int) (c0725bM2676l.f4801d.mo2653j(solverVariableM2677m) * (-1.0f)));
        }
        m2667c(c0725bM2676l);
    }

    /* JADX INFO: renamed from: h */
    public final void m2672h(C0725b c0725b) {
        int i10;
        if (c0725b.f4802e) {
            c0725b.f4798a.m2642i(this, c0725b.f4799b);
        } else {
            C0725b[] c0725bArr = this.f4810f;
            int i11 = this.f4814j;
            c0725bArr[i11] = c0725b;
            SolverVariable solverVariable = c0725b.f4798a;
            solverVariable.f4778c = i11;
            this.f4814j = i11 + 1;
            solverVariable.m2643l(this, c0725b);
        }
        if (this.f4805a) {
            int i12 = 0;
            while (i12 < this.f4814j) {
                if (this.f4810f[i12] == null) {
                    System.out.println("WTF");
                }
                C0725b c0725b2 = this.f4810f[i12];
                if (c0725b2 != null && c0725b2.f4802e) {
                    c0725b2.f4798a.m2642i(this, c0725b2.f4799b);
                    ((C1293b) this.f4816l.f8004b).m4797a(c0725b2);
                    this.f4810f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f4814j;
                        if (i13 >= i10) {
                            break;
                        }
                        C0725b[] c0725bArr2 = this.f4810f;
                        int i15 = i13 - 1;
                        C0725b c0725b3 = c0725bArr2[i13];
                        c0725bArr2[i15] = c0725b3;
                        SolverVariable solverVariable2 = c0725b3.f4798a;
                        if (solverVariable2.f4778c == i13) {
                            solverVariable2.f4778c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f4810f[i14] = null;
                    }
                    this.f4814j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f4805a = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2673i() {
        for (int i10 = 0; i10 < this.f4814j; i10++) {
            C0725b c0725b = this.f4810f[i10];
            c0725b.f4798a.f4780e = c0725b.f4799b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final SolverVariable m2674j(int i10) {
        if (this.f4813i + 1 >= this.f4809e) {
            m2678o();
        }
        SolverVariable solverVariableM2665a = m2665a(SolverVariable.Type.ERROR);
        int i11 = this.f4806b + 1;
        this.f4806b = i11;
        this.f4813i++;
        solverVariableM2665a.f4777b = i11;
        solverVariableM2665a.f4779d = i10;
        ((SolverVariable[]) this.f4816l.f8006d)[i11] = solverVariableM2665a;
        C0727d c0727d = this.f4807c;
        c0727d.f4823i.f4824a = solverVariableM2665a;
        float[] fArr = solverVariableM2665a.f4783h;
        Arrays.fill(fArr, 0.0f);
        fArr[solverVariableM2665a.f4779d] = 1.0f;
        c0727d.m2684j(solverVariableM2665a);
        return solverVariableM2665a;
    }

    /* JADX INFO: renamed from: k */
    public final SolverVariable m2675k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f4813i + 1 >= this.f4809e) {
            m2678o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f4834i;
            if (solverVariable == null) {
                constraintAnchor.m2696k();
                solverVariable = constraintAnchor.f4834i;
            }
            int i10 = solverVariable.f4777b;
            C1292a c1292a = this.f4816l;
            if (i10 == -1 || i10 > this.f4806b || ((SolverVariable[]) c1292a.f8006d)[i10] == null) {
                if (i10 != -1) {
                    solverVariable.m2641g();
                }
                int i11 = this.f4806b + 1;
                this.f4806b = i11;
                this.f4813i++;
                solverVariable.f4777b = i11;
                solverVariable.f4784i = SolverVariable.Type.UNRESTRICTED;
                ((SolverVariable[]) c1292a.f8006d)[i11] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* JADX INFO: renamed from: l */
    public final C0725b m2676l() {
        Object obj;
        C1292a c1292a = this.f4816l;
        C1293b c1293b = (C1293b) c1292a.f8004b;
        int i10 = c1293b.f8007a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = (Object[]) c1293b.f8008b;
            obj = objArr[i11];
            objArr[i11] = null;
            c1293b.f8007a = i11;
        } else {
            obj = null;
        }
        C0725b c0725b = (C0725b) obj;
        if (c0725b == null) {
            return new C0725b(c1292a);
        }
        c0725b.f4798a = null;
        c0725b.f4801d.clear();
        c0725b.f4799b = 0.0f;
        c0725b.f4802e = false;
        return c0725b;
    }

    /* JADX INFO: renamed from: m */
    public final SolverVariable m2677m() {
        if (this.f4813i + 1 >= this.f4809e) {
            m2678o();
        }
        SolverVariable solverVariableM2665a = m2665a(SolverVariable.Type.SLACK);
        int i10 = this.f4806b + 1;
        this.f4806b = i10;
        this.f4813i++;
        solverVariableM2665a.f4777b = i10;
        ((SolverVariable[]) this.f4816l.f8006d)[i10] = solverVariableM2665a;
        return solverVariableM2665a;
    }

    /* JADX INFO: renamed from: o */
    public final void m2678o() {
        int i10 = this.f4808d * 2;
        this.f4808d = i10;
        this.f4810f = (C0725b[]) Arrays.copyOf(this.f4810f, i10);
        C1292a c1292a = this.f4816l;
        c1292a.f8006d = (SolverVariable[]) Arrays.copyOf((SolverVariable[]) c1292a.f8006d, this.f4808d);
        int i11 = this.f4808d;
        this.f4812h = new boolean[i11];
        this.f4809e = i11;
        this.f4815k = i11;
    }

    /* JADX INFO: renamed from: p */
    public final void m2679p() throws Exception {
        C0727d c0727d = this.f4807c;
        if (c0727d.mo2659e()) {
            m2673i();
            return;
        }
        if (!this.f4811g) {
            m2680q(c0727d);
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f4814j) {
                z10 = true;
                break;
            } else if (!this.f4810f[i10].f4802e) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            m2673i();
        } else {
            m2680q(c0727d);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2680q(C0727d c0727d) throws Exception {
        float f3;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f3 = 0.0f;
            i10 = 1;
            if (i11 >= this.f4814j) {
                z10 = false;
                break;
            }
            C0725b c0725b = this.f4810f[i11];
            if (c0725b.f4798a.f4784i != SolverVariable.Type.UNRESTRICTED && c0725b.f4799b < 0.0f) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f4814j) {
                    C0725b c0725b2 = this.f4810f[i15];
                    if (c0725b2.f4798a.f4784i != SolverVariable.Type.UNRESTRICTED && !c0725b2.f4802e && c0725b2.f4799b < f3) {
                        int iMo2644a = c0725b2.f4801d.mo2644a();
                        int i17 = 0;
                        while (i17 < iMo2644a) {
                            SolverVariable solverVariableMo2648e = c0725b2.f4801d.mo2648e(i17);
                            float fMo2653j = c0725b2.f4801d.mo2653j(solverVariableMo2648e);
                            if (fMo2653j > f3) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f11 = solverVariableMo2648e.f4782g[i18] / fMo2653j;
                                    if ((f11 < f10 && i18 == i16) || i18 > i16) {
                                        i14 = solverVariableMo2648e.f4777b;
                                        i16 = i18;
                                        f10 = f11;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f3 = 0.0f;
                        }
                    }
                    i15++;
                    f3 = 0.0f;
                }
                if (i13 != -1) {
                    C0725b c0725b3 = this.f4810f[i13];
                    c0725b3.f4798a.f4778c = -1;
                    c0725b3.m2661g(((SolverVariable[]) this.f4816l.f8006d)[i14]);
                    SolverVariable solverVariable = c0725b3.f4798a;
                    solverVariable.f4778c = i13;
                    solverVariable.m2643l(this, c0725b3);
                } else {
                    z11 = true;
                }
                if (i12 > this.f4813i / 2) {
                    z11 = true;
                }
                f3 = 0.0f;
                i10 = 1;
            }
        }
        m2681r(c0727d);
        m2673i();
    }

    /* JADX INFO: renamed from: r */
    public final void m2681r(C0725b c0725b) {
        for (int i10 = 0; i10 < this.f4813i; i10++) {
            this.f4812h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            while (!z10) {
                i11++;
                if (i11 >= this.f4813i * 2) {
                    return;
                }
                SolverVariable solverVariable = c0725b.f4798a;
                if (solverVariable != null) {
                    this.f4812h[solverVariable.f4777b] = true;
                }
                SolverVariable solverVariableMo2655a = c0725b.mo2655a(this.f4812h);
                if (solverVariableMo2655a != null) {
                    boolean[] zArr = this.f4812h;
                    int i12 = solverVariableMo2655a.f4777b;
                    if (zArr[i12]) {
                        return;
                    } else {
                        zArr[i12] = true;
                    }
                }
                if (solverVariableMo2655a != null) {
                    float f3 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f4814j; i14++) {
                        C0725b c0725b2 = this.f4810f[i14];
                        if (c0725b2.f4798a.f4784i != SolverVariable.Type.UNRESTRICTED && !c0725b2.f4802e) {
                            if (c0725b2.f4801d.mo2645b(solverVariableMo2655a)) {
                                float fMo2653j = c0725b2.f4801d.mo2653j(solverVariableMo2655a);
                                if (fMo2653j < 0.0f) {
                                    float f10 = (-c0725b2.f4799b) / fMo2653j;
                                    if (f10 < f3) {
                                        i13 = i14;
                                        f3 = f10;
                                    }
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        C0725b c0725b3 = this.f4810f[i13];
                        c0725b3.f4798a.f4778c = -1;
                        c0725b3.m2661g(solverVariableMo2655a);
                        SolverVariable solverVariable2 = c0725b3.f4798a;
                        solverVariable2.f4778c = i13;
                        solverVariable2.m2643l(this, c0725b3);
                    }
                } else {
                    z10 = true;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2682s() {
        for (int i10 = 0; i10 < this.f4814j; i10++) {
            C0725b c0725b = this.f4810f[i10];
            if (c0725b != null) {
                ((C1293b) this.f4816l.f8004b).m4797a(c0725b);
            }
            this.f4810f[i10] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2683t() {
        C1292a c1292a;
        int i10 = 0;
        while (true) {
            c1292a = this.f4816l;
            SolverVariable[] solverVariableArr = (SolverVariable[]) c1292a.f8006d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.m2641g();
            }
            i10++;
        }
        C1293b c1293b = (C1293b) c1292a.f8005c;
        SolverVariable[] solverVariableArr2 = this.f4817m;
        int length = this.f4818n;
        c1293b.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            SolverVariable solverVariable2 = solverVariableArr2[i11];
            int i12 = c1293b.f8007a;
            Object[] objArr = (Object[]) c1293b.f8008b;
            if (i12 < objArr.length) {
                objArr[i12] = solverVariable2;
                c1293b.f8007a = i12 + 1;
            }
        }
        this.f4818n = 0;
        Arrays.fill((SolverVariable[]) c1292a.f8006d, (Object) null);
        this.f4806b = 0;
        C0727d c0727d = this.f4807c;
        c0727d.f4822h = 0;
        c0727d.f4799b = 0.0f;
        this.f4813i = 1;
        for (int i13 = 0; i13 < this.f4814j; i13++) {
            C0725b c0725b = this.f4810f[i13];
        }
        m2682s();
        this.f4814j = 0;
        this.f4819o = new C0725b(c1292a);
    }
}
