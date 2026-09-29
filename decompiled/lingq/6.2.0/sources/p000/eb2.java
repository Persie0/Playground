package p000;

/* JADX INFO: loaded from: classes.dex */
public final class eb2 {

    /* JADX INFO: renamed from: a */
    public int f36969a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb2) && this.f36969a == ((eb2) obj).f36969a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36969a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("DeltaCounter(count="), this.f36969a, ')');
    }
}
