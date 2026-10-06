package p000;

import android.graphics.Paint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyy {

    /* JADX INFO: renamed from: a */
    public final hyv f29997a;

    /* JADX INFO: renamed from: b */
    public final Paint f29998b;

    public hyy(hyv hyvVar, Paint paint) {
        if (hyvVar == null) {
            throw new NullPointerException("Null hotshotState");
        }
        this.f29997a = hyvVar;
        this.f29998b = paint;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyy) {
            hyy hyyVar = (hyy) obj;
            if (this.f29997a.equals(hyyVar.f29997a) && this.f29998b.equals(hyyVar.f29998b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29997a.hashCode() ^ 1000003) * 1000003) ^ this.f29998b.hashCode();
    }

    public final String toString() {
        return "HotshotCircle{hotshotState=" + this.f29997a.f29992j + ", paint=" + this.f29998b.toString() + "}";
    }

    public hyy() {
    }
}
