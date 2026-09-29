package p000;

import com.lingq.core.p012ui.LessonInfoSource;

/* JADX INFO: loaded from: classes3.dex */
public final class s35 {

    /* JADX INFO: renamed from: a */
    public final int f60230a;

    /* JADX INFO: renamed from: b */
    public final String f60231b;

    /* JADX INFO: renamed from: c */
    public final String f60232c;

    /* JADX INFO: renamed from: d */
    public final String f60233d;

    /* JADX INFO: renamed from: e */
    public final String f60234e;

    /* JADX INFO: renamed from: f */
    public final LessonInfoSource f60235f;

    /* JADX INFO: renamed from: g */
    public final String f60236g;

    public s35(int i, String str, String str2, String str3, LessonInfoSource lessonInfoSource, String str4, int i2) {
        lessonInfoSource = (i2 & 32) != 0 ? LessonInfoSource.Library : lessonInfoSource;
        str4 = (i2 & 64) != 0 ? "" : str4;
        str.getClass();
        str2.getClass();
        lessonInfoSource.getClass();
        str4.getClass();
        this.f60230a = i;
        this.f60231b = str;
        this.f60232c = str2;
        this.f60233d = str3;
        this.f60234e = "";
        this.f60235f = lessonInfoSource;
        this.f60236g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s35)) {
            return false;
        }
        s35 s35Var = (s35) obj;
        return this.f60230a == s35Var.f60230a && fa4.m11650l(this.f60231b, s35Var.f60231b) && fa4.m11650l(this.f60232c, s35Var.f60232c) && fa4.m11650l(this.f60233d, s35Var.f60233d) && fa4.m11650l(this.f60234e, s35Var.f60234e) && this.f60235f == s35Var.f60235f && fa4.m11650l(this.f60236g, s35Var.f60236g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f60230a) * 31, this.f60231b, 31), this.f60232c, 31);
        String str = this.f60233d;
        return this.f60236g.hashCode() + ((this.f60235f.hashCode() + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f60234e, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f60230a, "LessonInfoParams(lessonId=", ", title=", this.f60231b, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f60232c, ", originalImageUrl=", this.f60233d, ", description=");
        sbM22995r.append(this.f60234e);
        sbM22995r.append(", source=");
        sbM22995r.append(this.f60235f);
        sbM22995r.append(", shelfCode=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f60236g, ")");
    }
}
