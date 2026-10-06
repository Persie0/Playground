package p000;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mau {

    /* JADX INFO: renamed from: a */
    public final nzw f39740a;

    /* JADX INFO: renamed from: b */
    private final lle f39741b;

    public mau(ksi ksiVar, lle lleVar, byte[] bArr) {
        ksiVar.getClass();
        nzw nzwVarM15687g = lle.m15687g(ksiVar);
        this.f39741b = lleVar;
        this.f39740a = nzwVarM15687g;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ lvo m16277c(mau mauVar, oer oerVar, Throwable th, lvu lvuVar, int i) {
        if ((i & 4) != 0) {
            lvuVar = null;
        }
        return mauVar.m16281b(oerVar, th, lvuVar, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ lvo m16278d(mau mauVar) {
        okv okvVar = okv.f46215a;
        return m16279e(mauVar, okvVar, okvVar, null, 12);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ lvo m16279e(mau mauVar, Collection collection, Collection collection2, oer oerVar, int i) {
        if ((i & 1) != 0) {
            collection = okv.f46215a;
        }
        if ((i & 2) != 0) {
            collection2 = okv.f46215a;
        }
        if ((i & 4) != 0) {
            oerVar = oer.SUCCESS;
        }
        return mauVar.m16280a(collection, collection2, oerVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final lvo m16280a(Collection collection, Collection collection2, oer oerVar, Throwable th) {
        collection.getClass();
        collection2.getClass();
        oerVar.getClass();
        return new lvo(this.f39741b, this.f39740a, collection, collection2, oerVar, th, null);
    }

    /* JADX INFO: renamed from: b */
    public final lvo m16281b(oer oerVar, Throwable th, lvu lvuVar, lxm lxmVar) {
        oerVar.getClass();
        return m16280a(lvuVar != null ? omn.m18666F(lvuVar) : okv.f46215a, lxmVar != null ? omn.m18666F(lxmVar) : okv.f46215a, oerVar, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mau)) {
            return false;
        }
        mau mauVar = (mau) obj;
        return ooc.m18737c(this.f39741b, mauVar.f39741b) && ooc.m18737c(this.f39740a, mauVar.f39740a);
    }

    public final String toString() {
        return "F250LogEventStarter(f250LogAction=" + this.f39741b + ", logEpochTimestamp=" + this.f39740a + ")";
    }

    public final int hashCode() {
        int iM18134L;
        int iHashCode = this.f39741b.hashCode() * 31;
        nzw nzwVar = this.f39740a;
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
        return iHashCode + iM18134L;
    }
}
