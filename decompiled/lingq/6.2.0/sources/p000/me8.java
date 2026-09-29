package p000;

import com.lingq.core.domain.model.lesson.LessonCard;

/* JADX INFO: loaded from: classes3.dex */
public final class me8 extends oe8 {

    /* JADX INFO: renamed from: a */
    public final vs3 f51212a;

    /* JADX INFO: renamed from: b */
    public final LessonCard f51213b;

    /* JADX INFO: renamed from: c */
    public final int f51214c;

    /* JADX INFO: renamed from: d */
    public final int f51215d;

    public me8(vs3 vs3Var, LessonCard lessonCard, int i, int i2) {
        vs3Var.getClass();
        this.f51212a = vs3Var;
        this.f51213b = lessonCard;
        this.f51214c = i;
        this.f51215d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me8)) {
            return false;
        }
        me8 me8Var = (me8) obj;
        return fa4.m11650l(this.f51212a, me8Var.f51212a) && this.f51213b.equals(me8Var.f51213b) && this.f51214c == me8Var.f51214c && this.f51215d == me8Var.f51215d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51215d) + wq1.m24106b(this.f51214c, (this.f51213b.hashCode() + (this.f51212a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TermStudied(colorScheme=" + this.f51212a + ", token=" + this.f51213b + ", resultCorrect=" + this.f51214c + ", resultIncorrect=" + this.f51215d + ")";
    }
}
