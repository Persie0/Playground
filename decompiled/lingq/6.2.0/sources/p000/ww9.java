package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ww9 {

    /* JADX INFO: renamed from: a */
    public final he9 f67431a;

    /* JADX INFO: renamed from: b */
    public final he9 f67432b;

    /* JADX INFO: renamed from: c */
    public final he9 f67433c;

    /* JADX INFO: renamed from: d */
    public final he9 f67434d;

    public ww9(he9 he9Var, he9 he9Var2, he9 he9Var3, he9 he9Var4) {
        this.f67431a = he9Var;
        this.f67432b = he9Var2;
        this.f67433c = he9Var3;
        this.f67434d = he9Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ww9)) {
            return false;
        }
        ww9 ww9Var = (ww9) obj;
        return fa4.m11650l(this.f67431a, ww9Var.f67431a) && fa4.m11650l(this.f67432b, ww9Var.f67432b) && fa4.m11650l(this.f67433c, ww9Var.f67433c) && fa4.m11650l(this.f67434d, ww9Var.f67434d);
    }

    public final int hashCode() {
        he9 he9Var = this.f67431a;
        int iHashCode = (he9Var != null ? he9Var.hashCode() : 0) * 31;
        he9 he9Var2 = this.f67432b;
        int iHashCode2 = (iHashCode + (he9Var2 != null ? he9Var2.hashCode() : 0)) * 31;
        he9 he9Var3 = this.f67433c;
        int iHashCode3 = (iHashCode2 + (he9Var3 != null ? he9Var3.hashCode() : 0)) * 31;
        he9 he9Var4 = this.f67434d;
        return iHashCode3 + (he9Var4 != null ? he9Var4.hashCode() : 0);
    }
}
