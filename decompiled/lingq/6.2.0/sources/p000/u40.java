package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u40 {

    /* JADX INFO: renamed from: a */
    public final String f63375a;

    /* JADX INFO: renamed from: b */
    public final String f63376b;

    public u40(String str, String str2) {
        this.f63375a = str;
        if (str2 != null) {
            this.f63376b = str2;
        } else {
            C3386nv.m17635v("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return this.f63375a.equals(u40Var.f63375a) && this.f63376b.equals(u40Var.f63376b);
    }

    public final int hashCode() {
        return this.f63376b.hashCode() ^ ((this.f63375a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f63375a);
        sb.append(", version=");
        return AbstractC3393o1.m17738m(sb, this.f63376b, "}");
    }
}
