package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w2b {

    /* JADX INFO: renamed from: a */
    public final String f66310a;

    public w2b(String str) {
        this.f66310a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2b) && this.f66310a.equals(((w2b) obj).f66310a);
    }

    public final int hashCode() {
        return this.f66310a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Web2WaveSubscription(status=", this.f66310a, ")");
    }
}
