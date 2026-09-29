package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ap1 {

    /* JADX INFO: renamed from: a */
    public final boolean f7316a;

    /* JADX INFO: renamed from: b */
    public final boolean f7317b;

    public ap1(boolean z, boolean z2) {
        this.f7316a = z;
        this.f7317b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1)) {
            return false;
        }
        ap1 ap1Var = (ap1) obj;
        return this.f7316a == ap1Var.f7316a && this.f7317b == ap1Var.f7317b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7317b) + (Boolean.hashCode(this.f7316a) * 31);
    }

    public final String toString() {
        return "CourseSubscriptionState(canSubscribe=" + this.f7316a + ", isSubscribed=" + this.f7317b + ")";
    }
}
