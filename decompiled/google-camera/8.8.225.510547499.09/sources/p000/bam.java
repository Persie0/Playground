package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bam {

    /* JADX INFO: renamed from: a */
    public final boolean f2874a;

    /* JADX INFO: renamed from: b */
    public final boolean f2875b;

    /* JADX INFO: renamed from: c */
    public final boolean f2876c;

    /* JADX INFO: renamed from: d */
    public final boolean f2877d;

    public bam(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f2874a = z;
        this.f2875b = z2;
        this.f2876c = z3;
        this.f2877d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bam)) {
            return false;
        }
        bam bamVar = (bam) obj;
        return this.f2874a == bamVar.f2874a && this.f2875b == bamVar.f2875b && this.f2876c == bamVar.f2876c && this.f2877d == bamVar.f2877d;
    }

    public final int hashCode() {
        return ((((((this.f2874a ? 1 : 0) * 31) + (this.f2875b ? 1 : 0)) * 31) + (this.f2876c ? 1 : 0)) * 31) + (this.f2877d ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f2874a + ", isValidated=" + this.f2875b + ", isMetered=" + this.f2876c + ", isNotRoaming=" + this.f2877d + ')';
    }
}
