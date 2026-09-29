package p000;

import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final class qja extends uja {

    /* JADX INFO: renamed from: a */
    public final LessonWord f57859a;

    public qja(LessonWord lessonWord) {
        lessonWord.getClass();
        this.f57859a = lessonWord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qja) && fa4.m11650l(this.f57859a, ((qja) obj).f57859a);
    }

    public final int hashCode() {
        return this.f57859a.hashCode();
    }

    public final String toString() {
        return "IgnoreWord(word=" + this.f57859a + ")";
    }
}
