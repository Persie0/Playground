package p367rh;

import com.lingq.entity.RelatedPhrase;
import dm.C5207g;
import java.util.List;

/* JADX INFO: renamed from: rh.u */
/* JADX INFO: loaded from: classes.dex */
public final class C8807u {

    /* JADX INFO: renamed from: a */
    public final String f46681a;

    /* JADX INFO: renamed from: b */
    public final List<RelatedPhrase> f46682b;

    public C8807u(List list, String str) {
        C5207g.m11111f(str, "termWithLanguage");
        C5207g.m11111f(list, "relatedPhrases");
        this.f46681a = str;
        this.f46682b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8807u)) {
            return false;
        }
        C8807u c8807u = (C8807u) obj;
        if (C5207g.m11106a(this.f46681a, c8807u.f46681a) && C5207g.m11106a(this.f46682b, c8807u.f46682b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46682b.hashCode() + (this.f46681a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenAndRelatedPhrases(termWithLanguage=" + this.f46681a + ", relatedPhrases=" + this.f46682b + ")";
    }
}
