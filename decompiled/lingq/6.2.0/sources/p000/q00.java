package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q00 {

    /* JADX INFO: renamed from: a */
    public final int f57064a;

    public /* synthetic */ q00(int i) {
        this.f57064a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ q00 m19582a(int i) {
        return new q00(i);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int m19583b() {
        return this.f57064a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q00) {
            return this.f57064a == ((q00) obj).f57064a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57064a);
    }

    public final String toString() {
        return wq1.m24114j("AutoClearFocusBehavior(value=", this.f57064a, ')');
    }
}
