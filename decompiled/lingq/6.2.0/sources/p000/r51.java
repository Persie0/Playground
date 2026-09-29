package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;

/* JADX INFO: loaded from: classes2.dex */
public final class r51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final h81 f58736a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LikeLocation f58737b;

    public r51(h81 h81Var, LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation) {
        h81Var.getClass();
        lqAnalyticsValues$LikeLocation.getClass();
        this.f58736a = h81Var;
        this.f58737b = lqAnalyticsValues$LikeLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r51)) {
            return false;
        }
        r51 r51Var = (r51) obj;
        return fa4.m11650l(this.f58736a, r51Var.f58736a) && this.f58737b == r51Var.f58737b;
    }

    public final int hashCode() {
        return this.f58737b.hashCode() + (this.f58736a.hashCode() * 31);
    }

    public final String toString() {
        return "OnLessonLikeClicked(item=" + this.f58736a + ", location=" + this.f58737b + ")";
    }
}
