package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mra extends qra {

    /* JADX INFO: renamed from: a */
    public final int f51780a;

    public mra(int i) {
        this.f51780a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mra) && this.f51780a == ((mra) obj).f51780a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51780a);
    }

    public final String toString() {
        return ux5.m22989l("UpdateStreakChallenge(goal=", this.f51780a, ")");
    }
}
