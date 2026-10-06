package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvz {

    /* JADX INFO: renamed from: a */
    private final nuw f39420a;

    public lvz(nuw nuwVar) {
        this.f39420a = nuwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvz) && ooc.m18737c(this.f39420a, ((lvz) obj).f39420a);
    }

    public final String toString() {
        return BEeWZPor.nNCEIdgDXoc + this.f39420a + ")";
    }

    public final int hashCode() {
        nuw nuwVar = this.f39420a;
        if (nuwVar.m18142ac()) {
            return nuwVar.m18134L();
        }
        int iM18134L = nuwVar.f44820aG;
        if (iM18134L == 0) {
            iM18134L = nuwVar.m18134L();
            nuwVar.f44820aG = iM18134L;
        }
        return iM18134L;
    }
}
