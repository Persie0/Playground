package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class n42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f52312a;

    /* JADX INFO: renamed from: b */
    public final Integer f52313b;

    public n42(Integer num, String str) {
        this.f52312a = str;
        this.f52313b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n42)) {
            return false;
        }
        n42 n42Var = (n42) obj;
        return fa4.m11650l(this.f52312a, n42Var.f52312a) && fa4.m11650l(this.f52313b, n42Var.f52313b);
    }

    public final int hashCode() {
        String str = this.f52312a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f52313b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Playlist(language=" + this.f52312a + ", playlistId=" + this.f52313b + ")";
    }
}
