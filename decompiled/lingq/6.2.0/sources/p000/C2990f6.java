package p000;

/* JADX INFO: renamed from: f6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2990f6 {

    /* JADX INFO: renamed from: a */
    public final C2953e6 f38501a;

    /* JADX INFO: renamed from: b */
    public final Integer f38502b;

    public C2990f6(C2953e6 c2953e6, Integer num) {
        this.f38501a = c2953e6;
        this.f38502b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2990f6)) {
            return false;
        }
        C2990f6 c2990f6 = (C2990f6) obj;
        return this.f38501a.equals(c2990f6.f38501a) && this.f38502b.equals(c2990f6.f38502b);
    }

    public final int hashCode() {
        return this.f38502b.hashCode() + this.f38501a.hashCode();
    }

    public final String toString() {
        return "(" + this.f38501a.m10861a() + ", " + this.f38502b + ')';
    }
}
