package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class r7b {

    /* JADX INFO: renamed from: a */
    public final int f58862a;

    /* JADX INFO: renamed from: b */
    public final int f58863b;

    /* JADX INFO: renamed from: c */
    public final int f58864c;

    /* JADX INFO: renamed from: d */
    public final int f58865d;

    public r7b(int i, int i2, int i3, int i4) {
        this.f58862a = i;
        this.f58863b = i2;
        this.f58864c = i3;
        this.f58865d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7b)) {
            return false;
        }
        r7b r7bVar = (r7b) obj;
        return this.f58862a == r7bVar.f58862a && this.f58863b == r7bVar.f58863b && this.f58864c == r7bVar.f58864c && this.f58865d == r7bVar.f58865d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58865d) + wq1.m24106b(this.f58864c, wq1.m24106b(this.f58863b, Integer.hashCode(this.f58862a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f58862a, this.f58863b, "WordLayoutKey(tokenIndex=", ", sentenceIndex=", ", startIndex=");
        sbM22994q.append(this.f58864c);
        sbM22994q.append(", endIndex=");
        sbM22994q.append(this.f58865d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
