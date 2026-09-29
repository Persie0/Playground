package p000;

import com.lingq.core.domain.model.lesson.LessonPromotedCourse;

/* JADX INFO: loaded from: classes2.dex */
public final class tn7 {

    /* JADX INFO: renamed from: a */
    public final String f62571a;

    /* JADX INFO: renamed from: b */
    public final String f62572b;

    /* JADX INFO: renamed from: c */
    public final LessonPromotedCourse f62573c;

    public tn7(String str, String str2, LessonPromotedCourse lessonPromotedCourse) {
        lessonPromotedCourse.getClass();
        this.f62571a = str;
        this.f62572b = str2;
        this.f62573c = lessonPromotedCourse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn7)) {
            return false;
        }
        tn7 tn7Var = (tn7) obj;
        return this.f62571a.equals(tn7Var.f62571a) && this.f62572b.equals(tn7Var.f62572b) && fa4.m11650l(this.f62573c, tn7Var.f62573c);
    }

    public final int hashCode() {
        return this.f62573c.hashCode() + ux5.m22980c(this.f62571a.hashCode() * 31, this.f62572b, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("PromotedCourse(title=", this.f62571a, ", imageURL=", this.f62572b, ", lessonPromotedCourse=");
        sbM23000w.append(this.f62573c);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
