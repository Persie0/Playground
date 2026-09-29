package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;

/* JADX INFO: loaded from: classes3.dex */
public final class s96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final int f60557b;

    /* JADX INFO: renamed from: c */
    public final String f60558c;

    /* JADX INFO: renamed from: d */
    public final LqAnalyticsValues$LessonPath f60559d;

    /* JADX INFO: renamed from: e */
    public final String f60560e;

    public s96(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f60557b = i;
        this.f60558c = str;
        this.f60559d = lqAnalyticsValues$LessonPath;
        this.f60560e = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m21169a() {
        return this.f60557b;
    }

    /* JADX INFO: renamed from: b */
    public final String m21170b() {
        return this.f60560e;
    }

    /* JADX INFO: renamed from: c */
    public final LqAnalyticsValues$LessonPath m21171c() {
        return this.f60559d;
    }

    /* JADX INFO: renamed from: d */
    public final String m21172d() {
        return this.f60558c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s96)) {
            return false;
        }
        s96 s96Var = (s96) obj;
        return this.f60557b == s96Var.f60557b && fa4.m11650l(this.f60558c, s96Var.f60558c) && fa4.m11650l(this.f60559d, s96Var.f60559d) && fa4.m11650l(this.f60560e, s96Var.f60560e);
    }

    public final int hashCode() {
        return this.f60560e.hashCode() + ((this.f60559d.hashCode() + ux5.m22980c(Integer.hashCode(this.f60557b) * 31, this.f60558c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f60557b, "Collection(collectionId=", ", shelfCode=", this.f60558c, ", lessonPath=");
        sbM22995r.append(this.f60559d);
        sbM22995r.append(", language=");
        sbM22995r.append(this.f60560e);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public /* synthetic */ s96(int i, String str, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath) {
        this(i, lqAnalyticsValues$LessonPath, str, "");
    }
}
