package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lpu {

    /* JADX INFO: renamed from: a */
    public final Context f38912a;

    /* JADX INFO: renamed from: b */
    public final msi f38913b;

    public lpu() {
    }

    public lpu(Context context, msi msiVar) {
        this.f38912a = context;
        this.f38913b = msiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpu) {
            lpu lpuVar = (lpu) obj;
            if (this.f38912a.equals(lpuVar.f38912a)) {
                msi msiVar = this.f38913b;
                msi msiVar2 = lpuVar.f38913b;
                if (msiVar != null ? msiVar.equals(msiVar2) : msiVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f38912a.hashCode() ^ 1000003;
        msi msiVar = this.f38913b;
        return (iHashCode * 1000003) ^ (msiVar == null ? 0 : msiVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f38912a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f38913b) + "}";
    }
}
