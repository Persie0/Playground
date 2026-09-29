package p000;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oh4 {

    /* JADX INFO: renamed from: a */
    public final List f54339a;

    /* JADX INFO: renamed from: b */
    public final LessonTranslationSentence f54340b;

    /* JADX INFO: renamed from: c */
    public final boolean f54341c;

    /* JADX INFO: renamed from: d */
    public final boolean f54342d;

    /* JADX INFO: renamed from: e */
    public final boolean f54343e;

    /* JADX INFO: renamed from: f */
    public final int f54344f;

    /* JADX INFO: renamed from: g */
    public final hc7 f54345g;

    /* JADX INFO: renamed from: h */
    public final Double f54346h;

    /* JADX INFO: renamed from: i */
    public final String f54347i;

    /* JADX INFO: renamed from: j */
    public final boolean f54348j;

    /* JADX INFO: renamed from: k */
    public final int f54349k;

    public oh4(List list, LessonTranslationSentence lessonTranslationSentence, boolean z, boolean z2, boolean z3, int i, hc7 hc7Var, Double d, String str, boolean z4, int i2) {
        str.getClass();
        this.f54339a = list;
        this.f54340b = lessonTranslationSentence;
        this.f54341c = z;
        this.f54342d = z2;
        this.f54343e = z3;
        this.f54344f = i;
        this.f54345g = hc7Var;
        this.f54346h = d;
        this.f54347i = str;
        this.f54348j = z4;
        this.f54349k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh4)) {
            return false;
        }
        oh4 oh4Var = (oh4) obj;
        return fa4.m11650l(this.f54339a, oh4Var.f54339a) && fa4.m11650l(this.f54340b, oh4Var.f54340b) && this.f54341c == oh4Var.f54341c && this.f54342d == oh4Var.f54342d && this.f54343e == oh4Var.f54343e && this.f54344f == oh4Var.f54344f && fa4.m11650l(this.f54345g, oh4Var.f54345g) && fa4.m11650l(this.f54346h, oh4Var.f54346h) && fa4.m11650l(this.f54347i, oh4Var.f54347i) && this.f54348j == oh4Var.f54348j && this.f54349k == oh4Var.f54349k;
    }

    public final int hashCode() {
        int iHashCode = this.f54339a.hashCode() * 31;
        LessonTranslationSentence lessonTranslationSentence = this.f54340b;
        int iHashCode2 = (this.f54345g.hashCode() + wq1.m24106b(this.f54344f, g9a.m12428e(g9a.m12428e(g9a.m12428e((iHashCode + (lessonTranslationSentence == null ? 0 : lessonTranslationSentence.hashCode())) * 31, 31, this.f54341c), 31, this.f54342d), 31, this.f54343e), 31)) * 31;
        Double d = this.f54346h;
        return Integer.hashCode(this.f54349k) + g9a.m12428e(ux5.m22980c((iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, this.f54347i, 31), 31, this.f54348j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KaraokeUiState(sentences=");
        sb.append(this.f54339a);
        sb.append(", activeSentence=");
        sb.append(this.f54340b);
        sb.append(", isLoading=");
        wq1.m24101A(sb, this.f54341c, ", fromLesson=", this.f54342d, ", showVideo=");
        hn1.m13373w(sb, this.f54343e, ", fontSize=", this.f54344f, ", playerState=");
        sb.append(this.f54345g);
        sb.append(", progressForVideo=");
        sb.append(this.f54346h);
        sb.append(", language=");
        ux5.m22976C(this.f54347i, ", isDownloading=", ", downloadProgress=", sb, this.f54348j);
        return wq1.m24123s(sb, this.f54349k, ")");
    }
}
