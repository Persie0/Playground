package li;

import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: li.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7377d {

    /* JADX INFO: renamed from: a */
    public final List<TokenRelatedPhrase> f41166a;

    public C7377d() {
        this(EmptyList.f38032a);
    }

    public C7377d(List<TokenRelatedPhrase> list) {
        C5207g.m11111f(list, "relatedPhrases");
        this.f41166a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7377d) && C5207g.m11106a(this.f41166a, ((C7377d) obj).f41166a);
    }

    public final int hashCode() {
        return this.f41166a.hashCode();
    }

    public final String toString() {
        return "TokenRelatedPhrases(relatedPhrases=" + this.f41166a + ")";
    }
}
