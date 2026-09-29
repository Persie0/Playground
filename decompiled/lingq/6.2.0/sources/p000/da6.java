package p000;

import com.lingq.core.p012ui.LessonInfoSource;

/* JADX INFO: loaded from: classes2.dex */
public final class da6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final int f35296b;

    /* JADX INFO: renamed from: c */
    public final String f35297c;

    /* JADX INFO: renamed from: d */
    public final String f35298d;

    /* JADX INFO: renamed from: e */
    public final String f35299e;

    /* JADX INFO: renamed from: f */
    public final String f35300f;

    /* JADX INFO: renamed from: g */
    public final LessonInfoSource f35301g;

    /* JADX INFO: renamed from: h */
    public final String f35302h;

    public da6(int i, String str, String str2, String str3, String str4, LessonInfoSource lessonInfoSource, String str5) {
        str.getClass();
        lessonInfoSource.getClass();
        str5.getClass();
        this.f35296b = i;
        this.f35297c = str;
        this.f35298d = str2;
        this.f35299e = str3;
        this.f35300f = str4;
        this.f35301g = lessonInfoSource;
        this.f35302h = str5;
    }

    /* JADX INFO: renamed from: a */
    public final int m10173a() {
        return this.f35296b;
    }

    /* JADX INFO: renamed from: b */
    public final String m10174b() {
        return this.f35297c;
    }

    /* JADX INFO: renamed from: c */
    public final String m10175c() {
        return this.f35300f;
    }

    /* JADX INFO: renamed from: d */
    public final String m10176d() {
        return this.f35298d;
    }

    /* JADX INFO: renamed from: e */
    public final String m10177e() {
        return this.f35299e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da6)) {
            return false;
        }
        da6 da6Var = (da6) obj;
        return this.f35296b == da6Var.f35296b && fa4.m11650l(this.f35297c, da6Var.f35297c) && this.f35298d.equals(da6Var.f35298d) && this.f35299e.equals(da6Var.f35299e) && this.f35300f.equals(da6Var.f35300f) && this.f35301g == da6Var.f35301g && fa4.m11650l(this.f35302h, da6Var.f35302h);
    }

    /* JADX INFO: renamed from: f */
    public final String m10178f() {
        return this.f35302h;
    }

    /* JADX INFO: renamed from: g */
    public final LessonInfoSource m10179g() {
        return this.f35301g;
    }

    public final int hashCode() {
        return this.f35302h.hashCode() + ((this.f35301g.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f35296b) * 31, this.f35297c, 31), this.f35298d, 31), this.f35299e, 31), this.f35300f, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f35296b, "LessonInfo(contentId=", ", contentTitle=", this.f35297c, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f35298d, ", originalImageUrl=", this.f35299e, ", description=");
        sbM22995r.append(this.f35300f);
        sbM22995r.append(", source=");
        sbM22995r.append(this.f35301g);
        sbM22995r.append(", shelfCode=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f35302h, ")");
    }
}
