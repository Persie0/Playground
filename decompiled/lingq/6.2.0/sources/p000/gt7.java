package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f41301a;

    public gt7(int i) {
        this.f41301a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt7) && this.f41301a == ((gt7) obj).f41301a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41301a);
    }

    public final String toString() {
        return ux5.m22989l("UpdateStreakChallenge(goal=", this.f41301a, ")");
    }
}
