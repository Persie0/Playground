package p000;

import com.lingq.core.domain.model.review.ReviewType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w0b {

    /* JADX INFO: renamed from: a */
    public final boolean f66188a;

    /* JADX INFO: renamed from: b */
    public final List f66189b;

    /* JADX INFO: renamed from: c */
    public final ReviewType f66190c;

    /* JADX INFO: renamed from: d */
    public final boolean f66191d;

    public w0b(boolean z, List list, ReviewType reviewType, boolean z2) {
        list.getClass();
        reviewType.getClass();
        this.f66188a = z;
        this.f66189b = list;
        this.f66190c = reviewType;
        this.f66191d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0b)) {
            return false;
        }
        w0b w0bVar = (w0b) obj;
        return this.f66188a == w0bVar.f66188a && fa4.m11650l(this.f66189b, w0bVar.f66189b) && this.f66190c == w0bVar.f66190c && this.f66191d == w0bVar.f66191d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66191d) + ((this.f66190c.hashCode() + ux5.m22979b(Boolean.hashCode(this.f66188a) * 31, 31, this.f66189b)) * 31);
    }

    public final String toString() {
        return "VocabularyReviewState(canReview=" + this.f66188a + ", terms=" + this.f66189b + ", reviewType=" + this.f66190c + ", shouldOpenFromDeepLink=" + this.f66191d + ")";
    }
}
