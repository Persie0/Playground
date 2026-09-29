package p000;

import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final class tja extends uja {

    /* JADX INFO: renamed from: a */
    public final LessonWord f62426a;

    public tja(LessonWord lessonWord) {
        lessonWord.getClass();
        this.f62426a = lessonWord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tja) && fa4.m11650l(this.f62426a, ((tja) obj).f62426a);
    }

    public final int hashCode() {
        return this.f62426a.hashCode();
    }

    public final String toString() {
        return "TokenClicked(word=" + this.f62426a + ")";
    }
}
