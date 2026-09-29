package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zd9 {

    /* JADX INFO: renamed from: a */
    public final String f71391a;

    /* JADX INFO: renamed from: b */
    public final String f71392b;

    public zd9(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f71391a = str;
        this.f71392b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m25559a() {
        return this.f71392b;
    }

    /* JADX INFO: renamed from: b */
    public final String m25560b() {
        return this.f71391a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd9)) {
            return false;
        }
        zd9 zd9Var = (zd9) obj;
        return fa4.m11650l(this.f71391a, zd9Var.f71391a) && fa4.m11650l(this.f71392b, zd9Var.f71392b);
    }

    public final int hashCode() {
        return this.f71392b.hashCode() + (this.f71391a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("SourceBlacklistEntity(name=", this.f71391a, ", language=", this.f71392b, ")");
    }
}
