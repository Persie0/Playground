package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyx {

    /* JADX INFO: renamed from: a */
    public final kpe f29995a;

    /* JADX INFO: renamed from: b */
    public final boolean f29996b;

    public hyx() {
    }

    public hyx(kpe kpeVar, boolean z) {
        this.f29995a = kpeVar;
        this.f29996b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyx) {
            hyx hyxVar = (hyx) obj;
            if (this.f29995a.equals(hyxVar.f29995a) && this.f29996b == hyxVar.f29996b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29995a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f29996b ? 1237 : 1231);
    }

    public final String toString() {
        return hIAHJKEnGsNbz.cYTXxW + this.f29995a.toString() + ", cropped=" + this.f29996b + "}";
    }
}
