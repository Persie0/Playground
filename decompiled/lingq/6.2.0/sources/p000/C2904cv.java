package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: cv */
/* JADX INFO: loaded from: classes.dex */
public final class C2904cv {

    /* JADX INFO: renamed from: b */
    public final C3349mv f34587b;

    /* JADX INFO: renamed from: c */
    public final C3309ls f34588c;

    /* JADX INFO: renamed from: a */
    public int f34586a = 0;

    /* JADX INFO: renamed from: d */
    public int f34589d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f34590e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f34591f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f34592g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f34593h = -1;

    /* JADX INFO: renamed from: i */
    public int f34594i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f34595j = false;

    public C2904cv(C3349mv c3349mv, C3309ls c3309ls) {
        this.f34587b = c3349mv;
        this.f34588c = c3309ls;
    }

    /* JADX INFO: renamed from: a */
    public final void m9902a(rd9 rd9Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f34593h;
            C3349mv c3349mv = this.f34587b;
            if (i == -1) {
                this.f34593h = 0;
                this.f34592g[0] = f;
                this.f34590e[0] = rd9Var.f59127b;
                this.f34591f[0] = -1;
                rd9Var.f59137l++;
                rd9Var.m20589a(c3349mv);
                this.f34586a++;
                if (this.f34595j) {
                    return;
                }
                int i2 = this.f34594i + 1;
                this.f34594i = i2;
                int[] iArr = this.f34590e;
                if (i2 >= iArr.length) {
                    this.f34595j = true;
                    this.f34594i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f34586a; i4++) {
                int i5 = this.f34590e[i];
                int i6 = rd9Var.f59127b;
                if (i5 == i6) {
                    float[] fArr = this.f34592g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.f34593h;
                        int[] iArr2 = this.f34591f;
                        if (i == i7) {
                            this.f34593h = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            rd9Var.m20590b(c3349mv);
                        }
                        if (this.f34595j) {
                            this.f34594i = i;
                        }
                        rd9Var.f59137l--;
                        this.f34586a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f34591f[i];
            }
            int length = this.f34594i;
            int i8 = length + 1;
            if (this.f34595j) {
                int[] iArr3 = this.f34590e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f34590e;
            if (length >= iArr4.length && this.f34586a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f34590e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f34590e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f34589d * 2;
                this.f34589d = i10;
                this.f34595j = false;
                this.f34594i = length - 1;
                this.f34592g = Arrays.copyOf(this.f34592g, i10);
                this.f34590e = Arrays.copyOf(this.f34590e, this.f34589d);
                this.f34591f = Arrays.copyOf(this.f34591f, this.f34589d);
            }
            this.f34590e[length] = rd9Var.f59127b;
            this.f34592g[length] = f;
            int[] iArr7 = this.f34591f;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f34593h;
                this.f34593h = length;
            }
            rd9Var.f59137l++;
            rd9Var.m20589a(c3349mv);
            this.f34586a++;
            if (!this.f34595j) {
                this.f34594i++;
            }
            int i11 = this.f34594i;
            int[] iArr8 = this.f34590e;
            if (i11 >= iArr8.length) {
                this.f34595j = true;
                this.f34594i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9903b() {
        int i = this.f34593h;
        for (int i2 = 0; i != -1 && i2 < this.f34586a; i2++) {
            rd9 rd9Var = ((rd9[]) this.f34588c.f50066d)[this.f34590e[i]];
            if (rd9Var != null) {
                rd9Var.m20590b(this.f34587b);
            }
            i = this.f34591f[i];
        }
        this.f34593h = -1;
        this.f34594i = -1;
        this.f34595j = false;
        this.f34586a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m9904c(rd9 rd9Var) {
        int i = this.f34593h;
        for (int i2 = 0; i != -1 && i2 < this.f34586a; i2++) {
            if (this.f34590e[i] == rd9Var.f59127b) {
                return this.f34592g[i];
            }
            i = this.f34591f[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m9905d() {
        return this.f34586a;
    }

    /* JADX INFO: renamed from: e */
    public final rd9 m9906e(int i) {
        int i2 = this.f34593h;
        for (int i3 = 0; i2 != -1 && i3 < this.f34586a; i3++) {
            if (i3 == i) {
                return ((rd9[]) this.f34588c.f50066d)[this.f34590e[i2]];
            }
            i2 = this.f34591f[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m9907f(int i) {
        int i2 = this.f34593h;
        for (int i3 = 0; i2 != -1 && i3 < this.f34586a; i3++) {
            if (i3 == i) {
                return this.f34592g[i2];
            }
            i2 = this.f34591f[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m9908g(rd9 rd9Var, float f) {
        if (f == 0.0f) {
            m9909h(rd9Var, true);
            return;
        }
        int i = this.f34593h;
        C3349mv c3349mv = this.f34587b;
        if (i == -1) {
            this.f34593h = 0;
            this.f34592g[0] = f;
            this.f34590e[0] = rd9Var.f59127b;
            this.f34591f[0] = -1;
            rd9Var.f59137l++;
            rd9Var.m20589a(c3349mv);
            this.f34586a++;
            if (this.f34595j) {
                return;
            }
            int i2 = this.f34594i + 1;
            this.f34594i = i2;
            int[] iArr = this.f34590e;
            if (i2 >= iArr.length) {
                this.f34595j = true;
                this.f34594i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f34586a; i4++) {
            int i5 = this.f34590e[i];
            int i6 = rd9Var.f59127b;
            if (i5 == i6) {
                this.f34592g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f34591f[i];
        }
        int length = this.f34594i;
        int i7 = length + 1;
        if (this.f34595j) {
            int[] iArr2 = this.f34590e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f34590e;
        if (length >= iArr3.length && this.f34586a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f34590e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f34590e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f34589d * 2;
            this.f34589d = i9;
            this.f34595j = false;
            this.f34594i = length - 1;
            this.f34592g = Arrays.copyOf(this.f34592g, i9);
            this.f34590e = Arrays.copyOf(this.f34590e, this.f34589d);
            this.f34591f = Arrays.copyOf(this.f34591f, this.f34589d);
        }
        this.f34590e[length] = rd9Var.f59127b;
        this.f34592g[length] = f;
        int[] iArr6 = this.f34591f;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f34593h;
            this.f34593h = length;
        }
        rd9Var.f59137l++;
        rd9Var.m20589a(c3349mv);
        int i10 = this.f34586a + 1;
        this.f34586a = i10;
        if (!this.f34595j) {
            this.f34594i++;
        }
        int[] iArr7 = this.f34590e;
        if (i10 >= iArr7.length) {
            this.f34595j = true;
        }
        if (this.f34594i >= iArr7.length) {
            this.f34595j = true;
            this.f34594i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m9909h(rd9 rd9Var, boolean z) {
        int i = this.f34593h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f34586a) {
            if (this.f34590e[i] == rd9Var.f59127b) {
                int i4 = this.f34593h;
                int[] iArr = this.f34591f;
                if (i == i4) {
                    this.f34593h = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    rd9Var.m20590b(this.f34587b);
                }
                rd9Var.f59137l--;
                this.f34586a--;
                this.f34590e[i] = -1;
                if (this.f34595j) {
                    this.f34594i = i;
                }
                return this.f34592g[i];
            }
            i2++;
            i3 = i;
            i = this.f34591f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f34593h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f34586a; i2++) {
            StringBuilder sbM22997t = ux5.m22997t(wq1.m24121q(ux5.m22997t(string.concat(" -> ")), this.f34592g[i], " : "));
            sbM22997t.append(((rd9[]) this.f34588c.f50066d)[this.f34590e[i]]);
            string = sbM22997t.toString();
            i = this.f34591f[i];
        }
        return string;
    }
}
