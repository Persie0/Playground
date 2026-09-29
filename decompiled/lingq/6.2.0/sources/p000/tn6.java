package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tn6 extends wn6 {

    /* JADX INFO: renamed from: a */
    public final boolean f62570a;

    public tn6(boolean z) {
        this.f62570a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn6) && this.f62570a == ((tn6) obj).f62570a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62570a);
    }

    public final String toString() {
        return hn1.m13355e("OnSendEmailChanged(enabled=", ")", this.f62570a);
    }
}
