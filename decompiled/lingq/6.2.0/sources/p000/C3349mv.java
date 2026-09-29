package p000;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: mv */
/* JADX INFO: loaded from: classes.dex */
public class C3349mv {

    /* JADX INFO: renamed from: d */
    public final C2904cv f51873d;

    /* JADX INFO: renamed from: a */
    public rd9 f51870a = null;

    /* JADX INFO: renamed from: b */
    public float f51871b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f51872c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f51874e = false;

    public C3349mv(C3309ls c3309ls) {
        this.f51873d = new C2904cv(this, c3309ls);
    }

    /* JADX INFO: renamed from: a */
    public final void m17049a(gd5 gd5Var, int i) {
        rd9 rd9VarM12494j = gd5Var.m12494j(i);
        C2904cv c2904cv = this.f51873d;
        c2904cv.m9908g(rd9VarM12494j, 1.0f);
        c2904cv.m9908g(gd5Var.m12494j(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m17050b(rd9 rd9Var, rd9 rd9Var2, rd9 rd9Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f51871b = i;
        }
        C2904cv c2904cv = this.f51873d;
        if (z) {
            c2904cv.m9908g(rd9Var, 1.0f);
            c2904cv.m9908g(rd9Var2, -1.0f);
            c2904cv.m9908g(rd9Var3, -1.0f);
        } else {
            c2904cv.m9908g(rd9Var, -1.0f);
            c2904cv.m9908g(rd9Var2, 1.0f);
            c2904cv.m9908g(rd9Var3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17051c(rd9 rd9Var, rd9 rd9Var2, rd9 rd9Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f51871b = i;
        }
        C2904cv c2904cv = this.f51873d;
        if (z) {
            c2904cv.m9908g(rd9Var, 1.0f);
            c2904cv.m9908g(rd9Var2, -1.0f);
            c2904cv.m9908g(rd9Var3, 1.0f);
        } else {
            c2904cv.m9908g(rd9Var, -1.0f);
            c2904cv.m9908g(rd9Var2, 1.0f);
            c2904cv.m9908g(rd9Var3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public rd9 mo16325d(boolean[] zArr) {
        return m17052f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo16326e() {
        return this.f51870a == null && this.f51871b == 0.0f && this.f51873d.m9905d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final rd9 m17052f(boolean[] zArr, rd9 rd9Var) {
        SolverVariable$Type solverVariable$Type;
        C2904cv c2904cv = this.f51873d;
        int iM9905d = c2904cv.m9905d();
        rd9 rd9Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < iM9905d; i++) {
            float fM9907f = c2904cv.m9907f(i);
            if (fM9907f < 0.0f) {
                rd9 rd9VarM9906e = c2904cv.m9906e(i);
                if ((zArr == null || !zArr[rd9VarM9906e.f59127b]) && rd9VarM9906e != rd9Var && (((solverVariable$Type = rd9VarM9906e.f59134i) == SolverVariable$Type.SLACK || solverVariable$Type == SolverVariable$Type.ERROR) && fM9907f < f)) {
                    f = fM9907f;
                    rd9Var2 = rd9VarM9906e;
                }
            }
        }
        return rd9Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m17053g(rd9 rd9Var) {
        rd9 rd9Var2 = this.f51870a;
        C2904cv c2904cv = this.f51873d;
        if (rd9Var2 != null) {
            c2904cv.m9908g(rd9Var2, -1.0f);
            this.f51870a.f59128c = -1;
            this.f51870a = null;
        }
        float fM9909h = c2904cv.m9909h(rd9Var, true) * (-1.0f);
        this.f51870a = rd9Var;
        if (fM9909h == 1.0f) {
            return;
        }
        this.f51871b /= fM9909h;
        int i = c2904cv.f34593h;
        for (int i2 = 0; i != -1 && i2 < c2904cv.f34586a; i2++) {
            float[] fArr = c2904cv.f34592g;
            fArr[i] = fArr[i] / fM9909h;
            i = c2904cv.f34591f[i];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m17054h(gd5 gd5Var, rd9 rd9Var, boolean z) {
        if (rd9Var.f59131f) {
            C2904cv c2904cv = this.f51873d;
            float fM9904c = c2904cv.m9904c(rd9Var);
            this.f51871b = (rd9Var.f59130e * fM9904c) + this.f51871b;
            c2904cv.m9909h(rd9Var, z);
            if (z) {
                rd9Var.m20590b(this);
            }
            if (c2904cv.m9905d() == 0) {
                this.f51874e = true;
                gd5Var.f40572b = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo16327i(gd5 gd5Var, C3349mv c3349mv, boolean z) {
        C2904cv c2904cv = this.f51873d;
        c2904cv.getClass();
        float fM9904c = c2904cv.m9904c(c3349mv.f51870a);
        c2904cv.m9909h(c3349mv.f51870a, z);
        C2904cv c2904cv2 = c3349mv.f51873d;
        int iM9905d = c2904cv2.m9905d();
        for (int i = 0; i < iM9905d; i++) {
            rd9 rd9VarM9906e = c2904cv2.m9906e(i);
            c2904cv.m9902a(rd9VarM9906e, c2904cv2.m9904c(rd9VarM9906e) * fM9904c, z);
        }
        this.f51871b = (c3349mv.f51871b * fM9904c) + this.f51871b;
        if (z) {
            c3349mv.f51870a.m20590b(this);
        }
        if (this.f51870a == null || c2904cv.m9905d() != 0) {
            return;
        }
        this.f51874e = true;
        gd5Var.f40572b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.f51870a == null ? "0" : "" + this.f51870a).concat(" = ");
        if (this.f51871b != 0.0f) {
            StringBuilder sbM22997t = ux5.m22997t(strConcat);
            sbM22997t.append(this.f51871b);
            strConcat = sbM22997t.toString();
            z = true;
        } else {
            z = false;
        }
        C2904cv c2904cv = this.f51873d;
        int iM9905d = c2904cv.m9905d();
        for (int i = 0; i < iM9905d; i++) {
            rd9 rd9VarM9906e = c2904cv.m9906e(i);
            if (rd9VarM9906e != null) {
                float fM9907f = c2904cv.m9907f(i);
                if (fM9907f != 0.0f) {
                    String string = rd9VarM9906e.toString();
                    if (z) {
                        if (fM9907f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fM9907f *= -1.0f;
                        }
                    } else if (fM9907f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fM9907f *= -1.0f;
                    }
                    strConcat = fM9907f == 1.0f ? strConcat.concat(string) : strConcat + fM9907f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
