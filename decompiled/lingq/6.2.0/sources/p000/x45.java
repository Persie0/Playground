package p000;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x45 {

    /* JADX INFO: renamed from: a */
    public final Lesson f67754a;

    /* JADX INFO: renamed from: b */
    public final List f67755b;

    /* JADX INFO: renamed from: c */
    public final LessonBookmark f67756c;

    public x45(Lesson lesson, List list, LessonBookmark lessonBookmark) {
        lesson.getClass();
        list.getClass();
        this.f67754a = lesson;
        this.f67755b = list;
        this.f67756c = lessonBookmark;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x45)) {
            return false;
        }
        x45 x45Var = (x45) obj;
        return fa4.m11650l(this.f67754a, x45Var.f67754a) && fa4.m11650l(this.f67755b, x45Var.f67755b) && fa4.m11650l(this.f67756c, x45Var.f67756c);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(this.f67754a.hashCode() * 31, 31, this.f67755b);
        LessonBookmark lessonBookmark = this.f67756c;
        return iM22979b + (lessonBookmark == null ? 0 : lessonBookmark.hashCode());
    }

    public final String toString() {
        return "LessonLoadedData(lesson=" + this.f67754a + ", sentences=" + this.f67755b + ", bookmark=" + this.f67756c + ")";
    }
}
