package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class lx7 extends mx7 {

    /* JADX INFO: renamed from: a */
    public final ReviewType f50251a;

    /* JADX INFO: renamed from: b */
    public final int f50252b;

    /* JADX INFO: renamed from: c */
    public final CardStatus f50253c;

    /* JADX INFO: renamed from: d */
    public final int f50254d;

    public lx7(int i, int i2, ReviewType reviewType, CardStatus cardStatus) {
        cardStatus.getClass();
        this.f50251a = reviewType;
        this.f50252b = i;
        this.f50253c = cardStatus;
        this.f50254d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx7)) {
            return false;
        }
        lx7 lx7Var = (lx7) obj;
        return this.f50251a == lx7Var.f50251a && this.f50252b == lx7Var.f50252b && this.f50253c == lx7Var.f50253c && this.f50254d == lx7Var.f50254d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50254d) + ((this.f50253c.hashCode() + wq1.m24106b(this.f50252b, this.f50251a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "NavigateReview(type=" + this.f50251a + ", lessonId=" + this.f50252b + ", statusUpper=" + this.f50253c + ", sentenceIndex=" + this.f50254d + ")";
    }
}
