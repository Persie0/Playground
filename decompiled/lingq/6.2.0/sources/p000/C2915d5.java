package p000;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2915d5 extends AbstractC2952e5 {

    /* JADX INFO: renamed from: a */
    public final int f35000a;

    public C2915d5(int i) {
        this.f35000a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2915d5) && this.f35000a == ((C2915d5) obj).f35000a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35000a);
    }

    public final String toString() {
        return ux5.m22989l("StreakMilestone(days=", this.f35000a, ")");
    }
}
