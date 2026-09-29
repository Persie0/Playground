package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;

/* JADX INFO: loaded from: classes.dex */
public final class o95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final s45 f54079a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath.Feed f54080b;

    public o95(s45 s45Var, LqAnalyticsValues$LessonPath.Feed feed) {
        s45Var.getClass();
        this.f54079a = s45Var;
        this.f54080b = feed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o95)) {
            return false;
        }
        o95 o95Var = (o95) obj;
        return fa4.m11650l(this.f54079a, o95Var.f54079a) && this.f54080b.equals(o95Var.f54080b);
    }

    public final int hashCode() {
        return this.f54080b.f14307a.hashCode() + (this.f54079a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToLesson(item=" + this.f54079a + ", lessonPath=" + this.f54080b + ")";
    }
}
