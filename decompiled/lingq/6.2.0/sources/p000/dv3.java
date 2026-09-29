package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;

/* JADX INFO: loaded from: classes3.dex */
public final class dv3 extends fv3 {

    /* JADX INFO: renamed from: a */
    public final int f36261a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f36262b;

    /* JADX INFO: renamed from: c */
    public final String f36263c = "";

    public dv3(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath) {
        this.f36261a = i;
        this.f36262b = lqAnalyticsValues$LessonPath;
    }

    /* JADX INFO: renamed from: a */
    public final int m10683a() {
        return this.f36261a;
    }

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath m10684b() {
        return this.f36262b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv3)) {
            return false;
        }
        dv3 dv3Var = (dv3) obj;
        return this.f36261a == dv3Var.f36261a && this.f36262b.equals(dv3Var.f36262b) && this.f36263c.equals(dv3Var.f36263c);
    }

    public final int hashCode() {
        return this.f36263c.hashCode() + ((this.f36262b.hashCode() + wq1.m24106b(0, Integer.hashCode(this.f36261a) * 31, 961)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigateToLesson(lessonId=");
        sb.append(this.f36261a);
        sb.append(", courseId=0, courseTitle=, lessonPath=");
        sb.append(this.f36262b);
        sb.append(", deeplinkLanguage=");
        return AbstractC3393o1.m17738m(sb, this.f36263c, ")");
    }
}
