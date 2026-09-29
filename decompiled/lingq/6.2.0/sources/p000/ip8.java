package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;

/* JADX INFO: loaded from: classes3.dex */
public final class ip8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final int f44406a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LikeLocation f44407b;

    public ip8(int i, LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation) {
        lqAnalyticsValues$LikeLocation.getClass();
        this.f44406a = i;
        this.f44407b = lqAnalyticsValues$LikeLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip8)) {
            return false;
        }
        ip8 ip8Var = (ip8) obj;
        return this.f44406a == ip8Var.f44406a && this.f44407b == ip8Var.f44407b;
    }

    public final int hashCode() {
        return this.f44407b.hashCode() + (Integer.hashCode(this.f44406a) * 31);
    }

    public final String toString() {
        return "UpdateLessonLike(lessonId=" + this.f44406a + ", likeLocation=" + this.f44407b + ")";
    }
}
