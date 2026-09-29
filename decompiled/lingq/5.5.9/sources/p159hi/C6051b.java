package p159hi;

import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: hi.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6051b {

    /* JADX INFO: renamed from: a */
    public final List<LessonStudySentence> f35734a;

    public C6051b() {
        this(EmptyList.f38032a);
    }

    public C6051b(List<LessonStudySentence> list) {
        C5207g.m11111f(list, "sentences");
        this.f35734a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6051b) && C5207g.m11106a(this.f35734a, ((C6051b) obj).f35734a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35734a.hashCode();
    }

    public final String toString() {
        return "LessonStudyParagraph(sentences=" + this.f35734a + ")";
    }
}
