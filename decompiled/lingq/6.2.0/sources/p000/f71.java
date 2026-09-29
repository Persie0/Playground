package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes2.dex */
public final class f71 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f38540a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f38541b;

    /* JADX INFO: renamed from: c */
    public final boolean f38542c;

    /* JADX INFO: renamed from: d */
    public final boolean f38543d;

    /* JADX INFO: renamed from: e */
    public final boolean f38544e;

    /* JADX INFO: renamed from: f */
    public final boolean f38545f;

    /* JADX INFO: renamed from: g */
    public final boolean f38546g;

    /* JADX INFO: renamed from: h */
    public final String f38547h;

    /* JADX INFO: renamed from: i */
    public final h81 f38548i;

    /* JADX INFO: renamed from: j */
    public final boolean f38549j;

    /* JADX INFO: renamed from: k */
    public final boolean f38550k;

    public f71(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, h81 h81Var, boolean z6, boolean z7) {
        libraryItem.getClass();
        libraryItemCounter.getClass();
        str.getClass();
        this.f38540a = libraryItem;
        this.f38541b = libraryItemCounter;
        this.f38542c = z;
        this.f38543d = z2;
        this.f38544e = z3;
        this.f38545f = z4;
        this.f38546g = z5;
        this.f38547h = str;
        this.f38548i = h81Var;
        this.f38549j = z6;
        this.f38550k = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f71)) {
            return false;
        }
        f71 f71Var = (f71) obj;
        return fa4.m11650l(this.f38540a, f71Var.f38540a) && fa4.m11650l(this.f38541b, f71Var.f38541b) && this.f38542c == f71Var.f38542c && this.f38543d == f71Var.f38543d && this.f38544e == f71Var.f38544e && this.f38545f == f71Var.f38545f && this.f38546g == f71Var.f38546g && fa4.m11650l(this.f38547h, f71Var.f38547h) && fa4.m11650l(this.f38548i, f71Var.f38548i) && this.f38549j == f71Var.f38549j && this.f38550k == f71Var.f38550k;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f38541b.hashCode() + (Integer.hashCode(this.f38540a.f19426a) * 31)) * 31, 31, this.f38542c), 31, this.f38543d), 31, this.f38544e), 31, this.f38545f), 31, this.f38546g), this.f38547h, 31);
        h81 h81Var = this.f38548i;
        return Boolean.hashCode(this.f38550k) + g9a.m12428e((iM22980c + (h81Var == null ? 0 : h81Var.hashCode())) * 31, 31, this.f38549j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfoState(course=");
        sb.append(this.f38540a);
        sb.append(", counter=");
        sb.append(this.f38541b);
        sb.append(", isAddedToContinueStudying=");
        wq1.m24101A(sb, this.f38542c, ", isDownloaded=", this.f38543d, ", isDownloading=");
        wq1.m24101A(sb, this.f38544e, ", isBuyingCourse=", this.f38545f, ", isExpanded=");
        hn1.m13367q(", shelfCode=", this.f38547h, ", startOrContinueLesson=", sb, this.f38546g);
        sb.append(this.f38548i);
        sb.append(", canSubscribe=");
        sb.append(this.f38549j);
        sb.append(", isSubscribed=");
        return AbstractC3393o1.m17740o(sb, this.f38550k, ")");
    }
}
