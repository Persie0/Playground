package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.lesson.Lesson;

/* JADX INFO: loaded from: classes2.dex */
public final class tt7 extends zic {

    /* JADX INFO: renamed from: c */
    public final Lesson f62862c;

    /* JADX INFO: renamed from: d */
    public final String f62863d;

    /* JADX INFO: renamed from: e */
    public final LqAnalyticsValues$LessonPath f62864e;

    /* JADX INFO: renamed from: f */
    public final boolean f62865f;

    public tt7(Lesson lesson, String str, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, boolean z) {
        lesson.getClass();
        str.getClass();
        this.f62862c = lesson;
        this.f62863d = str;
        this.f62864e = lqAnalyticsValues$LessonPath;
        this.f62865f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt7)) {
            return false;
        }
        tt7 tt7Var = (tt7) obj;
        return fa4.m11650l(this.f62862c, tt7Var.f62862c) && fa4.m11650l(this.f62863d, tt7Var.f62863d) && fa4.m11650l(this.f62864e, tt7Var.f62864e) && this.f62865f == tt7Var.f62865f;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f62862c.hashCode() * 31, this.f62863d, 31);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f62864e;
        return Boolean.hashCode(this.f62865f) + ((iM22980c + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31);
    }

    public final String toString() {
        return "LessonOpened(lesson=" + this.f62862c + ", language=" + this.f62863d + ", lessonPath=" + this.f62864e + ", isSentenceMode=" + this.f62865f + ")";
    }
}
