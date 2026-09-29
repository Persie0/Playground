package p000;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;

/* JADX INFO: loaded from: classes2.dex */
public final class dx8 {

    /* JADX INFO: renamed from: a */
    public final int f36397a;

    /* JADX INFO: renamed from: b */
    public final String f36398b;

    /* JADX INFO: renamed from: c */
    public final LessonTranslationSentence f36399c;

    public dx8(int i, String str, LessonTranslationSentence lessonTranslationSentence) {
        str.getClass();
        this.f36397a = i;
        this.f36398b = str;
        this.f36399c = lessonTranslationSentence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx8)) {
            return false;
        }
        dx8 dx8Var = (dx8) obj;
        return this.f36397a == dx8Var.f36397a && fa4.m11650l(this.f36398b, dx8Var.f36398b) && this.f36399c.equals(dx8Var.f36399c);
    }

    public final int hashCode() {
        return this.f36399c.hashCode() + ux5.m22980c(Integer.hashCode(this.f36397a) * 31, this.f36398b, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f36397a, "SentenceListItem(index=", ", text=", this.f36398b, ", sentence=");
        sbM22995r.append(this.f36399c);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
