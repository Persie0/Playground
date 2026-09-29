package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final ud7 f65193a;

    /* JADX INFO: renamed from: b */
    public final boolean f65194b;

    public vc7(ud7 ud7Var, boolean z) {
        this.f65193a = ud7Var;
        this.f65194b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc7)) {
            return false;
        }
        vc7 vc7Var = (vc7) obj;
        return this.f65193a.equals(vc7Var.f65193a) && this.f65194b == vc7Var.f65194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65194b) + (this.f65193a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPlaylistSelected(playlistLesson=" + this.f65193a + ", isDownloaded=" + this.f65194b + ")";
    }
}
