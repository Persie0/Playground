package p000;

import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final class nja extends uja {

    /* JADX INFO: renamed from: a */
    public final LessonWord f52857a;

    public nja(LessonWord lessonWord) {
        lessonWord.getClass();
        this.f52857a = lessonWord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nja) && fa4.m11650l(this.f52857a, ((nja) obj).f52857a);
    }

    public final int hashCode() {
        return this.f52857a.hashCode();
    }

    public final String toString() {
        return "AddMeaning(word=" + this.f52857a + ")";
    }
}
