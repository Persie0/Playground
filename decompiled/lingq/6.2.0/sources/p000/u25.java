package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u25 {

    /* JADX INFO: renamed from: a */
    public final int f63312a;

    /* JADX INFO: renamed from: b */
    public final boolean f63313b;

    /* JADX INFO: renamed from: c */
    public final boolean f63314c;

    /* JADX INFO: renamed from: d */
    public final String f63315d;

    /* JADX INFO: renamed from: e */
    public final String f63316e;

    /* JADX INFO: renamed from: f */
    public final int f63317f;

    public u25(int i, int i2, String str, String str2, boolean z, boolean z2) {
        this.f63312a = i;
        this.f63313b = z;
        this.f63314c = z2;
        this.f63315d = str;
        this.f63316e = str2;
        this.f63317f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u25)) {
            return false;
        }
        u25 u25Var = (u25) obj;
        return this.f63312a == u25Var.f63312a && this.f63313b == u25Var.f63313b && this.f63314c == u25Var.f63314c && this.f63315d.equals(u25Var.f63315d) && this.f63316e.equals(u25Var.f63316e) && this.f63317f == u25Var.f63317f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63317f) + ux5.m22980c(ux5.m22980c(g9a.m12428e(g9a.m12428e(Integer.hashCode(this.f63312a) * 31, 31, this.f63313b), 31, this.f63314c), this.f63315d, 31), this.f63316e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonInfoActionsState(playlistCount=");
        sb.append(this.f63312a);
        sb.append(", isDownloading=");
        sb.append(this.f63313b);
        sb.append(", isAvailableOffline=");
        hn1.m13367q(", lessonUrl=", this.f63315d, ", audioFetchStatus=", sb, this.f63314c);
        sb.append(this.f63316e);
        sb.append(", downloadProgress=");
        sb.append(this.f63317f);
        sb.append(")");
        return sb.toString();
    }
}
