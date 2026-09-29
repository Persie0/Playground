package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class sx4 {

    /* JADX INFO: renamed from: a */
    public final int f61542a;

    /* JADX INFO: renamed from: b */
    public final String f61543b;

    /* JADX INFO: renamed from: c */
    public final boolean f61544c;

    /* JADX INFO: renamed from: d */
    public final int f61545d;

    /* JADX INFO: renamed from: e */
    public final String f61546e;

    /* JADX INFO: renamed from: f */
    public final String f61547f;

    /* JADX INFO: renamed from: g */
    public final long f61548g;

    public sx4(int i, String str, boolean z, int i2, String str2, String str3, long j) {
        str.getClass();
        str2.getClass();
        this.f61542a = i;
        this.f61543b = str;
        this.f61544c = z;
        this.f61545d = i2;
        this.f61546e = str2;
        this.f61547f = str3;
        this.f61548g = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m21758a() {
        return this.f61545d;
    }

    /* JADX INFO: renamed from: b */
    public final String m21759b() {
        return this.f61547f;
    }

    /* JADX INFO: renamed from: c */
    public final int m21760c() {
        return this.f61542a;
    }

    /* JADX INFO: renamed from: d */
    public final String m21761d() {
        return this.f61543b;
    }

    /* JADX INFO: renamed from: e */
    public final long m21762e() {
        return this.f61548g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx4)) {
            return false;
        }
        sx4 sx4Var = (sx4) obj;
        return this.f61542a == sx4Var.f61542a && fa4.m11650l(this.f61543b, sx4Var.f61543b) && this.f61544c == sx4Var.f61544c && this.f61545d == sx4Var.f61545d && fa4.m11650l(this.f61546e, sx4Var.f61546e) && fa4.m11650l(this.f61547f, sx4Var.f61547f) && this.f61548g == sx4Var.f61548g;
    }

    /* JADX INFO: renamed from: f */
    public final String m21763f() {
        return this.f61546e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m21764g() {
        return this.f61544c;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f61545d, g9a.m12428e(ux5.m22980c(Integer.hashCode(this.f61542a) * 31, this.f61543b, 31), 31, this.f61544c), 31), this.f61546e, 31);
        String str = this.f61547f;
        return Long.hashCode(this.f61548g) + ((iM22980c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f61542a, "LessonAudioDownloadEntity(id=", ", language=", this.f61543b, ", isDownloaded=");
        hn1.m13373w(sbM22995r, this.f61544c, ", downloadProgress=", this.f61545d, ", status=");
        AbstractC3393o1.m17725C(sbM22995r, this.f61546e, ", errorType=", this.f61547f, ", lastUpdated=");
        return wq1.m24113i(this.f61548g, ")", sbM22995r);
    }
}
