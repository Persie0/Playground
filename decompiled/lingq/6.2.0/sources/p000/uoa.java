package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uoa extends toa {

    /* JADX INFO: renamed from: H */
    public final float f64140H;

    /* JADX INFO: renamed from: I */
    public final float f64141I;

    /* JADX INFO: renamed from: a */
    public final String f64142a;

    /* JADX INFO: renamed from: b */
    public final List f64143b;

    /* JADX INFO: renamed from: c */
    public final int f64144c;

    /* JADX INFO: renamed from: d */
    public final vi0 f64145d;

    /* JADX INFO: renamed from: e */
    public final float f64146e;

    /* JADX INFO: renamed from: f */
    public final vi0 f64147f;

    /* JADX INFO: renamed from: g */
    public final float f64148g;

    /* JADX INFO: renamed from: h */
    public final float f64149h;

    /* JADX INFO: renamed from: i */
    public final int f64150i;

    /* JADX INFO: renamed from: j */
    public final int f64151j;

    /* JADX INFO: renamed from: k */
    public final float f64152k;

    /* JADX INFO: renamed from: l */
    public final float f64153l;

    public uoa(String str, List list, int i, vi0 vi0Var, float f, vi0 vi0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f64142a = str;
        this.f64143b = list;
        this.f64144c = i;
        this.f64145d = vi0Var;
        this.f64146e = f;
        this.f64147f = vi0Var2;
        this.f64148g = f2;
        this.f64149h = f3;
        this.f64150i = i2;
        this.f64151j = i3;
        this.f64152k = f4;
        this.f64153l = f5;
        this.f64140H = f6;
        this.f64141I = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uoa.class != obj.getClass()) {
            return false;
        }
        uoa uoaVar = (uoa) obj;
        return this.f64142a.equals(uoaVar.f64142a) && fa4.m11650l(this.f64145d, uoaVar.f64145d) && this.f64146e == uoaVar.f64146e && fa4.m11650l(this.f64147f, uoaVar.f64147f) && this.f64148g == uoaVar.f64148g && this.f64149h == uoaVar.f64149h && this.f64150i == uoaVar.f64150i && this.f64151j == uoaVar.f64151j && this.f64152k == uoaVar.f64152k && this.f64153l == uoaVar.f64153l && this.f64140H == uoaVar.f64140H && this.f64141I == uoaVar.f64141I && this.f64144c == uoaVar.f64144c && fa4.m11650l(this.f64143b, uoaVar.f64143b);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(this.f64142a.hashCode() * 31, 31, this.f64143b);
        vi0 vi0Var = this.f64145d;
        int iM24105a = wq1.m24105a((iM22979b + (vi0Var != null ? vi0Var.hashCode() : 0)) * 31, this.f64146e, 31);
        vi0 vi0Var2 = this.f64147f;
        return Integer.hashCode(this.f64144c) + wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24106b(this.f64151j, wq1.m24106b(this.f64150i, wq1.m24105a(wq1.m24105a((iM24105a + (vi0Var2 != null ? vi0Var2.hashCode() : 0)) * 31, this.f64148g, 31), this.f64149h, 31), 31), 31), this.f64152k, 31), this.f64153l, 31), this.f64140H, 31), this.f64141I, 31);
    }
}
