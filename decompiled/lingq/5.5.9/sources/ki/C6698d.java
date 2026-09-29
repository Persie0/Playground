package ki;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ki.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6698d {

    /* JADX INFO: renamed from: a */
    public final int f37875a;

    /* JADX INFO: renamed from: b */
    public final boolean f37876b;

    /* JADX INFO: renamed from: c */
    public final int f37877c;

    public C6698d(int i10, int i11, boolean z10) {
        this.f37875a = i10;
        this.f37876b = z10;
        this.f37877c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6698d)) {
            return false;
        }
        C6698d c6698d = (C6698d) obj;
        return this.f37875a == c6698d.f37875a && this.f37876b == c6698d.f37876b && this.f37877c == c6698d.f37877c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37875a) * 31;
        boolean z10 = this.f37876b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f37877c) + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaylistLessonDownload(id=");
        sb2.append(this.f37875a);
        sb2.append(", isDownloaded=");
        sb2.append(this.f37876b);
        sb2.append(", downloadProgress=");
        return C0166e.m768o(sb2, this.f37877c, ")");
    }
}
