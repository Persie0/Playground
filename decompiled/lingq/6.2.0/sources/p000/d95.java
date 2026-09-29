package p000;

import com.lingq.core.domain.model.library.LibraryShelf;

/* JADX INFO: loaded from: classes.dex */
public final class d95 extends h95 {

    /* JADX INFO: renamed from: b */
    public final LibraryShelf f35217b;

    /* JADX INFO: renamed from: c */
    public final y59 f35218c;

    /* JADX INFO: renamed from: d */
    public final String f35219d;

    /* JADX WARN: Illegal instructions before constructor call */
    public d95(LibraryShelf libraryShelf, y59 y59Var) {
        String str = libraryShelf.f19496d;
        str.getClass();
        super(str);
        this.f35217b = libraryShelf;
        this.f35218c = y59Var;
        this.f35219d = str;
    }

    @Override // p000.h95
    /* JADX INFO: renamed from: a */
    public final String mo188a() {
        return this.f35219d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d95)) {
            return false;
        }
        d95 d95Var = (d95) obj;
        return this.f35217b.equals(d95Var.f35217b) && this.f35218c.equals(d95Var.f35218c) && this.f35219d.equals(d95Var.f35219d);
    }

    public final int hashCode() {
        return this.f35219d.hashCode() + ((this.f35218c.hashCode() + (this.f35217b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shelf(shelf=");
        sb.append(this.f35217b);
        sb.append(", state=");
        sb.append(this.f35218c);
        sb.append(", key=");
        return AbstractC3393o1.m17738m(sb, this.f35219d, ")");
    }
}
