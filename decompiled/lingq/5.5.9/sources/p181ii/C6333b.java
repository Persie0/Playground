package p181ii;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ii.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6333b {

    /* JADX INFO: renamed from: a */
    public final int f36621a;

    /* JADX INFO: renamed from: b */
    public final boolean f36622b;

    /* JADX INFO: renamed from: c */
    public final int f36623c;

    public C6333b(int i10, int i11, boolean z10) {
        this.f36621a = i10;
        this.f36622b = z10;
        this.f36623c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6333b)) {
            return false;
        }
        C6333b c6333b = (C6333b) obj;
        return this.f36621a == c6333b.f36621a && this.f36622b == c6333b.f36622b && this.f36623c == c6333b.f36623c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36621a) * 31;
        boolean z10 = this.f36622b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f36623c) + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryItemDownload(id=");
        sb2.append(this.f36621a);
        sb2.append(", isDownloaded=");
        sb2.append(this.f36622b);
        sb2.append(", downloadProgress=");
        return C0166e.m768o(sb2, this.f36623c, ")");
    }
}
