package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jo1 {

    /* JADX INFO: renamed from: a */
    public final int f45902a;

    /* JADX INFO: renamed from: b */
    public final String f45903b;

    /* JADX INFO: renamed from: c */
    public final String f45904c;

    /* JADX INFO: renamed from: d */
    public final String f45905d;

    /* JADX INFO: renamed from: e */
    public final String f45906e;

    /* JADX INFO: renamed from: f */
    public final String f45907f;

    /* JADX INFO: renamed from: g */
    public final String f45908g;

    public jo1(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        ux5.m22974A(str4, str5, str6);
        this.f45902a = i;
        this.f45903b = str;
        this.f45904c = str2;
        this.f45905d = str3;
        this.f45906e = str4;
        this.f45907f = str5;
        this.f45908g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo1)) {
            return false;
        }
        jo1 jo1Var = (jo1) obj;
        return this.f45902a == jo1Var.f45902a && this.f45903b.equals(jo1Var.f45903b) && this.f45904c.equals(jo1Var.f45904c) && this.f45905d.equals(jo1Var.f45905d) && fa4.m11650l(this.f45906e, jo1Var.f45906e) && fa4.m11650l(this.f45907f, jo1Var.f45907f) && fa4.m11650l(this.f45908g, jo1Var.f45908g);
    }

    public final int hashCode() {
        return this.f45908g.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f45902a) * 31, this.f45903b, 31), this.f45904c, 31), this.f45905d, 31), this.f45906e, 31), this.f45907f, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f45902a, "CourseItemNavigation(courseId=", ", courseTitle=", this.f45903b, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f45904c, ", originalImageUrl=", this.f45905d, ", shelfCode=");
        AbstractC3393o1.m17725C(sbM22995r, this.f45906e, ", shelfName=", this.f45907f, ", tab=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f45908g, ")");
    }
}
