package p000;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihw {

    /* JADX INFO: renamed from: a */
    public final Surface f31016a;

    /* JADX INFO: renamed from: b */
    public final int f31017b;

    /* JADX INFO: renamed from: c */
    public final Size f31018c;

    public ihw(Surface surface, int i, Size size) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f31016a = surface;
        this.f31017b = i;
        this.f31018c = size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihw) {
            ihw ihwVar = (ihw) obj;
            if (this.f31016a.equals(ihwVar.f31016a) && this.f31017b == ihwVar.f31017b && this.f31018c.equals(ihwVar.f31018c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f31016a.hashCode() ^ 1000003) * 1000003) ^ this.f31017b) * 1000003) ^ this.f31018c.hashCode();
    }

    public final String toString() {
        return "CreatedSurface{surface=" + this.f31016a.toString() + ", format=" + this.f31017b + ", size=" + this.f31018c.toString() + "}";
    }

    public ihw() {
    }
}
