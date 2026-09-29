package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes.dex */
public final class p68 {

    /* JADX INFO: renamed from: a */
    public final boolean f55660a;

    /* JADX INFO: renamed from: b */
    public final String f55661b;

    /* JADX INFO: renamed from: c */
    public final LibraryItem f55662c;

    public p68(boolean z, String str, LibraryItem libraryItem) {
        this.f55660a = z;
        this.f55661b = str;
        this.f55662c = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p68)) {
            return false;
        }
        p68 p68Var = (p68) obj;
        return this.f55660a == p68Var.f55660a && fa4.m11650l(this.f55661b, p68Var.f55661b) && fa4.m11650l(this.f55662c, p68Var.f55662c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Boolean.hashCode(this.f55660a) * 31, this.f55661b, 31);
        LibraryItem libraryItem = this.f55662c;
        return iM22980c + (libraryItem == null ? 0 : Integer.hashCode(libraryItem.f19426a));
    }

    public final String toString() {
        return "ReportDialogState(show=" + this.f55660a + ", itemTitle=" + this.f55661b + ", item=" + this.f55662c + ")";
    }

    public /* synthetic */ p68(int i) {
        this(false, "", null);
    }
}
