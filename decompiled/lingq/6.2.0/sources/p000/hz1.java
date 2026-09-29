package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hz1 implements jz1 {

    /* JADX INFO: renamed from: a */
    public final int f43235a;

    /* JADX INFO: renamed from: b */
    public final int f43236b;

    public hz1(int i) {
        this.f43235a = i;
        this.f43236b = i;
    }

    @Override // p000.jz1
    /* JADX INFO: renamed from: a */
    public final Integer mo13592a() {
        return Integer.valueOf(this.f43236b);
    }

    @Override // p000.jz1
    /* JADX INFO: renamed from: b */
    public final String mo13593b() {
        return "custom";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz1) && this.f43235a == ((hz1) obj).f43235a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43235a);
    }

    public final String toString() {
        return ux5.m22989l("Custom(coins=", this.f43235a, ")");
    }
}
