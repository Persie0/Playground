package p000;

import android.util.Pair;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gam {

    /* JADX INFO: renamed from: a */
    public final Float f24031a;

    /* JADX INFO: renamed from: b */
    private final Pair f24032b;

    public gam() {
    }

    public gam(Float f, Pair pair) {
        this.f24031a = f;
        this.f24032b = pair;
    }

    /* JADX INFO: renamed from: a */
    public static gam m8996a(Float f, Pair pair) {
        return new gam(f, pair);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gam)) {
            return false;
        }
        gam gamVar = (gam) obj;
        Float f = this.f24031a;
        if (f != null ? f.equals(gamVar.f24031a) : gamVar.f24031a == null) {
            Pair pair = this.f24032b;
            Pair pair2 = gamVar.f24032b;
            if (pair != null ? pair.equals(pair2) : pair2 == null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return YmzeHXaMYOLk.pZEajYJGMRM + this.f24031a + ", focusRange=" + String.valueOf(this.f24032b) + "}";
    }

    public final int hashCode() {
        Float f = this.f24031a;
        int iHashCode = f == null ? 0 : f.hashCode();
        Pair pair = this.f24032b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (pair != null ? pair.hashCode() : 0);
    }
}
