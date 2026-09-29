package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class mx8 {

    /* JADX INFO: renamed from: a */
    public final ReviewType f51998a;

    /* JADX INFO: renamed from: b */
    public final CardStatus f51999b;

    /* JADX INFO: renamed from: c */
    public final int f52000c;

    public mx8(ReviewType reviewType, CardStatus cardStatus, int i) {
        reviewType.getClass();
        cardStatus.getClass();
        this.f51998a = reviewType;
        this.f51999b = cardStatus;
        this.f52000c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx8)) {
            return false;
        }
        mx8 mx8Var = (mx8) obj;
        return this.f51998a == mx8Var.f51998a && this.f51999b == mx8Var.f51999b && this.f52000c == mx8Var.f52000c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52000c) + ((this.f51999b.hashCode() + (this.f51998a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentenceReviewRequest(reviewType=");
        sb.append(this.f51998a);
        sb.append(", statusUpper=");
        sb.append(this.f51999b);
        sb.append(", sentenceIndex=");
        return wq1.m24123s(sb, this.f52000c, ")");
    }
}
