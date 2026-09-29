package p000;

import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final class rja extends uja {

    /* JADX INFO: renamed from: a */
    public final LessonWord f59416a;

    public rja(LessonWord lessonWord) {
        lessonWord.getClass();
        this.f59416a = lessonWord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rja) && fa4.m11650l(this.f59416a, ((rja) obj).f59416a);
    }

    public final int hashCode() {
        return this.f59416a.hashCode();
    }

    public final String toString() {
        return "PlayTts(token=" + this.f59416a + ")";
    }
}
