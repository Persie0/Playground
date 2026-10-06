package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgp {

    /* JADX INFO: renamed from: a */
    public final String f38223a;

    public lgp(String str) {
        this.f38223a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lgp) {
            return this.f38223a.equals(((lgp) obj).f38223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38223a.hashCode();
    }

    public final String toString() {
        return this.f38223a;
    }
}
