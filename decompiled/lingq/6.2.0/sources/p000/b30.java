package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b30 extends wp1 {

    /* JADX INFO: renamed from: a */
    public final String f7831a;

    /* JADX INFO: renamed from: b */
    public final String f7832b;

    /* JADX INFO: renamed from: c */
    public final String f7833c;

    public b30(String str, String str2, String str3) {
        this.f7831a = str;
        this.f7832b = str2;
        this.f7833c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wp1) {
            b30 b30Var = (b30) ((wp1) obj);
            if (this.f7831a.equals(b30Var.f7831a) && this.f7832b.equals(b30Var.f7832b) && this.f7833c.equals(b30Var.f7833c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7833c.hashCode() ^ ((((this.f7831a.hashCode() ^ 1000003) * 1000003) ^ this.f7832b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f7831a);
        sb.append(", libraryName=");
        sb.append(this.f7832b);
        sb.append(", buildId=");
        return AbstractC3393o1.m17738m(sb, this.f7833c, "}");
    }
}
