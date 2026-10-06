package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class leb implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final leb f38016a = new leb(3, 0);

    /* JADX INFO: renamed from: b */
    public final int f38017b;

    /* JADX INFO: renamed from: c */
    public final int f38018c;

    public leb(int i, int i2) {
        this.f38017b = i;
        this.f38018c = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(leb lebVar) {
        int i = this.f38017b;
        int i2 = lebVar.f38017b;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.f38018c - lebVar.f38018c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15238b(leb lebVar) {
        return compareTo(lebVar) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leb)) {
            return false;
        }
        leb lebVar = (leb) obj;
        return this.f38017b == lebVar.f38017b && this.f38018c == lebVar.f38018c;
    }

    public final int hashCode() {
        return (this.f38017b * 31) + this.f38018c;
    }

    public final String toString() {
        return this.f38017b + "." + this.f38018c;
    }
}
