package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibz {

    /* JADX INFO: renamed from: a */
    public final Rect f30280a;

    /* JADX INFO: renamed from: b */
    public final int f30281b;

    public ibz() {
    }

    public ibz(Rect rect, int i) {
        this.f30280a = rect;
        this.f30281b = i;
    }

    /* JADX INFO: renamed from: a */
    public static lmv m11034a() {
        return new lmv();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibz) {
            ibz ibzVar = (ibz) obj;
            if (this.f30280a.equals(ibzVar.f30280a) && this.f30281b == ibzVar.f30281b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30280a.hashCode() ^ 1000003) * 1000003) ^ this.f30281b;
    }

    public final String toString() {
        return "RoundedRect{rect=" + String.valueOf(this.f30280a) + ", radius=" + this.f30281b + "}";
    }
}
