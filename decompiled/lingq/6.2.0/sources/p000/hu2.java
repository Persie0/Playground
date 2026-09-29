package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hu2 extends ju2 {

    /* JADX INFO: renamed from: a */
    public final b90 f42939a;

    public hu2(b90 b90Var) {
        this.f42939a = b90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu2) && this.f42939a.equals(((hu2) obj).f42939a);
    }

    public final int hashCode() {
        return this.f42939a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.f42939a + ')';
    }
}
