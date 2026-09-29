package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.Sort;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c61 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f9606a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f9607b;

    /* JADX INFO: renamed from: c */
    public final List f9608c;

    /* JADX INFO: renamed from: d */
    public final Sort f9609d;

    /* JADX INFO: renamed from: e */
    public final boolean f9610e;

    /* JADX INFO: renamed from: f */
    public final boolean f9611f;

    /* JADX INFO: renamed from: g */
    public final boolean f9612g;

    /* JADX INFO: renamed from: h */
    public final boolean f9613h;

    /* JADX INFO: renamed from: i */
    public final boolean f9614i;

    /* JADX INFO: renamed from: j */
    public final boolean f9615j;

    /* JADX INFO: renamed from: k */
    public final boolean f9616k;

    /* JADX INFO: renamed from: l */
    public final boolean f9617l;

    /* JADX INFO: renamed from: m */
    public final boolean f9618m;

    /* JADX INFO: renamed from: n */
    public final boolean f9619n;

    /* JADX INFO: renamed from: o */
    public final boolean f9620o;

    /* JADX INFO: renamed from: p */
    public final boolean f9621p;

    /* JADX INFO: renamed from: q */
    public final String f9622q;

    public c61(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, List list, Sort sort, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str) {
        list.getClass();
        sort.getClass();
        this.f9606a = libraryItem;
        this.f9607b = libraryItemCounter;
        this.f9608c = list;
        this.f9609d = sort;
        this.f9610e = z;
        this.f9611f = z2;
        this.f9612g = z3;
        this.f9613h = z4;
        this.f9614i = z5;
        this.f9615j = z6;
        this.f9616k = z7;
        this.f9617l = z8;
        this.f9618m = z9;
        this.f9619n = z10;
        this.f9620o = z11;
        this.f9621p = z12;
        this.f9622q = str;
    }

    /* JADX INFO: renamed from: a */
    public static c61 m4341a(c61 c61Var, LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, List list, Sort sort, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str, int i) {
        LibraryItem libraryItem2 = (i & 1) != 0 ? c61Var.f9606a : libraryItem;
        LibraryItemCounter libraryItemCounter2 = (i & 2) != 0 ? c61Var.f9607b : libraryItemCounter;
        List list2 = (i & 4) != 0 ? c61Var.f9608c : list;
        Sort sort2 = (i & 8) != 0 ? c61Var.f9609d : sort;
        boolean z13 = (i & 16) != 0 ? c61Var.f9610e : z;
        boolean z14 = (i & 32) != 0 ? c61Var.f9611f : z2;
        boolean z15 = (i & 64) != 0 ? c61Var.f9612g : z3;
        boolean z16 = (i & 128) != 0 ? c61Var.f9613h : z4;
        boolean z17 = (i & 256) != 0 ? c61Var.f9614i : z5;
        boolean z18 = (i & 512) != 0 ? c61Var.f9615j : z6;
        boolean z19 = (i & 1024) != 0 ? c61Var.f9616k : z7;
        boolean z20 = (i & 2048) != 0 ? c61Var.f9617l : z8;
        boolean z21 = (i & 4096) != 0 ? c61Var.f9618m : z9;
        boolean z22 = (i & 8192) != 0 ? c61Var.f9619n : z10;
        LibraryItem libraryItem3 = libraryItem2;
        boolean z23 = (i & 16384) != 0 ? c61Var.f9620o : z11;
        boolean z24 = (i & 32768) != 0 ? c61Var.f9621p : z12;
        String str2 = (i & 65536) != 0 ? c61Var.f9622q : str;
        c61Var.getClass();
        list2.getClass();
        sort2.getClass();
        return new c61(libraryItem3, libraryItemCounter2, list2, sort2, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c61)) {
            return false;
        }
        c61 c61Var = (c61) obj;
        return fa4.m11650l(this.f9606a, c61Var.f9606a) && fa4.m11650l(this.f9607b, c61Var.f9607b) && fa4.m11650l(this.f9608c, c61Var.f9608c) && this.f9609d == c61Var.f9609d && this.f9610e == c61Var.f9610e && this.f9611f == c61Var.f9611f && this.f9612g == c61Var.f9612g && this.f9613h == c61Var.f9613h && this.f9614i == c61Var.f9614i && this.f9615j == c61Var.f9615j && this.f9616k == c61Var.f9616k && this.f9617l == c61Var.f9617l && this.f9618m == c61Var.f9618m && this.f9619n == c61Var.f9619n && this.f9620o == c61Var.f9620o && this.f9621p == c61Var.f9621p && this.f9622q.equals(c61Var.f9622q);
    }

    public final int hashCode() {
        LibraryItem libraryItem = this.f9606a;
        int iHashCode = (libraryItem == null ? 0 : Integer.hashCode(libraryItem.f19426a)) * 31;
        LibraryItemCounter libraryItemCounter = this.f9607b;
        return this.f9622q.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f9609d.hashCode() + ux5.m22979b((iHashCode + (libraryItemCounter != null ? libraryItemCounter.hashCode() : 0)) * 31, 31, this.f9608c)) * 31, 31, this.f9610e), 31, this.f9611f), 31, this.f9612g), 31, this.f9613h), 31, this.f9614i), 31, this.f9615j), 31, this.f9616k), 31, this.f9617l), 31, this.f9618m), 31, this.f9619n), 31, this.f9620o), 31, this.f9621p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionContentState(course=");
        sb.append(this.f9606a);
        sb.append(", courseCounter=");
        sb.append(this.f9607b);
        sb.append(", lessons=");
        sb.append(this.f9608c);
        sb.append(", sort=");
        sb.append(this.f9609d);
        sb.append(", isAddedToContinueStudying=");
        wq1.m24101A(sb, this.f9610e, ", isDownloaded=", this.f9611f, ", isDownloading=");
        wq1.m24101A(sb, this.f9612g, ", isBuyingCourse=", this.f9613h, ", isExpanded=");
        wq1.m24101A(sb, this.f9614i, ", isLoadingCourse=", this.f9615j, ", isLoadingLessons=");
        wq1.m24101A(sb, this.f9616k, ", shouldShowNoContent=", this.f9617l, ", isAllLessonsTaken=");
        wq1.m24101A(sb, this.f9618m, ", isSomeLessonsTaken=", this.f9619n, ", isBlacklisted=");
        wq1.m24101A(sb, this.f9620o, ", isSubscribedToCourse=", this.f9621p, ", profileUsername=");
        return AbstractC3393o1.m17738m(sb, this.f9622q, ")");
    }
}
