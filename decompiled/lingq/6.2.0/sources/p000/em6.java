package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes.dex */
public final class em6 {

    /* JADX INFO: renamed from: a */
    public final boolean f37456a;

    /* JADX INFO: renamed from: b */
    public final int f37457b;

    /* JADX INFO: renamed from: c */
    public final int f37458c;

    /* JADX INFO: renamed from: d */
    public final LibraryItem f37459d;

    public em6(boolean z, int i, int i2, LibraryItem libraryItem) {
        this.f37456a = z;
        this.f37457b = i;
        this.f37458c = i2;
        this.f37459d = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em6)) {
            return false;
        }
        em6 em6Var = (em6) obj;
        return this.f37456a == em6Var.f37456a && this.f37457b == em6Var.f37457b && this.f37458c == em6Var.f37458c && fa4.m11650l(this.f37459d, em6Var.f37459d);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f37458c, wq1.m24106b(this.f37457b, Boolean.hashCode(this.f37456a) * 31, 31), 31);
        LibraryItem libraryItem = this.f37459d;
        return iM24106b + (libraryItem == null ? 0 : Integer.hashCode(libraryItem.f19426a));
    }

    public final String toString() {
        return "NotEnoughBalanceDialogState(show=" + this.f37456a + ", price=" + this.f37457b + ", balance=" + this.f37458c + ", item=" + this.f37459d + ")";
    }

    public /* synthetic */ em6(int i) {
        this(false, 0, 0, null);
    }
}
