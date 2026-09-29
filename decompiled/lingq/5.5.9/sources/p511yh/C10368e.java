package p511yh;

import com.lingq.shared.network.result.ResultWord;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: yh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10368e {

    /* JADX INFO: renamed from: a */
    public final List<ResultWord> f52120a;

    public C10368e() {
        this(EmptyList.f38032a);
    }

    public C10368e(List<ResultWord> list) {
        C5207g.m11111f(list, "words");
        this.f52120a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10368e) && C5207g.m11106a(this.f52120a, ((C10368e) obj).f52120a);
    }

    public final int hashCode() {
        return this.f52120a.hashCode();
    }

    public final String toString() {
        return "ResultWords(words=" + this.f52120a + ")";
    }
}
