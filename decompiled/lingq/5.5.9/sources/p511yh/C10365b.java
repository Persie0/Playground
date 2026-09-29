package p511yh;

import com.lingq.shared.network.result.ResultCard;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: yh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10365b {

    /* JADX INFO: renamed from: a */
    public final List<ResultCard> f52119a;

    public C10365b() {
        this(EmptyList.f38032a);
    }

    public C10365b(List<ResultCard> list) {
        C5207g.m11111f(list, "cards");
        this.f52119a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10365b) && C5207g.m11106a(this.f52119a, ((C10365b) obj).f52119a);
    }

    public final int hashCode() {
        return this.f52119a.hashCode();
    }

    public final String toString() {
        return "ResultCards(cards=" + this.f52119a + ")";
    }
}
