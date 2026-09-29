package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class asa extends csa {

    /* JADX INFO: renamed from: a */
    public final int f7443a;

    /* JADX INFO: renamed from: b */
    public final CardStatus f7444b;

    /* JADX INFO: renamed from: c */
    public final ReviewType f7445c;

    /* JADX INFO: renamed from: d */
    public final int f7446d;

    public asa(int i, int i2, ReviewType reviewType, CardStatus cardStatus) {
        cardStatus.getClass();
        reviewType.getClass();
        this.f7443a = i;
        this.f7444b = cardStatus;
        this.f7445c = reviewType;
        this.f7446d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asa)) {
            return false;
        }
        asa asaVar = (asa) obj;
        return this.f7443a == asaVar.f7443a && this.f7444b == asaVar.f7444b && this.f7445c == asaVar.f7445c && this.f7446d == asaVar.f7446d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7446d) + ((this.f7445c.hashCode() + ((this.f7444b.hashCode() + (Integer.hashCode(this.f7443a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Review(lessonId=" + this.f7443a + ", statusUpper=" + this.f7444b + ", reviewType=" + this.f7445c + ", sentenceIndex=" + this.f7446d + ")";
    }
}
