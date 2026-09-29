package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class v85 {

    /* JADX INFO: renamed from: a */
    public final int f65014a;

    /* JADX INFO: renamed from: b */
    public final String f65015b;

    /* JADX INFO: renamed from: c */
    public final String f65016c;

    /* JADX INFO: renamed from: d */
    public final boolean f65017d;

    public v85(String str, int i, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f65014a = i;
        this.f65015b = str;
        this.f65016c = str2;
        this.f65017d = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m23171a() {
        return this.f65014a;
    }

    /* JADX INFO: renamed from: b */
    public final String m23172b() {
        return this.f65015b;
    }

    /* JADX INFO: renamed from: c */
    public final String m23173c() {
        return this.f65016c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23174d() {
        return this.f65017d;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof v85) {
            v85 v85Var = (v85) obj;
            if (this.f65014a == v85Var.f65014a && fa4.m11650l(this.f65015b, v85Var.f65015b) && fa4.m11650l(this.f65016c, v85Var.f65016c) && this.f65017d == v85Var.f65017d && obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = 0;
        return num.hashCode() + g9a.m12428e(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f65014a) * 31, this.f65015b, 31), this.f65016c, 31), 31, this.f65017d);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f65014a, "LibraryDownloadEntity(id=", ", language=", this.f65015b, ", type=");
        ux5.m22976C(this.f65016c, ", isDownloaded=", ", downloadProgress=", sbM22995r, this.f65017d);
        sbM22995r.append((Object) 0);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
