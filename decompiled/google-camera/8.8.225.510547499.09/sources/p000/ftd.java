package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftd {

    /* JADX INFO: renamed from: a */
    public final int f23544a;

    /* JADX INFO: renamed from: b */
    public final int f23545b;

    /* JADX INFO: renamed from: c */
    public final long f23546c;

    /* JADX INFO: renamed from: d */
    public final int f23547d;

    public ftd() {
    }

    public ftd(int i, int i2, long j, int i3) {
        this.f23544a = i;
        this.f23545b = i2;
        this.f23546c = j;
        this.f23547d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ftd) {
            ftd ftdVar = (ftd) obj;
            if (this.f23544a == ftdVar.f23544a && this.f23545b == ftdVar.f23545b && this.f23546c == ftdVar.f23546c && this.f23547d == ftdVar.f23547d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f23544a ^ 1000003) * 1000003) ^ this.f23545b) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f23546c)) * 1000003) ^ this.f23547d;
    }

    public final String toString() {
        return "{" + this.f23544a + ", " + this.f23545b + ", false, " + this.f23546c + ", " + this.f23547d + "}";
    }
}
