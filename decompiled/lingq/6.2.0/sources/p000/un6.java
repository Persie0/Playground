package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class un6 extends wn6 {

    /* JADX INFO: renamed from: a */
    public final boolean f64108a;

    public un6(boolean z) {
        this.f64108a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un6) && this.f64108a == ((un6) obj).f64108a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64108a);
    }

    public final String toString() {
        return hn1.m13355e("OnSendNotificationChanged(enabled=", ")", this.f64108a);
    }
}
