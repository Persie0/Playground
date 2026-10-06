package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lxv {

    /* JADX INFO: renamed from: a */
    public final nzw f39537a;

    /* JADX INFO: renamed from: b */
    public final nzw f39538b;

    /* JADX INFO: renamed from: c */
    public final nzw f39539c;

    /* JADX INFO: renamed from: d */
    public final lvi f39540d;

    /* JADX INFO: renamed from: e */
    public final lwh f39541e;

    /* JADX INFO: renamed from: f */
    public final double f39542f;

    public lxv() {
        this(null, null, null, null, null, 0.0d, 63);
    }

    public lxv(nzw nzwVar, nzw nzwVar2, nzw nzwVar3, lvi lviVar, lwh lwhVar, double d) {
        nzwVar.getClass();
        lviVar.getClass();
        lwhVar.getClass();
        this.f39537a = nzwVar;
        this.f39538b = nzwVar2;
        this.f39539c = nzwVar3;
        this.f39540d = lviVar;
        this.f39541e = lwhVar;
        this.f39542f = d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ lxv m16126a(lxv lxvVar, nzw nzwVar, nzw nzwVar2, lvi lviVar, lwh lwhVar, double d, int i) {
        nzw nzwVar3 = (i & 1) != 0 ? lxvVar.f39537a : null;
        if ((i & 2) != 0) {
            nzwVar = lxvVar.f39538b;
        }
        nzw nzwVar4 = nzwVar;
        if ((i & 4) != 0) {
            nzwVar2 = lxvVar.f39539c;
        }
        nzw nzwVar5 = nzwVar2;
        if ((i & 8) != 0) {
            lviVar = lxvVar.f39540d;
        }
        lvi lviVar2 = lviVar;
        if ((i & 16) != 0) {
            lwhVar = lxvVar.f39541e;
        }
        lwh lwhVar2 = lwhVar;
        double d2 = (i & 32) != 0 ? lxvVar.f39542f : d;
        nzwVar3.getClass();
        lviVar2.getClass();
        lwhVar2.getClass();
        return new lxv(nzwVar3, nzwVar4, nzwVar5, lviVar2, lwhVar2, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxv)) {
            return false;
        }
        lxv lxvVar = (lxv) obj;
        return ooc.m18737c(this.f39537a, lxvVar.f39537a) && ooc.m18737c(this.f39538b, lxvVar.f39538b) && ooc.m18737c(this.f39539c, lxvVar.f39539c) && this.f39540d == lxvVar.f39540d && this.f39541e == lxvVar.f39541e && Double.compare(this.f39542f, lxvVar.f39542f) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("addedToAirlockEpochTimestamp: " + lle.m15688h(this.f39537a) + ", ");
        nzw nzwVar = this.f39538b;
        if (nzwVar != null) {
            sb.append("uploadToF250RequestedEpochTimestamp: " + lle.m15688h(nzwVar) + ", ");
        }
        nzw nzwVar2 = this.f39539c;
        if (nzwVar2 != null) {
            sb.append("uploadToF250CompletedEpochTimestamp: " + lle.m15688h(nzwVar2) + ", ");
        }
        sb.append("uploadState: " + this.f39541e + ", ");
        sb.append("airlockFileState: " + this.f39540d + ", ");
        sb.append("uploadProgressPercent: " + this.f39542f);
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ lxv(nzw nzwVar, nzw nzwVar2, nzw nzwVar3, lvi lviVar, lwh lwhVar, double d, int i) {
        if ((i & 1) != 0) {
            nzw nzwVar4 = nzw.f45101c;
            throw null;
        }
        nzw nzwVar5 = (i & 2) != 0 ? null : nzwVar2;
        nzw nzwVar6 = (i & 4) != 0 ? null : nzwVar3;
        if ((i & 8) != 0) {
            lvi lviVar2 = lvi.UNKNOWN_AIRLOCK_FILE_STATE;
            throw null;
        }
        if ((i & 16) == 0) {
            this(nzwVar, nzwVar5, nzwVar6, lviVar, lwhVar, (i & 32) != 0 ? 0.0d : d);
        } else {
            lwh lwhVar2 = lwh.UNKNOWN_UPLOAD_STATE;
            throw null;
        }
    }

    public final int hashCode() {
        int iM18134L;
        int iM18134L2;
        nzw nzwVar = this.f39537a;
        if (nzwVar.m18142ac()) {
            iM18134L = nzwVar.m18134L();
        } else {
            int iM18134L3 = nzwVar.f44820aG;
            if (iM18134L3 == 0) {
                iM18134L3 = nzwVar.m18134L();
                nzwVar.f44820aG = iM18134L3;
            }
            iM18134L = iM18134L3;
        }
        nzw nzwVar2 = this.f39538b;
        int iM18134L4 = 0;
        if (nzwVar2 == null) {
            iM18134L2 = 0;
        } else if (nzwVar2.m18142ac()) {
            iM18134L2 = nzwVar2.m18134L();
        } else {
            int iM18134L5 = nzwVar2.f44820aG;
            if (iM18134L5 == 0) {
                iM18134L5 = nzwVar2.m18134L();
                nzwVar2.f44820aG = iM18134L5;
            }
            iM18134L2 = iM18134L5;
        }
        int i = iM18134L * 31;
        nzw nzwVar3 = this.f39539c;
        if (nzwVar3 != null) {
            if (nzwVar3.m18142ac()) {
                iM18134L4 = nzwVar3.m18134L();
            } else {
                iM18134L4 = nzwVar3.f44820aG;
                if (iM18134L4 == 0) {
                    iM18134L4 = nzwVar3.m18134L();
                    nzwVar3.f44820aG = iM18134L4;
                }
            }
        }
        int iHashCode = (((((((i + iM18134L2) * 31) + iM18134L4) * 31) + this.f39540d.hashCode()) * 31) + this.f39541e.hashCode()) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f39542f);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }
}
