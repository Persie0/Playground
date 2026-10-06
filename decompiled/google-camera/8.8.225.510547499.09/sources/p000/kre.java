package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kre {

    /* JADX INFO: renamed from: a */
    public final long f37023a;

    /* JADX INFO: renamed from: b */
    public final long f37024b;

    /* JADX INFO: renamed from: c */
    public final long f37025c;

    /* JADX INFO: renamed from: d */
    private final long f37026d;

    /* JADX INFO: renamed from: e */
    private final String f37027e;

    /* JADX INFO: renamed from: f */
    private final String f37028f;

    /* JADX INFO: renamed from: g */
    private final String f37029g;

    public kre() {
    }

    public kre(long j, long j2, long j3, long j4, String str, String str2, String str3) {
        this.f37023a = j;
        this.f37024b = j2;
        this.f37025c = j3;
        this.f37026d = j4;
        this.f37027e = str;
        this.f37028f = str2;
        this.f37029g = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kre) {
            kre kreVar = (kre) obj;
            if (this.f37023a == kreVar.f37023a && this.f37024b == kreVar.f37024b && this.f37025c == kreVar.f37025c && this.f37026d == kreVar.f37026d && this.f37027e.equals(kreVar.f37027e) && this.f37028f.equals(kreVar.f37028f) && this.f37029g.equals(kreVar.f37029g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f37023a;
        long j2 = this.f37024b;
        long j3 = this.f37025c;
        long j4 = this.f37026d;
        return ((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f37027e.hashCode()) * 1000003) ^ this.f37028f.hashCode()) * 1000003) ^ this.f37029g.hashCode();
    }

    public final String toString() {
        return "TemporaryMediaFileInfo{groupTimestampNs=" + this.f37023a + xPAWq.xtZeoJUIxrRzE + this.f37024b + ", timestampNs=" + this.f37025c + ", utcTimestampMs=" + this.f37026d + ", groupTag=" + this.f37027e + ", tag=" + this.f37028f + ", extension=" + this.f37029g + "}";
    }
}
