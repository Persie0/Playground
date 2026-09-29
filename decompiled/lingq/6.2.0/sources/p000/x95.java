package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class x95 {

    /* JADX INFO: renamed from: a */
    public final int f67975a;

    /* JADX INFO: renamed from: b */
    public final String f67976b;

    public x95(int i, String str) {
        this.f67975a = i;
        this.f67976b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x95)) {
            return false;
        }
        x95 x95Var = (x95) obj;
        return this.f67975a == x95Var.f67975a && this.f67976b.equals(x95Var.f67976b);
    }

    public final int hashCode() {
        return this.f67976b.hashCode() + (Integer.hashCode(this.f67975a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f67975a, "LibraryPlaylistItemState(playlistId=", ", title=", this.f67976b, ")");
    }
}
