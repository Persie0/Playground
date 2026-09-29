package p181ii;

import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryShelf;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: ii.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6336e {

    /* JADX INFO: renamed from: a */
    public final String f36628a;

    /* JADX INFO: renamed from: b */
    public final LibraryShelf f36629b;

    /* JADX INFO: renamed from: c */
    public final LibraryContentType f36630c;

    /* JADX INFO: renamed from: d */
    public final int f36631d;

    /* JADX INFO: renamed from: e */
    public final boolean f36632e;

    /* JADX INFO: renamed from: f */
    public final int f36633f;

    /* JADX INFO: renamed from: g */
    public final String f36634g;

    public C6336e(String str, LibraryShelf libraryShelf, LibraryContentType libraryContentType, int i10, boolean z10, int i11, String str2) {
        C5207g.m11111f(libraryContentType, "contentType");
        C5207g.m11111f(str2, "apiUrl");
        this.f36628a = str;
        this.f36629b = libraryShelf;
        this.f36630c = libraryContentType;
        this.f36631d = i10;
        this.f36632e = z10;
        this.f36633f = i11;
        this.f36634g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6336e)) {
            return false;
        }
        C6336e c6336e = (C6336e) obj;
        if (C5207g.m11106a(this.f36628a, c6336e.f36628a) && C5207g.m11106a(this.f36629b, c6336e.f36629b) && this.f36630c == c6336e.f36630c && this.f36631d == c6336e.f36631d && this.f36632e == c6336e.f36632e && this.f36633f == c6336e.f36633f && C5207g.m11106a(this.f36634g, c6336e.f36634g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f36631d, (this.f36630c.hashCode() + ((this.f36629b.hashCode() + (this.f36628a.hashCode() * 31)) * 31)) * 31, 31);
        boolean z10 = this.f36632e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f36634g.hashCode() + C0009a.m16d(this.f36633f, (iM16d + r10) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibrarySelectableTab(title=");
        sb2.append(this.f36628a);
        sb2.append(", shelf=");
        sb2.append(this.f36629b);
        sb2.append(", contentType=");
        sb2.append(this.f36630c);
        sb2.append(", level=");
        sb2.append(this.f36631d);
        sb2.append(", isSelected=");
        sb2.append(this.f36632e);
        sb2.append(", index=");
        sb2.append(this.f36633f);
        sb2.append(", apiUrl=");
        return C0009a.m23l(sb2, this.f36634g, ")");
    }
}
