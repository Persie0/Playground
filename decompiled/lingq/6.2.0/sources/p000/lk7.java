package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lk7 extends C3349mv {

    /* JADX INFO: renamed from: f */
    public rd9[] f49774f;

    /* JADX INFO: renamed from: g */
    public int f49775g;

    /* JADX INFO: renamed from: h */
    public fs6 f49776h;

    @Override // p000.C3349mv
    /* JADX INFO: renamed from: d */
    public final rd9 mo16325d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f49775g; i2++) {
            rd9[] rd9VarArr = this.f49774f;
            rd9 rd9Var = rd9VarArr[i2];
            if (!zArr[rd9Var.f59127b]) {
                fs6 fs6Var = this.f49776h;
                fs6Var.f39590b = rd9Var;
                int i3 = 8;
                if (i != -1) {
                    rd9 rd9Var2 = rd9VarArr[i];
                    while (i3 >= 0) {
                        float f = rd9Var2.f59133h[i3];
                        float f2 = ((rd9) fs6Var.f39590b).f59133h[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((rd9) fs6Var.f39590b).f59133h[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f49774f[i];
    }

    @Override // p000.C3349mv
    /* JADX INFO: renamed from: e */
    public final boolean mo16326e() {
        return this.f49775g == 0;
    }

    @Override // p000.C3349mv
    /* JADX INFO: renamed from: i */
    public final void mo16327i(gd5 gd5Var, C3349mv c3349mv, boolean z) {
        rd9 rd9Var = c3349mv.f51870a;
        if (rd9Var == null) {
            return;
        }
        float[] fArr = rd9Var.f59133h;
        C2904cv c2904cv = c3349mv.f51873d;
        int iM9905d = c2904cv.m9905d();
        for (int i = 0; i < iM9905d; i++) {
            rd9 rd9VarM9906e = c2904cv.m9906e(i);
            float fM9907f = c2904cv.m9907f(i);
            fs6 fs6Var = this.f49776h;
            fs6Var.f39590b = rd9VarM9906e;
            if (rd9VarM9906e.f59126a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((rd9) fs6Var.f39590b).f59133h;
                    float f = (fArr[i2] * fM9907f) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((rd9) fs6Var.f39590b).f59133h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((lk7) fs6Var.f39591c).m16329k((rd9) fs6Var.f39590b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM9907f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((rd9) fs6Var.f39590b).f59133h[i3] = f3;
                    } else {
                        ((rd9) fs6Var.f39590b).f59133h[i3] = 0.0f;
                    }
                }
                m16328j(rd9VarM9906e);
            }
            this.f51871b = (c3349mv.f51871b * fM9907f) + this.f51871b;
        }
        m16329k(rd9Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m16328j(rd9 rd9Var) {
        int i = this.f49775g + 1;
        rd9[] rd9VarArr = this.f49774f;
        if (i > rd9VarArr.length) {
            rd9[] rd9VarArr2 = (rd9[]) Arrays.copyOf(rd9VarArr, rd9VarArr.length * 2);
            this.f49774f = rd9VarArr2;
        }
        rd9[] rd9VarArr3 = this.f49774f;
        int i2 = this.f49775g;
        rd9VarArr3[i2] = rd9Var;
        int i3 = i2 + 1;
        this.f49775g = i3;
        if (i3 > 1) {
            int i4 = rd9Var.f59127b;
        }
        rd9Var.f59126a = true;
        rd9Var.m20589a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m16329k(rd9 rd9Var) {
        int i = 0;
        while (i < this.f49775g) {
            if (this.f49774f[i] == rd9Var) {
                while (true) {
                    int i2 = this.f49775g;
                    if (i >= i2 - 1) {
                        this.f49775g = i2 - 1;
                        rd9Var.f59126a = false;
                        return;
                    } else {
                        rd9[] rd9VarArr = this.f49774f;
                        int i3 = i + 1;
                        rd9VarArr[i] = rd9VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C3349mv
    public final String toString() {
        fs6 fs6Var = this.f49776h;
        String strM24121q = wq1.m24121q(new StringBuilder(" goal -> ("), this.f51871b, ") : ");
        for (int i = 0; i < this.f49775g; i++) {
            fs6Var.f39590b = this.f49774f[i];
            strM24121q = strM24121q + fs6Var + " ";
        }
        return strM24121q;
    }
}
