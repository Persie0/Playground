package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mf0 {

    /* JADX INFO: renamed from: a */
    public C3185ki f51239a = null;

    /* JADX INFO: renamed from: b */
    public C3459pg f51240b = null;

    /* JADX INFO: renamed from: c */
    public an0 f51241c = null;

    /* JADX INFO: renamed from: d */
    public C3500qj f51242d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf0)) {
            return false;
        }
        mf0 mf0Var = (mf0) obj;
        return fa4.m11650l(this.f51239a, mf0Var.f51239a) && fa4.m11650l(this.f51240b, mf0Var.f51240b) && fa4.m11650l(this.f51241c, mf0Var.f51241c) && fa4.m11650l(this.f51242d, mf0Var.f51242d);
    }

    public final int hashCode() {
        C3185ki c3185ki = this.f51239a;
        int iHashCode = (c3185ki == null ? 0 : c3185ki.hashCode()) * 31;
        C3459pg c3459pg = this.f51240b;
        int iHashCode2 = (iHashCode + (c3459pg == null ? 0 : c3459pg.hashCode())) * 31;
        an0 an0Var = this.f51241c;
        int iHashCode3 = (iHashCode2 + (an0Var == null ? 0 : an0Var.hashCode())) * 31;
        C3500qj c3500qj = this.f51242d;
        return iHashCode3 + (c3500qj != null ? c3500qj.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f51239a + ", canvas=" + this.f51240b + ", canvasDrawScope=" + this.f51241c + ", borderPath=" + this.f51242d + ')';
    }
}
