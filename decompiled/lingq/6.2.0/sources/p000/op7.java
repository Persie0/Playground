package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes.dex */
public final class op7 {

    /* JADX INFO: renamed from: a */
    public final boolean f54688a;

    /* JADX INFO: renamed from: b */
    public final int f54689b;

    /* JADX INFO: renamed from: c */
    public final int f54690c;

    /* JADX INFO: renamed from: d */
    public final LibraryItem f54691d;

    public op7(boolean z, int i, int i2, LibraryItem libraryItem) {
        this.f54688a = z;
        this.f54689b = i;
        this.f54690c = i2;
        this.f54691d = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op7)) {
            return false;
        }
        op7 op7Var = (op7) obj;
        return this.f54688a == op7Var.f54688a && this.f54689b == op7Var.f54689b && this.f54690c == op7Var.f54690c && fa4.m11650l(this.f54691d, op7Var.f54691d);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f54690c, wq1.m24106b(this.f54689b, Boolean.hashCode(this.f54688a) * 31, 31), 31);
        LibraryItem libraryItem = this.f54691d;
        return iM24106b + (libraryItem == null ? 0 : Integer.hashCode(libraryItem.f19426a));
    }

    public final String toString() {
        return "PurchaseConfirmationDialogState(show=" + this.f54688a + ", price=" + this.f54689b + ", balance=" + this.f54690c + ", item=" + this.f54691d + ")";
    }

    public /* synthetic */ op7(int i) {
        this(false, 0, 0, null);
    }
}
