package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s45 {

    /* JADX INFO: renamed from: a */
    public final int f60271a;

    /* JADX INFO: renamed from: b */
    public final String f60272b;

    /* JADX INFO: renamed from: c */
    public final int f60273c;

    /* JADX INFO: renamed from: d */
    public final String f60274d;

    /* JADX INFO: renamed from: e */
    public final String f60275e;

    /* JADX INFO: renamed from: f */
    public final String f60276f;

    /* JADX INFO: renamed from: g */
    public final String f60277g;

    /* JADX INFO: renamed from: h */
    public final String f60278h;

    /* JADX INFO: renamed from: i */
    public final boolean f60279i;

    /* JADX INFO: renamed from: j */
    public final y85 f60280j;

    /* JADX INFO: renamed from: k */
    public final String f60281k;

    /* JADX INFO: renamed from: l */
    public final List f60282l;

    /* JADX INFO: renamed from: m */
    public final String f60283m;

    public s45(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, y85 y85Var, String str7, List list, String str8) {
        ux5.m22975B(str, str3, str5, str6, str8);
        this.f60271a = i;
        this.f60272b = str;
        this.f60273c = i2;
        this.f60274d = str2;
        this.f60275e = str3;
        this.f60276f = str4;
        this.f60277g = str5;
        this.f60278h = str6;
        this.f60279i = z;
        this.f60280j = y85Var;
        this.f60281k = str7;
        this.f60282l = list;
        this.f60283m = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s45)) {
            return false;
        }
        s45 s45Var = (s45) obj;
        return this.f60271a == s45Var.f60271a && fa4.m11650l(this.f60272b, s45Var.f60272b) && this.f60273c == s45Var.f60273c && this.f60274d.equals(s45Var.f60274d) && fa4.m11650l(this.f60275e, s45Var.f60275e) && this.f60276f.equals(s45Var.f60276f) && fa4.m11650l(this.f60277g, s45Var.f60277g) && fa4.m11650l(this.f60278h, s45Var.f60278h) && this.f60279i == s45Var.f60279i && this.f60280j.equals(s45Var.f60280j) && this.f60281k.equals(s45Var.f60281k) && this.f60282l.equals(s45Var.f60282l) && fa4.m11650l(this.f60283m, s45Var.f60283m);
    }

    public final int hashCode() {
        return this.f60283m.hashCode() + ux5.m22979b(ux5.m22980c((this.f60280j.hashCode() + g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f60273c, ux5.m22980c(Integer.hashCode(this.f60271a) * 31, this.f60272b, 31), 31), this.f60274d, 31), this.f60275e, 31), this.f60276f, 31), this.f60277g, 31), this.f60278h, 31), 31, this.f60279i)) * 31, this.f60281k, 31), 31, this.f60282l);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f60271a, "LessonItemNavigation(lessonId=", ", lessonTitle=", this.f60272b, ", courseId=");
        hn1.m13361k(this.f60273c, ", courseTitle=", this.f60274d, ", imageUrl=", sbM22995r);
        AbstractC3393o1.m17725C(sbM22995r, this.f60275e, ", originalImageUrl=", this.f60276f, ", shelfCode=");
        AbstractC3393o1.m17725C(sbM22995r, this.f60277g, ", shelfName=", this.f60278h, ", isPremium=");
        sbM22995r.append(this.f60279i);
        sbM22995r.append(", importData=");
        sbM22995r.append(this.f60280j);
        sbM22995r.append(", sharedByName=");
        hn1.m13366p(this.f60281k, ", tags=", ", tab=", sbM22995r, this.f60282l);
        return AbstractC3393o1.m17738m(sbM22995r, this.f60283m, ")");
    }
}
