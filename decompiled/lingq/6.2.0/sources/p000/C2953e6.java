package p000;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2953e6 {

    /* JADX INFO: renamed from: a */
    public final String f36732a;

    public C2953e6(String str) {
        this.f36732a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m10861a() {
        return this.f36732a;
    }

    /* JADX INFO: renamed from: b */
    public final C2990f6 m10862b(Integer num) {
        return new C2990f6(this, num);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2953e6) {
            return fa4.m11650l(this.f36732a, ((C2953e6) obj).f36732a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36732a.hashCode();
    }

    public final String toString() {
        return this.f36732a;
    }
}
