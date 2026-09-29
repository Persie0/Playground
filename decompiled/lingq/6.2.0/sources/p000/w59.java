package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class w59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final x95 f66430a;

    /* JADX INFO: renamed from: b */
    public final LibraryItem f66431b;

    /* JADX INFO: renamed from: c */
    public final String f66432c;

    public w59(x95 x95Var, LibraryItem libraryItem) {
        String str = "playlist-" + libraryItem.f19426a;
        libraryItem.getClass();
        this.f66430a = x95Var;
        this.f66431b = libraryItem;
        this.f66432c = str;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f66432c;
    }

    /* JADX INFO: renamed from: b */
    public final LibraryItem m23766b() {
        return this.f66431b;
    }

    /* JADX INFO: renamed from: c */
    public final x95 m23767c() {
        return this.f66430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w59)) {
            return false;
        }
        w59 w59Var = (w59) obj;
        return fa4.m11650l(this.f66430a, w59Var.f66430a) && fa4.m11650l(this.f66431b, w59Var.f66431b) && fa4.m11650l(this.f66432c, w59Var.f66432c);
    }

    public final int hashCode() {
        return this.f66432c.hashCode() + wq1.m24106b(this.f66431b.f19426a, this.f66430a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(playlist=");
        sb.append(this.f66430a);
        sb.append(", item=");
        sb.append(this.f66431b);
        sb.append(", key=");
        return AbstractC3393o1.m17738m(sb, this.f66432c, ")");
    }
}
