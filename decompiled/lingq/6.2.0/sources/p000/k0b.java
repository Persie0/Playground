package p000;

import com.lingq.core.domain.model.review.ReviewType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k0b extends p0b {

    /* JADX INFO: renamed from: a */
    public final List f46522a;

    /* JADX INFO: renamed from: b */
    public final ReviewType f46523b;

    public k0b(List list, ReviewType reviewType) {
        list.getClass();
        reviewType.getClass();
        this.f46522a = list;
        this.f46523b = reviewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0b)) {
            return false;
        }
        k0b k0bVar = (k0b) obj;
        return fa4.m11650l(this.f46522a, k0bVar.f46522a) && this.f46523b == k0bVar.f46523b;
    }

    public final int hashCode() {
        return this.f46523b.hashCode() + (this.f46522a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenReview(terms=" + this.f46522a + ", reviewType=" + this.f46523b + ")";
    }
}
