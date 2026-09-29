package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class d46 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final int f34993a;

    public d46(int i) {
        this.f34993a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d46) && this.f34993a == ((d46) obj).f34993a;
    }

    public final int hashCode() {
        return this.f34993a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f34993a;
    }
}
