package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f66103a;

    public vy9(boolean z) {
        this.f66103a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy9) && this.f66103a == ((vy9) obj).f66103a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66103a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateTransliteration(enabled=", ")", this.f66103a);
    }
}
