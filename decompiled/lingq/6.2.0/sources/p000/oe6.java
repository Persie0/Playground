package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;

/* JADX INFO: loaded from: classes2.dex */
public final class oe6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final int f54244a;

    /* JADX INFO: renamed from: b */
    public final String f54245b;

    /* JADX INFO: renamed from: c */
    public final String f54246c;

    /* JADX INFO: renamed from: d */
    public final LqAnalyticsValues$LessonPath f54247d;

    public oe6(int i, int i2, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str, String str2) {
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        lqAnalyticsValues$LessonPath = (i2 & 8) != 0 ? null : lqAnalyticsValues$LessonPath;
        this.f54244a = i;
        this.f54245b = str;
        this.f54246c = str2;
        this.f54247d = lqAnalyticsValues$LessonPath;
    }

    /* JADX INFO: renamed from: a */
    public final int m17948a() {
        return this.f54244a;
    }

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath m17949b() {
        return this.f54247d;
    }

    /* JADX INFO: renamed from: c */
    public final String m17950c() {
        return this.f54245b;
    }

    /* JADX INFO: renamed from: d */
    public final String m17951d() {
        return this.f54246c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe6)) {
            return false;
        }
        oe6 oe6Var = (oe6) obj;
        return this.f54244a == oe6Var.f54244a && fa4.m11650l(this.f54245b, oe6Var.f54245b) && fa4.m11650l(this.f54246c, oe6Var.f54246c) && fa4.m11650l(this.f54247d, oe6Var.f54247d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f54244a) * 31;
        String str = this.f54245b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54246c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f54247d;
        return iHashCode3 + (lqAnalyticsValues$LessonPath != null ? lqAnalyticsValues$LessonPath.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f54244a, "Lesson(lessonId=", ", medium=", this.f54245b, ", source=");
        sbM22995r.append(this.f54246c);
        sbM22995r.append(", lessonPath=");
        sbM22995r.append(this.f54247d);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
