package p000;

/* JADX INFO: loaded from: classes.dex */
public final class eea implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte f37135a;

    public /* synthetic */ eea(byte b) {
        this.f37135a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return fa4.m11651m(this.f37135a & 255, ((eea) obj).f37135a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eea) {
            return this.f37135a == ((eea) obj).f37135a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f37135a);
    }

    public final String toString() {
        return String.valueOf(this.f37135a & 255);
    }
}
