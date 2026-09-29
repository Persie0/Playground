package p367rh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: rh.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8798l {

    /* JADX INFO: renamed from: a */
    public final int f46652a;

    /* JADX INFO: renamed from: b */
    public final String f46653b;

    /* JADX INFO: renamed from: c */
    public final boolean f46654c;

    /* JADX INFO: renamed from: d */
    public final int f46655d;

    public C8798l(int i10, int i11, String str, boolean z10) {
        C5207g.m11111f(str, "language");
        this.f46652a = i10;
        this.f46653b = str;
        this.f46654c = z10;
        this.f46655d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8798l)) {
            return false;
        }
        C8798l c8798l = (C8798l) obj;
        if (this.f46652a == c8798l.f46652a && C5207g.m11106a(this.f46653b, c8798l.f46653b) && this.f46654c == c8798l.f46654c && this.f46655d == c8798l.f46655d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f46653b, Integer.hashCode(this.f46652a) * 31, 31);
        boolean z10 = this.f46654c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f46655d) + ((iM758d + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonAudioDownload(id=");
        sb2.append(this.f46652a);
        sb2.append(", language=");
        sb2.append(this.f46653b);
        sb2.append(", isDownloaded=");
        sb2.append(this.f46654c);
        sb2.append(", downloadProgress=");
        return C0166e.m768o(sb2, this.f46655d, ")");
    }
}
