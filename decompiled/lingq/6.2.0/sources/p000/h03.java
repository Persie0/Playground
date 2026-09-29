package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class h03 extends n03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f41603a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LikeLocation f41604b;

    public h03(LibraryItem libraryItem, LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation) {
        lqAnalyticsValues$LikeLocation.getClass();
        this.f41603a = libraryItem;
        this.f41604b = lqAnalyticsValues$LikeLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03Var = (h03) obj;
        return this.f41603a.equals(h03Var.f41603a) && this.f41604b == h03Var.f41604b;
    }

    public final int hashCode() {
        return this.f41604b.hashCode() + (Integer.hashCode(this.f41603a.f19426a) * 31);
    }

    public final String toString() {
        return "OnLessonLikeClicked(lesson=" + this.f41603a + ", location=" + this.f41604b + ")";
    }
}
