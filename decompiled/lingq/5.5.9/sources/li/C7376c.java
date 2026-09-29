package li;

import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: li.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7376c {

    /* JADX INFO: renamed from: a */
    public final List<TokenMeaning> f41165a;

    public C7376c() {
        this(EmptyList.f38032a);
    }

    public C7376c(List<TokenMeaning> list) {
        C5207g.m11111f(list, "popularMeanings");
        this.f41165a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7376c) && C5207g.m11106a(this.f41165a, ((C7376c) obj).f41165a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f41165a.hashCode();
    }

    public final String toString() {
        return "TokenPopularMeanings(popularMeanings=" + this.f41165a + ")";
    }
}
