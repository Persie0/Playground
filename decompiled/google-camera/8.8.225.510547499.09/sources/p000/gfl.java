package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfl {

    /* JADX INFO: renamed from: a */
    public final gev f24580a;

    /* JADX INFO: renamed from: b */
    public final int f24581b;

    /* JADX INFO: renamed from: c */
    public final int f24582c;

    /* JADX INFO: renamed from: d */
    public final mws f24583d;

    public gfl(gev gevVar, int i, int i2, mws mwsVar) {
        if (gevVar == null) {
            throw new NullPointerException("Null category");
        }
        this.f24580a = gevVar;
        this.f24581b = i;
        this.f24582c = i2;
        if (mwsVar == null) {
            throw new NullPointerException("Null optionSpecs");
        }
        this.f24583d = mwsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfl) {
            gfl gflVar = (gfl) obj;
            if (this.f24580a.equals(gflVar.f24580a) && this.f24581b == gflVar.f24581b && this.f24582c == gflVar.f24582c && mkv.m16505M(this.f24583d, gflVar.f24583d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f24580a.hashCode() ^ 1000003) * 1000003) ^ this.f24581b) * 1000003) ^ this.f24582c) * 1000003) ^ this.f24583d.hashCode();
    }

    public final String toString() {
        return "ImmutableCategorySpec{category=" + this.f24580a.toString() + ", contentLabel=" + this.f24581b + ", contentDescription=" + this.f24582c + ", optionSpecs=" + this.f24583d.toString() + "}";
    }

    public gfl() {
    }
}
