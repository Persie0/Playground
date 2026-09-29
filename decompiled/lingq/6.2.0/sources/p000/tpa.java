package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tpa {

    /* JADX INFO: renamed from: a */
    public final List f62706a;

    /* JADX INFO: renamed from: b */
    public final String f62707b;

    /* JADX INFO: renamed from: c */
    public final String f62708c;

    /* JADX INFO: renamed from: d */
    public final String f62709d;

    /* JADX INFO: renamed from: e */
    public final String f62710e;

    /* JADX INFO: renamed from: f */
    public final String f62711f;

    /* JADX INFO: renamed from: g */
    public final boolean f62712g;

    /* JADX INFO: renamed from: h */
    public final boolean f62713h;

    /* JADX INFO: renamed from: i */
    public final boolean f62714i;

    /* JADX INFO: renamed from: j */
    public final Integer f62715j;

    public tpa(List list, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, Integer num) {
        list.getClass();
        str5.getClass();
        this.f62706a = list;
        this.f62707b = str;
        this.f62708c = str2;
        this.f62709d = str3;
        this.f62710e = str4;
        this.f62711f = str5;
        this.f62712g = z;
        this.f62713h = z2;
        this.f62714i = z3;
        this.f62715j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpa)) {
            return false;
        }
        tpa tpaVar = (tpa) obj;
        return fa4.m11650l(this.f62706a, tpaVar.f62706a) && this.f62707b.equals(tpaVar.f62707b) && this.f62708c.equals(tpaVar.f62708c) && this.f62709d.equals(tpaVar.f62709d) && this.f62710e.equals(tpaVar.f62710e) && fa4.m11650l(this.f62711f, tpaVar.f62711f) && this.f62712g == tpaVar.f62712g && this.f62713h == tpaVar.f62713h && this.f62714i == tpaVar.f62714i && fa4.m11650l(this.f62715j, tpaVar.f62715j);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f62706a.hashCode() * 31, this.f62707b, 31), this.f62708c, 31), this.f62709d, 31), this.f62710e, 31), this.f62711f, 31), 31, this.f62712g), 31, this.f62713h), 31, this.f62714i);
        Integer num = this.f62715j;
        return iM12428e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoContentState(paragraphs=");
        sb.append(this.f62706a);
        sb.append(", videoUrl=");
        sb.append(this.f62707b);
        sb.append(", lessonTitle=");
        AbstractC3393o1.m17725C(sb, this.f62708c, ", courseTitle=", this.f62709d, ", imageUrl=");
        AbstractC3393o1.m17725C(sb, this.f62710e, ", language=", this.f62711f, ", isLoading=");
        wq1.m24101A(sb, this.f62712g, ", isRefreshing=", this.f62713h, ", isLessonComplete=");
        sb.append(this.f62714i);
        sb.append(", bookmarkParagraphIndex=");
        sb.append(this.f62715j);
        sb.append(")");
        return sb.toString();
    }
}
