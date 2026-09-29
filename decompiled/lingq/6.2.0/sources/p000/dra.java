package p000;

import com.lingq.core.domain.model.review.ReviewType;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dra extends qra {

    /* JADX INFO: renamed from: a */
    public final int f36117a;

    /* JADX INFO: renamed from: b */
    public final Set f36118b;

    /* JADX INFO: renamed from: c */
    public final ReviewType f36119c;

    public dra(int i, Set set, ReviewType reviewType) {
        reviewType.getClass();
        this.f36117a = i;
        this.f36118b = set;
        this.f36119c = reviewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dra)) {
            return false;
        }
        dra draVar = (dra) obj;
        return this.f36117a == draVar.f36117a && this.f36118b.equals(draVar.f36118b) && this.f36119c == draVar.f36119c;
    }

    public final int hashCode() {
        return this.f36119c.hashCode() + ((this.f36118b.hashCode() + (Integer.hashCode(this.f36117a) * 31)) * 31);
    }

    public final String toString() {
        return "ReviewSentence(sentenceIndex=" + this.f36117a + ", reviewTerms=" + this.f36118b + ", reviewType=" + this.f36119c + ")";
    }
}
