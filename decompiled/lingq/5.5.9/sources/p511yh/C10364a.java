package p511yh;

import com.lingq.shared.network.result.ResultSentence;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: yh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10364a {

    /* JADX INFO: renamed from: a */
    public final List<ResultSentence> f52118a;

    public C10364a() {
        this(EmptyList.f38032a);
    }

    public C10364a(List<ResultSentence> list) {
        C5207g.m11111f(list, "sentences");
        this.f52118a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10364a) && C5207g.m11106a(this.f52118a, ((C10364a) obj).f52118a);
    }

    public final int hashCode() {
        return this.f52118a.hashCode();
    }

    public final String toString() {
        return "Paragraph(sentences=" + this.f52118a + ")";
    }
}
