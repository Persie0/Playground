package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;

/* JADX INFO: loaded from: classes2.dex */
public final class or8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f54788a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LikeLocation f54789b;

    public or8(uq8 uq8Var, LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation) {
        lqAnalyticsValues$LikeLocation.getClass();
        this.f54788a = uq8Var;
        this.f54789b = lqAnalyticsValues$LikeLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or8)) {
            return false;
        }
        or8 or8Var = (or8) obj;
        return this.f54788a.equals(or8Var.f54788a) && this.f54789b == or8Var.f54789b;
    }

    public final int hashCode() {
        return this.f54789b.hashCode() + (this.f54788a.hashCode() * 31);
    }

    public final String toString() {
        return "OnLessonLikeClicked(item=" + this.f54788a + ", location=" + this.f54789b + ")";
    }
}
