package p000;

import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final class ot7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final LessonWord f54969a;

    public ot7(LessonWord lessonWord) {
        lessonWord.getClass();
        this.f54969a = lessonWord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot7) && fa4.m11650l(this.f54969a, ((ot7) obj).f54969a);
    }

    public final int hashCode() {
        return this.f54969a.hashCode();
    }

    public final String toString() {
        return "VocabularyWordAdded(word=" + this.f54969a + ")";
    }
}
