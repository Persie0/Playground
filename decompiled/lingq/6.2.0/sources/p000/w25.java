package p000;

import com.lingq.core.p012ui.LessonInfoSource;

/* JADX INFO: loaded from: classes3.dex */
public final class w25 {
    public static final v25 Companion = new v25();

    /* JADX INFO: renamed from: a */
    public final int f66282a;

    /* JADX INFO: renamed from: b */
    public final String f66283b;

    /* JADX INFO: renamed from: c */
    public final String f66284c;

    /* JADX INFO: renamed from: d */
    public final String f66285d;

    /* JADX INFO: renamed from: e */
    public final String f66286e;

    /* JADX INFO: renamed from: f */
    public final LessonInfoSource f66287f;

    /* JADX INFO: renamed from: g */
    public final String f66288g;

    public w25(int i, String str, String str2, String str3, String str4, LessonInfoSource lessonInfoSource, String str5) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        lessonInfoSource.getClass();
        str5.getClass();
        this.f66282a = i;
        this.f66283b = str;
        this.f66284c = str2;
        this.f66285d = str3;
        this.f66286e = str4;
        this.f66287f = lessonInfoSource;
        this.f66288g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w25)) {
            return false;
        }
        w25 w25Var = (w25) obj;
        return this.f66282a == w25Var.f66282a && fa4.m11650l(this.f66283b, w25Var.f66283b) && fa4.m11650l(this.f66284c, w25Var.f66284c) && fa4.m11650l(this.f66285d, w25Var.f66285d) && fa4.m11650l(this.f66286e, w25Var.f66286e) && this.f66287f == w25Var.f66287f && fa4.m11650l(this.f66288g, w25Var.f66288g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f66282a) * 31, this.f66283b, 31), this.f66284c, 31);
        String str = this.f66285d;
        return this.f66288g.hashCode() + ((this.f66287f.hashCode() + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f66286e, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f66282a, "LessonInfoArgs(lessonId=", ", title=", this.f66283b, ", imageURL=");
        AbstractC3393o1.m17725C(sbM22995r, this.f66284c, ", originalImageUrl=", this.f66285d, ", description=");
        sbM22995r.append(this.f66286e);
        sbM22995r.append(", from=");
        sbM22995r.append(this.f66287f);
        sbM22995r.append(", shelfCode=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f66288g, ")");
    }
}
