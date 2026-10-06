package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class brz implements bqn {

    /* JADX INFO: renamed from: b */
    private final bqn f4253b;

    /* JADX INFO: renamed from: c */
    private final bqn f4254c;

    public brz(bqn bqnVar, bqn bqnVar2) {
        this.f4253b = bqnVar;
        this.f4254c = bqnVar2;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        this.f4253b.mo2922a(messageDigest);
        this.f4254c.mo2922a(messageDigest);
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof brz) {
            brz brzVar = (brz) obj;
            if (this.f4253b.equals(brzVar.f4253b) && this.f4254c.equals(brzVar.f4254c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return (this.f4253b.hashCode() * 31) + this.f4254c.hashCode();
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + String.valueOf(this.f4253b) + ", signature=" + String.valueOf(this.f4254c) + "}";
    }
}
