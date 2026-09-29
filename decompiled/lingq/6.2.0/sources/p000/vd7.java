package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vd7 {

    /* JADX INFO: renamed from: a */
    public final int f65236a;

    /* JADX INFO: renamed from: b */
    public final boolean f65237b;

    /* JADX INFO: renamed from: c */
    public final int f65238c;

    /* JADX INFO: renamed from: d */
    public final String f65239d;

    /* JADX INFO: renamed from: e */
    public final String f65240e;

    /* JADX INFO: renamed from: f */
    public final long f65241f;

    public /* synthetic */ vd7(String str, int i, int i2, int i3, boolean z, String str2) {
        this(i, z, i2, (i3 & 8) != 0 ? "idle" : str, (i3 & 16) != 0 ? null : str2, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd7)) {
            return false;
        }
        vd7 vd7Var = (vd7) obj;
        return this.f65236a == vd7Var.f65236a && this.f65237b == vd7Var.f65237b && this.f65238c == vd7Var.f65238c && fa4.m11650l(this.f65239d, vd7Var.f65239d) && fa4.m11650l(this.f65240e, vd7Var.f65240e) && this.f65241f == vd7Var.f65241f;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f65238c, g9a.m12428e(Integer.hashCode(this.f65236a) * 31, 31, this.f65237b), 31), this.f65239d, 31);
        String str = this.f65240e;
        return Long.hashCode(this.f65241f) + ((iM22980c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistLessonDownload(id=");
        sb.append(this.f65236a);
        sb.append(", isDownloaded=");
        sb.append(this.f65237b);
        sb.append(", downloadProgress=");
        hn1.m13361k(this.f65238c, ", status=", this.f65239d, ", errorType=", sb);
        sb.append(this.f65240e);
        sb.append(", lastUpdated=");
        sb.append(this.f65241f);
        sb.append(")");
        return sb.toString();
    }

    public vd7(int i, boolean z, int i2, String str, String str2, long j) {
        str.getClass();
        this.f65236a = i;
        this.f65237b = z;
        this.f65238c = i2;
        this.f65239d = str;
        this.f65240e = str2;
        this.f65241f = j;
    }
}
