package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vo2 {

    /* JADX INFO: renamed from: a */
    public final gh1 f65702a;

    /* JADX INFO: renamed from: b */
    public int f65703b;

    /* JADX INFO: renamed from: c */
    public int f65704c;

    /* JADX INFO: renamed from: d */
    public int f65705d;

    /* JADX INFO: renamed from: e */
    public int f65706e;

    public vo2(C3419on c3419on, long j) {
        String str = c3419on.f54604b;
        gh1 gh1Var = new gh1(1);
        gh1Var.f40792d = str;
        gh1Var.f40790b = -1;
        gh1Var.f40791c = -1;
        this.f65702a = gh1Var;
        this.f65703b = cx9.m9924f(j);
        this.f65704c = cx9.m9923e(j);
        this.f65705d = -1;
        this.f65706e = -1;
        int iM9924f = cx9.m9924f(j);
        int iM9923e = cx9.m9923e(j);
        if (iM9924f < 0 || iM9924f > str.length()) {
            ij6.m13949f(str.length(), ux5.m22998u("start (", iM9924f, ") offset is outside of text region "));
            throw null;
        }
        if (iM9923e < 0 || iM9923e > str.length()) {
            ij6.m13949f(str.length(), ux5.m22998u("end (", iM9923e, ") offset is outside of text region "));
            throw null;
        }
        if (iM9924f <= iM9923e) {
            return;
        }
        C3386nv.m17626m(wq1.m24115k("Do not set reversed range: ", iM9924f, iM9923e, " > "));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m23453a(int i, int i2) {
        long jM11127g = eh0.m11127g(i, i2);
        this.f65702a.m12640s(i, "", i2);
        long jM21985R = te1.m21985R(eh0.m11127g(this.f65703b, this.f65704c), jM11127g);
        m23460h(cx9.m9924f(jM21985R));
        m23459g(cx9.m9923e(jM21985R));
        int i3 = this.f65705d;
        if (i3 != -1) {
            long jM21985R2 = te1.m21985R(eh0.m11127g(i3, this.f65706e), jM11127g);
            if (cx9.m9921c(jM21985R2)) {
                this.f65705d = -1;
                this.f65706e = -1;
            } else {
                this.f65705d = cx9.m9924f(jM21985R2);
                this.f65706e = cx9.m9923e(jM21985R2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final char m23454b(int i) {
        gh1 gh1Var = this.f65702a;
        pj3 pj3Var = (pj3) gh1Var.f40793e;
        if (pj3Var != null && i >= gh1Var.f40790b) {
            int iM19198d = pj3Var.f56311b - pj3Var.m19198d();
            int i2 = gh1Var.f40790b;
            if (i >= iM19198d + i2) {
                return ((String) gh1Var.f40792d).charAt(i - ((iM19198d - gh1Var.f40791c) + i2));
            }
            int i3 = i - i2;
            int i4 = pj3Var.f56312c;
            char[] cArr = (char[]) pj3Var.f56314e;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + pj3Var.f56313d];
        }
        return ((String) gh1Var.f40792d).charAt(i);
    }

    /* JADX INFO: renamed from: c */
    public final cx9 m23455c() {
        int i = this.f65705d;
        if (i != -1) {
            return new cx9(eh0.m11127g(i, this.f65706e));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m23456d(int i, String str, int i2) {
        gh1 gh1Var = this.f65702a;
        if (i < 0 || i > gh1Var.m12627f()) {
            ij6.m13949f(gh1Var.m12627f(), ux5.m22998u("start (", i, ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > gh1Var.m12627f()) {
            ij6.m13949f(gh1Var.m12627f(), ux5.m22998u("end (", i2, ") offset is outside of text region "));
        } else {
            if (i > i2) {
                C3386nv.m17626m(wq1.m24115k("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            gh1Var.m12640s(i, str, i2);
            m23460h(str.length() + i);
            m23459g(str.length() + i);
            this.f65705d = -1;
            this.f65706e = -1;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23457e(int i, int i2) {
        gh1 gh1Var = this.f65702a;
        if (i < 0 || i > gh1Var.m12627f()) {
            ij6.m13949f(gh1Var.m12627f(), ux5.m22998u("start (", i, ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > gh1Var.m12627f()) {
            ij6.m13949f(gh1Var.m12627f(), ux5.m22998u("end (", i2, ") offset is outside of text region "));
        } else if (i >= i2) {
            C3386nv.m17626m(wq1.m24115k("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.f65705d = i;
            this.f65706e = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m23458f(int i, int i2) {
        gh1 gh1Var = this.f65702a;
        if (i < 0 || i > gh1Var.m12627f()) {
            ij6.m13949f(gh1Var.m12627f(), ux5.m22998u("start (", i, ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > gh1Var.m12627f()) {
            ij6.m13949f(gh1Var.m12627f(), ux5.m22998u("end (", i2, ") offset is outside of text region "));
        } else if (i > i2) {
            C3386nv.m17626m(wq1.m24115k("Do not set reversed range: ", i, i2, " > "));
        } else {
            m23460h(i);
            m23459g(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23459g(int i) {
        if (!(i >= 0)) {
            j54.m14288a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f65704c = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m23460h(int i) {
        if (!(i >= 0)) {
            j54.m14288a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f65703b = i;
    }

    public final String toString() {
        return this.f65702a.toString();
    }
}
