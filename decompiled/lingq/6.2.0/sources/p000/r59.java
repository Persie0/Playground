package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes.dex */
public final class r59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final d85 f58777a;

    /* JADX INFO: renamed from: b */
    public final jo1 f58778b;

    /* JADX INFO: renamed from: c */
    public final LibraryItemCounter f58779c;

    /* JADX INFO: renamed from: d */
    public final LibraryItem f58780d;

    /* JADX INFO: renamed from: e */
    public final String f58781e;

    public r59(d85 d85Var, jo1 jo1Var, LibraryItemCounter libraryItemCounter, LibraryItem libraryItem) {
        String str = "course-" + libraryItem.f19426a + jo1Var.f45906e + jo1Var.f45908g;
        libraryItem.getClass();
        this.f58777a = d85Var;
        this.f58778b = jo1Var;
        this.f58779c = libraryItemCounter;
        this.f58780d = libraryItem;
        this.f58781e = str;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f58781e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r59)) {
            return false;
        }
        r59 r59Var = (r59) obj;
        return fa4.m11650l(this.f58777a, r59Var.f58777a) && fa4.m11650l(this.f58778b, r59Var.f58778b) && fa4.m11650l(this.f58779c, r59Var.f58779c) && fa4.m11650l(this.f58780d, r59Var.f58780d) && fa4.m11650l(this.f58781e, r59Var.f58781e);
    }

    public final int hashCode() {
        int iHashCode = (this.f58778b.hashCode() + (this.f58777a.hashCode() * 31)) * 31;
        LibraryItemCounter libraryItemCounter = this.f58779c;
        return this.f58781e.hashCode() + wq1.m24106b(this.f58780d.f19426a, (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Course(course=");
        sb.append(this.f58777a);
        sb.append(", nav=");
        sb.append(this.f58778b);
        sb.append(", counter=");
        sb.append(this.f58779c);
        sb.append(", item=");
        sb.append(this.f58780d);
        sb.append(", key=");
        return AbstractC3393o1.m17738m(sb, this.f58781e, ")");
    }
}
