package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dgr {

    /* JADX INFO: renamed from: a */
    public final int f10958a;

    /* JADX INFO: renamed from: b */
    public final hev f10959b;

    public dgr() {
    }

    public dgr(int i, hev hevVar) {
        this.f10958a = i;
        this.f10959b = hevVar;
    }

    /* JADX INFO: renamed from: a */
    public static lmv m6119a() {
        lmv lmvVar = new lmv();
        lmvVar.f38711b = 5;
        lmvVar.f38710a = (byte) 1;
        return lmvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgr) {
            dgr dgrVar = (dgr) obj;
            if (this.f10958a == dgrVar.f10958a && this.f10959b.equals(dgrVar.f10959b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10958a ^ 1000003) * 1000003) ^ this.f10959b.hashCode();
    }

    public final String toString() {
        return KMNlNMe.VemZPrVjoCeq + this.f10958a + ", suggestion=" + String.valueOf(this.f10959b) + "}";
    }
}
