package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes.dex */
public final class t59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final z85 f61884a;

    /* JADX INFO: renamed from: b */
    public final s45 f61885b;

    /* JADX INFO: renamed from: c */
    public final LibraryItemCounter f61886c;

    /* JADX INFO: renamed from: d */
    public final LibraryItem f61887d;

    /* JADX INFO: renamed from: e */
    public final String f61888e;

    public t59(z85 z85Var, s45 s45Var, LibraryItemCounter libraryItemCounter, LibraryItem libraryItem) {
        String str = "lesson-" + libraryItem.f19426a + s45Var.f60277g + s45Var.f60283m;
        libraryItem.getClass();
        this.f61884a = z85Var;
        this.f61885b = s45Var;
        this.f61886c = libraryItemCounter;
        this.f61887d = libraryItem;
        this.f61888e = str;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f61888e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t59)) {
            return false;
        }
        t59 t59Var = (t59) obj;
        return fa4.m11650l(this.f61884a, t59Var.f61884a) && fa4.m11650l(this.f61885b, t59Var.f61885b) && fa4.m11650l(this.f61886c, t59Var.f61886c) && fa4.m11650l(this.f61887d, t59Var.f61887d) && fa4.m11650l(this.f61888e, t59Var.f61888e);
    }

    public final int hashCode() {
        int iHashCode = (this.f61885b.hashCode() + (this.f61884a.hashCode() * 31)) * 31;
        LibraryItemCounter libraryItemCounter = this.f61886c;
        return this.f61888e.hashCode() + wq1.m24106b(this.f61887d.f19426a, (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lesson(lesson=");
        sb.append(this.f61884a);
        sb.append(", nav=");
        sb.append(this.f61885b);
        sb.append(", counter=");
        sb.append(this.f61886c);
        sb.append(", item=");
        sb.append(this.f61887d);
        sb.append(", key=");
        return AbstractC3393o1.m17738m(sb, this.f61888e, ")");
    }
}
