package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;

/* JADX INFO: loaded from: classes3.dex */
public final class ja6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final int f45347b;

    /* JADX INFO: renamed from: c */
    public final int f45348c;

    /* JADX INFO: renamed from: d */
    public final String f45349d;

    /* JADX INFO: renamed from: e */
    public final LqAnalyticsValues$LessonPath f45350e;

    public ja6(int i, int i2, String str, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath) {
        this.f45347b = i;
        this.f45348c = i2;
        this.f45349d = str;
        this.f45350e = lqAnalyticsValues$LessonPath;
    }

    /* JADX INFO: renamed from: a */
    public final int m14362a() {
        return this.f45348c;
    }

    /* JADX INFO: renamed from: b */
    public final String m14363b() {
        return this.f45349d;
    }

    /* JADX INFO: renamed from: c */
    public final int m14364c() {
        return this.f45347b;
    }

    /* JADX INFO: renamed from: d */
    public final LqAnalyticsValues$LessonPath m14365d() {
        return this.f45350e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja6)) {
            return false;
        }
        ja6 ja6Var = (ja6) obj;
        return this.f45347b == ja6Var.f45347b && this.f45348c == ja6Var.f45348c && this.f45349d.equals(ja6Var.f45349d) && this.f45350e.equals(ja6Var.f45350e);
    }

    public final int hashCode() {
        return (this.f45350e.hashCode() + ux5.m22980c(wq1.m24106b(this.f45348c, Integer.hashCode(this.f45347b) * 31, 31), this.f45349d, 31)) * 31;
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f45347b, this.f45348c, "Reader(contentId=", ", collectionId=", ", collectionTitle=");
        sbM22994q.append(this.f45349d);
        sbM22994q.append(", lessonPath=");
        sbM22994q.append(this.f45350e);
        sbM22994q.append(", navOptions=null)");
        return sbM22994q.toString();
    }
}
