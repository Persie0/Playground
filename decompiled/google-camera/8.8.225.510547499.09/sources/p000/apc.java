package p000;

import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class apc {

    /* JADX INFO: renamed from: a */
    final int f1975a;

    /* JADX INFO: renamed from: b */
    final int f1976b;

    /* JADX INFO: renamed from: c */
    final long f1977c;

    /* JADX INFO: renamed from: d */
    final long f1978d;

    public apc(int i, int i2, long j, long j2) {
        this.f1975a = i;
        this.f1976b = i2;
        this.f1977c = j;
        this.f1978d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof apc)) {
            return false;
        }
        apc apcVar = (apc) obj;
        return this.f1976b == apcVar.f1976b && this.f1977c == apcVar.f1977c && this.f1975a == apcVar.f1975a && this.f1978d == apcVar.f1978d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1976b), Long.valueOf(this.f1977c), Integer.valueOf(this.f1975a), Long.valueOf(this.f1978d));
    }
}
