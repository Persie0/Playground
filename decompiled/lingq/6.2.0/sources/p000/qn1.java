package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qn1 extends AbstractC0830c0 {

    /* JADX INFO: renamed from: c */
    public static final s46 f57957c = new s46(9);

    /* JADX INFO: renamed from: b */
    public final String f57958b;

    public qn1() {
        super(f57957c);
        this.f57958b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn1) && fa4.m11650l(this.f57958b, ((qn1) obj).f57958b);
    }

    public final int hashCode() {
        return this.f57958b.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("CoroutineName("), this.f57958b, ')');
    }
}
