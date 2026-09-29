package p181ii;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ii.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6334c {

    /* JADX INFO: renamed from: a */
    public final int f36624a;

    /* JADX INFO: renamed from: b */
    public final boolean f36625b;

    /* JADX INFO: renamed from: c */
    public final int f36626c;

    public C6334c(int i10, int i11, boolean z10) {
        this.f36624a = i10;
        this.f36625b = z10;
        this.f36626c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6334c)) {
            return false;
        }
        C6334c c6334c = (C6334c) obj;
        if (this.f36624a == c6334c.f36624a && this.f36625b == c6334c.f36625b && this.f36626c == c6334c.f36626c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36624a) * 31;
        boolean z10 = this.f36625b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f36626c) + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryLessonAudioDownload(id=");
        sb2.append(this.f36624a);
        sb2.append(", isDownloaded=");
        sb2.append(this.f36625b);
        sb2.append(", downloadProgress=");
        return C0166e.m768o(sb2, this.f36626c, ")");
    }
}
