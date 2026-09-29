package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final boolean f63612b;

    public u96(boolean z) {
        this.f63612b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22635a() {
        return this.f63612b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u96) && this.f63612b == ((u96) obj).f63612b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63612b);
    }

    public final String toString() {
        return hn1.m13355e("Cup(openSignup=", ")", this.f63612b);
    }
}
