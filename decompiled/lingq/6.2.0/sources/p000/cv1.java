package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cv1 implements ev1 {

    /* JADX INFO: renamed from: a */
    public final boolean f34601a;

    public cv1(boolean z) {
        this.f34601a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv1) && this.f34601a == ((cv1) obj).f34601a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34601a);
    }

    public final String toString() {
        return hn1.m13355e("OnSignupNotificationsToggle(checked=", ")", this.f34601a);
    }
}
