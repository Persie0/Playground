package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes3.dex */
public final class pq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f56682a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f56683b;

    /* JADX INFO: renamed from: c */
    public final boolean f56684c;

    /* JADX INFO: renamed from: d */
    public final boolean f56685d;

    /* JADX INFO: renamed from: e */
    public final String f56686e;

    /* JADX INFO: renamed from: f */
    public final String f56687f;

    public pq8(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, boolean z, boolean z2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f56682a = libraryItem;
        this.f56683b = libraryItemCounter;
        this.f56684c = z;
        this.f56685d = z2;
        this.f56686e = str;
        this.f56687f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq8)) {
            return false;
        }
        pq8 pq8Var = (pq8) obj;
        return this.f56682a.equals(pq8Var.f56682a) && fa4.m11650l(this.f56683b, pq8Var.f56683b) && this.f56684c == pq8Var.f56684c && this.f56685d == pq8Var.f56685d && fa4.m11650l(this.f56686e, pq8Var.f56686e) && fa4.m11650l(this.f56687f, pq8Var.f56687f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f56682a.f19426a) * 31;
        LibraryItemCounter libraryItemCounter = this.f56683b;
        return this.f56687f.hashCode() + ux5.m22980c(g9a.m12428e(g9a.m12428e((iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31, 31, this.f56684c), 31, this.f56685d), this.f56686e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Course(course=");
        sb.append(this.f56682a);
        sb.append(", counter=");
        sb.append(this.f56683b);
        sb.append(", isDownloaded=");
        wq1.m24101A(sb, this.f56684c, ", isDownloading=", this.f56685d, ", shelfName=");
        return wq1.m24125u(sb, this.f56686e, ", shelfCode=", this.f56687f, ")");
    }
}
