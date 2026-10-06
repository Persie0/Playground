package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gly {

    /* JADX INFO: renamed from: a */
    public final boolean f25569a;

    /* JADX INFO: renamed from: b */
    public final boolean f25570b;

    public gly() {
    }

    public gly(boolean z, boolean z2) {
        this.f25569a = z;
        this.f25570b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gly) {
            gly glyVar = (gly) obj;
            if (this.f25569a == glyVar.f25569a && this.f25570b == glyVar.f25570b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.f25569a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.f25570b ? 1231 : 1237);
    }

    public final String toString() {
        return "DualEvTrigger{hdrNetEnabled=" + this.f25569a + ", modeSupported=" + this.f25570b + "}";
    }
}
