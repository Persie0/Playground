package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g7a {

    /* JADX INFO: renamed from: a */
    public final long f40360a;

    /* JADX INFO: renamed from: b */
    public final long f40361b;

    /* JADX INFO: renamed from: c */
    public final long f40362c;

    /* JADX INFO: renamed from: d */
    public final long f40363d;

    /* JADX INFO: renamed from: e */
    public final long f40364e;

    /* JADX INFO: renamed from: f */
    public final long f40365f;

    public g7a(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f40360a = j;
        this.f40361b = j2;
        this.f40362c = j3;
        this.f40363d = j4;
        this.f40364e = j5;
        this.f40365f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g7a)) {
            return false;
        }
        g7a g7aVar = (g7a) obj;
        return aa1.m199c(this.f40360a, g7aVar.f40360a) && aa1.m199c(this.f40361b, g7aVar.f40361b) && aa1.m199c(this.f40362c, g7aVar.f40362c) && aa1.m199c(this.f40363d, g7aVar.f40363d) && aa1.m199c(this.f40364e, g7aVar.f40364e) && aa1.m199c(this.f40365f, g7aVar.f40365f);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f40365f) + ux5.m22981d(this.f40364e, ux5.m22981d(this.f40363d, ux5.m22981d(this.f40362c, ux5.m22981d(this.f40361b, Long.hashCode(this.f40360a) * 31, 31), 31), 31), 31);
    }
}
