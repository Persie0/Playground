package p000;

import com.google.android.material.snackbar.VMX.rgoX;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyd {

    /* JADX INFO: renamed from: a */
    public final hye f29901a;

    /* JADX INFO: renamed from: b */
    private final mrm f29902b;

    public hyd(hye hyeVar, mrm mrmVar) {
        if (hyeVar == null) {
            throw new NullPointerException("Null getType");
        }
        this.f29901a = hyeVar;
        this.f29902b = mrmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyd) {
            hyd hydVar = (hyd) obj;
            if (this.f29901a.equals(hydVar.f29901a) && this.f29902b.equals(hydVar.f29902b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29901a.hashCode() ^ 1000003) * 1000003) ^ this.f29902b.hashCode();
    }

    public final String toString() {
        return rgoX.OCEHiZYC + this.f29901a.toString() + ", foldBounds=" + this.f29902b.toString() + "}";
    }

    public hyd() {
    }
}
