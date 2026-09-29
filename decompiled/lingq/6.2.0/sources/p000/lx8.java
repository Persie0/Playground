package p000;

import com.lingq.core.domain.model.lesson.LessonSentence;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lx8 {

    /* JADX INFO: renamed from: a */
    public final int f50255a;

    /* JADX INFO: renamed from: b */
    public final String f50256b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f50257c;

    /* JADX INFO: renamed from: d */
    public final LessonSentence f50258d;

    public lx8(int i, String str, ArrayList arrayList, LessonSentence lessonSentence) {
        this.f50255a = i;
        this.f50256b = str;
        this.f50257c = arrayList;
        this.f50258d = lessonSentence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx8)) {
            return false;
        }
        lx8 lx8Var = (lx8) obj;
        return this.f50255a == lx8Var.f50255a && this.f50256b.equals(lx8Var.f50256b) && this.f50257c.equals(lx8Var.f50257c) && this.f50258d.equals(lx8Var.f50258d);
    }

    public final int hashCode() {
        return this.f50258d.hashCode() + ((this.f50257c.hashCode() + ux5.m22980c(Integer.hashCode(this.f50255a) * 31, this.f50256b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f50255a, "SentenceParagraph(sentenceIndex=", ", text=", this.f50256b, ", tokens=");
        sbM22995r.append(this.f50257c);
        sbM22995r.append(", sentence=");
        sbM22995r.append(this.f50258d);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
