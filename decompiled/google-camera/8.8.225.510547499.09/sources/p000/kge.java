package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kge {

    /* JADX INFO: renamed from: a */
    public final boolean f35878a;

    /* JADX INFO: renamed from: b */
    public final int f35879b;

    /* JADX INFO: renamed from: c */
    public final int f35880c;

    /* JADX INFO: renamed from: d */
    public final int f35881d;

    public kge() {
    }

    public kge(int i, int i2, int i3, boolean z) {
        this.f35879b = i;
        this.f35880c = i2;
        this.f35881d = i3;
        this.f35878a = z;
    }

    /* JADX INFO: renamed from: a */
    public static kgd m14187a() {
        kgd kgdVar = new kgd();
        kgdVar.m14185d(false);
        return kgdVar;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14188b() {
        int i = this.f35879b;
        return i == 4 || i == 2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14189c() {
        int i = this.f35881d;
        return i == 4 || i == 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14190d() {
        return this.f35880c != 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kge)) {
            return false;
        }
        kge kgeVar = (kge) obj;
        int i = this.f35879b;
        int i2 = kgeVar.f35879b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.f35880c;
            int i4 = kgeVar.f35880c;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4) {
                int i5 = this.f35881d;
                int i6 = kgeVar.f35881d;
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == i6 && this.f35878a == kgeVar.f35878a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f35879b;
        kgq.m14214d(i);
        int i2 = this.f35880c;
        kgq.m14214d(i2);
        int i3 = this.f35881d;
        kgq.m14214d(i3);
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (true != this.f35878a ? 1237 : 1231);
    }

    public final String toString() {
        return "Spec3A{exposure=" + kgq.m14213c(this.f35879b) + ", focus=" + kgq.m14213c(this.f35880c) + ", whiteBalance=" + kgq.m14213c(this.f35881d) + ", forCapture=" + this.f35878a + "}";
    }
}
