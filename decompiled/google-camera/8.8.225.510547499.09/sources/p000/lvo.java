package p000;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvo {

    /* JADX INFO: renamed from: a */
    public final nzw f39406a;

    /* JADX INFO: renamed from: b */
    public final Collection f39407b;

    /* JADX INFO: renamed from: c */
    public final Collection f39408c;

    /* JADX INFO: renamed from: d */
    public final oer f39409d;

    /* JADX INFO: renamed from: e */
    public final Throwable f39410e;

    /* JADX INFO: renamed from: f */
    public final lle f39411f;

    public lvo(lle lleVar, nzw nzwVar, Collection collection, Collection collection2, oer oerVar, Throwable th, byte[] bArr) {
        this.f39411f = lleVar;
        this.f39406a = nzwVar;
        this.f39407b = collection;
        this.f39408c = collection2;
        this.f39409d = oerVar;
        this.f39410e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvo)) {
            return false;
        }
        lvo lvoVar = (lvo) obj;
        return ooc.m18737c(this.f39411f, lvoVar.f39411f) && ooc.m18737c(this.f39406a, lvoVar.f39406a) && ooc.m18737c(this.f39407b, lvoVar.f39407b) && ooc.m18737c(this.f39408c, lvoVar.f39408c) && this.f39409d == lvoVar.f39409d && ooc.m18737c(this.f39410e, lvoVar.f39410e);
    }

    public final String toString() {
        return "F250LogEvent(f250LogAction=" + this.f39411f + ", logEpochTimestamp=" + this.f39406a + ", resources=" + this.f39407b + ", annotachments=" + this.f39408c + ", f250LogReason=" + this.f39409d + ", errorThrowable=" + this.f39410e + ")";
    }

    public final int hashCode() {
        int iM18134L;
        int iHashCode = this.f39411f.hashCode() * 31;
        nzw nzwVar = this.f39406a;
        if (nzwVar.m18142ac()) {
            iM18134L = nzwVar.m18134L();
        } else {
            int iM18134L2 = nzwVar.f44820aG;
            if (iM18134L2 == 0) {
                iM18134L2 = nzwVar.m18134L();
                nzwVar.f44820aG = iM18134L2;
            }
            iM18134L = iM18134L2;
        }
        int iHashCode2 = (((((((iHashCode + iM18134L) * 31) + this.f39407b.hashCode()) * 31) + this.f39408c.hashCode()) * 31) + this.f39409d.hashCode()) * 31;
        Throwable th = this.f39410e;
        return iHashCode2 + (th == null ? 0 : th.hashCode());
    }
}
